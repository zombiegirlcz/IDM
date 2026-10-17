package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/tokens/LinearProgressIndicatorTokens;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "ActiveThickness", "F", "getActiveThickness-D9Ej5fM", "()F", "ActiveWaveAmplitude", "getActiveWaveAmplitude-D9Ej5fM", "ActiveWaveWavelength", "getActiveWaveWavelength-D9Ej5fM", "Height", "getHeight-D9Ej5fM", "IndeterminateActiveWaveWavelength", "getIndeterminateActiveWaveWavelength-D9Ej5fM", "StopSize", "getStopSize-D9Ej5fM", "StopTrailingSpace", "getStopTrailingSpace-D9Ej5fM", "TrackActiveSpace", "getTrackActiveSpace-D9Ej5fM", "TrackThickness", "getTrackThickness-D9Ej5fM", "WaveHeight", "getWaveHeight-D9Ej5fM", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LinearProgressIndicatorTokens {
    private static final float ActiveThickness;
    private static final float Height;
    private static final float StopSize;
    private static final float TrackActiveSpace;
    private static final float TrackThickness;

    @NotNull
    public static final LinearProgressIndicatorTokens INSTANCE = new LinearProgressIndicatorTokens();
    private static final float ActiveWaveAmplitude = Dp.m3297constructorimpl((float) 3.0d);
    private static final float ActiveWaveWavelength = Dp.m3297constructorimpl((float) 40.0d);
    private static final float IndeterminateActiveWaveWavelength = Dp.m3297constructorimpl((float) 20.0d);
    private static final float StopTrailingSpace = Dp.m3297constructorimpl((float) 0.0d);
    private static final float WaveHeight = Dp.m3297constructorimpl((float) 10.0d);

    static {
        float f = (float) 4.0d;
        ActiveThickness = Dp.m3297constructorimpl(f);
        Height = Dp.m3297constructorimpl(f);
        StopSize = Dp.m3297constructorimpl(f);
        TrackActiveSpace = Dp.m3297constructorimpl(f);
        TrackThickness = Dp.m3297constructorimpl(f);
    }

    private LinearProgressIndicatorTokens() {
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1501getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getStopSize-D9Ej5fM, reason: not valid java name */
    public final float m1502getStopSizeD9Ej5fM() {
        return StopSize;
    }

    /* JADX INFO: renamed from: getTrackActiveSpace-D9Ej5fM, reason: not valid java name */
    public final float m1503getTrackActiveSpaceD9Ej5fM() {
        return TrackActiveSpace;
    }
}
