package com.revolut.feature.wealth.private_companies.impl.ui.private_company_details;

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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/wealth/private_companies/impl/ui/private_company_details/PrivateCompanyDetailsFlowContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "", "Lcom/revolut/feature/wealth/private_companies/impl/ui/private_company_details/PrivateCompanyDetailsFlowContract$Page;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "OVERVIEW", "FINANCIALS", "FEED", "feature_wealth_private_companies_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrivateCompanyDetailsFlowContract$Page implements PagerItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrivateCompanyDetailsFlowContract$Page[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PrivateCompanyDetailsFlowContract$Page> CREATOR;
    public static final PrivateCompanyDetailsFlowContract$Page FEED;
    public static final PrivateCompanyDetailsFlowContract$Page FINANCIALS;
    public static final PrivateCompanyDetailsFlowContract$Page OVERVIEW;

    @NotNull
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PrivateCompanyDetailsFlowContract$Page.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PrivateCompanyDetailsFlowContract$Page[i];
        }
    }

    static {
        PrivateCompanyDetailsFlowContract$Page privateCompanyDetailsFlowContract$Page = new PrivateCompanyDetailsFlowContract$Page("OVERVIEW", 0, "overview");
        OVERVIEW = privateCompanyDetailsFlowContract$Page;
        PrivateCompanyDetailsFlowContract$Page privateCompanyDetailsFlowContract$Page2 = new PrivateCompanyDetailsFlowContract$Page("FINANCIALS", 1, "financials");
        FINANCIALS = privateCompanyDetailsFlowContract$Page2;
        PrivateCompanyDetailsFlowContract$Page privateCompanyDetailsFlowContract$Page3 = new PrivateCompanyDetailsFlowContract$Page("FEED", 2, "feed");
        FEED = privateCompanyDetailsFlowContract$Page3;
        PrivateCompanyDetailsFlowContract$Page[] privateCompanyDetailsFlowContract$PageArr = {privateCompanyDetailsFlowContract$Page, privateCompanyDetailsFlowContract$Page2, privateCompanyDetailsFlowContract$Page3};
        $VALUES = privateCompanyDetailsFlowContract$PageArr;
        $ENTRIES = s.n(privateCompanyDetailsFlowContract$PageArr);
        CREATOR = new a();
    }

    public PrivateCompanyDetailsFlowContract$Page(String str, int i, String str2) {
        this.id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static PrivateCompanyDetailsFlowContract$Page valueOf(String str) {
        return (PrivateCompanyDetailsFlowContract$Page) Enum.valueOf(PrivateCompanyDetailsFlowContract$Page.class, str);
    }

    public static PrivateCompanyDetailsFlowContract$Page[] values() {
        return (PrivateCompanyDetailsFlowContract$Page[]) $VALUES.clone();
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
