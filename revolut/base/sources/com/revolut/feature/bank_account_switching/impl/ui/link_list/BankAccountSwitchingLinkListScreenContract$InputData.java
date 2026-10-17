package com.revolut.feature.bank_account_switching.impl.ui.link_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.domain.RequestStatus$Link;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/link_list/BankAccountSwitchingLinkListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankAccountSwitchingLinkListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BankAccountSwitchingLinkListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f63949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f63950b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", BankAccountSwitchingLinkListScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RequestStatus$Link.CREATOR, parcel, arrayList, iA, 1);
            }
            return new BankAccountSwitchingLinkListScreenContract$InputData(clause, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankAccountSwitchingLinkListScreenContract$InputData[i];
        }
    }

    public BankAccountSwitchingLinkListScreenContract$InputData(Clause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f63949a = title;
        this.f63950b = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankAccountSwitchingLinkListScreenContract$InputData)) {
            return false;
        }
        BankAccountSwitchingLinkListScreenContract$InputData bankAccountSwitchingLinkListScreenContract$InputData = (BankAccountSwitchingLinkListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f63949a, bankAccountSwitchingLinkListScreenContract$InputData.f63949a) && Intrinsics.f(this.f63950b, bankAccountSwitchingLinkListScreenContract$InputData.f63950b);
    }

    public final int hashCode() {
        return this.f63950b.hashCode() + (this.f63949a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63949a, i);
        Iterator itV = p.a.v(this.f63950b, dest);
        while (itV.hasNext()) {
            ((RequestStatus$Link) itV.next()).writeToParcel(dest, i);
        }
    }
}
