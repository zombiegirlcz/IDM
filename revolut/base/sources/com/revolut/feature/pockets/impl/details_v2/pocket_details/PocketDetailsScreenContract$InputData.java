package com.revolut.feature.pockets.impl.details_v2.pocket_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.pockets.impl.details_v2.domain.PocketDetailsBottomButtonAction;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pockets/impl/details_v2/pocket_details/PocketDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PocketDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f80846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80847c;
    public final boolean d;
    public final b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f80848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PocketDetailsBottomButtonAction f80849h;
    public final NaviCommand i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PocketDetailsInitialAction f80850j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            AccountId accountId = (AccountId) parcel.readParcelable(PocketDetailsScreenContract$InputData.class.getClassLoader());
            boolean z4 = false;
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            b bVar = (b) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z3 = z;
                z = true;
            } else {
                z3 = z;
            }
            return new PocketDetailsScreenContract$InputData(dVar, accountId, z6, z4, bVar, z, parcel.readInt() == 0 ? z3 : true, (PocketDetailsBottomButtonAction) parcel.readParcelable(PocketDetailsScreenContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(PocketDetailsScreenContract$InputData.class.getClassLoader()), (PocketDetailsInitialAction) parcel.readParcelable(PocketDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketDetailsScreenContract$InputData[i];
        }
    }

    public PocketDetailsScreenContract$InputData(d pocket, AccountId accountId, boolean z, boolean z3, b bVar, boolean z4, boolean z6, PocketDetailsBottomButtonAction pocketDetailsBottomButtonAction, NaviCommand naviCommand, PocketDetailsInitialAction pocketDetailsInitialAction) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f80845a = pocket;
        this.f80846b = accountId;
        this.f80847c = z;
        this.d = z3;
        this.e = bVar;
        this.f = z4;
        this.f80848g = z6;
        this.f80849h = pocketDetailsBottomButtonAction;
        this.i = naviCommand;
        this.f80850j = pocketDetailsInitialAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketDetailsScreenContract$InputData)) {
            return false;
        }
        PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData = (PocketDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80845a, pocketDetailsScreenContract$InputData.f80845a) && Intrinsics.f(this.f80846b, pocketDetailsScreenContract$InputData.f80846b) && this.f80847c == pocketDetailsScreenContract$InputData.f80847c && this.d == pocketDetailsScreenContract$InputData.d && Intrinsics.f(this.e, pocketDetailsScreenContract$InputData.e) && this.f == pocketDetailsScreenContract$InputData.f && this.f80848g == pocketDetailsScreenContract$InputData.f80848g && Intrinsics.f(this.f80849h, pocketDetailsScreenContract$InputData.f80849h) && Intrinsics.f(this.i, pocketDetailsScreenContract$InputData.i) && Intrinsics.f(this.f80850j, pocketDetailsScreenContract$InputData.f80850j);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(l.b(this.f80846b, this.f80845a.hashCode() * 31, 31), 31, this.f80847c), 31, this.d);
        b bVar = this.e;
        int iC2 = j6.a.c(j6.a.c((iC + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.f), 31, this.f80848g);
        PocketDetailsBottomButtonAction pocketDetailsBottomButtonAction = this.f80849h;
        int iHashCode = (iC2 + (pocketDetailsBottomButtonAction == null ? 0 : pocketDetailsBottomButtonAction.hashCode())) * 31;
        NaviCommand naviCommand = this.i;
        int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        PocketDetailsInitialAction pocketDetailsInitialAction = this.f80850j;
        return iHashCode2 + (pocketDetailsInitialAction != null ? pocketDetailsInitialAction.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80845a);
        dest.writeParcelable(this.f80846b, i);
        dest.writeInt(this.f80847c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f80848g ? 1 : 0);
        dest.writeParcelable(this.f80849h, i);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f80850j, i);
    }
}
