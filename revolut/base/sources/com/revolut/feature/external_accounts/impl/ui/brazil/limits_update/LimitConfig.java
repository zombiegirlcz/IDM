package com.revolut.feature.external_accounts.impl.ui.brazil.limits_update;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import dj0.d;
import grl.w3;
import grl.y3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import wj6.i;
import wj6.j;
import wj6.k;
import yhm.r;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig;", "Landroid/os/Parcelable;", "SingleTransactionLimit", "DailyLimit", "HierarchicalLimit", "NoValidationLimit", "wj6/k", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig$DailyLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig$HierarchicalLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig$NoValidationLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig$SingleTransactionLimit;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LimitConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig$HierarchicalLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HierarchicalLimit implements LimitConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72628c;
        public final Clause d;
        public final String e;
        public final d f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f72629g;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<HierarchicalLimit> CREATOR = new b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f72625h = r0.k(new Pair("singleTransactionLimit", new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b(0, y3.SINGLE_TRANSACTION_LIMIT, R$string.open_finance_payment_authorization_limit_update_input_title_single_transaction_limit)), new Pair("dailyLimit", new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b(1, y3.DAILY_LIMIT, R$string.open_finance_payment_authorization_limit_update_input_title_daily_limit)), new Pair("weeklyLimit", new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b(2, y3.WEEKLY_LIMIT, R$string.open_finance_payment_authorization_limit_update_input_title_weekly_limit)), new Pair("monthlyLimit", new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b(3, y3.MONTHLY_LIMIT, R$string.open_finance_payment_authorization_limit_update_input_title_monthly_limit)), new Pair("yearlyLimit", new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b(4, y3.YEARLY_LIMIT, R$string.open_finance_payment_authorization_limit_update_input_title_yearly_limit)), new Pair("totalLimit", new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b(5, y3.TOTAL_LIMIT, R$string.open_finance_payment_authorization_limit_update_input_title_total_limit)));

        /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig$HierarchicalLimit$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
            public static int a(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b bVar = (com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b) HierarchicalLimit.f72625h.get(id10);
                if (bVar != null) {
                    return bVar.f72636a;
                }
                return -1;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
            public static TextLocalisedClause b(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Object obj2 = HierarchicalLimit.f72625h.get(id10);
                if (obj2 != null) {
                    return new TextLocalisedClause(((com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b) obj2).f72638c, null, null, 14);
                }
                throw new IllegalArgumentException(j6.a.q("Unknown limit id: ", id10).toString());
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                d dVar2 = (d) parcel.readSerializable();
                boolean z = parcel.readInt() != 0;
                Clause clause = (Clause) parcel.readParcelable(HierarchicalLimit.class.getClassLoader());
                String string = parcel.readString();
                d dVar3 = (d) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readSerializable());
                }
                return new HierarchicalLimit(dVar, dVar2, z, clause, string, dVar3, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HierarchicalLimit[i];
            }
        }

        public HierarchicalLimit(d initialValue, d dVar, boolean z, Clause title, String limitId, d dVar2, Map neighborLimits) {
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(limitId, "limitId");
            Intrinsics.checkNotNullParameter(neighborLimits, "neighborLimits");
            this.f72626a = initialValue;
            this.f72627b = dVar;
            this.f72628c = z;
            this.d = title;
            this.e = limitId;
            this.f = dVar2;
            this.f72629g = neighborLimits;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: C, reason: from getter */
        public final d getF72633a() {
            return this.f72626a;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        public final k S0(d amountMoney) {
            d dVar;
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            INSTANCE.getClass();
            int iA = Companion.a(this.e);
            Pair pairA = a(iA);
            Pair pairB = b(iA);
            d dVar2 = this.f72627b;
            if (dVar2 != null && amountMoney.compareTo(dVar2) > 0) {
                return new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_max_limit_reached, u.c(new MoneyClause(this.f72627b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12));
            }
            if (pairA != null) {
                d dVar3 = (d) pairA.f186386b;
                if (amountMoney.compareTo(dVar3) > 0) {
                    return new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_max_of, v.k(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), Companion.b((String) pairA.f186385a)), null, 12));
                }
            }
            if (this.f72628c && amountMoney.k()) {
                return new i(null);
            }
            if (!amountMoney.k() && pairB != null) {
                d dVar4 = (d) pairB.f186386b;
                if (amountMoney.compareTo(dVar4) < 0) {
                    return new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_min_of, v.k(new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), Companion.b((String) pairB.f186385a)), null, 12));
                }
            }
            return (amountMoney.k() || (dVar = this.f) == null || dVar.f115082a <= 0 || amountMoney.compareTo(dVar) >= 0) ? j.f297968a : new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_min_of, v.k(new MoneyClause(this.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), this.d), null, 12));
        }

        public final Pair a(int i) {
            Object next;
            ArrayList arrayListC = c();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListC) {
                if (((Number) ((r) obj2).f314203c).intValue() > i) {
                    arrayList.add(obj2);
                }
            }
            Iterator it8 = arrayList.iterator();
            if (it8.hasNext()) {
                next = it8.next();
                if (it8.hasNext()) {
                    int iIntValue = ((Number) ((r) next).f314203c).intValue();
                    do {
                        Object next2 = it8.next();
                        int iIntValue2 = ((Number) ((r) next2).f314203c).intValue();
                        if (iIntValue > iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it8.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            if (rVar != null) {
                return new Pair((String) rVar.f314201a, (d) rVar.f314202b);
            }
            return null;
        }

        public final Pair b(int i) {
            Object next;
            ArrayList arrayListC = c();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListC) {
                if (((Number) ((r) obj2).f314203c).intValue() < i) {
                    arrayList.add(obj2);
                }
            }
            Iterator it8 = arrayList.iterator();
            if (it8.hasNext()) {
                next = it8.next();
                if (it8.hasNext()) {
                    int iIntValue = ((Number) ((r) next).f314203c).intValue();
                    do {
                        Object next2 = it8.next();
                        int iIntValue2 = ((Number) ((r) next2).f314203c).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it8.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            if (rVar != null) {
                return new Pair((String) rVar.f314201a, (d) rVar.f314202b);
            }
            return null;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        public final ArrayList c() {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f72629g.entrySet()) {
                String str = (String) entry.getKey();
                d dVar = (d) entry.getValue();
                INSTANCE.getClass();
                int iA = Companion.a(str);
                r rVar = (iA < 0 || dVar == null || dVar.f115082a <= 0) ? null : new r(str, dVar, Integer.valueOf(iA));
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
            return arrayList;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: d0, reason: from getter */
        public final boolean getF72635c() {
            return this.f72628c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HierarchicalLimit)) {
                return false;
            }
            HierarchicalLimit hierarchicalLimit = (HierarchicalLimit) obj2;
            return Intrinsics.f(this.f72626a, hierarchicalLimit.f72626a) && Intrinsics.f(this.f72627b, hierarchicalLimit.f72627b) && this.f72628c == hierarchicalLimit.f72628c && Intrinsics.f(this.d, hierarchicalLimit.d) && Intrinsics.f(this.e, hierarchicalLimit.e) && Intrinsics.f(this.f, hierarchicalLimit.f) && this.f72629g.equals(hierarchicalLimit.f72629g);
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = this.f72626a.hashCode() * 31;
            d dVar = this.f72627b;
            int iC = p.a.c(p.a.a(j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f72628c), 31, this.d), 31, this.e);
            d dVar2 = this.f;
            return this.f72629g.hashCode() + ((iC + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        public final yj6.a u7(d amountMoney) {
            d dVar;
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            INSTANCE.getClass();
            String id10 = this.e;
            int iA = Companion.a(id10);
            Pair pairA = a(iA);
            Pair pairB = b(iA);
            Intrinsics.checkNotNullParameter(id10, "id");
            com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b bVar = (com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.b) f72625h.get(id10);
            y3 y3Var = bVar != null ? bVar.f72637b : null;
            if (y3Var == null) {
                throw new IllegalArgumentException("Unknown limit id: ".concat(id10).toString());
            }
            d dVar2 = this.f72627b;
            if (dVar2 != null && amountMoney.compareTo(dVar2) > 0) {
                return new yj6.a(w3.EXCEEDS_UPPER_BOUND, y3Var);
            }
            if (pairA != null && amountMoney.compareTo((d) pairA.f186386b) > 0) {
                return new yj6.a(w3.EXCEEDS_UPPER_BOUND, y3Var);
            }
            if (!amountMoney.k() && pairB != null && amountMoney.compareTo((d) pairB.f186386b) < 0) {
                return new yj6.a(w3.BELOW_LOWER_BOUND, y3Var);
            }
            if (amountMoney.k() || (dVar = this.f) == null || dVar.f115082a <= 0 || amountMoney.compareTo(dVar) >= 0) {
                return null;
            }
            return new yj6.a(w3.BELOW_LOWER_BOUND, y3Var);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72626a);
            dest.writeSerializable(this.f72627b);
            dest.writeInt(this.f72628c ? 1 : 0);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e);
            dest.writeSerializable(this.f);
            Iterator itT = o.t(this.f72629g, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeSerializable((Serializable) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig$NoValidationLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoValidationLimit implements LimitConfig {

        @NotNull
        public static final Parcelable.Creator<NoValidationLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f72631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f72632c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoValidationLimit((d) parcel.readSerializable(), (Clause) parcel.readParcelable(NoValidationLimit.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoValidationLimit[i];
            }
        }

        public NoValidationLimit(d initialValue, Clause title, d dVar, boolean z) {
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f72630a = initialValue;
            this.f72631b = title;
            this.f72632c = dVar;
            this.d = z;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: C, reason: from getter */
        public final d getF72633a() {
            return this.f72630a;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        public final k S0(d amountMoney) {
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            return j.f297968a;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: d0, reason: from getter */
        public final boolean getF72635c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NoValidationLimit)) {
                return false;
            }
            NoValidationLimit noValidationLimit = (NoValidationLimit) obj2;
            return Intrinsics.f(this.f72630a, noValidationLimit.f72630a) && Intrinsics.f(this.f72631b, noValidationLimit.f72631b) && Intrinsics.f(this.f72632c, noValidationLimit.f72632c) && this.d == noValidationLimit.d;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getD() {
            return this.f72631b;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f72630a.hashCode() * 31, 31, this.f72631b);
            d dVar = this.f72632c;
            return Boolean.hashCode(this.d) + ((iA + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        public final yj6.a u7(d amountMoney) {
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72630a);
            dest.writeParcelable(this.f72631b, i);
            dest.writeSerializable(this.f72632c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: C */
    d getF72633a();

    k S0(d dVar);

    /* JADX INFO: renamed from: d0 */
    boolean getF72635c();

    /* JADX INFO: renamed from: getTitle */
    Clause getD();

    yj6.a u7(d dVar);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig$DailyLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DailyLimit implements LimitConfig {

        @NotNull
        public static final Parcelable.Creator<DailyLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72624c;
        public final Clause d;
        public final d e;
        public final d f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DailyLimit((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0, (Clause) parcel.readParcelable(DailyLimit.class.getClassLoader()), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DailyLimit[i];
            }
        }

        public DailyLimit(d initialValue, d dVar, boolean z, Clause title, d dVar2, d dVar3) {
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f72622a = initialValue;
            this.f72623b = dVar;
            this.f72624c = z;
            this.d = title;
            this.e = dVar2;
            this.f = dVar3;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: C, reason: from getter */
        public final d getF72633a() {
            return this.f72622a;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        public final k S0(d amountMoney) {
            d dVar;
            d dVar2;
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            d dVar3 = this.f72623b;
            return (dVar3 == null || amountMoney.compareTo(dVar3) <= 0) ? (this.f72624c && amountMoney.k()) ? new i(null) : (amountMoney.k() || (dVar2 = this.e) == null || dVar2.f115082a <= 0 || amountMoney.compareTo(dVar2) >= 0) ? (amountMoney.k() || (dVar = this.f) == null || dVar.f115082a <= 0 || amountMoney.compareTo(dVar) >= 0) ? j.f297968a : new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_min_of, v.k(new MoneyClause(this.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_title_daily_limit, null, null, 14)), null, 12)) : new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_daily_lower_than_single_transaction, null, null, 14)) : new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_pix_daily_limit_reached, null, null, 14));
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: d0, reason: from getter */
        public final boolean getF72635c() {
            return this.f72624c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DailyLimit)) {
                return false;
            }
            DailyLimit dailyLimit = (DailyLimit) obj2;
            return Intrinsics.f(this.f72622a, dailyLimit.f72622a) && Intrinsics.f(this.f72623b, dailyLimit.f72623b) && this.f72624c == dailyLimit.f72624c && Intrinsics.f(this.d, dailyLimit.d) && Intrinsics.f(this.e, dailyLimit.e) && Intrinsics.f(this.f, dailyLimit.f);
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = this.f72622a.hashCode() * 31;
            d dVar = this.f72623b;
            int iA = p.a.a(j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f72624c), 31, this.d);
            d dVar2 = this.e;
            int iHashCode2 = (iA + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
            d dVar3 = this.f;
            return iHashCode2 + (dVar3 != null ? dVar3.hashCode() : 0);
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        public final yj6.a u7(d amountMoney) {
            d dVar;
            d dVar2;
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            d dVar3 = this.f72623b;
            if (dVar3 != null && amountMoney.compareTo(dVar3) > 0) {
                return new yj6.a(w3.EXCEEDS_UPPER_BOUND, y3.DAILY_LIMIT);
            }
            if (!amountMoney.k() && (dVar2 = this.e) != null && dVar2.f115082a > 0 && amountMoney.compareTo(dVar2) < 0) {
                return new yj6.a(w3.EXCEEDS_UPPER_BOUND, y3.SINGLE_TRANSACTION_LIMIT);
            }
            if (amountMoney.k() || (dVar = this.f) == null || dVar.f115082a <= 0 || amountMoney.compareTo(dVar) >= 0) {
                return null;
            }
            return new yj6.a(w3.BELOW_LOWER_BOUND, y3.DAILY_LIMIT);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72622a);
            dest.writeSerializable(this.f72623b);
            dest.writeInt(this.f72624c ? 1 : 0);
            dest.writeParcelable(this.d, i);
            dest.writeSerializable(this.e);
            dest.writeSerializable(this.f);
        }

        public /* synthetic */ DailyLimit(d dVar, d dVar2, boolean z, d dVar3) {
            this(dVar, dVar2, z, new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_title_daily_limit, null, null, 14), dVar3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig$SingleTransactionLimit;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/LimitConfig;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleTransactionLimit implements LimitConfig {

        @NotNull
        public static final Parcelable.Creator<SingleTransactionLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72635c;
        public final Clause d;
        public final d e;
        public final d f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleTransactionLimit((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0, (Clause) parcel.readParcelable(SingleTransactionLimit.class.getClassLoader()), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleTransactionLimit[i];
            }
        }

        public SingleTransactionLimit(d initialValue, d dVar, boolean z, Clause title, d dVar2, d dVar3) {
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f72633a = initialValue;
            this.f72634b = dVar;
            this.f72635c = z;
            this.d = title;
            this.e = dVar2;
            this.f = dVar3;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: C, reason: from getter */
        public final d getF72633a() {
            return this.f72633a;
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        public final k S0(d amountMoney) {
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            d dVar = this.f72634b;
            if (dVar != null && amountMoney.compareTo(dVar) > 0) {
                return new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_max_limit_reached, u.c(new MoneyClause(this.f72634b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12));
            }
            d dVar2 = this.e;
            if (dVar2 != null && dVar2.f115082a > 0 && amountMoney.compareTo(dVar2) > 0) {
                return new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_transaction_higher_than_daily, null, null, 14));
            }
            if (this.f72635c && amountMoney.k()) {
                return new i(null);
            }
            d dVar3 = this.f;
            if (dVar3 == null || dVar3.f115082a <= 0 || amountMoney.k() || amountMoney.compareTo(dVar3) >= 0) {
                return j.f297968a;
            }
            return new i(new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_error_min_of, v.k(new MoneyClause(this.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_title_single_transaction_limit, null, null, 14)), null, 12));
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: d0, reason: from getter */
        public final boolean getF72635c() {
            return this.f72635c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SingleTransactionLimit)) {
                return false;
            }
            SingleTransactionLimit singleTransactionLimit = (SingleTransactionLimit) obj2;
            return Intrinsics.f(this.f72633a, singleTransactionLimit.f72633a) && Intrinsics.f(this.f72634b, singleTransactionLimit.f72634b) && this.f72635c == singleTransactionLimit.f72635c && Intrinsics.f(this.d, singleTransactionLimit.d) && Intrinsics.f(this.e, singleTransactionLimit.e) && Intrinsics.f(this.f, singleTransactionLimit.f);
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = this.f72633a.hashCode() * 31;
            d dVar = this.f72634b;
            int iA = p.a.a(j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f72635c), 31, this.d);
            d dVar2 = this.e;
            int iHashCode2 = (iA + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
            d dVar3 = this.f;
            return iHashCode2 + (dVar3 != null ? dVar3.hashCode() : 0);
        }

        @Override // com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig
        public final yj6.a u7(d amountMoney) {
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            d dVar = this.f72634b;
            if (dVar != null && amountMoney.compareTo(dVar) > 0) {
                return new yj6.a(w3.EXCEEDS_UPPER_BOUND, y3.SINGLE_TRANSACTION_LIMIT);
            }
            d dVar2 = this.e;
            if (dVar2 != null && dVar2.f115082a > 0 && amountMoney.compareTo(dVar2) > 0) {
                return new yj6.a(w3.EXCEEDS_UPPER_BOUND, y3.DAILY_LIMIT);
            }
            d dVar3 = this.f;
            if (dVar3 == null || dVar3.f115082a <= 0 || amountMoney.k() || amountMoney.compareTo(dVar3) >= 0) {
                return null;
            }
            return new yj6.a(w3.BELOW_LOWER_BOUND, y3.SINGLE_TRANSACTION_LIMIT);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72633a);
            dest.writeSerializable(this.f72634b);
            dest.writeInt(this.f72635c ? 1 : 0);
            dest.writeParcelable(this.d, i);
            dest.writeSerializable(this.e);
            dest.writeSerializable(this.f);
        }

        public /* synthetic */ SingleTransactionLimit(d dVar, d dVar2, boolean z, d dVar3) {
            this(dVar, dVar2, z, new TextLocalisedClause(R$string.open_finance_payment_authorization_limit_update_input_title_single_transaction_limit, null, null, 14), dVar3, null);
        }
    }
}
