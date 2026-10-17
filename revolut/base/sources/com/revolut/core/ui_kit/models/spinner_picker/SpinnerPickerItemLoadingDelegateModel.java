package com.revolut.core.ui_kit.models.spinner_picker;

import android.os.Parcelable;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ow0.b;
import p.a;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/spinner_picker/SpinnerPickerItemLoadingDelegateModel;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpinnerPickerItemLoadingDelegateModel implements j, TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f58158c;

    public SpinnerPickerItemLoadingDelegateModel(boolean z, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f58156a = z;
        this.f58157b = listId;
        this.f58158c = null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF58157b() {
        return this.f58157b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpinnerPickerItemLoadingDelegateModel)) {
            return false;
        }
        SpinnerPickerItemLoadingDelegateModel spinnerPickerItemLoadingDelegateModel = (SpinnerPickerItemLoadingDelegateModel) obj2;
        return this.f58156a == spinnerPickerItemLoadingDelegateModel.f58156a && Intrinsics.f(this.f58157b, spinnerPickerItemLoadingDelegateModel.f58157b) && Intrinsics.f(this.f58158c, spinnerPickerItemLoadingDelegateModel.f58158c);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF58158c() {
        return this.f58158c;
    }

    public final int hashCode() {
        int iC = a.c(j6.a.c(Boolean.hashCode(this.f58156a) * 31, 31, false), 31, this.f58157b);
        Parcelable parcelable = this.f58158c;
        return iC + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f58158c = parcelable;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof SpinnerPickerItemLoadingDelegateModel ? (SpinnerPickerItemLoadingDelegateModel) oldItem : null) != null) {
            return new b(this.f58156a != ((SpinnerPickerItemLoadingDelegateModel) oldItem).f58156a, false);
        }
        return null;
    }
}
