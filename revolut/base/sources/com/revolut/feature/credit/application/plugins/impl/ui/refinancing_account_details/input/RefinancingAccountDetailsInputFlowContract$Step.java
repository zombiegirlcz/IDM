package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "InputStep", "OpenDocumentsUpload", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputFlowContract$Step$InputStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputFlowContract$Step$OpenDocumentsUpload;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RefinancingAccountDetailsInputFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputFlowContract$Step$OpenDocumentsUpload;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenDocumentsUpload implements RefinancingAccountDetailsInputFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenDocumentsUpload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68266b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenDocumentsUpload(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenDocumentsUpload[i];
            }
        }

        public OpenDocumentsUpload(int i, String categoryId) {
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            this.f68265a = i;
            this.f68266b = categoryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenDocumentsUpload)) {
                return false;
            }
            OpenDocumentsUpload openDocumentsUpload = (OpenDocumentsUpload) obj2;
            return this.f68265a == openDocumentsUpload.f68265a && Intrinsics.f(this.f68266b, openDocumentsUpload.f68266b);
        }

        public final int hashCode() {
            return this.f68266b.hashCode() + (Integer.hashCode(this.f68265a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f68265a);
            dest.writeString(this.f68266b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputFlowContract$Step$InputStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputStep implements RefinancingAccountDetailsInputFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InputStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68264a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputStep(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputStep[i];
            }
        }

        public InputStep(int i) {
            this.f68264a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputStep) && this.f68264a == ((InputStep) obj2).f68264a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f68264a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f68264a);
        }

        public InputStep() {
            this(0);
        }
    }
}
