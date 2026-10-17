package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefundIneligibilityDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionRefundIneligibilityDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionRefundIneligibilityDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimHyperText f100506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f100507c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel = EsimHyperText.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimHyperText.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EsimSubscriptionRefundIneligibilityDetails(string, esimHyperTextCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionRefundIneligibilityDetails[i];
        }
    }

    public EsimSubscriptionRefundIneligibilityDetails(String title, EsimHyperText subtitle, ArrayList criteria) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(criteria, "criteria");
        this.f100505a = title;
        this.f100506b = subtitle;
        this.f100507c = criteria;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionRefundIneligibilityDetails)) {
            return false;
        }
        EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails = (EsimSubscriptionRefundIneligibilityDetails) obj2;
        return Intrinsics.f(this.f100505a, esimSubscriptionRefundIneligibilityDetails.f100505a) && Intrinsics.f(this.f100506b, esimSubscriptionRefundIneligibilityDetails.f100506b) && this.f100507c.equals(esimSubscriptionRefundIneligibilityDetails.f100507c);
    }

    public final int hashCode() {
        return this.f100507c.hashCode() + ((this.f100506b.hashCode() + (this.f100505a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100505a);
        this.f100506b.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f100507c, dest);
        while (itY.hasNext()) {
            ((EsimHyperText) itY.next()).writeToParcel(dest, i);
        }
    }
}
