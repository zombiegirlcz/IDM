package com.revolut.feature.home_feed.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0014\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "<init>", "()V", "Loan", "CreditCard", "Personal", "Collateral", "PersonalPocket", "GroupPocket", "JointPocket", "JointCurrency", "Pro", "ProPocket", "ProTaxPocket", "JuniorPocket", "Junior", "Savings", "JuniorSavings", "TeenSavings", "TeenPocket", "Linked", "JointSavings", "TotalWealth", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Collateral;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$CreditCard;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$GroupPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JointCurrency;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JointPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JointSavings;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Junior;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JuniorPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JuniorSavings;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Linked;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Loan;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Personal;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$PersonalPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Pro;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$ProPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$ProTaxPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$TeenPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$TeenSavings;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$TotalWealth;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HomeFeedWidgetContext extends WidgetContext {

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Collateral;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "facilityId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Collateral;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getFacilityId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Collateral extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String facilityId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Collateral> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Collateral$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Collateral(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Collateral[i];
            }
        }

        public /* synthetic */ Collateral(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ Collateral copy$default(Collateral collateral, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = collateral.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = collateral.facilityId;
            }
            return collateral.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFacilityId() {
            return this.facilityId;
        }

        @NotNull
        public final Collateral copy(@NotNull String contextKey, @NotNull String facilityId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            return new Collateral(contextKey, facilityId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Collateral)) {
                return false;
            }
            Collateral collateral = (Collateral) other;
            return Intrinsics.f(this.contextKey, collateral.contextKey) && Intrinsics.f(this.facilityId, collateral.facilityId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getFacilityId() {
            return this.facilityId;
        }

        public int hashCode() {
            return this.facilityId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.facilityId);
        }

        private Collateral(String str, String str2) {
            this.contextKey = str;
            this.facilityId = str2;
        }

        public /* synthetic */ Collateral(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CollateralPocket" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$CreditCard;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "creditCardFacilityId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$CreditCard;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getCreditCardFacilityId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCard extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String creditCardFacilityId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<CreditCard> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$CreditCard$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static CreditCard a(String creditCardFacilityId) {
                Intrinsics.checkNotNullParameter(creditCardFacilityId, "creditCardFacilityId");
                return new CreditCard(null, creditCardFacilityId, 1, 0 == true ? 1 : 0);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCard(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCard[i];
            }
        }

        public /* synthetic */ CreditCard(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ CreditCard copy$default(CreditCard creditCard, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = creditCard.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = creditCard.creditCardFacilityId;
            }
            return creditCard.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCreditCardFacilityId() {
            return this.creditCardFacilityId;
        }

        @NotNull
        public final CreditCard copy(@NotNull String contextKey, @NotNull String creditCardFacilityId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(creditCardFacilityId, "creditCardFacilityId");
            return new CreditCard(contextKey, creditCardFacilityId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreditCard)) {
                return false;
            }
            CreditCard creditCard = (CreditCard) other;
            return Intrinsics.f(this.contextKey, creditCard.contextKey) && Intrinsics.f(this.creditCardFacilityId, creditCard.creditCardFacilityId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getCreditCardFacilityId() {
            return this.creditCardFacilityId;
        }

        public int hashCode() {
            return this.creditCardFacilityId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.creditCardFacilityId);
        }

        private CreditCard(String str, String str2) {
            this.contextKey = str;
            this.creditCardFacilityId = str2;
        }

        public /* synthetic */ CreditCard(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CreditCard" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$GroupPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "subaccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$GroupPocket;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getSubaccountId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupPocket extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String subaccountId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<GroupPocket> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$GroupPocket$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GroupPocket(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupPocket[i];
            }
        }

        public /* synthetic */ GroupPocket(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ GroupPocket copy$default(GroupPocket groupPocket, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = groupPocket.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = groupPocket.subaccountId;
            }
            return groupPocket.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        @NotNull
        public final GroupPocket copy(@NotNull String contextKey, @NotNull String subaccountId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
            return new GroupPocket(contextKey, subaccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupPocket)) {
                return false;
            }
            GroupPocket groupPocket = (GroupPocket) other;
            return Intrinsics.f(this.contextKey, groupPocket.contextKey) && Intrinsics.f(this.subaccountId, groupPocket.subaccountId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        public int hashCode() {
            return this.subaccountId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.subaccountId);
        }

        private GroupPocket(String str, String str2) {
            this.contextKey = str;
            this.subaccountId = str2;
        }

        public /* synthetic */ GroupPocket(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GroupPocket" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JointCurrency;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JointCurrency;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointCurrency extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<JointCurrency> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$JointCurrency$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointCurrency(parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointCurrency[i];
            }
        }

        public /* synthetic */ JointCurrency(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public static /* synthetic */ JointCurrency copy$default(JointCurrency jointCurrency, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = jointCurrency.contextKey;
            }
            return jointCurrency.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        public final JointCurrency copy(@NotNull String contextKey) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            return new JointCurrency(contextKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JointCurrency) && Intrinsics.f(this.contextKey, ((JointCurrency) other).contextKey);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        public int hashCode() {
            return this.contextKey.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
        }

        private JointCurrency(String str) {
            this.contextKey = str;
        }

        public /* synthetic */ JointCurrency(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "JointCurrency" : str);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JointPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "subaccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JointPocket;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getSubaccountId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointPocket extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String subaccountId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<JointPocket> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$JointPocket$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static JointPocket a(String subaccountId) {
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                return new JointPocket(null, subaccountId, 1, 0 == true ? 1 : 0);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointPocket(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointPocket[i];
            }
        }

        public /* synthetic */ JointPocket(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ JointPocket copy$default(JointPocket jointPocket, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = jointPocket.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = jointPocket.subaccountId;
            }
            return jointPocket.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        @NotNull
        public final JointPocket copy(@NotNull String contextKey, @NotNull String subaccountId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
            return new JointPocket(contextKey, subaccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JointPocket)) {
                return false;
            }
            JointPocket jointPocket = (JointPocket) other;
            return Intrinsics.f(this.contextKey, jointPocket.contextKey) && Intrinsics.f(this.subaccountId, jointPocket.subaccountId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        public int hashCode() {
            return this.subaccountId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.subaccountId);
        }

        private JointPocket(String str, String str2) {
            this.contextKey = str;
            this.subaccountId = str2;
        }

        public /* synthetic */ JointPocket(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "JointPocket" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JointSavings;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "accountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JointSavings;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getAccountId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointSavings extends HomeFeedWidgetContext {

        @NotNull
        private final String accountId;

        @NotNull
        private final String contextKey;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<JointSavings> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$JointSavings$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointSavings(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointSavings[i];
            }
        }

        public /* synthetic */ JointSavings(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ JointSavings copy$default(JointSavings jointSavings, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = jointSavings.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = jointSavings.accountId;
            }
            return jointSavings.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @NotNull
        public final JointSavings copy(@NotNull String contextKey, @NotNull String accountId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            return new JointSavings(contextKey, accountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JointSavings)) {
                return false;
            }
            JointSavings jointSavings = (JointSavings) other;
            return Intrinsics.f(this.contextKey, jointSavings.contextKey) && Intrinsics.f(this.accountId, jointSavings.accountId);
        }

        @NotNull
        public final String getAccountId() {
            return this.accountId;
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        public int hashCode() {
            return this.accountId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.accountId);
        }

        private JointSavings(String str, String str2) {
            this.contextKey = str;
            this.accountId = str2;
        }

        public /* synthetic */ JointSavings(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "JointSavings" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Junior;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "juniorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Junior;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getJuniorId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String juniorId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Junior$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public /* synthetic */ Junior(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ Junior copy$default(Junior junior, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = junior.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = junior.juniorId;
            }
            return junior.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getJuniorId() {
            return this.juniorId;
        }

        @NotNull
        public final Junior copy(@NotNull String contextKey, @NotNull String juniorId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            return new Junior(contextKey, juniorId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Junior)) {
                return false;
            }
            Junior junior = (Junior) other;
            return Intrinsics.f(this.contextKey, junior.contextKey) && Intrinsics.f(this.juniorId, junior.juniorId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getJuniorId() {
            return this.juniorId;
        }

        public int hashCode() {
            return this.juniorId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.juniorId);
        }

        private Junior(String str, String str2) {
            this.contextKey = str;
            this.juniorId = str2;
        }

        public /* synthetic */ Junior(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "YouthAccount" : str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JuniorPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorPocket extends HomeFeedWidgetContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74692b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<JuniorPocket> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$JuniorPocket$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorPocket(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorPocket[i];
            }
        }

        public JuniorPocket(String str, String str2) {
            this.f74691a = str;
            this.f74692b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorPocket)) {
                return false;
            }
            JuniorPocket juniorPocket = (JuniorPocket) obj2;
            return Intrinsics.f(this.f74691a, juniorPocket.f74691a) && Intrinsics.f(this.f74692b, juniorPocket.f74692b);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        /* JADX INFO: renamed from: getContextKey, reason: from getter */
        public final String getF74702a() {
            return this.f74691a;
        }

        public final int hashCode() {
            return this.f74692b.hashCode() + (this.f74691a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74691a);
            dest.writeString(this.f74692b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$JuniorSavings;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorSavings extends HomeFeedWidgetContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f74695c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<JuniorSavings> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$JuniorSavings$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorSavings(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorSavings[i];
            }
        }

        public JuniorSavings(String str, String str2, String str3) {
            this.f74693a = str;
            this.f74694b = str2;
            this.f74695c = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorSavings)) {
                return false;
            }
            JuniorSavings juniorSavings = (JuniorSavings) obj2;
            return Intrinsics.f(this.f74693a, juniorSavings.f74693a) && Intrinsics.f(this.f74694b, juniorSavings.f74694b) && Intrinsics.f(this.f74695c, juniorSavings.f74695c);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        /* JADX INFO: renamed from: getContextKey, reason: from getter */
        public final String getF74702a() {
            return this.f74693a;
        }

        public final int hashCode() {
            return this.f74695c.hashCode() + a.c(this.f74693a.hashCode() * 31, 31, this.f74694b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74693a);
            dest.writeString(this.f74694b);
            dest.writeString(this.f74695c);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B%\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\nJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006$"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Linked;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "pocketId", "institutionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Linked;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getPocketId", "getInstitutionName", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Linked extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;
        private final String institutionName;

        @NotNull
        private final String pocketId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Linked> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Linked$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Linked(parcel.readString(), parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Linked[i];
            }
        }

        public /* synthetic */ Linked(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }

        public static /* synthetic */ Linked copy$default(Linked linked, String str, String str2, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = linked.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = linked.pocketId;
            }
            if ((i & 4) != 0) {
                str3 = linked.institutionName;
            }
            return linked.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPocketId() {
            return this.pocketId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getInstitutionName() {
            return this.institutionName;
        }

        @NotNull
        public final Linked copy(@NotNull String contextKey, @NotNull String pocketId, String institutionName) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            return new Linked(contextKey, pocketId, institutionName);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Linked)) {
                return false;
            }
            Linked linked = (Linked) other;
            return Intrinsics.f(this.contextKey, linked.contextKey) && Intrinsics.f(this.pocketId, linked.pocketId) && Intrinsics.f(this.institutionName, linked.institutionName);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        public final String getInstitutionName() {
            return this.institutionName;
        }

        @NotNull
        public final String getPocketId() {
            return this.pocketId;
        }

        public int hashCode() {
            int iC = a.c(this.contextKey.hashCode() * 31, 31, this.pocketId);
            String str = this.institutionName;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.pocketId);
            dest.writeString(this.institutionName);
        }

        private Linked(String str, String str2, String str3) {
            this.contextKey = str;
            this.pocketId = str2;
            this.institutionName = str3;
        }

        public /* synthetic */ Linked(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LinkedAccount" : str, str2, str3);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Loan;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "loanId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Loan;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getLoanId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loan extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String loanId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Loan> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Loan$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Loan(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loan[i];
            }
        }

        public /* synthetic */ Loan(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ Loan copy$default(Loan loan, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = loan.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = loan.loanId;
            }
            return loan.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLoanId() {
            return this.loanId;
        }

        @NotNull
        public final Loan copy(@NotNull String contextKey, @NotNull String loanId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            return new Loan(contextKey, loanId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loan)) {
                return false;
            }
            Loan loan = (Loan) other;
            return Intrinsics.f(this.contextKey, loan.contextKey) && Intrinsics.f(this.loanId, loan.loanId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getLoanId() {
            return this.loanId;
        }

        public int hashCode() {
            return this.loanId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.loanId);
        }

        private Loan(String str, String str2) {
            this.contextKey = str;
            this.loanId = str2;
        }

        public /* synthetic */ Loan(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LoanFeed" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Personal;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Personal;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Personal extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Personal$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Personal a() {
                return new Personal(null, 1, 0 == true ? 1 : 0);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Personal(parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        public /* synthetic */ Personal(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public static /* synthetic */ Personal copy$default(Personal personal, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = personal.contextKey;
            }
            return personal.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        public final Personal copy(@NotNull String contextKey) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            return new Personal(contextKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Personal) && Intrinsics.f(this.contextKey, ((Personal) other).contextKey);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        public int hashCode() {
            return this.contextKey.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
        }

        private Personal(String str) {
            this.contextKey = str;
        }

        public /* synthetic */ Personal(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Home" : str);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$PersonalPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "subaccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$PersonalPocket;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getSubaccountId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalPocket extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String subaccountId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<PersonalPocket> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$PersonalPocket$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static PersonalPocket a(String subaccountId) {
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                return new PersonalPocket(null, subaccountId, 1, 0 == true ? 1 : 0);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalPocket(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalPocket[i];
            }
        }

        public /* synthetic */ PersonalPocket(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ PersonalPocket copy$default(PersonalPocket personalPocket, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = personalPocket.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = personalPocket.subaccountId;
            }
            return personalPocket.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        @NotNull
        public final PersonalPocket copy(@NotNull String contextKey, @NotNull String subaccountId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
            return new PersonalPocket(contextKey, subaccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersonalPocket)) {
                return false;
            }
            PersonalPocket personalPocket = (PersonalPocket) other;
            return Intrinsics.f(this.contextKey, personalPocket.contextKey) && Intrinsics.f(this.subaccountId, personalPocket.subaccountId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        public int hashCode() {
            return this.subaccountId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.subaccountId);
        }

        private PersonalPocket(String str, String str2) {
            this.contextKey = str;
            this.subaccountId = str2;
        }

        public /* synthetic */ PersonalPocket(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "PersonalPocket" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Pro;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "accountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Pro;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getAccountId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pro extends HomeFeedWidgetContext {

        @NotNull
        private final String accountId;

        @NotNull
        private final String contextKey;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Pro$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pro(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        public /* synthetic */ Pro(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ Pro copy$default(Pro pro, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = pro.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = pro.accountId;
            }
            return pro.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @NotNull
        public final Pro copy(@NotNull String contextKey, @NotNull String accountId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            return new Pro(contextKey, accountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pro)) {
                return false;
            }
            Pro pro = (Pro) other;
            return Intrinsics.f(this.contextKey, pro.contextKey) && Intrinsics.f(this.accountId, pro.accountId);
        }

        @NotNull
        public final String getAccountId() {
            return this.accountId;
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        public int hashCode() {
            return this.accountId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.accountId);
        }

        private Pro(String str, String str2) {
            this.contextKey = str;
            this.accountId = str2;
        }

        public /* synthetic */ Pro(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Pro" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$ProPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "subaccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$ProPocket;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getSubaccountId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProPocket extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String subaccountId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<ProPocket> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$ProPocket$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProPocket(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProPocket[i];
            }
        }

        public /* synthetic */ ProPocket(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ ProPocket copy$default(ProPocket proPocket, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = proPocket.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = proPocket.subaccountId;
            }
            return proPocket.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        @NotNull
        public final ProPocket copy(@NotNull String contextKey, @NotNull String subaccountId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
            return new ProPocket(contextKey, subaccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProPocket)) {
                return false;
            }
            ProPocket proPocket = (ProPocket) other;
            return Intrinsics.f(this.contextKey, proPocket.contextKey) && Intrinsics.f(this.subaccountId, proPocket.subaccountId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        public int hashCode() {
            return this.subaccountId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.subaccountId);
        }

        private ProPocket(String str, String str2) {
            this.contextKey = str;
            this.subaccountId = str2;
        }

        public /* synthetic */ ProPocket(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ProPocket" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$ProTaxPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "subaccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$ProTaxPocket;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getSubaccountId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProTaxPocket extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String subaccountId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<ProTaxPocket> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$ProTaxPocket$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProTaxPocket(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProTaxPocket[i];
            }
        }

        public /* synthetic */ ProTaxPocket(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ ProTaxPocket copy$default(ProTaxPocket proTaxPocket, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = proTaxPocket.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = proTaxPocket.subaccountId;
            }
            return proTaxPocket.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        @NotNull
        public final ProTaxPocket copy(@NotNull String contextKey, @NotNull String subaccountId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
            return new ProTaxPocket(contextKey, subaccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProTaxPocket)) {
                return false;
            }
            ProTaxPocket proTaxPocket = (ProTaxPocket) other;
            return Intrinsics.f(this.contextKey, proTaxPocket.contextKey) && Intrinsics.f(this.subaccountId, proTaxPocket.subaccountId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getSubaccountId() {
            return this.subaccountId;
        }

        public int hashCode() {
            return this.subaccountId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.subaccountId);
        }

        private ProTaxPocket(String str, String str2) {
            this.contextKey = str;
            this.subaccountId = str2;
        }

        public /* synthetic */ ProTaxPocket(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ProTaxPocket" : str, str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\nJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006%"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;", "type", "<init>", "(Ljava/lang/String;Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;", "copy", "(Ljava/lang/String;Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;", "getType", "Companion", "a", "Type", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Savings extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final Type type;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Savings> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;", "Landroid/os/Parcelable;", "Personal", "Joint", "Youth", "Teen", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type$Joint;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type$Personal;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type$Teen;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type$Youth;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Type extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type$Joint;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Joint implements Type {

                @NotNull
                public static final Parcelable.Creator<Joint> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f74696a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Joint(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Joint[i];
                    }
                }

                public Joint(String id10) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    this.f74696a = id10;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Joint) && Intrinsics.f(this.f74696a, ((Joint) obj2).f74696a);
                }

                @Override // com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Savings.Type
                /* JADX INFO: renamed from: getId, reason: from getter */
                public final String getF74700a() {
                    return this.f74696a;
                }

                public final int hashCode() {
                    return this.f74696a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f74696a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type$Personal;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Personal implements Type {

                @NotNull
                public static final Parcelable.Creator<Personal> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f74697a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Personal(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Personal[i];
                    }
                }

                public Personal(String id10) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    this.f74697a = id10;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Personal) && Intrinsics.f(this.f74697a, ((Personal) obj2).f74697a);
                }

                @Override // com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Savings.Type
                /* JADX INFO: renamed from: getId, reason: from getter */
                public final String getF74700a() {
                    return this.f74697a;
                }

                public final int hashCode() {
                    return this.f74697a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f74697a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type$Teen;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Teen implements Type {

                @NotNull
                public static final Parcelable.Creator<Teen> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f74698a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f74699b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Teen(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Teen[i];
                    }
                }

                public Teen(String id10, String teenId) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(teenId, "teenId");
                    this.f74698a = id10;
                    this.f74699b = teenId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Teen)) {
                        return false;
                    }
                    Teen teen = (Teen) obj2;
                    return Intrinsics.f(this.f74698a, teen.f74698a) && Intrinsics.f(this.f74699b, teen.f74699b);
                }

                @Override // com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Savings.Type
                /* JADX INFO: renamed from: getId, reason: from getter */
                public final String getF74700a() {
                    return this.f74698a;
                }

                public final int hashCode() {
                    return this.f74699b.hashCode() + (this.f74698a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f74698a);
                    dest.writeString(this.f74699b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type$Youth;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$Savings$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Youth implements Type {

                @NotNull
                public static final Parcelable.Creator<Youth> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f74700a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f74701b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Youth(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Youth[i];
                    }
                }

                public Youth(String id10, String juniorId) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                    this.f74700a = id10;
                    this.f74701b = juniorId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Youth)) {
                        return false;
                    }
                    Youth youth = (Youth) obj2;
                    return Intrinsics.f(this.f74700a, youth.f74700a) && Intrinsics.f(this.f74701b, youth.f74701b);
                }

                @Override // com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Savings.Type
                /* JADX INFO: renamed from: getId, reason: from getter */
                public final String getF74700a() {
                    return this.f74700a;
                }

                public final int hashCode() {
                    return this.f74701b.hashCode() + (this.f74700a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f74700a);
                    dest.writeString(this.f74701b);
                }
            }

            /* JADX INFO: renamed from: getId */
            String getF74700a();
        }

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Savings$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Savings a(Type type) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new Savings(null, type, 1, 0 == true ? 1 : 0);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Savings(parcel.readString(), (Type) parcel.readParcelable(Savings.class.getClassLoader()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Savings[i];
            }
        }

        public /* synthetic */ Savings(String str, Type type, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, type);
        }

        public static /* synthetic */ Savings copy$default(Savings savings, String str, Type type, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = savings.contextKey;
            }
            if ((i & 2) != 0) {
                type = savings.type;
            }
            return savings.copy(str, type);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @NotNull
        public final Savings copy(@NotNull String contextKey, @NotNull Type type) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Savings(contextKey, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Savings)) {
                return false;
            }
            Savings savings = (Savings) other;
            return Intrinsics.f(this.contextKey, savings.contextKey) && Intrinsics.f(this.type, savings.type);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeParcelable(this.type, flags);
        }

        private Savings(String str, Type type) {
            this.contextKey = str;
            this.type = type;
        }

        public /* synthetic */ Savings(String str, Type type, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Savings" : str, type);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$TeenPocket;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "vaultId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$TeenPocket;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "getVaultId", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TeenPocket extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        @NotNull
        private final String vaultId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<TeenPocket> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$TeenPocket$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TeenPocket(parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TeenPocket[i];
            }
        }

        public /* synthetic */ TeenPocket(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public static /* synthetic */ TeenPocket copy$default(TeenPocket teenPocket, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = teenPocket.contextKey;
            }
            if ((i & 2) != 0) {
                str2 = teenPocket.vaultId;
            }
            return teenPocket.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVaultId() {
            return this.vaultId;
        }

        @NotNull
        public final TeenPocket copy(@NotNull String contextKey, @NotNull String vaultId) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            Intrinsics.checkNotNullParameter(vaultId, "vaultId");
            return new TeenPocket(contextKey, vaultId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TeenPocket)) {
                return false;
            }
            TeenPocket teenPocket = (TeenPocket) other;
            return Intrinsics.f(this.contextKey, teenPocket.contextKey) && Intrinsics.f(this.vaultId, teenPocket.vaultId);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        @NotNull
        public final String getVaultId() {
            return this.vaultId;
        }

        public int hashCode() {
            return this.vaultId.hashCode() + (this.contextKey.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
            dest.writeString(this.vaultId);
        }

        private TeenPocket(String str, String str2) {
            this.contextKey = str;
            this.vaultId = str2;
        }

        public /* synthetic */ TeenPocket(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "TeenPocket" : str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$TeenSavings;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TeenSavings extends HomeFeedWidgetContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f74704c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<TeenSavings> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$TeenSavings$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TeenSavings(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TeenSavings[i];
            }
        }

        public TeenSavings(String str, String str2, String str3) {
            this.f74702a = str;
            this.f74703b = str2;
            this.f74704c = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TeenSavings)) {
                return false;
            }
            TeenSavings teenSavings = (TeenSavings) obj2;
            return Intrinsics.f(this.f74702a, teenSavings.f74702a) && Intrinsics.f(this.f74703b, teenSavings.f74703b) && Intrinsics.f(this.f74704c, teenSavings.f74704c);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        /* JADX INFO: renamed from: getContextKey, reason: from getter */
        public final String getF74702a() {
            return this.f74702a;
        }

        public final int hashCode() {
            return this.f74704c.hashCode() + a.c(this.f74702a.hashCode() * 31, 31, this.f74703b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74702a);
            dest.writeString(this.f74703b);
            dest.writeString(this.f74704c);
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$TotalWealth;", "Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext;", "", "contextKey", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/revolut/feature/home_feed/api/models/HomeFeedWidgetContext$TotalWealth;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "Companion", "a", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TotalWealth extends HomeFeedWidgetContext {

        @NotNull
        private final String contextKey;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<TotalWealth> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$TotalWealth$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TotalWealth(parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalWealth[i];
            }
        }

        public /* synthetic */ TotalWealth(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public static /* synthetic */ TotalWealth copy$default(TotalWealth totalWealth, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = totalWealth.contextKey;
            }
            return totalWealth.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContextKey() {
            return this.contextKey;
        }

        @NotNull
        public final TotalWealth copy(@NotNull String contextKey) {
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            return new TotalWealth(contextKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TotalWealth) && Intrinsics.f(this.contextKey, ((TotalWealth) other).contextKey);
        }

        @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
        @NotNull
        /* JADX INFO: renamed from: getContextKey */
        public String getF74702a() {
            return this.contextKey;
        }

        public int hashCode() {
            return this.contextKey.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contextKey);
        }

        private TotalWealth(String str) {
            this.contextKey = str;
        }

        public /* synthetic */ TotalWealth(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "TotalWealth" : str);
        }
    }

    private HomeFeedWidgetContext() {
    }
}
