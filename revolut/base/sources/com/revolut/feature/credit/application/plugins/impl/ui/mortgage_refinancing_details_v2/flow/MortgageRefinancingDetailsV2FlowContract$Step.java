package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xy3.a;
import xy3.l;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "QuestionnaireStep", "ChangeAddressStep", "DeclinePopup", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step$ChangeAddressStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step$DeclinePopup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step$QuestionnaireStep;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MortgageRefinancingDetailsV2FlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step$ChangeAddressStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeAddressStep implements MortgageRefinancingDetailsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChangeAddressStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Address f68007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xy3.c f68008c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeAddressStep(parcel.readString(), (Address) parcel.readParcelable(ChangeAddressStep.class.getClassLoader()), (xy3.c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeAddressStep[i];
            }
        }

        public ChangeAddressStep(String stepId, Address userAddress, xy3.c configuration) {
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(userAddress, "userAddress");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f68006a = stepId;
            this.f68007b = userAddress;
            this.f68008c = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChangeAddressStep)) {
                return false;
            }
            ChangeAddressStep changeAddressStep = (ChangeAddressStep) obj2;
            return Intrinsics.f(this.f68006a, changeAddressStep.f68006a) && Intrinsics.f(this.f68007b, changeAddressStep.f68007b) && Intrinsics.f(this.f68008c, changeAddressStep.f68008c);
        }

        public final int hashCode() {
            return this.f68008c.hashCode() + ((this.f68007b.hashCode() + (this.f68006a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68006a);
            dest.writeParcelable(this.f68007b, i);
            dest.writeSerializable(this.f68008c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step$DeclinePopup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclinePopup implements MortgageRefinancingDetailsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeclinePopup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f68009a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclinePopup((l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclinePopup[i];
            }
        }

        public DeclinePopup(l configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f68009a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeclinePopup) && Intrinsics.f(this.f68009a, ((DeclinePopup) obj2).f68009a);
        }

        public final int hashCode() {
            return this.f68009a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68009a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial implements MortgageRefinancingDetailsV2FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f68010a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f68010a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step$QuestionnaireStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QuestionnaireStep implements MortgageRefinancingDetailsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QuestionnaireStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f68011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.b f68012b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QuestionnaireStep(parcel.readInt() != 0, (a.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QuestionnaireStep[i];
            }
        }

        public QuestionnaireStep(boolean z, a.b questionnaireStep) {
            Intrinsics.checkNotNullParameter(questionnaireStep, "questionnaireStep");
            this.f68011a = z;
            this.f68012b = questionnaireStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QuestionnaireStep)) {
                return false;
            }
            QuestionnaireStep questionnaireStep = (QuestionnaireStep) obj2;
            return this.f68011a == questionnaireStep.f68011a && Intrinsics.f(this.f68012b, questionnaireStep.f68012b);
        }

        public final int hashCode() {
            return this.f68012b.hashCode() + (Boolean.hashCode(this.f68011a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f68011a ? 1 : 0);
            dest.writeSerializable(this.f68012b);
        }
    }
}
