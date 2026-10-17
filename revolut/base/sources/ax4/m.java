package ax4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10891b;

    public m(String parameterKey, boolean z) {
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.f10890a = parameterKey;
        this.f10891b = z;
    }

    public static m a(m mVar, boolean z) {
        String parameterKey = mVar.f10890a;
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        return new m(parameterKey, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f10890a, mVar.f10890a) && this.f10891b == mVar.f10891b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10891b) + (this.f10890a.hashCode() * 31);
    }
}
