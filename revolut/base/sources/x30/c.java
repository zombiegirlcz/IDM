package x30;

import a0.d;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f302608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f302609c;
    public final byte[] d;

    public c(String filePath, byte[] waveformAmplitudes, long j2, long j3) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(waveformAmplitudes, "waveformAmplitudes");
        this.f302607a = filePath;
        this.f302608b = j2;
        this.f302609c = j3;
        this.d = waveformAmplitudes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f302607a, cVar.f302607a) && this.f302608b == cVar.f302608b && this.f302609c == cVar.f302609c && Arrays.equals(this.d, cVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + d.c(d.c(this.f302607a.hashCode() * 31, 31, this.f302608b), 31, this.f302609c);
    }
}
