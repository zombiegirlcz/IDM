package com.revolut.retail.feature.plan_gifting.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingRefund;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanGiftingRefund implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanGiftingRefund> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f102443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanGiftingHyperText f102444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlanGiftingHyperText f102445c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            Parcelable.Creator<PlanGiftingHyperText> creator = PlanGiftingHyperText.CREATOR;
            return new PlanGiftingRefund(dVar, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanGiftingRefund[i];
        }
    }

    public PlanGiftingRefund(d dVar, PlanGiftingHyperText title, PlanGiftingHyperText subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f102443a = dVar;
        this.f102444b = title;
        this.f102445c = subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanGiftingRefund)) {
            return false;
        }
        PlanGiftingRefund planGiftingRefund = (PlanGiftingRefund) obj2;
        return Intrinsics.f(this.f102443a, planGiftingRefund.f102443a) && Intrinsics.f(this.f102444b, planGiftingRefund.f102444b) && Intrinsics.f(this.f102445c, planGiftingRefund.f102445c);
    }

    public final int hashCode() {
        d dVar = this.f102443a;
        return this.f102445c.hashCode() + ((this.f102444b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f102443a);
        this.f102444b.writeToParcel(dest, i);
        this.f102445c.writeToParcel(dest, i);
    }
}
