package com.revolut.feature.statements.impl.ui.consolidated.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/statements/impl/ui/consolidated/flow/ConsolidatedStatementFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ConsolidatedStatementScreen", "BankIDAnnualStatementsScreen", "Lcom/revolut/feature/statements/impl/ui/consolidated/flow/ConsolidatedStatementFlowContract$Step$BankIDAnnualStatementsScreen;", "Lcom/revolut/feature/statements/impl/ui/consolidated/flow/ConsolidatedStatementFlowContract$Step$ConsolidatedStatementScreen;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConsolidatedStatementFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/flow/ConsolidatedStatementFlowContract$Step$BankIDAnnualStatementsScreen;", "Lcom/revolut/feature/statements/impl/ui/consolidated/flow/ConsolidatedStatementFlowContract$Step;", "<init>", "()V", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BankIDAnnualStatementsScreen extends ConsolidatedStatementFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BankIDAnnualStatementsScreen f88310a = new BankIDAnnualStatementsScreen();

        @NotNull
        public static final Parcelable.Creator<BankIDAnnualStatementsScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BankIDAnnualStatementsScreen.f88310a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankIDAnnualStatementsScreen[i];
            }
        }

        private BankIDAnnualStatementsScreen() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/flow/ConsolidatedStatementFlowContract$Step$ConsolidatedStatementScreen;", "Lcom/revolut/feature/statements/impl/ui/consolidated/flow/ConsolidatedStatementFlowContract$Step;", "<init>", "()V", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConsolidatedStatementScreen extends ConsolidatedStatementFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConsolidatedStatementScreen f88311a = new ConsolidatedStatementScreen();

        @NotNull
        public static final Parcelable.Creator<ConsolidatedStatementScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConsolidatedStatementScreen.f88311a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsolidatedStatementScreen[i];
            }
        }

        private ConsolidatedStatementScreen() {
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

    private ConsolidatedStatementFlowContract$Step() {
    }
}
