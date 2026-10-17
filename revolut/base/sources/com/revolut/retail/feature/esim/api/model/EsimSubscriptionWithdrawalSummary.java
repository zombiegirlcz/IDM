package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionWithdrawalSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionWithdrawalSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionWithdrawalSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimHyperText f100522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimHyperText f100523c;
    public final ArrayList d;
    public final EsimSubscriptionWithdrawalConfirmation e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Parcelable.Creator<EsimHyperText<?, ?>> creator = EsimHyperText.CREATOR;
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel = creator.createFromParcel(parcel);
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel2 = creator.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimSubscriptionWithdrawalInfoSection.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EsimSubscriptionWithdrawalSummary(string, esimHyperTextCreateFromParcel, esimHyperTextCreateFromParcel2, arrayList, parcel.readInt() == 0 ? null : EsimSubscriptionWithdrawalConfirmation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionWithdrawalSummary[i];
        }
    }

    public EsimSubscriptionWithdrawalSummary(String str, EsimHyperText subtitle, EsimHyperText terms, ArrayList sections, EsimSubscriptionWithdrawalConfirmation esimSubscriptionWithdrawalConfirmation) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f100521a = str;
        this.f100522b = subtitle;
        this.f100523c = terms;
        this.d = sections;
        this.e = esimSubscriptionWithdrawalConfirmation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionWithdrawalSummary)) {
            return false;
        }
        EsimSubscriptionWithdrawalSummary esimSubscriptionWithdrawalSummary = (EsimSubscriptionWithdrawalSummary) obj2;
        return Intrinsics.f(this.f100521a, esimSubscriptionWithdrawalSummary.f100521a) && Intrinsics.f(this.f100522b, esimSubscriptionWithdrawalSummary.f100522b) && Intrinsics.f(this.f100523c, esimSubscriptionWithdrawalSummary.f100523c) && this.d.equals(esimSubscriptionWithdrawalSummary.d) && Intrinsics.f(this.e, esimSubscriptionWithdrawalSummary.e);
    }

    public final int hashCode() {
        String str = this.f100521a;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f100523c.hashCode() + ((this.f100522b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31);
        EsimSubscriptionWithdrawalConfirmation esimSubscriptionWithdrawalConfirmation = this.e;
        return iB + (esimSubscriptionWithdrawalConfirmation != null ? esimSubscriptionWithdrawalConfirmation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100521a);
        this.f100522b.writeToParcel(dest, i);
        this.f100523c.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((EsimSubscriptionWithdrawalInfoSection) itY.next()).writeToParcel(dest, i);
        }
        EsimSubscriptionWithdrawalConfirmation esimSubscriptionWithdrawalConfirmation = this.e;
        if (esimSubscriptionWithdrawalConfirmation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimSubscriptionWithdrawalConfirmation.writeToParcel(dest, i);
        }
    }
}
