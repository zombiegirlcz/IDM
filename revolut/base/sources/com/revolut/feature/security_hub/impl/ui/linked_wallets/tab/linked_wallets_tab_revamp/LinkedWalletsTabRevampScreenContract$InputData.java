package com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$WalletConnectionSection;
import com.revolut.kompot.common.IOData$Input;
import h93.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/security_hub/impl/ui/linked_wallets/tab/linked_wallets_tab_revamp/LinkedWalletsTabRevampScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkedWalletsTabRevampScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LinkedWalletsTabRevampScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f85626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f85627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f85628c;
    public final Boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f0 f0Var = (f0) parcel.readSerializable();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(LinkedWalletsScreenContract$WalletConnectionSection.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            Throwable th10 = (Throwable) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LinkedWalletsTabRevampScreenContract$InputData(f0Var, arrayList, th10, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkedWalletsTabRevampScreenContract$InputData[i];
        }
    }

    public LinkedWalletsTabRevampScreenContract$InputData(f0 f0Var, List list, Throwable th10, Boolean bool) {
        this.f85626a = f0Var;
        this.f85627b = list;
        this.f85628c = th10;
        this.d = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkedWalletsTabRevampScreenContract$InputData)) {
            return false;
        }
        LinkedWalletsTabRevampScreenContract$InputData linkedWalletsTabRevampScreenContract$InputData = (LinkedWalletsTabRevampScreenContract$InputData) obj2;
        return Intrinsics.f(this.f85626a, linkedWalletsTabRevampScreenContract$InputData.f85626a) && Intrinsics.f(this.f85627b, linkedWalletsTabRevampScreenContract$InputData.f85627b) && Intrinsics.f(this.f85628c, linkedWalletsTabRevampScreenContract$InputData.f85628c) && Intrinsics.f(this.d, linkedWalletsTabRevampScreenContract$InputData.d);
    }

    public final int hashCode() {
        f0 f0Var = this.f85626a;
        int iHashCode = (f0Var == null ? 0 : f0Var.hashCode()) * 31;
        List list = this.f85627b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Throwable th10 = this.f85628c;
        int iHashCode3 = (iHashCode2 + (th10 == null ? 0 : th10.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85626a);
        List list = this.f85627b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((LinkedWalletsScreenContract$WalletConnectionSection) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeSerializable(this.f85628c);
        Boolean bool = this.d;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
