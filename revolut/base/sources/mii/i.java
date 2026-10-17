package mii;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f205865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f205866c;
    public final Parcelable d;
    public final f1 e;

    public i(String id10, TextLocalisedClause message, TextLocalisedClause textLocalisedClause, CryptoDepositAddress cryptoDepositAddress, int i) {
        textLocalisedClause = (i & 4) != 0 ? null : textLocalisedClause;
        cryptoDepositAddress = (i & 8) != 0 ? null : cryptoDepositAddress;
        f1 position = f1.BOTTOM;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f205864a = id10;
        this.f205865b = message;
        this.f205866c = textLocalisedClause;
        this.d = cryptoDepositAddress;
        this.e = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f205864a, iVar.f205864a) && Intrinsics.f(this.f205865b, iVar.f205865b) && Intrinsics.f(this.f205866c, iVar.f205866c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f205864a.hashCode() * 31, 31, this.f205865b);
        Clause clause = this.f205866c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Parcelable parcelable = this.d;
        return this.e.hashCode() + ((iHashCode + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
    }
}
