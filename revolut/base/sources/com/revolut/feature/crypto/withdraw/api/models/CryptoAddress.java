package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import ehe.n;
import h30.l;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import ko5.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ko5/a", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAddress implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f71060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71061c;
    public final CryptoAddressDestinationTag d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f71062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wk5.a f71063h;
    public final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f71064j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoAddressRecipientDetails f71065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f71066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CryptoWithdrawLimits f71067n;
    public final Instant o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CryptoAddressCounterparty f71068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f71069q;

    @NotNull
    public static final Parcelable.Creator<CryptoAddress> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            int i2;
            c cVar;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            String string2 = parcel.readString();
            CryptoAddressDestinationTag cryptoAddressDestinationTag = (CryptoAddressDestinationTag) parcel.readParcelable(CryptoAddress.class.getClassLoader());
            String string3 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z3 = true;
            } else {
                i = 0;
            }
            c cVarValueOf = c.valueOf(parcel.readString());
            wk5.a aVarValueOf = wk5.a.valueOf(parcel.readString());
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
            for (int i5 = i; i5 != i3; i5++) {
                linkedHashSet.add(ko5.b.valueOf(parcel.readString()));
            }
            int i6 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i6);
            int iA = i;
            while (iA != i6) {
                iA = o.a(parcel, linkedHashSet2, iA, 1);
            }
            if (parcel.readInt() != 0) {
                i2 = 1;
                cVar = cVarValueOf;
                z = 1;
            } else {
                i2 = 1;
                cVar = cVarValueOf;
                z = i;
            }
            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = (CryptoAddressRecipientDetails) parcel.readParcelable(CryptoAddress.class.getClassLoader());
            if (parcel.readInt() != 0) {
                i = i2;
            }
            return new CryptoAddress(string, bVar, string2, cryptoAddressDestinationTag, string3, z3, cVar, aVarValueOf, linkedHashSet, linkedHashSet2, z, cryptoAddressRecipientDetails, i, parcel.readInt() == 0 ? null : CryptoWithdrawLimits.CREATOR.createFromParcel(parcel), (Instant) parcel.readSerializable(), (CryptoAddressCounterparty) parcel.readParcelable(CryptoAddress.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAddress[i];
        }
    }

    public CryptoAddress(String id10, xi0.b currency, String address, CryptoAddressDestinationTag destinationTag, String str, boolean z, c status, wk5.a blockchain, Set flags, Set linkedIds, boolean z3, CryptoAddressRecipientDetails cryptoAddressRecipientDetails, boolean z4, CryptoWithdrawLimits cryptoWithdrawLimits, Instant createdDate, CryptoAddressCounterparty cryptoAddressCounterparty, String addressTypeLocalised) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(destinationTag, "destinationTag");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(linkedIds, "linkedIds");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(addressTypeLocalised, "addressTypeLocalised");
        this.f71059a = id10;
        this.f71060b = currency;
        this.f71061c = address;
        this.d = destinationTag;
        this.e = str;
        this.f = z;
        this.f71062g = status;
        this.f71063h = blockchain;
        this.i = flags;
        this.f71064j = linkedIds;
        this.k = z3;
        this.f71065l = cryptoAddressRecipientDetails;
        this.f71066m = z4;
        this.f71067n = cryptoWithdrawLimits;
        this.o = createdDate;
        this.f71068p = cryptoAddressCounterparty;
        this.f71069q = addressTypeLocalised;
    }

    public static CryptoAddress a(CryptoAddress cryptoAddress, Set linkedIds) {
        String id10 = cryptoAddress.f71059a;
        xi0.b currency = cryptoAddress.f71060b;
        String address = cryptoAddress.f71061c;
        CryptoAddressDestinationTag destinationTag = cryptoAddress.d;
        String str = cryptoAddress.e;
        boolean z = cryptoAddress.f;
        c status = cryptoAddress.f71062g;
        wk5.a blockchain = cryptoAddress.f71063h;
        Set flags = cryptoAddress.i;
        boolean z3 = cryptoAddress.k;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddress.f71065l;
        boolean z4 = cryptoAddress.f71066m;
        CryptoWithdrawLimits cryptoWithdrawLimits = cryptoAddress.f71067n;
        Instant createdDate = cryptoAddress.o;
        CryptoAddressCounterparty cryptoAddressCounterparty = cryptoAddress.f71068p;
        String addressTypeLocalised = cryptoAddress.f71069q;
        cryptoAddress.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(destinationTag, "destinationTag");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(linkedIds, "linkedIds");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(addressTypeLocalised, "addressTypeLocalised");
        return new CryptoAddress(id10, currency, address, destinationTag, str, z, status, blockchain, flags, linkedIds, z3, cryptoAddressRecipientDetails, z4, cryptoWithdrawLimits, createdDate, cryptoAddressCounterparty, addressTypeLocalised);
    }

    public static /* synthetic */ ko5.a e(CryptoAddress cryptoAddress, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        return cryptoAddress.d(i, true);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF71061c() {
        return this.f71061c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final wk5.a getF71063h() {
        return this.f71063h;
    }

    public final ko5.a d(int i, boolean z) {
        String strA;
        String strL = this.e;
        if (strL == null || d0.W(strL)) {
            strL = null;
        }
        if (strL == null) {
            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = this.f71065l;
            strL = (cryptoAddressRecipientDetails == null || (strA = cryptoAddressRecipientDetails.a()) == null) ? null : m70.a.l(strA);
        }
        return new ko5.a(strL == null ? j(i, z) : strL, strL != null ? j(i, z) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAddress)) {
            return false;
        }
        CryptoAddress cryptoAddress = (CryptoAddress) obj2;
        return Intrinsics.f(this.f71059a, cryptoAddress.f71059a) && Intrinsics.f(this.f71060b, cryptoAddress.f71060b) && Intrinsics.f(this.f71061c, cryptoAddress.f71061c) && Intrinsics.f(this.d, cryptoAddress.d) && Intrinsics.f(this.e, cryptoAddress.e) && this.f == cryptoAddress.f && this.f71062g == cryptoAddress.f71062g && this.f71063h == cryptoAddress.f71063h && Intrinsics.f(this.i, cryptoAddress.i) && Intrinsics.f(this.f71064j, cryptoAddress.f71064j) && this.k == cryptoAddress.k && Intrinsics.f(this.f71065l, cryptoAddress.f71065l) && this.f71066m == cryptoAddress.f71066m && Intrinsics.f(this.f71067n, cryptoAddress.f71067n) && Intrinsics.f(this.o, cryptoAddress.o) && Intrinsics.f(this.f71068p, cryptoAddress.f71068p) && Intrinsics.f(this.f71069q, cryptoAddress.f71069q);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(l.j(this.f71060b, this.f71059a.hashCode() * 31, 31), 31, this.f71061c)) * 31;
        String str = this.e;
        int iC = j6.a.c(p.a.f(p.a.f((this.f71063h.hashCode() + ((this.f71062g.hashCode() + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f)) * 31)) * 31, 31, this.i), 31, this.f71064j), 31, this.k);
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = this.f71065l;
        int iC2 = j6.a.c((iC + (cryptoAddressRecipientDetails == null ? 0 : cryptoAddressRecipientDetails.hashCode())) * 31, 31, this.f71066m);
        CryptoWithdrawLimits cryptoWithdrawLimits = this.f71067n;
        int iC3 = r6.b.c((iC2 + (cryptoWithdrawLimits == null ? 0 : cryptoWithdrawLimits.hashCode())) * 31, 31, this.o);
        CryptoAddressCounterparty cryptoAddressCounterparty = this.f71068p;
        return this.f71069q.hashCode() + ((iC3 + (cryptoAddressCounterparty != null ? cryptoAddressCounterparty.hashCode() : 0)) * 31);
    }

    public final String j(int i, boolean z) {
        StringBuilder sb6 = new StringBuilder();
        if (z) {
            sb6.append(this.f71069q);
            m70.a.a(t0.f186434a);
            sb6.append(" · ");
        }
        sb6.append(z(i));
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71059a);
        dest.writeSerializable(this.f71060b);
        dest.writeString(this.f71061c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f71062g.name());
        dest.writeString(this.f71063h.name());
        Iterator itV = n.v(this.i, dest);
        while (itV.hasNext()) {
            dest.writeString(((ko5.b) itV.next()).name());
        }
        Iterator itV2 = n.v(this.f71064j, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        dest.writeInt(this.k ? 1 : 0);
        dest.writeParcelable(this.f71065l, i);
        dest.writeInt(this.f71066m ? 1 : 0);
        CryptoWithdrawLimits cryptoWithdrawLimits = this.f71067n;
        if (cryptoWithdrawLimits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cryptoWithdrawLimits.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.o);
        dest.writeParcelable(this.f71068p, i);
        dest.writeString(this.f71069q);
    }

    public final String z(int i) {
        String str = this.f71061c;
        String strSubstring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(str.length() - i, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(strSubstring, "…", strSubstring2);
    }

    public CryptoAddress(String str, xi0.b bVar, String str2, CryptoAddressDestinationTag cryptoAddressDestinationTag, String str3, boolean z, c cVar, wk5.a aVar, Set set, boolean z3, CryptoAddressRecipientDetails cryptoAddressRecipientDetails, boolean z4, CryptoWithdrawLimits cryptoWithdrawLimits, Instant instant, CryptoAddressCounterparty cryptoAddressCounterparty, String str4) {
        this(str, bVar, str2, cryptoAddressDestinationTag, str3, z, cVar, aVar, set, y0.b(str), z3, cryptoAddressRecipientDetails, z4, cryptoWithdrawLimits, instant, cryptoAddressCounterparty, str4);
    }
}
