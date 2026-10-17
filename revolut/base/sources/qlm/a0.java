package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class a0 {

    @NotNull
    private static final z Companion = new z();
    public static final long[] e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f247609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rch.o f247610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f247611c;
    public final long[] d;

    public a0(SerialDescriptor descriptor, rch.o readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f247609a = descriptor;
        this.f247610b = readIfAbsent;
        int iC = descriptor.c();
        if (iC <= 64) {
            this.f247611c = iC != 64 ? (-1) << iC : 0L;
            this.d = e;
            return;
        }
        this.f247611c = 0L;
        int i = (iC - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iC & 63) != 0) {
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            jArr[i - 1] = (-1) << iC;
        }
        this.d = jArr;
    }

    public final void a(int i) {
        if (i < 64) {
            this.f247611c = (1 << i) | this.f247611c;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.d;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }

    public final int b() {
        rch.o oVar;
        int iNumberOfTrailingZeros;
        SerialDescriptor serialDescriptor = this.f247609a;
        int iC = serialDescriptor.c();
        do {
            long j2 = this.f247611c;
            oVar = this.f247610b;
            if (j2 == -1) {
                if (iC <= 64) {
                    return -1;
                }
                long[] jArr = this.d;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j3 = jArr[i];
                    while (j3 != -1) {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
                        j3 |= 1 << iNumberOfTrailingZeros2;
                        int i5 = iNumberOfTrailingZeros2 + i3;
                        if (((Boolean) oVar.invoke(serialDescriptor, Integer.valueOf(i5))).booleanValue()) {
                            jArr[i] = j3;
                            return i5;
                        }
                    }
                    jArr[i] = j3;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
            this.f247611c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) oVar.invoke(serialDescriptor, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
