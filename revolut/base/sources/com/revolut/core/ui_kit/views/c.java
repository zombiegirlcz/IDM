package com.revolut.core.ui_kit.views;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements mx0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionsView.Item f59026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59027b;

    public c(ActionsView.Item action, int i) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f59026a = action;
        this.f59027b = i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58316a() {
        return this.f59026a.f58316a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f59026a, cVar.f59026a) && this.f59027b == cVar.f59027b;
    }

    @Override // mx0.j
    public final int getType() {
        return this.f59027b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59027b) + (this.f59026a.hashCode() * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof c ? (c) oldItem : null) != null) {
            c cVar = (c) oldItem;
            if (cVar.f59027b == this.f59027b) {
                return this.f59026a.z(cVar.f59026a);
            }
        }
        return null;
    }
}
