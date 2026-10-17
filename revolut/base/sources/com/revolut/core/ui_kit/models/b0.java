package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 implements c0, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f58046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f58047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f58048c;
    public final boolean d;
    public final Object e;

    public /* synthetic */ b0(TextLocalisedClause textLocalisedClause, Clause clause, Image image, int i) {
        this(textLocalisedClause, (i & 2) != 0 ? null : clause, (i & 4) != 0 ? null : image, false, null);
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53832y() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f58046a, b0Var.f58046a) && Intrinsics.f(this.f58047b, b0Var.f58047b) && Intrinsics.f(this.f58048c, b0Var.f58048c) && this.d == b0Var.d && Intrinsics.f(this.e, b0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f58046a.hashCode() * 31;
        Clause clause = this.f58047b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f58048c;
        int iC = j6.a.c((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.d);
        Object obj2 = this.e;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }

    public b0(TextLocalisedClause title, Clause clause, Image image, boolean z, svi.m mVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f58046a = title;
        this.f58047b = clause;
        this.f58048c = image;
        this.d = z;
        this.e = mVar;
    }
}
