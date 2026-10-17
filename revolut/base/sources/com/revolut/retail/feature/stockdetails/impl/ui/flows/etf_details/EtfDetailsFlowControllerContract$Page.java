package com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/etf_details/EtfDetailsFlowControllerContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/etf_details/EtfDetailsFlowControllerContract$Page;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "OVERVIEW", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EtfDetailsFlowControllerContract$Page implements PagerItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EtfDetailsFlowControllerContract$Page[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EtfDetailsFlowControllerContract$Page> CREATOR;
    public static final EtfDetailsFlowControllerContract$Page OVERVIEW;

    @NotNull
    private final String id = "overview";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return EtfDetailsFlowControllerContract$Page.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EtfDetailsFlowControllerContract$Page[i];
        }
    }

    static {
        EtfDetailsFlowControllerContract$Page etfDetailsFlowControllerContract$Page = new EtfDetailsFlowControllerContract$Page();
        OVERVIEW = etfDetailsFlowControllerContract$Page;
        EtfDetailsFlowControllerContract$Page[] etfDetailsFlowControllerContract$PageArr = {etfDetailsFlowControllerContract$Page};
        $VALUES = etfDetailsFlowControllerContract$PageArr;
        $ENTRIES = s.n(etfDetailsFlowControllerContract$PageArr);
        CREATOR = new a();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static EtfDetailsFlowControllerContract$Page valueOf(String str) {
        return (EtfDetailsFlowControllerContract$Page) Enum.valueOf(EtfDetailsFlowControllerContract$Page.class, str);
    }

    public static EtfDetailsFlowControllerContract$Page[] values() {
        return (EtfDetailsFlowControllerContract$Page[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
