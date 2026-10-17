package com.revolut.core.ui_kit.delegates;

import ip0.d60;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qc implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d60 f54631b;

    public qc(String listId, d60 style) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54630a = listId;
        this.f54631b = style;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return this.f54630a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj2;
        return Intrinsics.f(this.f54630a, qcVar.f54630a) && this.f54631b == qcVar.f54631b;
    }

    public final int hashCode() {
        return this.f54631b.hashCode() + (this.f54630a.hashCode() * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof qc) {
            return new rc(this.f54631b != ((qc) oldItem).f54631b);
        }
        return null;
    }
}
