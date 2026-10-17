package com.revolut.feature_retail_user_declarations.risk_assessment.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskAssessmentScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ConfirmDialog", "InfoDialog", "Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskAssessmentScreenContract$ModalStep$ConfirmDialog;", "Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskAssessmentScreenContract$ModalStep$InfoDialog;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RiskAssessmentScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskAssessmentScreenContract$ModalStep$ConfirmDialog;", "Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskAssessmentScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmDialog implements RiskAssessmentScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ConfirmDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RiskItem.Option f97732a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmDialog(RiskItem.Option.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmDialog[i];
            }
        }

        public ConfirmDialog(RiskItem.Option option) {
            Intrinsics.checkNotNullParameter(option, "option");
            this.f97732a = option;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmDialog) && Intrinsics.f(this.f97732a, ((ConfirmDialog) obj2).f97732a);
        }

        public final int hashCode() {
            return this.f97732a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97732a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskAssessmentScreenContract$ModalStep$InfoDialog;", "Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskAssessmentScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoDialog implements RiskAssessmentScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RiskItem.Option f97733a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InfoDialog(RiskItem.Option.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoDialog[i];
            }
        }

        public InfoDialog(RiskItem.Option option) {
            Intrinsics.checkNotNullParameter(option, "option");
            this.f97733a = option;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InfoDialog) && Intrinsics.f(this.f97733a, ((InfoDialog) obj2).f97733a);
        }

        public final int hashCode() {
            return this.f97733a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97733a.writeToParcel(dest, i);
        }
    }
}
