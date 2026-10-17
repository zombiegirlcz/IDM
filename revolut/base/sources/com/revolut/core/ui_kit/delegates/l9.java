package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import ip0.iy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l9 implements n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f54432c;
    public final iy d;
    public final iy e;
    public final iy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final iy f54433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54434h;

    public l9(Clause clause, String str, Clause clause2, iy iyVar, iy iyVar2, int i) {
        iyVar2 = (i & 16) != 0 ? null : iyVar2;
        boolean z = (i & 32) == 0;
        this.f54430a = clause;
        this.f54431b = str;
        this.f54432c = clause2;
        this.d = iyVar;
        this.e = iyVar;
        this.f = iyVar2;
        this.f54433g = iyVar2;
        this.f54434h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj2;
        return Intrinsics.f(this.f54430a, l9Var.f54430a) && Intrinsics.f(this.f54431b, l9Var.f54431b) && Intrinsics.f(this.f54432c, l9Var.f54432c) && Intrinsics.f(this.d, l9Var.d) && Intrinsics.f(this.e, l9Var.e) && Intrinsics.f(this.f, l9Var.f) && Intrinsics.f(this.f54433g, l9Var.f54433g) && this.f54434h == l9Var.f54434h;
    }

    public final int hashCode() {
        Clause clause = this.f54430a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        String str = this.f54431b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Clause clause2 = this.f54432c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        iy iyVar = this.d;
        int iHashCode4 = (iHashCode3 + (iyVar == null ? 0 : iyVar.hashCode())) * 31;
        iy iyVar2 = this.e;
        int iHashCode5 = (iHashCode4 + (iyVar2 == null ? 0 : iyVar2.hashCode())) * 31;
        iy iyVar3 = this.f;
        int iHashCode6 = (iHashCode5 + (iyVar3 == null ? 0 : iyVar3.hashCode())) * 31;
        iy iyVar4 = this.f54433g;
        return Boolean.hashCode(this.f54434h) + ((iHashCode6 + (iyVar4 != null ? iyVar4.hashCode() : 0)) * 31);
    }
}
