package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.domain.models.beneficiary.BeneficiarySearchList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s4j.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition", "", "InputDefinition", "DropdownDefinition", "SearchList", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition$DropdownDefinition;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition$InputDefinition;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition$SearchList;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Field$BackendDefinition implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition$DropdownDefinition;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropdownDefinition extends Field$BackendDefinition {

        @NotNull
        public static final Parcelable.Creator<DropdownDefinition> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BankFieldDefinition f99713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99714b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DropdownDefinition((BankFieldDefinition) parcel.readParcelable(DropdownDefinition.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropdownDefinition[i];
            }
        }

        public DropdownDefinition(BankFieldDefinition bankFieldDefinition, String choice) {
            Intrinsics.checkNotNullParameter(bankFieldDefinition, "bankFieldDefinition");
            Intrinsics.checkNotNullParameter(choice, "choice");
            this.f99713a = bankFieldDefinition;
            this.f99714b = choice;
        }

        public static DropdownDefinition b(DropdownDefinition dropdownDefinition, String choice) {
            BankFieldDefinition bankFieldDefinition = dropdownDefinition.f99713a;
            dropdownDefinition.getClass();
            Intrinsics.checkNotNullParameter(bankFieldDefinition, "bankFieldDefinition");
            Intrinsics.checkNotNullParameter(choice, "choice");
            return new DropdownDefinition(bankFieldDefinition, choice);
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BankFieldDefinition getF99718a() {
            return this.f99713a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DropdownDefinition)) {
                return false;
            }
            DropdownDefinition dropdownDefinition = (DropdownDefinition) obj2;
            return Intrinsics.f(this.f99713a, dropdownDefinition.f99713a) && Intrinsics.f(this.f99714b, dropdownDefinition.f99714b);
        }

        public final int hashCode() {
            return this.f99714b.hashCode() + (this.f99713a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99713a, i);
            dest.writeString(this.f99714b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition$InputDefinition;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputDefinition extends Field$BackendDefinition {

        @NotNull
        public static final Parcelable.Creator<InputDefinition> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BankFieldDefinition f99715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f99717c;
        public final c d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputDefinition((BankFieldDefinition) parcel.readParcelable(InputDefinition.class.getClassLoader()), parcel.readString(), parcel.readString(), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputDefinition[i];
            }
        }

        public InputDefinition(BankFieldDefinition bankFieldDefinition, String inputValue, String formattedInput, c validationState) {
            Intrinsics.checkNotNullParameter(bankFieldDefinition, "bankFieldDefinition");
            Intrinsics.checkNotNullParameter(inputValue, "inputValue");
            Intrinsics.checkNotNullParameter(formattedInput, "formattedInput");
            Intrinsics.checkNotNullParameter(validationState, "validationState");
            this.f99715a = bankFieldDefinition;
            this.f99716b = inputValue;
            this.f99717c = formattedInput;
            this.d = validationState;
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BankFieldDefinition getF99718a() {
            return this.f99715a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputDefinition)) {
                return false;
            }
            InputDefinition inputDefinition = (InputDefinition) obj2;
            return Intrinsics.f(this.f99715a, inputDefinition.f99715a) && Intrinsics.f(this.f99716b, inputDefinition.f99716b) && Intrinsics.f(this.f99717c, inputDefinition.f99717c) && this.d == inputDefinition.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f99715a.hashCode() * 31, 31, this.f99716b), 31, this.f99717c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99715a, i);
            dest.writeString(this.f99716b);
            dest.writeString(this.f99717c);
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition$SearchList;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition;", "", "toString", "()Ljava/lang/String;", "SelectedInfo", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchList extends Field$BackendDefinition {

        @NotNull
        public static final Parcelable.Creator<SearchList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BankFieldDefinition f99718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BeneficiarySearchList f99719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f99720c;
        public final SelectedInfo d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$BackendDefinition$SearchList$SelectedInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SelectedInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<SelectedInfo> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99721a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99722b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SelectedInfo(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SelectedInfo[i];
                }
            }

            public SelectedInfo(String selectedName, String selectedBackendValue) {
                Intrinsics.checkNotNullParameter(selectedName, "selectedName");
                Intrinsics.checkNotNullParameter(selectedBackendValue, "selectedBackendValue");
                this.f99721a = selectedName;
                this.f99722b = selectedBackendValue;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SelectedInfo)) {
                    return false;
                }
                SelectedInfo selectedInfo = (SelectedInfo) obj2;
                return Intrinsics.f(this.f99721a, selectedInfo.f99721a) && Intrinsics.f(this.f99722b, selectedInfo.f99722b);
            }

            public final int hashCode() {
                return this.f99722b.hashCode() + (this.f99721a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99721a);
                dest.writeString(this.f99722b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                BankFieldDefinition bankFieldDefinition = (BankFieldDefinition) j6.a.f(parcel, "parcel", SearchList.class);
                BeneficiarySearchList beneficiarySearchList = (BeneficiarySearchList) parcel.readParcelable(SearchList.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SearchList.class, parcel, arrayList, iE, 1);
                }
                return new SearchList(bankFieldDefinition, beneficiarySearchList, arrayList, parcel.readInt() == 0 ? null : SelectedInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchList[i];
            }
        }

        public SearchList(BankFieldDefinition bankFieldDefinition, BeneficiarySearchList searchListData, ArrayList items, SelectedInfo selectedInfo) {
            Intrinsics.checkNotNullParameter(bankFieldDefinition, "bankFieldDefinition");
            Intrinsics.checkNotNullParameter(searchListData, "searchListData");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f99718a = bankFieldDefinition;
            this.f99719b = searchListData;
            this.f99720c = items;
            this.d = selectedInfo;
        }

        public static SearchList b(SearchList searchList, SelectedInfo selectedInfo) {
            BankFieldDefinition bankFieldDefinition = searchList.f99718a;
            BeneficiarySearchList searchListData = searchList.f99719b;
            ArrayList items = searchList.f99720c;
            searchList.getClass();
            Intrinsics.checkNotNullParameter(bankFieldDefinition, "bankFieldDefinition");
            Intrinsics.checkNotNullParameter(searchListData, "searchListData");
            Intrinsics.checkNotNullParameter(items, "items");
            return new SearchList(bankFieldDefinition, searchListData, items, selectedInfo);
        }

        @Override // com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BankFieldDefinition getF99718a() {
            return this.f99718a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SearchList)) {
                return false;
            }
            SearchList searchList = (SearchList) obj2;
            return Intrinsics.f(this.f99718a, searchList.f99718a) && Intrinsics.f(this.f99719b, searchList.f99719b) && this.f99720c.equals(searchList.f99720c) && Intrinsics.f(this.d, searchList.d);
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f99720c, (this.f99719b.hashCode() + (this.f99718a.hashCode() * 31)) * 31, 31);
            SelectedInfo selectedInfo = this.d;
            return iB + (selectedInfo == null ? 0 : selectedInfo.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99718a, i);
            dest.writeParcelable(this.f99719b, i);
            Iterator itY = j6.a.y(this.f99720c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            SelectedInfo selectedInfo = this.d;
            if (selectedInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selectedInfo.writeToParcel(dest, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract BankFieldDefinition getF99718a();
}
