package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/missing_fields/MissingFieldsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DefinitionSelector", "SearchList", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/missing_fields/MissingFieldsScreenContract$ModalStep$DefinitionSelector;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/missing_fields/MissingFieldsScreenContract$ModalStep$SearchList;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MissingFieldsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/missing_fields/MissingFieldsScreenContract$ModalStep$DefinitionSelector;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/missing_fields/MissingFieldsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DefinitionSelector implements MissingFieldsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DefinitionSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f99764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field$BackendDefinition.DropdownDefinition f99765b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(DefinitionSelector.class, parcel, arrayList, iE, 1);
                }
                return new DefinitionSelector(arrayList, Field$BackendDefinition.DropdownDefinition.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DefinitionSelector[i];
            }
        }

        public DefinitionSelector(List backendDefinitions, Field$BackendDefinition.DropdownDefinition dropdownDefinition) {
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            Intrinsics.checkNotNullParameter(dropdownDefinition, "dropdownDefinition");
            this.f99764a = backendDefinitions;
            this.f99765b = dropdownDefinition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DefinitionSelector)) {
                return false;
            }
            DefinitionSelector definitionSelector = (DefinitionSelector) obj2;
            return Intrinsics.f(this.f99764a, definitionSelector.f99764a) && Intrinsics.f(this.f99765b, definitionSelector.f99765b);
        }

        public final int hashCode() {
            return this.f99765b.hashCode() + (this.f99764a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f99764a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            this.f99765b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/missing_fields/MissingFieldsScreenContract$ModalStep$SearchList;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/missing_fields/MissingFieldsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchList implements MissingFieldsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SearchList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f99766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field$BackendDefinition.SearchList f99767b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SearchList.class, parcel, arrayList, iE, 1);
                }
                return new SearchList(arrayList, Field$BackendDefinition.SearchList.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchList[i];
            }
        }

        public SearchList(List backendDefinitions, Field$BackendDefinition.SearchList searchList) {
            Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
            Intrinsics.checkNotNullParameter(searchList, "searchList");
            this.f99766a = backendDefinitions;
            this.f99767b = searchList;
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
            return Intrinsics.f(this.f99766a, searchList.f99766a) && Intrinsics.f(this.f99767b, searchList.f99767b);
        }

        public final int hashCode() {
            return this.f99767b.hashCode() + (this.f99766a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f99766a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            this.f99767b.writeToParcel(dest, i);
        }
    }
}
