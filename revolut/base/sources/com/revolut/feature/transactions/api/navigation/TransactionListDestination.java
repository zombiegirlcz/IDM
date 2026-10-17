package com.revolut.feature.transactions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.R$string;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import ehe.n;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import prk.o;
import rhf.g;
import rhf.h;
import tof.i1;
import tof.q6;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionListDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/transactions/api/navigation/TransactionListDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionListDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TransactionListDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f91991b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionListDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f91992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f91993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f91994c;
        public final boolean d;
        public final TransactionsListFilterType e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AccountId f91995g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final h f91996h;
        public final g i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TransactionDestination f91997j;
        public final q6 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Set f91998l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final RecurringPaymentAccount f91999m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final RecurringPaymentFilter f92000n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f92001p;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", InputData.class);
                Clause clause2 = (Clause) parcel.readParcelable(InputData.class.getClassLoader());
                Image image = (Image) parcel.readParcelable(InputData.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                TransactionsListFilterType transactionsListFilterType = (TransactionsListFilterType) parcel.readParcelable(InputData.class.getClassLoader());
                String string = parcel.readString();
                AccountId accountId = (AccountId) parcel.readParcelable(InputData.class.getClassLoader());
                h hVarValueOf = h.valueOf(parcel.readString());
                g gVarValueOf = g.valueOf(parcel.readString());
                TransactionDestination transactionDestination = (TransactionDestination) parcel.readParcelable(InputData.class.getClassLoader());
                q6 q6Var = (q6) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                boolean z3 = z;
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new InputData(clause, clause2, image, z3, transactionsListFilterType, string, accountId, hVarValueOf, gVarValueOf, transactionDestination, q6Var, linkedHashSet, (RecurringPaymentAccount) parcel.readParcelable(InputData.class.getClassLoader()), (RecurringPaymentFilter) parcel.readParcelable(InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData() {
            this((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, (AccountId) null, (h) null, (g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return Intrinsics.f(this.f91992a, inputData.f91992a) && Intrinsics.f(this.f91993b, inputData.f91993b) && Intrinsics.f(this.f91994c, inputData.f91994c) && this.d == inputData.d && Intrinsics.f(this.e, inputData.e) && Intrinsics.f(this.f, inputData.f) && Intrinsics.f(this.f91995g, inputData.f91995g) && this.f91996h == inputData.f91996h && this.i == inputData.i && Intrinsics.f(this.f91997j, inputData.f91997j) && Intrinsics.f(this.k, inputData.k) && Intrinsics.f(this.f91998l, inputData.f91998l) && Intrinsics.f(this.f91999m, inputData.f91999m) && Intrinsics.f(this.f92000n, inputData.f92000n) && this.o == inputData.o && this.f92001p == inputData.f92001p;
        }

        public final int hashCode() {
            int iHashCode = this.f91992a.hashCode() * 31;
            Clause clause = this.f91993b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image = this.f91994c;
            int iHashCode3 = (this.f91999m.hashCode() + p.a.f((this.k.hashCode() + ((this.f91997j.hashCode() + ((this.i.hashCode() + ((this.f91996h.hashCode() + l.b(this.f91995g, p.a.c((this.e.hashCode() + j6.a.c((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31)) * 31)) * 31)) * 31)) * 31, 31, this.f91998l)) * 31;
            RecurringPaymentFilter recurringPaymentFilter = this.f92000n;
            return Boolean.hashCode(this.f92001p) + j6.a.c((iHashCode3 + (recurringPaymentFilter != null ? recurringPaymentFilter.hashCode() : 0)) * 31, 31, this.o);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91992a, i);
            dest.writeParcelable(this.f91993b, i);
            dest.writeParcelable(this.f91994c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
            dest.writeString(this.f);
            dest.writeParcelable(this.f91995g, i);
            dest.writeString(this.f91996h.name());
            dest.writeString(this.i.name());
            dest.writeParcelable(this.f91997j, i);
            dest.writeSerializable(this.k);
            Iterator itV = n.v(this.f91998l, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
            dest.writeParcelable(this.f91999m, i);
            dest.writeParcelable(this.f92000n, i);
            dest.writeInt(this.o ? 1 : 0);
            dest.writeInt(this.f92001p ? 1 : 0);
        }

        public InputData(Clause title, Clause clause, Image image, boolean z, TransactionsListFilterType filterType, String initialSearchQuery, AccountId accountId, h selectedTab, g entrypoint, TransactionDestination navigationDestination, q6 transactionScope, Set remotelyFoundTransactionGroupIds, RecurringPaymentAccount recurringPaymentAccount, RecurringPaymentFilter recurringPaymentFilter, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(filterType, "filterType");
            Intrinsics.checkNotNullParameter(initialSearchQuery, "initialSearchQuery");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
            Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
            Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
            Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
            Intrinsics.checkNotNullParameter(remotelyFoundTransactionGroupIds, "remotelyFoundTransactionGroupIds");
            Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
            this.f91992a = title;
            this.f91993b = clause;
            this.f91994c = image;
            this.d = z;
            this.e = filterType;
            this.f = initialSearchQuery;
            this.f91995g = accountId;
            this.f91996h = selectedTab;
            this.i = entrypoint;
            this.f91997j = navigationDestination;
            this.k = transactionScope;
            this.f91998l = remotelyFoundTransactionGroupIds;
            this.f91999m = recurringPaymentAccount;
            this.f92000n = recurringPaymentFilter;
            this.o = z3;
            this.f92001p = z4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public InputData(Clause clause, TextLocalisedClause textLocalisedClause, UrlImage urlImage, boolean z, TransactionsListFilterType transactionsListFilterType, String str, AccountId accountId, h hVar, g gVar, TransactionDestination transactionDestination, q6 q6Var, Set set, RecurringPaymentAccount recurringPaymentAccount, RecurringPaymentFilter recurringPaymentFilter, boolean z3, int i) {
            String str2;
            Clause textLocalisedClause2 = (i & 1) != 0 ? new TextLocalisedClause(R$string.transaction_list_navbar_title_default, null, null, 14) : clause;
            TextLocalisedClause textLocalisedClause3 = (i & 2) != 0 ? null : textLocalisedClause;
            UrlImage urlImage2 = (i & 4) != 0 ? null : urlImage;
            boolean z4 = (i & 8) != 0 ? true : z;
            TransactionsListFilterType transactionsListFilterType2 = (i & 16) != 0 ? TransactionsListFilterType.NoFilters.f92015a : transactionsListFilterType;
            if ((i & 32) != 0) {
                m70.a.c(t0.f186434a);
                str2 = "";
            } else {
                str2 = str;
            }
            this(textLocalisedClause2, textLocalisedClause3, urlImage2, z4, transactionsListFilterType2, str2, (i & 64) != 0 ? AccountId.Personal.f51414a : accountId, (i & 128) != 0 ? h.PAST : hVar, (i & 256) != 0 ? g.OTHER : gVar, (i & 512) != 0 ? TransactionDestination.Details.f91984a : transactionDestination, (i & 1024) != 0 ? i1.f272794a : q6Var, (i & 2048) != 0 ? h0.f322473a : set, (i & 4096) != 0 ? RecurringPaymentAccount.Personal.f89320a : recurringPaymentAccount, (i & 8192) != 0 ? null : recurringPaymentFilter, (i & 16384) == 0, (i & 32768) != 0 ? false : z3);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionListDestination(InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionListDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionListDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f91991b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f91991b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransactionListDestination) && Intrinsics.f(this.f91991b, ((TransactionListDestination) obj2).f91991b);
    }

    public final int hashCode() {
        return this.f91991b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f91991b.writeToParcel(dest, i);
    }

    public TransactionListDestination() {
        this(new InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, (AccountId) null, (h) null, (g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
    }
}
