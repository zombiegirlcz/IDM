package com.revolut.feature.wealth.impl.ui.flows.add_money.composite;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "Lcom/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlowContract$Step;", "COLLECT_DEPOSIT_INFO", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CompositeAddMoneyFlowContract$Step implements FlowStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CompositeAddMoneyFlowContract$Step[] $VALUES;
    public static final CompositeAddMoneyFlowContract$Step COLLECT_DEPOSIT_INFO;

    @NotNull
    public static final Parcelable.Creator<CompositeAddMoneyFlowContract$Step> CREATOR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CompositeAddMoneyFlowContract$Step.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CompositeAddMoneyFlowContract$Step[i];
        }
    }

    static {
        CompositeAddMoneyFlowContract$Step compositeAddMoneyFlowContract$Step = new CompositeAddMoneyFlowContract$Step("COLLECT_DEPOSIT_INFO", 0);
        COLLECT_DEPOSIT_INFO = compositeAddMoneyFlowContract$Step;
        CompositeAddMoneyFlowContract$Step[] compositeAddMoneyFlowContract$StepArr = {compositeAddMoneyFlowContract$Step};
        $VALUES = compositeAddMoneyFlowContract$StepArr;
        $ENTRIES = s.n(compositeAddMoneyFlowContract$StepArr);
        CREATOR = new a();
    }

    public static CompositeAddMoneyFlowContract$Step valueOf(String str) {
        return (CompositeAddMoneyFlowContract$Step) Enum.valueOf(CompositeAddMoneyFlowContract$Step.class, str);
    }

    public static CompositeAddMoneyFlowContract$Step[] values() {
        return (CompositeAddMoneyFlowContract$Step[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
