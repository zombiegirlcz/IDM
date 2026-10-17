package com.revolut.feature.pockets.api.ui.add_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pockets.api.ui.add_new.ExtendedAccountId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/api/ui/add_new/OpenNewPocketDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenNewPocketDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<OpenNewPocketDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f80795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtendedAccountId f80796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80797c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenNewPocketDestination(l.valueOf(parcel.readString()), (ExtendedAccountId) parcel.readParcelable(OpenNewPocketDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenNewPocketDestination[i];
        }
    }

    public OpenNewPocketDestination(l pocketType, ExtendedAccountId accountId, boolean z) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f80795a = pocketType;
        this.f80796b = accountId;
        this.f80797c = z;
    }

    /* JADX INFO: renamed from: X4, reason: from getter */
    public final l getF80795a() {
        return this.f80795a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ExtendedAccountId getF80796b() {
        return this.f80796b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenNewPocketDestination)) {
            return false;
        }
        OpenNewPocketDestination openNewPocketDestination = (OpenNewPocketDestination) obj2;
        return this.f80795a == openNewPocketDestination.f80795a && Intrinsics.f(this.f80796b, openNewPocketDestination.f80796b) && this.f80797c == openNewPocketDestination.f80797c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80797c) + ((this.f80796b.hashCode() + (this.f80795a.hashCode() * 31)) * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF80797c() {
        return this.f80797c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80795a.name());
        dest.writeParcelable(this.f80796b, i);
        dest.writeInt(this.f80797c ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpenNewPocketDestination(l pocketType, AccountId accountId, boolean z) {
        this(pocketType, ExtendedAccountId.Companion.a(accountId), z);
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ExtendedAccountId.INSTANCE.getClass();
    }
}
