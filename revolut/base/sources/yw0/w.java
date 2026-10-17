package yw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yw0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f317305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f317306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f317307c;

    public w(int i, TextLocalisedClause title, TextLocalisedClause actionText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        this.f317305a = i;
        this.f317306b = title;
        this.f317307c = actionText;
    }

    @Override // yw0.a0
    public final a0 b(k model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof s) {
            return new z((s) model, 0, false);
        }
        if (model instanceof f.b) {
            return new v(((f.b) model).f317273a);
        }
        if (model instanceof g) {
            return a0.a((g) model);
        }
        if (!(model instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar = (j) model;
        return new y(jVar.f317278b, jVar.f317277a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f317305a == wVar.f317305a && this.f317306b.equals(wVar.f317306b) && this.f317307c.equals(wVar.f317307c);
    }

    public final int hashCode() {
        return this.f317307c.hashCode() + t61.a.a(Integer.hashCode(this.f317305a) * 31, 31, this.f317306b);
    }
}
