package wca;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296369a;

    public f(String otp) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f296369a = otp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f296369a, ((f) obj2).f296369a);
    }

    public final int hashCode() {
        return this.f296369a.hashCode();
    }
}
