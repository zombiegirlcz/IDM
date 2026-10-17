package com.revolut.core.ui_kit.models;

import android.os.Parcelable;
import aw0.d6;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/models/IndexBarModel;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "aw0/d6", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndexBarModel implements koi.j, qv0.p, TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f57793c;
    public final Clause d;
    public final j77.b e;
    public Parcelable f;

    public IndexBarModel(String listId, int i, TextClause title, Clause subtitle, j77.b bVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f57791a = listId;
        this.f57792b = i;
        this.f57793c = title;
        this.d = subtitle;
        this.e = bVar;
        this.f = null;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF54968n() {
        return this.e;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF52630a() {
        return this.f57791a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IndexBarModel)) {
            return false;
        }
        IndexBarModel indexBarModel = (IndexBarModel) obj2;
        return Intrinsics.f(this.f57791a, indexBarModel.f57791a) && this.f57792b == indexBarModel.f57792b && this.f57793c.equals(indexBarModel.f57793c) && this.d.equals(indexBarModel.d) && this.e.equals(indexBarModel.e) && Intrinsics.f(this.f, indexBarModel.f);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF52639p() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.a(v7.b(j6.a.b(this.f57792b, this.f57791a.hashCode() * 31, 31), 31, this.f57793c), 31, this.d)) * 31;
        Parcelable parcelable = this.f;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f = parcelable;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof IndexBarModel ? (IndexBarModel) oldItem : null) == null) {
            return null;
        }
        return new d6(this.f57792b != ((IndexBarModel) oldItem).f57792b, !this.f57793c.equals(r6.f57793c), !this.d.equals(r6.d));
    }
}
