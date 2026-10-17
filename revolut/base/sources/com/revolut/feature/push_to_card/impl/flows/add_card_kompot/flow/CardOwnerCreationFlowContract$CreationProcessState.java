package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.push_to_card.api.model.CardEligibility;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$CreationProcessState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardOwnerCreationFlowContract$CreationProcessState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardOwnerCreationFlowContract$CreationProcessState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwnerInfoState f81565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardEligibility f81566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f81567c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            CardOwnerInfoState cardOwnerInfoState = (CardOwnerInfoState) j6.a.f(parcel, "parcel", CardOwnerCreationFlowContract$CreationProcessState.class);
            CardEligibility cardEligibility = (CardEligibility) parcel.readParcelable(CardOwnerCreationFlowContract$CreationProcessState.class.getClassLoader());
            Address address = (Address) parcel.readParcelable(CardOwnerCreationFlowContract$CreationProcessState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(CardOwnerCreationFlowContract$CreationProcessState.class, parcel, arrayList2, iE, 1);
                }
                arrayList = arrayList2;
            }
            return new CardOwnerCreationFlowContract$CreationProcessState(cardOwnerInfoState, cardEligibility, address, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardOwnerCreationFlowContract$CreationProcessState[i];
        }
    }

    public CardOwnerCreationFlowContract$CreationProcessState(CardOwnerInfoState cardOwnerInfo, CardEligibility eligibility, Address address, List list) {
        Intrinsics.checkNotNullParameter(cardOwnerInfo, "cardOwnerInfo");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f81565a = cardOwnerInfo;
        this.f81566b = eligibility;
        this.f81567c = address;
        this.d = list;
    }

    public static CardOwnerCreationFlowContract$CreationProcessState a(CardOwnerCreationFlowContract$CreationProcessState cardOwnerCreationFlowContract$CreationProcessState, Address address, List list, int i) {
        CardOwnerInfoState cardOwnerInfo = cardOwnerCreationFlowContract$CreationProcessState.f81565a;
        CardEligibility eligibility = cardOwnerCreationFlowContract$CreationProcessState.f81566b;
        if ((i & 4) != 0) {
            address = cardOwnerCreationFlowContract$CreationProcessState.f81567c;
        }
        if ((i & 8) != 0) {
            list = cardOwnerCreationFlowContract$CreationProcessState.d;
        }
        cardOwnerCreationFlowContract$CreationProcessState.getClass();
        Intrinsics.checkNotNullParameter(cardOwnerInfo, "cardOwnerInfo");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        return new CardOwnerCreationFlowContract$CreationProcessState(cardOwnerInfo, eligibility, address, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardOwnerCreationFlowContract$CreationProcessState)) {
            return false;
        }
        CardOwnerCreationFlowContract$CreationProcessState cardOwnerCreationFlowContract$CreationProcessState = (CardOwnerCreationFlowContract$CreationProcessState) obj2;
        return Intrinsics.f(this.f81565a, cardOwnerCreationFlowContract$CreationProcessState.f81565a) && Intrinsics.f(this.f81566b, cardOwnerCreationFlowContract$CreationProcessState.f81566b) && Intrinsics.f(this.f81567c, cardOwnerCreationFlowContract$CreationProcessState.f81567c) && Intrinsics.f(this.d, cardOwnerCreationFlowContract$CreationProcessState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f81566b.hashCode() + (this.f81565a.hashCode() * 31)) * 31;
        Address address = this.f81567c;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        List list = this.d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81565a, i);
        dest.writeParcelable(this.f81566b, i);
        dest.writeParcelable(this.f81567c, i);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }
}
