package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubModal;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanHubModal implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanHubModal> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102650b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanHubModal(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanHubModal[i];
        }
    }

    public PlanHubModal(String id10, String deeplink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f102649a = id10;
        this.f102650b = deeplink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanHubModal)) {
            return false;
        }
        PlanHubModal planHubModal = (PlanHubModal) obj2;
        return Intrinsics.f(this.f102649a, planHubModal.f102649a) && Intrinsics.f(this.f102650b, planHubModal.f102650b);
    }

    public final int hashCode() {
        return this.f102650b.hashCode() + (this.f102649a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102649a);
        dest.writeString(this.f102650b);
    }
}
