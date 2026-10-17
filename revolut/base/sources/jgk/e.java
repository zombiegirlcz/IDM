package jgk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f174072b;

    public e(String familyId, boolean z) {
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        this.f174071a = familyId;
        this.f174072b = z;
    }

    @Override // jgk.g
    public final boolean a() {
        return this.f174072b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f174071a, eVar.f174071a) && this.f174072b == eVar.f174072b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174072b) + p.a.c(Integer.hashCode(1) * 31, 31, this.f174071a);
    }
}
