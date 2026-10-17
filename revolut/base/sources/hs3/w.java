package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154958b;

    public w(String planId, String backgroundCode) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(backgroundCode, "backgroundCode");
        this.f154957a = planId;
        this.f154958b = backgroundCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f154957a, wVar.f154957a) && Intrinsics.f(this.f154958b, wVar.f154958b);
    }

    public final int hashCode() {
        return this.f154958b.hashCode() + (this.f154957a.hashCode() * 31);
    }
}
