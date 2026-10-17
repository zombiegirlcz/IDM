package com.revolut.shared.feature.wealth.models.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/transaction/TradingTransactionsFilter;", "Landroid/os/Parcelable;", "Companion", "TradingTransactionsFilterImpl", "a", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingTransactionsFilter extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f105351a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/transaction/TradingTransactionsFilter$TradingTransactionsFilterImpl;", "Lcom/revolut/shared/feature/wealth/models/transaction/TradingTransactionsFilter;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingTransactionsFilterImpl implements TradingTransactionsFilter {

        @NotNull
        public static final Parcelable.Creator<TradingTransactionsFilterImpl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f105347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f105348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105349c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f105350g;

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
                return new TradingTransactionsFilterImpl(linkedHashSet, linkedHashSet2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingTransactionsFilterImpl[i];
            }
        }

        @d
        public TradingTransactionsFilterImpl() {
            this(0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Set getF105347a() {
            return this.f105347a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getF105350g() {
            return this.f105350g;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Set getF105348b() {
            return this.f105348b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingTransactionsFilterImpl)) {
                return false;
            }
            TradingTransactionsFilterImpl tradingTransactionsFilterImpl = (TradingTransactionsFilterImpl) obj2;
            return Intrinsics.f(this.f105347a, tradingTransactionsFilterImpl.f105347a) && Intrinsics.f(this.f105348b, tradingTransactionsFilterImpl.f105348b) && Intrinsics.f(this.f105349c, tradingTransactionsFilterImpl.f105349c) && Intrinsics.f(this.d, tradingTransactionsFilterImpl.d) && Intrinsics.f(this.e, tradingTransactionsFilterImpl.e) && Intrinsics.f(this.f, tradingTransactionsFilterImpl.f) && Intrinsics.f(this.f105350g, tradingTransactionsFilterImpl.f105350g);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF105349c() {
            return this.f105349c;
        }

        public final int hashCode() {
            int iF = p.a.f(this.f105347a.hashCode() * 31, 31, this.f105348b);
            String str = this.f105349c;
            int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.f105350g;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f105347a, dest);
            while (itV.hasNext()) {
                ((WealthAccountType) itV.next()).writeToParcel(dest, i);
            }
            Iterator itV2 = n.v(this.f105348b, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
            dest.writeString(this.f105349c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            Boolean bool = this.f105350g;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }

        public TradingTransactionsFilterImpl(Set accountTypes, Set currencies, String str, String str2, String str3, String str4, Boolean bool) {
            Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.f105347a = accountTypes;
            this.f105348b = currencies;
            this.f105349c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.f105350g = bool;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TradingTransactionsFilterImpl(int i) {
            h0 h0Var = h0.f322473a;
            this(h0Var, h0Var, null, null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f105351a = new Companion();

        static {
            new TradingTransactionsFilterImpl(0);
        }

        private Companion() {
        }
    }
}
