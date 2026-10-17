package com.revolut.shared.feature.wealth.models.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import dfl.p;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yhm.d;
import zhm.c0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/transaction/InvestTransactionsFilter;", "Landroid/os/Parcelable;", "Companion", "InvestTransactionsFilterImpl", "a", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestTransactionsFilter extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f105345a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/transaction/InvestTransactionsFilter$InvestTransactionsFilterImpl;", "Lcom/revolut/shared/feature/wealth/models/transaction/InvestTransactionsFilter;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestTransactionsFilterImpl implements InvestTransactionsFilter {

        @NotNull
        public static final Parcelable.Creator<InvestTransactionsFilterImpl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f105341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f105342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105343c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f105344g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(WealthAccountType.CREATOR.createFromParcel(parcel));
                }
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                int iD = 0;
                while (iD != i3) {
                    iD = v7.d(parcel, linkedHashSet2, iD, 1);
                }
                return new InvestTransactionsFilterImpl(linkedHashSet, linkedHashSet2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestTransactionsFilterImpl[i];
            }
        }

        @d
        public InvestTransactionsFilterImpl() {
            this(null, null, null, null, null, null, null, CertificateBody.profileType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvestTransactionsFilterImpl)) {
                return false;
            }
            InvestTransactionsFilterImpl investTransactionsFilterImpl = (InvestTransactionsFilterImpl) obj2;
            return Intrinsics.f(this.f105341a, investTransactionsFilterImpl.f105341a) && Intrinsics.f(this.f105342b, investTransactionsFilterImpl.f105342b) && Intrinsics.f(this.f105343c, investTransactionsFilterImpl.f105343c) && Intrinsics.f(this.d, investTransactionsFilterImpl.d) && Intrinsics.f(this.e, investTransactionsFilterImpl.e) && Intrinsics.f(this.f, investTransactionsFilterImpl.f) && Intrinsics.f(this.f105344g, investTransactionsFilterImpl.f105344g);
        }

        public final int hashCode() {
            int iF = p.a.f(this.f105341a.hashCode() * 31, 31, this.f105342b);
            String str = this.f105343c;
            int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.f105344g;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f105341a, dest);
            while (itV.hasNext()) {
                ((WealthAccountType) itV.next()).writeToParcel(dest, i);
            }
            Iterator itV2 = n.v(this.f105342b, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
            dest.writeString(this.f105343c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            Boolean bool = this.f105344g;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }

        public InvestTransactionsFilterImpl(Set accountTypes, Set currencies, String str, String str2, String str3, String str4, Boolean bool) {
            Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.f105341a = accountTypes;
            this.f105342b = currencies;
            this.f105343c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.f105344g = bool;
        }

        public InvestTransactionsFilterImpl(Set set, SortedSet sortedSet, String str, String str2, String str3, String str4, Boolean bool, int i) {
            this((i & 1) != 0 ? h0.f322473a : set, (i & 2) != 0 ? h0.f322473a : sortedSet, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool);
        }
    }

    /* JADX INFO: renamed from: com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f105345a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InvestTransactionsFilterImpl f105346b = new InvestTransactionsFilterImpl(null, null, null, null, null, null, null, CertificateBody.profileType);

        private Companion() {
        }

        public static InvestTransactionsFilterImpl a(WealthAccountType accountType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new InvestTransactionsFilterImpl(y0.b(accountType), null, null, null, null, null, null, 126);
        }

        public static InvestTransactionsFilterImpl b(List currencies) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            return new InvestTransactionsFilterImpl(null, c0.P(currencies, new dfl.n()), null, null, null, null, null, ISO781611.SMT_TAG);
        }

        public static InvestTransactionsFilterImpl c(String portfolioId, List currencies, Boolean bool) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            return new InvestTransactionsFilterImpl(null, c0.P(currencies, new p()), portfolioId, null, null, null, bool, 57);
        }

        public static InvestTransactionsFilterImpl d(Companion companion, String str) {
            f0 f0Var = f0.f322471a;
            companion.getClass();
            return c(str, f0Var, null);
        }
    }
}
