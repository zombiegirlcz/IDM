package androidx.media3.common.audio;

import a0.d;
import com.google.common.base.Preconditions;
import ehe.n;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
final class Sonic {
    private double accumulatedSpeedAdjustmentError;
    private final int channelCount;
    private final SonicImpl<?> impl;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private int outputFrameCount;
    private final float pitch;
    private int pitchFrameCount;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    public final class SonicFloatImpl implements SonicImpl<float[]> {
        private final float[] downSampleBuffer;
        private float[] inputBuffer;
        private double maxDiff;
        private double minDiff;
        private float[] outputBuffer;
        private float[] pitchBuffer;
        private double prevMinDiff;

        public SonicFloatImpl() {
            this.downSampleBuffer = new float[Sonic.this.maxRequiredFrameCount];
            this.inputBuffer = new float[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
            this.outputBuffer = new float[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
            this.pitchBuffer = new float[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
        }

        private float[] ensureSpaceForAdditionalFrames(float[] fArr, int i, int i2) {
            int length = fArr.length / Sonic.this.channelCount;
            return i + i2 <= length ? fArr : Arrays.copyOf(fArr, d.D(length, 3, 2, i2) * Sonic.this.channelCount);
        }

        private int findPitchPeriodInRange(float[] fArr, int i, int i2, int i3) {
            int i5 = Sonic.this.channelCount * i;
            double d = 1.0d;
            int i6 = 0;
            double d5 = 0.0d;
            int i21 = 255;
            int i22 = i2;
            while (i22 <= i3) {
                double dAbs = 0.0d;
                for (int i32 = 0; i32 < i22; i32++) {
                    dAbs += (double) Math.abs(fArr[i5 + i32] - fArr[(i5 + i22) + i32]);
                }
                int i33 = i5;
                double d6 = i22;
                if (((double) i6) * dAbs < d * d6) {
                    i6 = i22;
                    d = dAbs;
                }
                if (((double) i21) * dAbs > d6 * d5) {
                    i21 = i22;
                    d5 = dAbs;
                }
                i22++;
                i5 = i33;
            }
            this.minDiff = d / ((double) i6);
            this.maxDiff = d5 / ((double) i21);
            return i6;
        }

        private float interpolate(float[] fArr, int i, long j2, long j3) {
            float f = fArr[i];
            float f4 = fArr[i + Sonic.this.channelCount];
            long j5 = ((long) Sonic.this.newRatePosition) * j2;
            long j16 = ((long) Sonic.this.oldRatePosition) * j3;
            long j22 = ((long) (Sonic.this.oldRatePosition + 1)) * j3;
            long j42 = j22 - j5;
            return (((r3 - j42) * f4) + (j42 * f)) / (j22 - j16);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int bytesPerSample() {
            return 4;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyBufferToInputBuffer(ByteBuffer byteBuffer, int i) {
            byteBuffer.asFloatBuffer().get(this.inputBuffer, Sonic.this.inputFrameCount * Sonic.this.channelCount, i / bytesPerSample());
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyOutputToByteBuffer(ByteBuffer byteBuffer, int i) {
            byteBuffer.asFloatBuffer().put(this.outputBuffer, 0, Sonic.this.channelCount * i);
            byteBuffer.position((i * bytesPerSample() * Sonic.this.channelCount) + byteBuffer.position());
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void downSampleInput(int i, int i2) {
            int i3 = Sonic.this.maxRequiredFrameCount / i2;
            int i5 = Sonic.this.channelCount * i2;
            int i6 = i * Sonic.this.channelCount;
            for (int i21 = 0; i21 < i3; i21++) {
                double d = 0.0d;
                for (int i22 = 0; i22 < i5; i22++) {
                    d += (double) this.inputBuffer[n.a(i21, i5, i6, i22)];
                }
                this.downSampleBuffer[i21] = (float) (d / ((double) i5));
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInInputBuffer(int i) {
            this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, Sonic.this.inputFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInOutputBuffer(int i) {
            this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, Sonic.this.outputFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInPitchBuffer(int i) {
            this.pitchBuffer = ensureSpaceForAdditionalFrames(this.pitchBuffer, Sonic.this.pitchFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithDownsampleBuffer(int i, int i2, int i3) {
            return findPitchPeriodInRange(this.downSampleBuffer, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithInputBuffer(int i, int i2, int i3) {
            return findPitchPeriodInRange(this.inputBuffer, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void flush() {
            this.prevMinDiff = 0.0d;
            this.minDiff = 0.0d;
            this.maxDiff = 0.0d;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void interpolateFrame(int i, long j2, long j3) {
            int i2 = 0;
            while (i2 < Sonic.this.channelCount) {
                long j5 = j2;
                this.outputBuffer[(Sonic.this.outputFrameCount * Sonic.this.channelCount) + i2] = interpolate(this.pitchBuffer, (Sonic.this.channelCount * i) + i2, j5, j3);
                i2++;
                j2 = j5;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public boolean isPreviousPeriodBetter() {
            if (this.minDiff == 0.0d || Sonic.this.prevPeriod == 0) {
                return false;
            }
            double d = this.maxDiff;
            double d5 = this.minDiff;
            return d <= d5 * 3.0d && d5 * 2.0d > this.prevMinDiff * 3.0d;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void overlapAdd(int i, int i2, int i3, int i5, int i6) {
            float[] fArr = this.outputBuffer;
            float[] fArr2 = this.inputBuffer;
            overlapAdd(i, i2, fArr, i3, fArr2, i5, fArr2, i6);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void updatePreviousMinDiff() {
            this.prevMinDiff = this.minDiff;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void zeroInputBuffer(int i, int i2) {
            for (int i3 = 0; i3 < Sonic.this.channelCount * i2; i3++) {
                this.inputBuffer[i + i3] = 0.0f;
            }
        }

        private void overlapAdd(int i, int i2, float[] fArr, int i3, float[] fArr2, int i5, float[] fArr3, int i6) {
            for (int i21 = 0; i21 < i2; i21++) {
                int i22 = (i3 * i2) + i21;
                int i32 = (i6 * i2) + i21;
                int i33 = (i5 * i2) + i21;
                for (int i43 = 0; i43 < i; i43++) {
                    fArr[i22] = ((fArr3[i32] * i43) + (fArr2[i33] * (i - i43))) / i;
                    i22 += i2;
                    i33 += i2;
                    i32 += i2;
                }
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public float[] getInputBuffer() {
            return this.inputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public float[] getOutputBuffer() {
            return this.outputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public float[] getPitchBuffer() {
            return this.pitchBuffer;
        }
    }

    public interface SonicImpl<T> {
        int bytesPerSample();

        void copyBufferToInputBuffer(ByteBuffer byteBuffer, int i);

        void copyOutputToByteBuffer(ByteBuffer byteBuffer, int i);

        void downSampleInput(int i, int i2);

        void ensureAdditionalFramesInInputBuffer(int i);

        void ensureAdditionalFramesInOutputBuffer(int i);

        void ensureAdditionalFramesInPitchBuffer(int i);

        int findPitchPeriodInRangeWithDownsampleBuffer(int i, int i2, int i3);

        int findPitchPeriodInRangeWithInputBuffer(int i, int i2, int i3);

        void flush();

        T getInputBuffer();

        T getOutputBuffer();

        T getPitchBuffer();

        void interpolateFrame(int i, long j2, long j3);

        boolean isPreviousPeriodBetter();

        void overlapAdd(int i, int i2, int i3, int i5, int i6);

        void updatePreviousMinDiff();

        void zeroInputBuffer(int i, int i2);
    }

    public final class SonicShortImpl implements SonicImpl<short[]> {
        private final short[] downSampleBuffer;
        private short[] inputBuffer;
        private int maxDiff;
        private int minDiff;
        private short[] outputBuffer;
        private short[] pitchBuffer;
        private int prevMinDiff;

        public SonicShortImpl() {
            this.downSampleBuffer = new short[Sonic.this.maxRequiredFrameCount];
            this.inputBuffer = new short[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
            this.outputBuffer = new short[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
            this.pitchBuffer = new short[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
        }

        private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i, int i2) {
            int length = sArr.length / Sonic.this.channelCount;
            return i + i2 <= length ? sArr : Arrays.copyOf(sArr, d.D(length, 3, 2, i2) * Sonic.this.channelCount);
        }

        private int findPitchPeriodInRange(short[] sArr, int i, int i2, int i3) {
            int i5 = i * Sonic.this.channelCount;
            int i6 = 255;
            int i21 = 1;
            int i22 = 0;
            int i32 = 0;
            while (i2 <= i3) {
                int iAbs = 0;
                for (int i33 = 0; i33 < i2; i33++) {
                    iAbs += Math.abs(sArr[i5 + i33] - sArr[(i5 + i2) + i33]);
                }
                if (iAbs * i22 < i21 * i2) {
                    i22 = i2;
                    i21 = iAbs;
                }
                if (iAbs * i6 > i32 * i2) {
                    i6 = i2;
                    i32 = iAbs;
                }
                i2++;
            }
            this.minDiff = i21 / i22;
            this.maxDiff = i32 / i6;
            return i22;
        }

        private short interpolate(short[] sArr, int i, long j2, long j3) {
            short s2 = sArr[i];
            short s3 = sArr[i + Sonic.this.channelCount];
            long j5 = ((long) Sonic.this.newRatePosition) * j2;
            long j16 = ((long) Sonic.this.oldRatePosition) * j3;
            long j22 = ((long) (Sonic.this.oldRatePosition + 1)) * j3;
            long j42 = j22 - j5;
            long j46 = j22 - j16;
            return (short) ((((j46 - j42) * ((long) s3)) + (((long) s2) * j42)) / j46);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int bytesPerSample() {
            return 2;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyBufferToInputBuffer(ByteBuffer byteBuffer, int i) {
            byteBuffer.asShortBuffer().get(this.inputBuffer, Sonic.this.inputFrameCount * Sonic.this.channelCount, i / 2);
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyOutputToByteBuffer(ByteBuffer byteBuffer, int i) {
            byteBuffer.asShortBuffer().put(this.outputBuffer, 0, Sonic.this.channelCount * i);
            byteBuffer.position((i * bytesPerSample() * Sonic.this.channelCount) + byteBuffer.position());
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void downSampleInput(int i, int i2) {
            short[] sArr = this.inputBuffer;
            int i3 = Sonic.this.maxRequiredFrameCount / i2;
            int i5 = Sonic.this.channelCount * i2;
            int i6 = i * Sonic.this.channelCount;
            for (int i21 = 0; i21 < i3; i21++) {
                int i22 = 0;
                for (int i32 = 0; i32 < i5; i32++) {
                    i22 += sArr[n.a(i21, i5, i6, i32)];
                }
                this.downSampleBuffer[i21] = (short) (i22 / i5);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInInputBuffer(int i) {
            this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, Sonic.this.inputFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInOutputBuffer(int i) {
            this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, Sonic.this.outputFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInPitchBuffer(int i) {
            this.pitchBuffer = ensureSpaceForAdditionalFrames(this.pitchBuffer, Sonic.this.pitchFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithDownsampleBuffer(int i, int i2, int i3) {
            return findPitchPeriodInRange(this.downSampleBuffer, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithInputBuffer(int i, int i2, int i3) {
            return findPitchPeriodInRange(this.inputBuffer, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void flush() {
            this.prevMinDiff = 0;
            this.minDiff = 0;
            this.maxDiff = 0;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void interpolateFrame(int i, long j2, long j3) {
            int i2 = 0;
            while (i2 < Sonic.this.channelCount) {
                long j5 = j2;
                this.outputBuffer[(Sonic.this.outputFrameCount * Sonic.this.channelCount) + i2] = interpolate(this.pitchBuffer, (Sonic.this.channelCount * i) + i2, j5, j3);
                i2++;
                j2 = j5;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public boolean isPreviousPeriodBetter() {
            if (this.minDiff == 0 || Sonic.this.prevPeriod == 0) {
                return false;
            }
            int i = this.maxDiff;
            int i2 = this.minDiff;
            return i <= i2 * 3 && i2 * 2 > this.prevMinDiff * 3;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void overlapAdd(int i, int i2, int i3, int i5, int i6) {
            short[] sArr = this.outputBuffer;
            short[] sArr2 = this.inputBuffer;
            overlapAdd(i, i2, sArr, i3, sArr2, i5, sArr2, i6);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void updatePreviousMinDiff() {
            this.prevMinDiff = this.minDiff;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void zeroInputBuffer(int i, int i2) {
            for (int i3 = 0; i3 < Sonic.this.channelCount * i2; i3++) {
                this.inputBuffer[i + i3] = 0;
            }
        }

        private void overlapAdd(int i, int i2, short[] sArr, int i3, short[] sArr2, int i5, short[] sArr3, int i6) {
            for (int i21 = 0; i21 < i2; i21++) {
                int i22 = (i3 * i2) + i21;
                int i32 = (i6 * i2) + i21;
                int i33 = (i5 * i2) + i21;
                for (int i43 = 0; i43 < i; i43++) {
                    sArr[i22] = (short) (((sArr3[i32] * i43) + ((i - i43) * sArr2[i33])) / i);
                    i22 += i2;
                    i33 += i2;
                    i32 += i2;
                }
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public short[] getInputBuffer() {
            return this.inputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public short[] getOutputBuffer() {
            return this.outputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public short[] getPitchBuffer() {
            return this.pitchBuffer;
        }
    }

    public Sonic(int i, int i2, float f, float f4, int i3, boolean z) {
        this.inputSampleRateHz = i;
        this.channelCount = i2;
        this.speed = f;
        this.pitch = f4;
        this.rate = i / i3;
        this.minPeriod = i / 400;
        int i5 = i / 65;
        this.maxPeriod = i5;
        this.maxRequiredFrameCount = i5 * 2;
        this.impl = z ? new SonicFloatImpl() : new SonicShortImpl();
    }

    private void adjustRate(float f, int i) {
        int i2;
        int i3;
        if (this.outputFrameCount == i) {
            return;
        }
        int i5 = this.inputSampleRateHz;
        long j2 = (long) (i5 / f);
        long j3 = i5;
        while (j2 != 0 && j3 != 0 && j2 % 2 == 0 && j3 % 2 == 0) {
            j2 /= 2;
            j3 /= 2;
        }
        moveNewSamplesToPitchBuffer(i);
        int i6 = 0;
        while (true) {
            int i21 = this.pitchFrameCount;
            if (i6 >= i21 - 1) {
                removePitchFrames(i21 - 1);
                return;
            }
            while (true) {
                i2 = this.oldRatePosition;
                long j5 = ((long) (i2 + 1)) * j2;
                i3 = this.newRatePosition;
                if (j5 <= ((long) i3) * j3) {
                    break;
                }
                this.impl.ensureAdditionalFramesInOutputBuffer(1);
                this.impl.interpolateFrame(i6, j3, j2);
                this.newRatePosition++;
                this.outputFrameCount++;
            }
            int i22 = i2 + 1;
            this.oldRatePosition = i22;
            if (i22 == j3) {
                this.oldRatePosition = 0;
                Preconditions.checkState(((long) i3) == j2);
                this.newRatePosition = 0;
            }
            i6++;
        }
    }

    private void changeSpeed(double d) {
        int iInsertPitchPeriod;
        int i = this.inputFrameCount;
        if (i < this.maxRequiredFrameCount) {
            return;
        }
        int iSkipPitchPeriod = 0;
        do {
            if (this.remainingInputToCopyFrameCount > 0) {
                iInsertPitchPeriod = copyInputToOutput(iSkipPitchPeriod);
            } else {
                int iFindPitchPeriod = findPitchPeriod(iSkipPitchPeriod);
                if (d > 1.0d) {
                    iSkipPitchPeriod = iFindPitchPeriod + skipPitchPeriod(iSkipPitchPeriod, d, iFindPitchPeriod) + iSkipPitchPeriod;
                } else {
                    iInsertPitchPeriod = insertPitchPeriod(iSkipPitchPeriod, d, iFindPitchPeriod);
                }
            }
            iSkipPitchPeriod += iInsertPitchPeriod;
        } while (this.maxRequiredFrameCount + iSkipPitchPeriod <= i);
        removeProcessedInputFrames(iSkipPitchPeriod);
    }

    private int copyInputToOutput(int i) {
        int iMin = Math.min(this.maxRequiredFrameCount, this.remainingInputToCopyFrameCount);
        copyToOutput(i, iMin);
        this.remainingInputToCopyFrameCount -= iMin;
        return iMin;
    }

    private void copyToOutput(int i, int i2) {
        this.impl.ensureAdditionalFramesInOutputBuffer(i2);
        Object inputBuffer = this.impl.getInputBuffer();
        int i3 = i * this.channelCount;
        Object outputBuffer = this.impl.getOutputBuffer();
        int i5 = this.outputFrameCount;
        int i6 = this.channelCount;
        System.arraycopy(inputBuffer, i3, outputBuffer, i5 * i6, i6 * i2);
        this.outputFrameCount += i2;
    }

    private int findPitchPeriod(int i) {
        int iFindPitchPeriodInRangeWithDownsampleBuffer;
        int i2 = this.inputSampleRateHz;
        int i3 = i2 > 4000 ? i2 / 4000 : 1;
        if (this.channelCount == 1 && i3 == 1) {
            iFindPitchPeriodInRangeWithDownsampleBuffer = this.impl.findPitchPeriodInRangeWithInputBuffer(i, this.minPeriod, this.maxPeriod);
        } else {
            this.impl.downSampleInput(i, i3);
            int iFindPitchPeriodInRangeWithDownsampleBuffer2 = this.impl.findPitchPeriodInRangeWithDownsampleBuffer(0, this.minPeriod / i3, this.maxPeriod / i3);
            if (i3 != 1) {
                int i5 = iFindPitchPeriodInRangeWithDownsampleBuffer2 * i3;
                int i6 = i3 * 4;
                int i21 = i5 - i6;
                int i22 = i5 + i6;
                int i32 = this.minPeriod;
                if (i21 < i32) {
                    i21 = i32;
                }
                int i33 = this.maxPeriod;
                if (i22 > i33) {
                    i22 = i33;
                }
                if (this.channelCount == 1) {
                    iFindPitchPeriodInRangeWithDownsampleBuffer = this.impl.findPitchPeriodInRangeWithInputBuffer(i, i21, i22);
                } else {
                    this.impl.downSampleInput(i, 1);
                    iFindPitchPeriodInRangeWithDownsampleBuffer = this.impl.findPitchPeriodInRangeWithDownsampleBuffer(0, i21, i22);
                }
            } else {
                iFindPitchPeriodInRangeWithDownsampleBuffer = iFindPitchPeriodInRangeWithDownsampleBuffer2;
            }
        }
        int i43 = this.impl.isPreviousPeriodBetter() ? this.prevPeriod : iFindPitchPeriodInRangeWithDownsampleBuffer;
        this.impl.updatePreviousMinDiff();
        this.prevPeriod = iFindPitchPeriodInRangeWithDownsampleBuffer;
        return i43;
    }

    private int insertPitchPeriod(int i, double d, int i2) {
        int iRound;
        if (d < 0.5d) {
            double d5 = ((((double) i2) * d) / (1.0d - d)) + this.accumulatedSpeedAdjustmentError;
            iRound = (int) Math.round(d5);
            this.accumulatedSpeedAdjustmentError = d5 - ((double) iRound);
        } else {
            double d6 = ((((2.0d * d) - 1.0d) * ((double) i2)) / (1.0d - d)) + this.accumulatedSpeedAdjustmentError;
            int iRound2 = (int) Math.round(d6);
            this.remainingInputToCopyFrameCount = iRound2;
            this.accumulatedSpeedAdjustmentError = d6 - ((double) iRound2);
            iRound = i2;
        }
        int i3 = i2 + iRound;
        this.impl.ensureAdditionalFramesInOutputBuffer(i3);
        Object inputBuffer = this.impl.getInputBuffer();
        int i5 = this.channelCount * i;
        Object outputBuffer = this.impl.getOutputBuffer();
        int i6 = this.outputFrameCount;
        int i21 = this.channelCount;
        System.arraycopy(inputBuffer, i5, outputBuffer, i6 * i21, i21 * i2);
        this.impl.overlapAdd(iRound, this.channelCount, this.outputFrameCount + i2, i + i2, i);
        this.outputFrameCount += i3;
        return iRound;
    }

    private void moveNewSamplesToPitchBuffer(int i) {
        int i2 = this.outputFrameCount - i;
        this.impl.ensureAdditionalFramesInPitchBuffer(i2);
        Object outputBuffer = this.impl.getOutputBuffer();
        int i3 = this.channelCount * i;
        Object pitchBuffer = this.impl.getPitchBuffer();
        int i5 = this.pitchFrameCount;
        int i6 = this.channelCount;
        System.arraycopy(outputBuffer, i3, pitchBuffer, i5 * i6, i6 * i2);
        this.outputFrameCount = i;
        this.pitchFrameCount += i2;
    }

    private void processStreamInput() {
        int i = this.outputFrameCount;
        float f = this.speed;
        float f4 = this.pitch;
        double d = f / f4;
        float f5 = this.rate * f4;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            changeSpeed(d);
        } else {
            copyToOutput(0, this.inputFrameCount);
            this.inputFrameCount = 0;
        }
        if (f5 != 1.0f) {
            adjustRate(f5, i);
        }
    }

    private void removePitchFrames(int i) {
        if (i == 0) {
            return;
        }
        System.arraycopy(this.impl.getPitchBuffer(), this.channelCount * i, this.impl.getPitchBuffer(), 0, (this.pitchFrameCount - i) * this.channelCount);
        this.pitchFrameCount -= i;
    }

    private void removeProcessedInputFrames(int i) {
        int i2 = this.inputFrameCount - i;
        System.arraycopy(this.impl.getInputBuffer(), i * this.channelCount, this.impl.getInputBuffer(), 0, this.channelCount * i2);
        this.inputFrameCount = i2;
    }

    private int skipPitchPeriod(int i, double d, int i2) {
        int i3;
        if (d >= 2.0d) {
            double d5 = (((double) i2) / (d - 1.0d)) + this.accumulatedSpeedAdjustmentError;
            int iRound = (int) Math.round(d5);
            this.accumulatedSpeedAdjustmentError = d5 - ((double) iRound);
            i3 = iRound;
        } else {
            double d6 = (((2.0d - d) * ((double) i2)) / (d - 1.0d)) + this.accumulatedSpeedAdjustmentError;
            int iRound2 = (int) Math.round(d6);
            this.remainingInputToCopyFrameCount = iRound2;
            this.accumulatedSpeedAdjustmentError = d6 - ((double) iRound2);
            i3 = i2;
        }
        this.impl.ensureAdditionalFramesInOutputBuffer(i3);
        this.impl.overlapAdd(i3, this.channelCount, this.outputFrameCount, i, i + i2);
        this.outputFrameCount += i3;
        return i3;
    }

    public void flush() {
        this.inputFrameCount = 0;
        this.outputFrameCount = 0;
        this.pitchFrameCount = 0;
        this.oldRatePosition = 0;
        this.newRatePosition = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.prevPeriod = 0;
        this.accumulatedSpeedAdjustmentError = 0.0d;
        this.impl.flush();
    }

    public void getOutput(ByteBuffer byteBuffer) {
        Preconditions.checkState(this.outputFrameCount >= 0);
        int iMin = Math.min(byteBuffer.remaining() / (this.channelCount * this.impl.bytesPerSample()), this.outputFrameCount);
        this.impl.copyOutputToByteBuffer(byteBuffer, iMin);
        this.outputFrameCount -= iMin;
        System.arraycopy(this.impl.getOutputBuffer(), iMin * this.channelCount, this.impl.getOutputBuffer(), 0, this.outputFrameCount * this.channelCount);
    }

    public int getOutputSize() {
        Preconditions.checkState(this.outputFrameCount >= 0);
        return this.outputFrameCount * this.channelCount * this.impl.bytesPerSample();
    }

    public int getPendingInputBytes() {
        return this.inputFrameCount * this.channelCount * this.impl.bytesPerSample();
    }

    public void queueEndOfStream() {
        int i = this.inputFrameCount;
        float f = this.speed;
        float f4 = this.pitch;
        double d = f / f4;
        double d5 = this.rate * f4;
        int i2 = this.remainingInputToCopyFrameCount;
        int i3 = this.outputFrameCount + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + this.accumulatedSpeedAdjustmentError) + ((double) this.pitchFrameCount)) / d5) + 0.5d));
        this.accumulatedSpeedAdjustmentError = 0.0d;
        this.impl.ensureAdditionalFramesInInputBuffer((this.maxRequiredFrameCount * 2) + i);
        this.impl.zeroInputBuffer(i * this.channelCount, this.maxRequiredFrameCount * 2);
        this.inputFrameCount = (this.maxRequiredFrameCount * 2) + this.inputFrameCount;
        processStreamInput();
        if (this.outputFrameCount > i3) {
            this.outputFrameCount = Math.max(i3, 0);
        }
        this.inputFrameCount = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.pitchFrameCount = 0;
    }

    public void queueInput(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int iBytesPerSample = iRemaining / (this.channelCount * this.impl.bytesPerSample());
        this.impl.ensureAdditionalFramesInInputBuffer(iBytesPerSample);
        this.impl.copyBufferToInputBuffer(byteBuffer, iRemaining);
        this.inputFrameCount += iBytesPerSample;
        processStreamInput();
    }
}
