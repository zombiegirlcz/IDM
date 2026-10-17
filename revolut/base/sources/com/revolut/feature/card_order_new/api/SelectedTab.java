package com.revolut.feature.card_order_new.api;

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
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/card_order_new/api/SelectedTab;", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "CREDIT", "DEBIT", "PAY_LATER", "FREELANCER", "JOINT", "JUNIOR", "CRYPTO", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectedTab implements FixedIdPagerItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelectedTab[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SelectedTab> CREATOR;
    public static final SelectedTab CREDIT;
    public static final SelectedTab CRYPTO;
    public static final SelectedTab DEBIT;
    public static final SelectedTab FREELANCER;
    public static final SelectedTab JOINT;
    public static final SelectedTab JUNIOR;
    public static final SelectedTab PAY_LATER;

    @NotNull
    private final String id = name();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SelectedTab.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectedTab[i];
        }
    }

    static {
        SelectedTab selectedTab = new SelectedTab("CREDIT", 0);
        CREDIT = selectedTab;
        SelectedTab selectedTab2 = new SelectedTab("DEBIT", 1);
        DEBIT = selectedTab2;
        SelectedTab selectedTab3 = new SelectedTab("PAY_LATER", 2);
        PAY_LATER = selectedTab3;
        SelectedTab selectedTab4 = new SelectedTab("FREELANCER", 3);
        FREELANCER = selectedTab4;
        SelectedTab selectedTab5 = new SelectedTab("JOINT", 4);
        JOINT = selectedTab5;
        SelectedTab selectedTab6 = new SelectedTab("JUNIOR", 5);
        JUNIOR = selectedTab6;
        SelectedTab selectedTab7 = new SelectedTab("CRYPTO", 6);
        CRYPTO = selectedTab7;
        SelectedTab[] selectedTabArr = {selectedTab, selectedTab2, selectedTab3, selectedTab4, selectedTab5, selectedTab6, selectedTab7};
        $VALUES = selectedTabArr;
        $ENTRIES = s.n(selectedTabArr);
        CREATOR = new a();
    }

    public SelectedTab(String str, int i) {
    }

    public static SelectedTab valueOf(String str) {
        return (SelectedTab) Enum.valueOf(SelectedTab.class, str);
    }

    public static SelectedTab[] values() {
        return (SelectedTab[]) $VALUES.clone();
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
