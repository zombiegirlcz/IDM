package com.revolut.feature.security_hub.impl.ui.linked_wallets.host;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qtc.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$WalletConnectionSection", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkedWalletsScreenContract$WalletConnectionSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LinkedWalletsScreenContract$WalletConnectionSection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f85615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f85616b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f fVarValueOf = f.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(LinkedWalletsScreenContract$WalletConnection.CREATOR, parcel, arrayList, iA, 1);
            }
            return new LinkedWalletsScreenContract$WalletConnectionSection(fVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkedWalletsScreenContract$WalletConnectionSection[i];
        }
    }

    public LinkedWalletsScreenContract$WalletConnectionSection(f type, ArrayList connections) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(connections, "connections");
        this.f85615a = type;
        this.f85616b = connections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkedWalletsScreenContract$WalletConnectionSection)) {
            return false;
        }
        LinkedWalletsScreenContract$WalletConnectionSection linkedWalletsScreenContract$WalletConnectionSection = (LinkedWalletsScreenContract$WalletConnectionSection) obj2;
        return this.f85615a == linkedWalletsScreenContract$WalletConnectionSection.f85615a && this.f85616b.equals(linkedWalletsScreenContract$WalletConnectionSection.f85616b);
    }

    public final int hashCode() {
        return this.f85616b.hashCode() + (this.f85615a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85615a.name());
        Iterator itY = j6.a.y(this.f85616b, dest);
        while (itY.hasNext()) {
            ((LinkedWalletsScreenContract$WalletConnection) itY.next()).writeToParcel(dest, i);
        }
    }
}
