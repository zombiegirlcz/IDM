package fyi;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i80.a f139021a;

    public f(i80.a qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f139021a = qrCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f139021a, ((f) obj2).f139021a);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(this.f139021a.f159408a);
    }
}
