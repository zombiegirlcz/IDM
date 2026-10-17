package com.revolut.feature.spending_analytics.api.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "contextKey", "", "Lcom/revolut/feature/widgets/api/model/WidgetContextKey;", "accountType", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;", "<init>", "(Ljava/lang/String;Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;)V", "getContextKey", "()Ljava/lang/String;", "getAccountType", "()Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AccountType", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpendingWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<SpendingWidgetContext> CREATOR = new a();

    @NotNull
    private final AccountType accountType;

    @NotNull
    private final String contextKey;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;", "Landroid/os/Parcelable;", "Personal", "Joint", "Pro", "Linked", "Junior", "CreditCard", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$CreditCard;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Joint;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Junior;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Linked;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Personal;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Pro;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface AccountType extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$CreditCard;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreditCard implements AccountType {

            @NotNull
            public static final Parcelable.Creator<CreditCard> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87495a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CreditCard(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreditCard[i];
                }
            }

            public CreditCard(String facilityId) {
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                this.f87495a = facilityId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CreditCard) && Intrinsics.f(this.f87495a, ((CreditCard) obj2).f87495a);
            }

            public final int hashCode() {
                return this.f87495a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87495a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Joint;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Joint implements AccountType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Joint f87496a = new Joint();

            @NotNull
            public static final Parcelable.Creator<Joint> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Joint.f87496a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Joint[i];
                }
            }

            private Joint() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Junior;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Junior implements AccountType {

            @NotNull
            public static final Parcelable.Creator<Junior> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87497a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Junior(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Junior[i];
                }
            }

            public Junior(String juniorId) {
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                this.f87497a = juniorId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Junior) && Intrinsics.f(this.f87497a, ((Junior) obj2).f87497a);
            }

            public final int hashCode() {
                return this.f87497a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87497a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Linked;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Linked implements AccountType {

            @NotNull
            public static final Parcelable.Creator<Linked> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f87499b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Linked(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Linked[i];
                }
            }

            public Linked(String pocketId, String str) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f87498a = pocketId;
                this.f87499b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Linked)) {
                    return false;
                }
                Linked linked = (Linked) obj2;
                return Intrinsics.f(this.f87498a, linked.f87498a) && Intrinsics.f(this.f87499b, linked.f87499b);
            }

            public final int hashCode() {
                int iHashCode = this.f87498a.hashCode() * 31;
                String str = this.f87499b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87498a);
                dest.writeString(this.f87499b);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Personal;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Personal implements AccountType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Personal f87500a = new Personal();

            @NotNull
            public static final Parcelable.Creator<Personal> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Personal.f87500a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Personal[i];
                }
            }

            private Personal() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType$Pro;", "Lcom/revolut/feature/spending_analytics/api/widget/SpendingWidgetContext$AccountType;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Pro implements AccountType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Pro f87501a = new Pro();

            @NotNull
            public static final Parcelable.Creator<Pro> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Pro.f87501a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pro[i];
                }
            }

            private Pro() {
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

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpendingWidgetContext(parcel.readString(), (AccountType) parcel.readParcelable(SpendingWidgetContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpendingWidgetContext[i];
        }
    }

    public SpendingWidgetContext(@NotNull String contextKey, @NotNull AccountType accountType) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.contextKey = contextKey;
        this.accountType = accountType;
    }

    public static /* synthetic */ SpendingWidgetContext copy$default(SpendingWidgetContext spendingWidgetContext, String str, AccountType accountType, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = spendingWidgetContext.contextKey;
        }
        if ((i & 2) != 0) {
            accountType = spendingWidgetContext.accountType;
        }
        return spendingWidgetContext.copy(str, accountType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContextKey() {
        return this.contextKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AccountType getAccountType() {
        return this.accountType;
    }

    @NotNull
    public final SpendingWidgetContext copy(@NotNull String contextKey, @NotNull AccountType accountType) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new SpendingWidgetContext(contextKey, accountType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpendingWidgetContext)) {
            return false;
        }
        SpendingWidgetContext spendingWidgetContext = (SpendingWidgetContext) other;
        return Intrinsics.f(this.contextKey, spendingWidgetContext.contextKey) && Intrinsics.f(this.accountType, spendingWidgetContext.accountType);
    }

    @NotNull
    public final AccountType getAccountType() {
        return this.accountType;
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    @NotNull
    public String getContextKey() {
        return this.contextKey;
    }

    public int hashCode() {
        return this.accountType.hashCode() + (this.contextKey.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contextKey);
        dest.writeParcelable(this.accountType, flags);
    }
}
