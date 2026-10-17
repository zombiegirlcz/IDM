package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreCampaignInstalmentOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreCampaignInstalmentOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreCampaignInstalmentOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f88442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f88444c;
    public final dj0.d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreCampaignInstalmentOption(d.valueOf(parcel.readString()), parcel.readString(), parcel.createStringArrayList(), (dj0.d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreCampaignInstalmentOption[i];
        }
    }

    public StoreCampaignInstalmentOption(d type, String termsLink, List instalmentPeriods, dj0.d minPurchaseAmount) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(termsLink, "termsLink");
        Intrinsics.checkNotNullParameter(instalmentPeriods, "instalmentPeriods");
        Intrinsics.checkNotNullParameter(minPurchaseAmount, "minPurchaseAmount");
        this.f88442a = type;
        this.f88443b = termsLink;
        this.f88444c = instalmentPeriods;
        this.d = minPurchaseAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreCampaignInstalmentOption)) {
            return false;
        }
        StoreCampaignInstalmentOption storeCampaignInstalmentOption = (StoreCampaignInstalmentOption) obj2;
        return this.f88442a == storeCampaignInstalmentOption.f88442a && Intrinsics.f(this.f88443b, storeCampaignInstalmentOption.f88443b) && Intrinsics.f(this.f88444c, storeCampaignInstalmentOption.f88444c) && Intrinsics.f(this.d, storeCampaignInstalmentOption.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f88442a.hashCode() * 31, 31, this.f88443b), 31, this.f88444c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88442a.name());
        dest.writeString(this.f88443b);
        dest.writeStringList(this.f88444c);
        dest.writeSerializable(this.d);
    }
}
