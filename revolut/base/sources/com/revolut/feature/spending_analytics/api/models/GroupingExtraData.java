package com.revolut.feature.spending_analytics.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.categorisation.api.model.AnalyticsAccountPocketSource;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData;", "Landroid/os/Parcelable;", "None", "SourceAccount", "Card", "JointAccountParticipants", "Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData$Card;", "Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData$JointAccountParticipants;", "Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData$None;", "Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData$SourceAccount;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GroupingExtraData extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData$Card;", "Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Card implements GroupingExtraData {

        @NotNull
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f87447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f87448b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(Card.class, parcel, arrayList2, iE, 1);
                }
                return new Card(arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card(List cards, List terminatedCards) {
            Intrinsics.checkNotNullParameter(cards, "cards");
            Intrinsics.checkNotNullParameter(terminatedCards, "terminatedCards");
            this.f87447a = cards;
            this.f87448b = terminatedCards;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Card)) {
                return false;
            }
            Card card = (Card) obj2;
            return Intrinsics.f(this.f87447a, card.f87447a) && Intrinsics.f(this.f87448b, card.f87448b);
        }

        public final int hashCode() {
            return this.f87448b.hashCode() + (this.f87447a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f87447a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = p.a.v(this.f87448b, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData$JointAccountParticipants;", "Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointAccountParticipants implements GroupingExtraData {

        @NotNull
        public static final Parcelable.Creator<JointAccountParticipants> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f87449a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(AnalyticsParticipant.CREATOR, parcel, arrayList, iA, 1);
                }
                return new JointAccountParticipants(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointAccountParticipants[i];
            }
        }

        public JointAccountParticipants(List participants) {
            Intrinsics.checkNotNullParameter(participants, "participants");
            this.f87449a = participants;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JointAccountParticipants) && Intrinsics.f(this.f87449a, ((JointAccountParticipants) obj2).f87449a);
        }

        public final int hashCode() {
            return this.f87449a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f87449a, dest);
            while (itV.hasNext()) {
                ((AnalyticsParticipant) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData$None;", "Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None implements GroupingExtraData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f87450a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f87450a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData$SourceAccount;", "Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData;", "", "toString", "()Ljava/lang/String;", "AccountPocketSource", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SourceAccount implements GroupingExtraData {

        @NotNull
        public static final Parcelable.Creator<SourceAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f87451a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/GroupingExtraData$SourceAccount$AccountPocketSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AccountPocketSource implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AccountPocketSource> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AnalyticsAccount f87452a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AnalyticsAccountPocketSource f87453b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AccountPocketSource((AnalyticsAccount) parcel.readParcelable(AccountPocketSource.class.getClassLoader()), (AnalyticsAccountPocketSource) parcel.readParcelable(AccountPocketSource.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AccountPocketSource[i];
                }
            }

            public AccountPocketSource(AnalyticsAccount analyticsAccount, AnalyticsAccountPocketSource pocketSource) {
                Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
                Intrinsics.checkNotNullParameter(pocketSource, "pocketSource");
                this.f87452a = analyticsAccount;
                this.f87453b = pocketSource;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AccountPocketSource)) {
                    return false;
                }
                AccountPocketSource accountPocketSource = (AccountPocketSource) obj2;
                return Intrinsics.f(this.f87452a, accountPocketSource.f87452a) && Intrinsics.f(this.f87453b, accountPocketSource.f87453b);
            }

            public final String getPocketId() {
                AnalyticsAccountPocketSource analyticsAccountPocketSource = this.f87453b;
                if (analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.PocketSource) {
                    return ((AnalyticsAccountPocketSource.PocketSource) analyticsAccountPocketSource).f65740a.f163145a;
                }
                if (analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.SubaccountSource) {
                    return ((AnalyticsAccountPocketSource.SubaccountSource) analyticsAccountPocketSource).f65741a.getPocketId();
                }
                throw new NoWhenBranchMatchedException();
            }

            public final int hashCode() {
                return this.f87453b.hashCode() + (this.f87452a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f87452a, i);
                dest.writeParcelable(this.f87453b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(AccountPocketSource.CREATOR, parcel, arrayList, iA, 1);
                }
                return new SourceAccount(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SourceAccount[i];
            }
        }

        public SourceAccount(List accountPocketSources) {
            Intrinsics.checkNotNullParameter(accountPocketSources, "accountPocketSources");
            this.f87451a = accountPocketSources;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SourceAccount) && Intrinsics.f(this.f87451a, ((SourceAccount) obj2).f87451a);
        }

        public final int hashCode() {
            return this.f87451a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f87451a, dest);
            while (itV.hasNext()) {
                ((AccountPocketSource) itV.next()).writeToParcel(dest, i);
            }
        }
    }
}
