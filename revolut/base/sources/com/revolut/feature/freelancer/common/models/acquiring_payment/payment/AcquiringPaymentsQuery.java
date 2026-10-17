package com.revolut.feature.freelancer.common.models.acquiring_payment.payment;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lr6.a;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import pr6.j;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_payment/payment/AcquiringPaymentsQuery;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AcquiringPaymentsQuery implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f73371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f73372c;
    public final Set d;
    public final Set e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f73373g;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AcquiringPaymentsQuery> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static AcquiringPaymentsQuery a(LocalDateTime now) {
            Intrinsics.checkNotNullParameter(now, "now");
            a[] elements = {a.CAPTURED, a.PENDING};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new AcquiringPaymentsQuery((String) null, now.minusDays(8L), (LocalDateTime) null, d.y0(elements), (Set) null, (Set) null, LDSFile.EF_DG2_TAG);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int i2 = 0;
            for (int i3 = 0; i3 != i; i3++) {
                linkedHashSet.add(a.valueOf(parcel.readString()));
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i5);
            int iD = 0;
            while (iD != i5) {
                iD = v7.d(parcel, linkedHashSet2, iD, 1);
            }
            int i6 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i6);
            while (true) {
                String string2 = parcel.readString();
                if (i2 == i6) {
                    return new AcquiringPaymentsQuery(string, localDateTime, localDateTime2, linkedHashSet, linkedHashSet2, linkedHashSet3, string2);
                }
                linkedHashSet3.add(j.valueOf(string2));
                i2++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AcquiringPaymentsQuery[i];
        }
    }

    public AcquiringPaymentsQuery() {
        this((String) null, (LocalDateTime) null, (LocalDateTime) null, (Set) null, (Set) null, (Set) null, CertificateBody.profileType);
    }

    public static AcquiringPaymentsQuery a(AcquiringPaymentsQuery acquiringPaymentsQuery, String str, h0 h0Var, h0 h0Var2, h0 h0Var3, String str2, int i) {
        if ((i & 1) != 0) {
            str = acquiringPaymentsQuery.f73370a;
        }
        String str3 = str;
        LocalDateTime localDateTime = (i & 2) != 0 ? acquiringPaymentsQuery.f73371b : null;
        LocalDateTime localDateTime2 = (i & 4) != 0 ? acquiringPaymentsQuery.f73372c : null;
        Set set = h0Var;
        if ((i & 8) != 0) {
            set = acquiringPaymentsQuery.d;
        }
        Set states = set;
        Set set2 = h0Var2;
        if ((i & 16) != 0) {
            set2 = acquiringPaymentsQuery.e;
        }
        Set currencies = set2;
        Set set3 = h0Var3;
        if ((i & 32) != 0) {
            set3 = acquiringPaymentsQuery.f;
        }
        Set paymentMethods = set3;
        if ((i & 64) != 0) {
            str2 = acquiringPaymentsQuery.f73373g;
        }
        acquiringPaymentsQuery.getClass();
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        return new AcquiringPaymentsQuery(str3, localDateTime, localDateTime2, states, currencies, paymentMethods, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AcquiringPaymentsQuery)) {
            return false;
        }
        AcquiringPaymentsQuery acquiringPaymentsQuery = (AcquiringPaymentsQuery) obj2;
        return Intrinsics.f(this.f73370a, acquiringPaymentsQuery.f73370a) && Intrinsics.f(this.f73371b, acquiringPaymentsQuery.f73371b) && Intrinsics.f(this.f73372c, acquiringPaymentsQuery.f73372c) && Intrinsics.f(this.d, acquiringPaymentsQuery.d) && Intrinsics.f(this.e, acquiringPaymentsQuery.e) && Intrinsics.f(this.f, acquiringPaymentsQuery.f) && Intrinsics.f(this.f73373g, acquiringPaymentsQuery.f73373g);
    }

    public final int hashCode() {
        String str = this.f73370a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDateTime localDateTime = this.f73371b;
        int iHashCode2 = (iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.f73372c;
        int iF = p.a.f(p.a.f(p.a.f((iHashCode2 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.f73373g;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73370a);
        dest.writeSerializable(this.f73371b);
        dest.writeSerializable(this.f73372c);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((a) itV.next()).name());
        }
        Iterator itV2 = n.v(this.e, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
        Iterator itV3 = n.v(this.f, dest);
        while (itV3.hasNext()) {
            dest.writeString(((j) itV3.next()).name());
        }
        dest.writeString(this.f73373g);
    }

    public AcquiringPaymentsQuery(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, Set states, Set currencies, Set paymentMethods, String str2) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.f73370a = str;
        this.f73371b = localDateTime;
        this.f73372c = localDateTime2;
        this.d = states;
        this.e = currencies;
        this.f = paymentMethods;
        this.f73373g = str2;
    }

    public AcquiringPaymentsQuery(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, Set set, Set set2, Set set3, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localDateTime, (i & 4) != 0 ? null : localDateTime2, (i & 8) != 0 ? h0.f322473a : set, (i & 16) != 0 ? h0.f322473a : set2, (i & 32) != 0 ? h0.f322473a : set3, (String) null);
    }
}
