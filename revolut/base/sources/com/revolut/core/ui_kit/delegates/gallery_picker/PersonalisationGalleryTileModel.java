package com.revolut.core.ui_kit.delegates.gallery_picker;

import android.os.Parcelable;
import aw0.v8;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import koi.j;
import koi.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lp0.a;
import qv0.p;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/gallery_picker/PersonalisationGalleryTileModel;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalisationGalleryTileModel implements j, p, TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v8 f54214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P2pPersonalisation f54215c;
    public Parcelable d;

    public PersonalisationGalleryTileModel(String listId, v8 tile, P2pPersonalisation p2pPersonalisation) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f54213a = listId;
        this.f54214b = tile;
        this.f54215c = p2pPersonalisation;
        this.d = null;
    }

    @Override // koi.j
    public final k T1() {
        return new PersonalisationGalleryTileDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getZ() {
        return this.f54215c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF54213a() {
        return this.f54213a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PersonalisationGalleryTileModel)) {
            return false;
        }
        PersonalisationGalleryTileModel personalisationGalleryTileModel = (PersonalisationGalleryTileModel) obj2;
        return Intrinsics.f(this.f54213a, personalisationGalleryTileModel.f54213a) && this.f54214b.equals(personalisationGalleryTileModel.f54214b) && this.f54215c.equals(personalisationGalleryTileModel.f54215c) && Intrinsics.f(this.d, personalisationGalleryTileModel.d);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getD() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f54215c.hashCode() + ((this.f54214b.hashCode() + (this.f54213a.hashCode() * 31)) * 31)) * 31;
        Parcelable parcelable = this.d;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.d = parcelable;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return new a(!Intrinsics.f((oldItem instanceof PersonalisationGalleryTileModel ? (PersonalisationGalleryTileModel) oldItem : null) != null ? r4.f54214b : null, this.f54214b));
    }
}
