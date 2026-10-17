package com.revolut.core.ui_kit.widget.dashboard;

import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
import koi.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yi0.a f59771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59772c;
    public final ly0.a d;
    public final b e;

    public a(String listId, CardReaderProductDetailsScreenContract$ProductDetailsWidgetType type, boolean z, ly0.a header, b state) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f59770a = listId;
        this.f59771b = type;
        this.f59772c = z;
        this.d = header;
        this.e = state;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53201a() {
        return this.f59770a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f59770a, aVar.f59770a) && Intrinsics.f(this.f59771b, aVar.f59771b) && this.f59772c == aVar.f59772c && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.c((this.f59771b.hashCode() + (this.f59770a.hashCode() * 31)) * 31, 31, this.f59772c)) * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof a ? (a) oldItem : null) == null || ((a) oldItem).f59772c != this.f59772c) {
            return null;
        }
        return new Object();
    }
}
