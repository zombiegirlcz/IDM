package com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.kompot.common.IOData$Input;
import h93.f0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_payment_method/impl/flows/link_card/screens/details/LinkCardDetailsReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkCardDetailsReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LinkCardDetailsReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketWithSubaccount f65273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f65274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f65275c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PocketWithSubaccount pocketWithSubaccount = (PocketWithSubaccount) j6.a.f(parcel, "parcel", LinkCardDetailsReviewScreenContract$InputData.class);
            f0 f0Var = (f0) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new LinkCardDetailsReviewScreenContract$InputData(pocketWithSubaccount, f0Var, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkCardDetailsReviewScreenContract$InputData[i];
        }
    }

    public LinkCardDetailsReviewScreenContract$InputData(PocketWithSubaccount pocketWithSubaccount, f0 card, List cardSubscriptions, boolean z) {
        Intrinsics.checkNotNullParameter(pocketWithSubaccount, "pocketWithSubaccount");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardSubscriptions, "cardSubscriptions");
        this.f65273a = pocketWithSubaccount;
        this.f65274b = card;
        this.f65275c = cardSubscriptions;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkCardDetailsReviewScreenContract$InputData)) {
            return false;
        }
        LinkCardDetailsReviewScreenContract$InputData linkCardDetailsReviewScreenContract$InputData = (LinkCardDetailsReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65273a, linkCardDetailsReviewScreenContract$InputData.f65273a) && Intrinsics.f(this.f65274b, linkCardDetailsReviewScreenContract$InputData.f65274b) && Intrinsics.f(this.f65275c, linkCardDetailsReviewScreenContract$InputData.f65275c) && this.d == linkCardDetailsReviewScreenContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d((this.f65274b.hashCode() + (this.f65273a.hashCode() * 31)) * 31, 31, this.f65275c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65273a, i);
        dest.writeSerializable(this.f65274b);
        Iterator itV = p.a.v(this.f65275c, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeInt(this.d ? 1 : 0);
    }
}
