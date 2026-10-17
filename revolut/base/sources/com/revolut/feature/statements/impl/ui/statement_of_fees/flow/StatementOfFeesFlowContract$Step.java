package com.revolut.feature.statements.impl.ui.statement_of_fees.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/statements/impl/ui/statement_of_fees/flow/StatementOfFeesFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "StatementOfFessScreen", "Lcom/revolut/feature/statements/impl/ui/statement_of_fees/flow/StatementOfFeesFlowContract$Step$StatementOfFessScreen;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StatementOfFeesFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/statement_of_fees/flow/StatementOfFeesFlowContract$Step$StatementOfFessScreen;", "Lcom/revolut/feature/statements/impl/ui/statement_of_fees/flow/StatementOfFeesFlowContract$Step;", "<init>", "()V", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StatementOfFessScreen extends StatementOfFeesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StatementOfFessScreen f88391a = new StatementOfFessScreen();

        @NotNull
        public static final Parcelable.Creator<StatementOfFessScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StatementOfFessScreen.f88391a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatementOfFessScreen[i];
            }
        }

        private StatementOfFessScreen() {
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

    private StatementOfFeesFlowContract$Step() {
    }
}
