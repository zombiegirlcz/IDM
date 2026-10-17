package com.revolut.core.ui_kit.models.spinner_picker;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p.a;
import qv0.p;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/spinner_picker/SpinnerPickerItemDelegateModel;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpinnerPickerItemDelegateModel implements j, TrackableItem, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.Default f58153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f58154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58155c;
    public final Object d;
    public Parcelable e;
    public final boolean f;

    public SpinnerPickerItemDelegateModel(AvatarModel.Default avatarModel, Clause title, String listId, Object obj2, int i) {
        boolean z = (i & 64) == 0;
        Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f58153a = avatarModel;
        this.f58154b = title;
        this.f58155c = listId;
        this.d = obj2;
        this.e = null;
        this.f = z;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getF() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF51641a() {
        return this.f58155c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpinnerPickerItemDelegateModel)) {
            return false;
        }
        SpinnerPickerItemDelegateModel spinnerPickerItemDelegateModel = (SpinnerPickerItemDelegateModel) obj2;
        return this.f58153a.equals(spinnerPickerItemDelegateModel.f58153a) && this.f58154b.equals(spinnerPickerItemDelegateModel.f58154b) && Intrinsics.f(this.f58155c, spinnerPickerItemDelegateModel.f58155c) && this.d.equals(spinnerPickerItemDelegateModel.d) && Intrinsics.f(this.e, spinnerPickerItemDelegateModel.e) && this.f == spinnerPickerItemDelegateModel.f;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF51644g() {
        return this.e;
    }

    public final int hashCode() {
        int iB = a.b(a.c(a.b(this.f58153a.hashCode() * 31, 961, this.f58154b), 31, this.f58155c), 31, this.d);
        Parcelable parcelable = this.e;
        return Boolean.hashCode(this.f) + ((iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.e = parcelable;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof SpinnerPickerItemDelegateModel ? (SpinnerPickerItemDelegateModel) oldItem : null) == null) {
            return null;
        }
        return new ow0.a(!this.f58153a.equals(r7.f58153a), !this.f58154b.equals(r7.f58154b), !true, this.f != ((SpinnerPickerItemDelegateModel) oldItem).f);
    }
}
