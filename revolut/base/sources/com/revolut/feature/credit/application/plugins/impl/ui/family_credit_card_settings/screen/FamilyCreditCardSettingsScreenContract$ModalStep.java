package com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dx4.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/family_credit_card_settings/screen/FamilyCreditCardSettingsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AmountInput", "Lcom/revolut/feature/credit/application/plugins/impl/ui/family_credit_card_settings/screen/FamilyCreditCardSettingsScreenContract$ModalStep$AmountInput;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FamilyCreditCardSettingsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/family_credit_card_settings/screen/FamilyCreditCardSettingsScreenContract$ModalStep$AmountInput;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/family_credit_card_settings/screen/FamilyCreditCardSettingsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountInput extends FamilyCreditCardSettingsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AmountInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f67676a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountInput((y) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountInput[i];
            }
        }

        public AmountInput(y config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f67676a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AmountInput) && Intrinsics.f(this.f67676a, ((AmountInput) obj2).f67676a);
        }

        public final int hashCode() {
            return this.f67676a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67676a);
        }
    }

    private FamilyCreditCardSettingsScreenContract$ModalStep() {
    }
}
