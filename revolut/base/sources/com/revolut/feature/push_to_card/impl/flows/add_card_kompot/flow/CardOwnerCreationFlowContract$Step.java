package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CardOwnerMainInfo", "Address", "AdditionalFields", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step$AdditionalFields;", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step$Address;", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step$CardOwnerMainInfo;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardOwnerCreationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step$AdditionalFields;", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalFields implements CardOwnerCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalFields> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwnerCreationFlowContract$CreationProcessState f81568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f81569b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                CardOwnerCreationFlowContract$CreationProcessState cardOwnerCreationFlowContract$CreationProcessStateCreateFromParcel = CardOwnerCreationFlowContract$CreationProcessState.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(AdditionalFields.class, parcel, arrayList, iE, 1);
                }
                return new AdditionalFields(cardOwnerCreationFlowContract$CreationProcessStateCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalFields[i];
            }
        }

        public AdditionalFields(CardOwnerCreationFlowContract$CreationProcessState creationProcessState, List additionalFields) {
            Intrinsics.checkNotNullParameter(creationProcessState, "creationProcessState");
            Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
            this.f81568a = creationProcessState;
            this.f81569b = additionalFields;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalFields)) {
                return false;
            }
            AdditionalFields additionalFields = (AdditionalFields) obj2;
            return Intrinsics.f(this.f81568a, additionalFields.f81568a) && Intrinsics.f(this.f81569b, additionalFields.f81569b);
        }

        public final int hashCode() {
            return this.f81569b.hashCode() + (this.f81568a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81568a.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f81569b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step$Address;", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Address implements CardOwnerCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwnerCreationFlowContract$CreationProcessState f81570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f81571b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(CardOwnerCreationFlowContract$CreationProcessState.CREATOR.createFromParcel(parcel), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address(CardOwnerCreationFlowContract$CreationProcessState creationProcessState, wi0.b preselectedCountry) {
            Intrinsics.checkNotNullParameter(creationProcessState, "creationProcessState");
            Intrinsics.checkNotNullParameter(preselectedCountry, "preselectedCountry");
            this.f81570a = creationProcessState;
            this.f81571b = preselectedCountry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Address)) {
                return false;
            }
            Address address = (Address) obj2;
            return Intrinsics.f(this.f81570a, address.f81570a) && Intrinsics.f(this.f81571b, address.f81571b);
        }

        public final int hashCode() {
            return this.f81571b.f297794a.hashCode() + (this.f81570a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81570a.writeToParcel(dest, i);
            dest.writeSerializable(this.f81571b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step$CardOwnerMainInfo;", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlowContract$Step;", "<init>", "()V", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardOwnerMainInfo implements CardOwnerCreationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardOwnerMainInfo f81572a = new CardOwnerMainInfo();

        @NotNull
        public static final Parcelable.Creator<CardOwnerMainInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardOwnerMainInfo.f81572a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOwnerMainInfo[i];
            }
        }

        private CardOwnerMainInfo() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
