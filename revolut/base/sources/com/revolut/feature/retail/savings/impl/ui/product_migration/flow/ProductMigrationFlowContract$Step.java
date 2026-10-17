package com.revolut.feature.retail.savings.impl.ui.product_migration.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Migration", "EligibilityWorkflow", "Documents", "Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step$Documents;", "Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step$EligibilityWorkflow;", "Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step$Migration;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductMigrationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step$Documents;", "Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Documents implements ProductMigrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83382a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Documents(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        public Documents(String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f83382a = productId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Documents) && Intrinsics.f(this.f83382a, ((Documents) obj2).f83382a);
        }

        public final int hashCode() {
            return this.f83382a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83382a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step$EligibilityWorkflow;", "Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EligibilityWorkflow implements ProductMigrationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EligibilityWorkflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f83383a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new EligibilityWorkflow(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EligibilityWorkflow[i];
            }
        }

        public EligibilityWorkflow(Map workflowParams) {
            Intrinsics.checkNotNullParameter(workflowParams, "workflowParams");
            this.f83383a = workflowParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EligibilityWorkflow) && Intrinsics.f(this.f83383a, ((EligibilityWorkflow) obj2).f83383a);
        }

        public final int hashCode() {
            return this.f83383a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itZ = j6.a.z(this.f83383a, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step$Migration;", "Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlowContract$Step;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Migration implements ProductMigrationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Migration f83384a = new Migration();

        @NotNull
        public static final Parcelable.Creator<Migration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Migration.f83384a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Migration[i];
            }
        }

        private Migration() {
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
