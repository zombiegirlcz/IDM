package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker;

import android.os.Parcel;
import android.os.Parcelable;
import hha.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Mode", "Landroid/os/Parcelable;", "Legacy", "Standalone", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Mode$Legacy;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Mode$Standalone;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanBillingPickerContract$Mode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Mode$Legacy;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Mode;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final class Legacy implements PlanBillingPickerContract$Mode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Legacy f103110a = new Legacy();

        @NotNull
        public static final Parcelable.Creator<Legacy> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Legacy.f103110a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Legacy[i];
            }
        }

        private Legacy() {
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode
        /* JADX INFO: renamed from: K8 */
        public final i getF103111a() {
            return null;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Mode$Standalone;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$Mode;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Standalone implements PlanBillingPickerContract$Mode {

        @NotNull
        public static final Parcelable.Creator<Standalone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f103111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f103113c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Standalone(parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Standalone[i];
            }
        }

        public Standalone(i iVar, String str, String str2) {
            this.f103111a = iVar;
            this.f103112b = str;
            this.f103113c = str2;
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode
        /* JADX INFO: renamed from: K8, reason: from getter */
        public final i getF103111a() {
            return this.f103111a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Standalone)) {
                return false;
            }
            Standalone standalone = (Standalone) obj2;
            return this.f103111a == standalone.f103111a && Intrinsics.f(this.f103112b, standalone.f103112b) && Intrinsics.f(this.f103113c, standalone.f103113c);
        }

        public final int hashCode() {
            i iVar = this.f103111a;
            int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            String str = this.f103112b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f103113c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            i iVar = this.f103111a;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
            dest.writeString(this.f103112b);
            dest.writeString(this.f103113c);
        }
    }

    /* JADX INFO: renamed from: K8 */
    i getF103111a();
}
