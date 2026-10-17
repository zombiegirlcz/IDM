package com.revolut.feature.categorisation.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import he3.b;
import he3.c;
import he3.d;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Interval;
import prk.o;
import tof.i7;
import tof.v6;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/CategorisationFilter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "he3/b", "Exclusion", "Scope", "he3/d", "he3/c", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategorisationFilter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CategorisationFilter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f65742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Scope f65743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interval f65744c;
    public final List d;
    public final i7 e;
    public final i7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f65745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f65746h;
    public final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f65747j;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion;", "Landroid/os/Parcelable;", "Investments", "InternalCredits", "StakingTransactions", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion$InternalCredits;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion$Investments;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion$StakingTransactions;", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Exclusion extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion$InternalCredits;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion;", "<init>", "()V", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class InternalCredits implements Exclusion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InternalCredits f65748a = new InternalCredits();

            @NotNull
            public static final Parcelable.Creator<InternalCredits> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return InternalCredits.f65748a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InternalCredits[i];
                }
            }

            private InternalCredits() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion$Investments;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion;", "<init>", "()V", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Investments implements Exclusion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Investments f65749a = new Investments();

            @NotNull
            public static final Parcelable.Creator<Investments> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Investments.f65749a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Investments[i];
                }
            }

            private Investments() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion$StakingTransactions;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Exclusion;", "<init>", "()V", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class StakingTransactions implements Exclusion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final StakingTransactions f65750a = new StakingTransactions();

            @NotNull
            public static final Parcelable.Creator<StakingTransactions> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return StakingTransactions.f65750a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new StakingTransactions[i];
                }
            }

            private StakingTransactions() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope;", "Landroid/os/Parcelable;", "PocketsIdSet", "AllPockets", "Empty", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope$AllPockets;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope$Empty;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope$PocketsIdSet;", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Scope extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope$AllPockets;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope;", "", "toString", "()Ljava/lang/String;", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AllPockets implements Scope {

            @NotNull
            public static final Parcelable.Creator<AllPockets> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f65751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f65752b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(l.valueOf(parcel.readString()));
                    }
                    return new AllPockets(linkedHashSet, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllPockets[i];
                }
            }

            public AllPockets(Set pocketTypes, boolean z) {
                Intrinsics.checkNotNullParameter(pocketTypes, "pocketTypes");
                this.f65751a = pocketTypes;
                this.f65752b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AllPockets)) {
                    return false;
                }
                AllPockets allPockets = (AllPockets) obj2;
                return Intrinsics.f(this.f65751a, allPockets.f65751a) && this.f65752b == allPockets.f65752b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f65752b) + (this.f65751a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f65751a, dest);
                while (itV.hasNext()) {
                    dest.writeString(((l) itV.next()).name());
                }
                dest.writeInt(this.f65752b ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope$Empty;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope;", "<init>", "()V", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Empty implements Scope {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Empty f65753a = new Empty();

            @NotNull
            public static final Parcelable.Creator<Empty> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Empty.f65753a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Empty[i];
                }
            }

            private Empty() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope$PocketsIdSet;", "Lcom/revolut/feature/categorisation/api/model/CategorisationFilter$Scope;", "", "toString", "()Ljava/lang/String;", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PocketsIdSet implements Scope {

            @NotNull
            public static final Parcelable.Creator<PocketsIdSet> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f65754a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = o.a(parcel, linkedHashSet, iA, 1);
                    }
                    return new PocketsIdSet(linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PocketsIdSet[i];
                }
            }

            public PocketsIdSet(Set pocketIds) {
                Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
                this.f65754a = pocketIds;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PocketsIdSet) && Intrinsics.f(this.f65754a, ((PocketsIdSet) obj2).f65754a);
            }

            public final int hashCode() {
                return this.f65754a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f65754a, dest);
                while (itV.hasNext()) {
                    dest.writeString((String) itV.next());
                }
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVarValueOf = d.valueOf(parcel.readString());
            Scope scope = (Scope) parcel.readParcelable(CategorisationFilter.class.getClassLoader());
            Interval interval = (Interval) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(v6.valueOf(parcel.readString()));
            }
            i7 i7Var = (i7) parcel.readSerializable();
            i7 i7Var2 = (i7) parcel.readSerializable();
            b bVarValueOf = b.valueOf(parcel.readString());
            c cVarValueOf = c.valueOf(parcel.readString());
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
            int iA = 0;
            while (iA != i3) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            int i5 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i5);
            while (iE != i5) {
                iE = j6.a.e(CategorisationFilter.class, parcel, arrayList2, iE, 1);
            }
            return new CategorisationFilter(dVarValueOf, scope, interval, arrayList, i7Var, i7Var2, bVarValueOf, cVarValueOf, linkedHashSet, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CategorisationFilter[i];
        }
    }

    public CategorisationFilter(d transactionsDirection, Scope scope, Interval interval, List states, i7 i7Var, i7 i7Var2, b dateFilter, c exclusionRule, Set excludeRecipientIds, List exclusions) {
        Intrinsics.checkNotNullParameter(transactionsDirection, "transactionsDirection");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(dateFilter, "dateFilter");
        Intrinsics.checkNotNullParameter(exclusionRule, "exclusionRule");
        Intrinsics.checkNotNullParameter(excludeRecipientIds, "excludeRecipientIds");
        Intrinsics.checkNotNullParameter(exclusions, "exclusions");
        this.f65742a = transactionsDirection;
        this.f65743b = scope;
        this.f65744c = interval;
        this.d = states;
        this.e = i7Var;
        this.f = i7Var2;
        this.f65745g = dateFilter;
        this.f65746h = exclusionRule;
        this.i = excludeRecipientIds;
        this.f65747j = exclusions;
    }

    public static CategorisationFilter a(CategorisationFilter categorisationFilter, d dVar, Interval interval, i7 i7Var, i7 i7Var2, c cVar, int i) {
        if ((i & 1) != 0) {
            dVar = categorisationFilter.f65742a;
        }
        d transactionsDirection = dVar;
        Scope scope = categorisationFilter.f65743b;
        Interval interval2 = (i & 4) != 0 ? categorisationFilter.f65744c : interval;
        List states = categorisationFilter.d;
        i7 i7Var3 = (i & 16) != 0 ? categorisationFilter.e : i7Var;
        i7 i7Var4 = (i & 32) != 0 ? categorisationFilter.f : i7Var2;
        b dateFilter = categorisationFilter.f65745g;
        c exclusionRule = (i & 128) != 0 ? categorisationFilter.f65746h : cVar;
        Set excludeRecipientIds = categorisationFilter.i;
        List exclusions = categorisationFilter.f65747j;
        categorisationFilter.getClass();
        Intrinsics.checkNotNullParameter(transactionsDirection, "transactionsDirection");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(interval2, "interval");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(dateFilter, "dateFilter");
        Intrinsics.checkNotNullParameter(exclusionRule, "exclusionRule");
        Intrinsics.checkNotNullParameter(excludeRecipientIds, "excludeRecipientIds");
        Intrinsics.checkNotNullParameter(exclusions, "exclusions");
        return new CategorisationFilter(transactionsDirection, scope, interval2, states, i7Var3, i7Var4, dateFilter, exclusionRule, excludeRecipientIds, exclusions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CategorisationFilter)) {
            return false;
        }
        CategorisationFilter categorisationFilter = (CategorisationFilter) obj2;
        return this.f65742a == categorisationFilter.f65742a && Intrinsics.f(this.f65743b, categorisationFilter.f65743b) && Intrinsics.f(this.f65744c, categorisationFilter.f65744c) && Intrinsics.f(this.d, categorisationFilter.d) && Intrinsics.f(this.e, categorisationFilter.e) && Intrinsics.f(this.f, categorisationFilter.f) && this.f65745g == categorisationFilter.f65745g && this.f65746h == categorisationFilter.f65746h && Intrinsics.f(this.i, categorisationFilter.i) && Intrinsics.f(this.f65747j, categorisationFilter.f65747j);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f65744c.hashCode() + ((this.f65743b.hashCode() + (this.f65742a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        i7 i7Var = this.e;
        int iHashCode = (iD + (i7Var == null ? 0 : i7Var.hashCode())) * 31;
        i7 i7Var2 = this.f;
        return this.f65747j.hashCode() + p.a.f((this.f65746h.hashCode() + ((this.f65745g.hashCode() + ((iHashCode + (i7Var2 != null ? i7Var2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65742a.name());
        dest.writeParcelable(this.f65743b, i);
        dest.writeSerializable(this.f65744c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((v6) itV.next()).name());
        }
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f65745g.name());
        dest.writeString(this.f65746h.name());
        Iterator itV2 = n.v(this.i, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        Iterator itV3 = p.a.v(this.f65747j, dest);
        while (itV3.hasNext()) {
            dest.writeParcelable((Parcelable) itV3.next(), i);
        }
    }

    public CategorisationFilter(d dVar, Scope scope, Interval interval, List list, i7 i7Var, i7 i7Var2, b bVar, c cVar, Set set, List list2, int i) {
        this((i & 1) != 0 ? d.BOTH : dVar, scope, interval, (i & 8) != 0 ? v.k(v6.PENDING, v6.COMPLETED) : list, (i & 16) != 0 ? null : i7Var, (i & 32) != 0 ? null : i7Var2, (i & 64) != 0 ? b.START_DATE : bVar, (i & 128) != 0 ? c.EXCLUDE_ONLY_FULLY_EXCLUDED : cVar, (i & 256) != 0 ? h0.f322473a : set, (i & 512) != 0 ? v.k(Exclusion.Investments.f65749a, Exclusion.InternalCredits.f65748a, Exclusion.StakingTransactions.f65750a) : list2);
    }
}
