package com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import ko5.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lo5.r;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoSendWalletsListControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoSendWalletsListControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f71335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f71336c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(p.valueOf(parcel.readString()));
            }
            return new CryptoSendWalletsListControllerContract$InputData(bVar, linkedHashSet, r.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoSendWalletsListControllerContract$InputData[i];
        }
    }

    public CryptoSendWalletsListControllerContract$InputData(b bVar, Set supportedRecipients, r entrypoint) {
        Intrinsics.checkNotNullParameter(supportedRecipients, "supportedRecipients");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        this.f71334a = bVar;
        this.f71335b = supportedRecipients;
        this.f71336c = entrypoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoSendWalletsListControllerContract$InputData)) {
            return false;
        }
        CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = (CryptoSendWalletsListControllerContract$InputData) obj2;
        return Intrinsics.f(this.f71334a, cryptoSendWalletsListControllerContract$InputData.f71334a) && Intrinsics.f(this.f71335b, cryptoSendWalletsListControllerContract$InputData.f71335b) && this.f71336c == cryptoSendWalletsListControllerContract$InputData.f71336c;
    }

    public final int hashCode() {
        b bVar = this.f71334a;
        return this.f71336c.hashCode() + p.a.f((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f71335b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71334a);
        Iterator itV = n.v(this.f71335b, dest);
        while (itV.hasNext()) {
            dest.writeString(((p) itV.next()).name());
        }
        dest.writeString(this.f71336c.name());
    }
}
