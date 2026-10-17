package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_hub/CobrandedCardsPlanHubFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Landroid/os/Parcelable;", "", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_hub/CobrandedCardsPlanHubFlowContract$PagerItem;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "OVERVIEW", "REWARDS", "TRANSACTIONS", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsPlanHubFlowContract$PagerItem implements FixedIdPagerItem, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CobrandedCardsPlanHubFlowContract$PagerItem[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanHubFlowContract$PagerItem> CREATOR;
    public static final CobrandedCardsPlanHubFlowContract$PagerItem OVERVIEW;
    public static final CobrandedCardsPlanHubFlowContract$PagerItem REWARDS;
    public static final CobrandedCardsPlanHubFlowContract$PagerItem TRANSACTIONS;

    @NotNull
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CobrandedCardsPlanHubFlowContract$PagerItem.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanHubFlowContract$PagerItem[i];
        }
    }

    static {
        CobrandedCardsPlanHubFlowContract$PagerItem cobrandedCardsPlanHubFlowContract$PagerItem = new CobrandedCardsPlanHubFlowContract$PagerItem("OVERVIEW", 0, "OVERVIEW");
        OVERVIEW = cobrandedCardsPlanHubFlowContract$PagerItem;
        CobrandedCardsPlanHubFlowContract$PagerItem cobrandedCardsPlanHubFlowContract$PagerItem2 = new CobrandedCardsPlanHubFlowContract$PagerItem("REWARDS", 1, "REWARDS");
        REWARDS = cobrandedCardsPlanHubFlowContract$PagerItem2;
        CobrandedCardsPlanHubFlowContract$PagerItem cobrandedCardsPlanHubFlowContract$PagerItem3 = new CobrandedCardsPlanHubFlowContract$PagerItem("TRANSACTIONS", 2, "TRANSACTIONS");
        TRANSACTIONS = cobrandedCardsPlanHubFlowContract$PagerItem3;
        CobrandedCardsPlanHubFlowContract$PagerItem[] cobrandedCardsPlanHubFlowContract$PagerItemArr = {cobrandedCardsPlanHubFlowContract$PagerItem, cobrandedCardsPlanHubFlowContract$PagerItem2, cobrandedCardsPlanHubFlowContract$PagerItem3};
        $VALUES = cobrandedCardsPlanHubFlowContract$PagerItemArr;
        $ENTRIES = s.n(cobrandedCardsPlanHubFlowContract$PagerItemArr);
        CREATOR = new a();
    }

    public CobrandedCardsPlanHubFlowContract$PagerItem(String str, int i, String str2) {
        this.id = str2;
    }

    public static CobrandedCardsPlanHubFlowContract$PagerItem valueOf(String str) {
        return (CobrandedCardsPlanHubFlowContract$PagerItem) Enum.valueOf(CobrandedCardsPlanHubFlowContract$PagerItem.class, str);
    }

    public static CobrandedCardsPlanHubFlowContract$PagerItem[] values() {
        return (CobrandedCardsPlanHubFlowContract$PagerItem[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
