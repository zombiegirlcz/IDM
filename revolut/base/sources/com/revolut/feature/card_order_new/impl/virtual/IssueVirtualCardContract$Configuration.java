package com.revolut.feature.card_order_new.impl.virtual;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.b;
import e93.e;
import e93.l0;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/virtual/IssueVirtualCardContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IssueVirtualCardContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IssueVirtualCardContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f65232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f65233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f65234c;
    public final String d;
    public final l0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f65235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f65236h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IssueVirtualCardContract$Configuration((e) parcel.readSerializable(), (AccountId) parcel.readParcelable(IssueVirtualCardContract$Configuration.class.getClassLoader()), (NaviCommand) parcel.readParcelable(IssueVirtualCardContract$Configuration.class.getClassLoader()), parcel.readString(), l0.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), (h) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IssueVirtualCardContract$Configuration[i];
        }
    }

    public IssueVirtualCardContract$Configuration(e virtualDesign, AccountId accountId, NaviCommand naviCommand, String str, l0 virtualCardLabelType, boolean z, b bVar, h hVar) {
        Intrinsics.checkNotNullParameter(virtualDesign, "virtualDesign");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
        this.f65232a = virtualDesign;
        this.f65233b = accountId;
        this.f65234c = naviCommand;
        this.d = str;
        this.e = virtualCardLabelType;
        this.f = z;
        this.f65235g = bVar;
        this.f65236h = hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IssueVirtualCardContract$Configuration)) {
            return false;
        }
        IssueVirtualCardContract$Configuration issueVirtualCardContract$Configuration = (IssueVirtualCardContract$Configuration) obj2;
        return Intrinsics.f(this.f65232a, issueVirtualCardContract$Configuration.f65232a) && Intrinsics.f(this.f65233b, issueVirtualCardContract$Configuration.f65233b) && Intrinsics.f(this.f65234c, issueVirtualCardContract$Configuration.f65234c) && Intrinsics.f(this.d, issueVirtualCardContract$Configuration.d) && this.e == issueVirtualCardContract$Configuration.e && this.f == issueVirtualCardContract$Configuration.f && this.f65235g == issueVirtualCardContract$Configuration.f65235g && Intrinsics.f(this.f65236h, issueVirtualCardContract$Configuration.f65236h);
    }

    public final int hashCode() {
        int iB = l.b(this.f65233b, this.f65232a.hashCode() * 31, 31);
        NaviCommand naviCommand = this.f65234c;
        int iHashCode = (iB + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        String str = this.d;
        int iC = j6.a.c((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f);
        b bVar = this.f65235g;
        int iHashCode2 = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        h hVar = this.f65236h;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f65232a);
        dest.writeParcelable(this.f65233b, i);
        dest.writeParcelable(this.f65234c, i);
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeInt(this.f ? 1 : 0);
        b bVar = this.f65235g;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeSerializable(this.f65236h);
    }
}
