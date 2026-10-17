package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/AdditionalFieldsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DropdownSelector", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/AdditionalFieldsScreenContract$ModalStep$DropdownSelector;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AdditionalFieldsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/AdditionalFieldsScreenContract$ModalStep$DropdownSelector;", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/AdditionalFieldsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropdownSelector implements AdditionalFieldsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DropdownSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f81553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AdditionalFieldInput.DropdownInput f81554b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(DropdownSelector.class, parcel, arrayList, iE, 1);
                }
                return new DropdownSelector(arrayList, AdditionalFieldInput.DropdownInput.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropdownSelector[i];
            }
        }

        public DropdownSelector(List fieldInputs, AdditionalFieldInput.DropdownInput dropdownField) {
            Intrinsics.checkNotNullParameter(fieldInputs, "fieldInputs");
            Intrinsics.checkNotNullParameter(dropdownField, "dropdownField");
            this.f81553a = fieldInputs;
            this.f81554b = dropdownField;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DropdownSelector)) {
                return false;
            }
            DropdownSelector dropdownSelector = (DropdownSelector) obj2;
            return Intrinsics.f(this.f81553a, dropdownSelector.f81553a) && Intrinsics.f(this.f81554b, dropdownSelector.f81554b);
        }

        public final int hashCode() {
            return this.f81554b.hashCode() + (this.f81553a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f81553a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            this.f81554b.writeToParcel(dest, i);
        }
    }
}
