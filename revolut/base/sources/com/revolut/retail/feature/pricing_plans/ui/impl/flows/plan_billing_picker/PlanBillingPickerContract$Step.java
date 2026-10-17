package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.PricingPlanActionModalStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BillingPicker", "DocumentsList", "ActionModal", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step$ActionModal;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step$DocumentsList;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanBillingPickerContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step$ActionModal;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionModal extends PlanBillingPickerContract$Step {

        @NotNull
        public static final Parcelable.Creator<ActionModal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanActionModalStep f103114a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionModal((PricingPlanActionModalStep) parcel.readParcelable(ActionModal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionModal[i];
            }
        }

        public ActionModal(PricingPlanActionModalStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.f103114a = step;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActionModal) && Intrinsics.f(this.f103114a, ((ActionModal) obj2).f103114a);
        }

        public final int hashCode() {
            return this.f103114a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103114a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillingPicker extends PlanBillingPickerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BillingPicker f103115a = new BillingPicker();

        @NotNull
        public static final Parcelable.Creator<BillingPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BillingPicker.f103115a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillingPicker[i];
            }
        }

        private BillingPicker() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof BillingPicker);
        }

        public final int hashCode() {
            return 1209743818;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step$DocumentsList;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsList extends PlanBillingPickerContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f103117b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(DocumentsList.class, parcel, arrayList, iE, 1);
                }
                return new DocumentsList(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsList[i];
            }
        }

        public DocumentsList(String planId, ArrayList documents) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f103116a = planId;
            this.f103117b = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentsList)) {
                return false;
            }
            DocumentsList documentsList = (DocumentsList) obj2;
            return Intrinsics.f(this.f103116a, documentsList.f103116a) && this.f103117b.equals(documentsList.f103117b);
        }

        public final int hashCode() {
            return this.f103117b.hashCode() + (this.f103116a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103116a);
            Iterator itY = j6.a.y(this.f103117b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    private PlanBillingPickerContract$Step() {
    }
}
