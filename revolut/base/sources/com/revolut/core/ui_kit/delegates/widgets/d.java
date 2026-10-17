package com.revolut.core.ui_kit.delegates.widgets;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f55319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f55320b;

    public d(c primaryRow, c cVar, int i) {
        cVar = (i & 2) != 0 ? null : cVar;
        Intrinsics.checkNotNullParameter(primaryRow, "primaryRow");
        this.f55319a = primaryRow;
        this.f55320b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f55319a.equals(dVar.f55319a) && Intrinsics.f(this.f55320b, dVar.f55320b);
    }

    public final int hashCode() {
        int iHashCode = this.f55319a.hashCode() * 31;
        c cVar = this.f55320b;
        return (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
    }
}
