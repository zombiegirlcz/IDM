package koe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zme.f f186323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zme.l f186324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f186325c;

    public p(zme.f taxResidency, zme.l taxResidencyRule, o action) {
        Intrinsics.checkNotNullParameter(taxResidency, "taxResidency");
        Intrinsics.checkNotNullParameter(taxResidencyRule, "taxResidencyRule");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f186323a = taxResidency;
        this.f186324b = taxResidencyRule;
        this.f186325c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f186323a, pVar.f186323a) && Intrinsics.f(this.f186324b, pVar.f186324b) && this.f186325c == pVar.f186325c;
    }

    public final int hashCode() {
        return this.f186325c.hashCode() + ((this.f186324b.hashCode() + (this.f186323a.hashCode() * 31)) * 31);
    }
}
