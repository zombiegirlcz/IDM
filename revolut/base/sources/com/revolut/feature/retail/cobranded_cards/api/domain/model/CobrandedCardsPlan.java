package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r5b.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlan;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlan implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlan> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82306c;
    public final String d;
    public final String e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f82307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CobrandedCardsCardConfiguration f82308h;
    public final CobrandedCardsCardConfiguration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f82309j;
    public final ParameterisedHyperText k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CobrandedCardsPlanCardFees f82310l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsBenefit.CREATOR, parcel, arrayList, iA, 1);
            }
            String string6 = parcel.readString();
            Parcelable.Creator<CobrandedCardsCardConfiguration> creator = CobrandedCardsCardConfiguration.CREATOR;
            return new CobrandedCardsPlan(string, string2, string3, string4, string5, arrayList, string6, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), (ParameterisedHyperText) parcel.readParcelable(CobrandedCardsPlan.class.getClassLoader()), parcel.readInt() != 0 ? CobrandedCardsPlanCardFees.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlan[i];
        }
    }

    public CobrandedCardsPlan(String id10, String tier, String title, String str, String backgroundImageUrl, ArrayList benefitList, String actionButtonText, CobrandedCardsCardConfiguration cardConfiguration, CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration, i iVar, ParameterisedHyperText parameterisedHyperText, CobrandedCardsPlanCardFees cobrandedCardsPlanCardFees) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.checkNotNullParameter(benefitList, "benefitList");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        this.f82304a = id10;
        this.f82305b = tier;
        this.f82306c = title;
        this.d = str;
        this.e = backgroundImageUrl;
        this.f = benefitList;
        this.f82307g = actionButtonText;
        this.f82308h = cardConfiguration;
        this.i = cobrandedCardsCardConfiguration;
        this.f82309j = iVar;
        this.k = parameterisedHyperText;
        this.f82310l = cobrandedCardsPlanCardFees;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlan)) {
            return false;
        }
        CobrandedCardsPlan cobrandedCardsPlan = (CobrandedCardsPlan) obj2;
        return Intrinsics.f(this.f82304a, cobrandedCardsPlan.f82304a) && Intrinsics.f(this.f82305b, cobrandedCardsPlan.f82305b) && Intrinsics.f(this.f82306c, cobrandedCardsPlan.f82306c) && Intrinsics.f(this.d, cobrandedCardsPlan.d) && Intrinsics.f(this.e, cobrandedCardsPlan.e) && this.f.equals(cobrandedCardsPlan.f) && Intrinsics.f(this.f82307g, cobrandedCardsPlan.f82307g) && Intrinsics.f(this.f82308h, cobrandedCardsPlan.f82308h) && Intrinsics.f(this.i, cobrandedCardsPlan.i) && this.f82309j == cobrandedCardsPlan.f82309j && Intrinsics.f(this.k, cobrandedCardsPlan.k) && Intrinsics.f(this.f82310l, cobrandedCardsPlan.f82310l);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f82304a.hashCode() * 31, 31, this.f82305b), 31, this.f82306c);
        String str = this.d;
        int iHashCode = (this.f82308h.hashCode() + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31), 31, this.f82307g)) * 31;
        CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration = this.i;
        int iHashCode2 = (iHashCode + (cobrandedCardsCardConfiguration == null ? 0 : cobrandedCardsCardConfiguration.hashCode())) * 31;
        i iVar = this.f82309j;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        ParameterisedHyperText parameterisedHyperText = this.k;
        int iHashCode4 = (iHashCode3 + (parameterisedHyperText == null ? 0 : parameterisedHyperText.f74758a.hashCode())) * 31;
        CobrandedCardsPlanCardFees cobrandedCardsPlanCardFees = this.f82310l;
        return iHashCode4 + (cobrandedCardsPlanCardFees != null ? cobrandedCardsPlanCardFees.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82304a);
        dest.writeString(this.f82305b);
        dest.writeString(this.f82306c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((CobrandedCardsBenefit) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f82307g);
        this.f82308h.writeToParcel(dest, i);
        CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration = this.i;
        if (cobrandedCardsCardConfiguration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsCardConfiguration.writeToParcel(dest, i);
        }
        i iVar = this.f82309j;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
        dest.writeParcelable(this.k, i);
        CobrandedCardsPlanCardFees cobrandedCardsPlanCardFees = this.f82310l;
        if (cobrandedCardsPlanCardFees == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanCardFees.writeToParcel(dest, i);
        }
    }
}
