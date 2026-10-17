package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z4 implements koi.j, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseDraggableWidgetDelegate.Model f55580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f55581c;
    public final xsh.h d;

    public z4(String listId, BaseDraggableWidgetDelegate.Model item, Clause clause, xsh.h hVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f55579a = listId;
        this.f55580b = item;
        this.f55581c = clause;
        this.d = hVar;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52406p() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52397a() {
        return this.f55579a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj2;
        return Intrinsics.f(this.f55579a, z4Var.f55579a) && Intrinsics.f(this.f55580b, z4Var.f55580b) && Intrinsics.f(this.f55581c, z4Var.f55581c) && this.d.equals(z4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f55580b.hashCode() + (this.f55579a.hashCode() * 31)) * 31;
        Clause clause = this.f55581c;
        return this.d.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return Unit.f186387a;
    }
}
