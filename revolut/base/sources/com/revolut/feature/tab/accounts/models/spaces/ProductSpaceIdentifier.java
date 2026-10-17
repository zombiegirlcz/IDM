package com.revolut.feature.tab.accounts.models.spaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "Landroid/os/Parcelable;", "Restricted", "Favourites", "Personal", "Joint", "Pro", "Youth", "Teen", "Linked", "TotalWealth", "CreditHub", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$CreditHub;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Favourites;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Joint;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Linked;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Personal;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Pro;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Restricted;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Teen;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$TotalWealth;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Youth;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProductSpaceIdentifier implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pie.a f89741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89742b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$CreditHub;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditHub extends ProductSpaceIdentifier {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditHub f89743c = new CreditHub();

        @NotNull
        public static final Parcelable.Creator<CreditHub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditHub.f89743c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditHub[i];
            }
        }

        private CreditHub() {
            super(pie.a.CREDIT_HUB);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Favourites;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Favourites extends ProductSpaceIdentifier {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Favourites f89744c = new Favourites();

        @NotNull
        public static final Parcelable.Creator<Favourites> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Favourites.f89744c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Favourites[i];
            }
        }

        private Favourites() {
            super(pie.a.FAVOURITES);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Joint;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "", "toString", "()Ljava/lang/String;", "State", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint extends ProductSpaceIdentifier {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final State f89745c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Joint$State;", "Landroid/os/Parcelable;", "Inactive", "Active", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Joint$State$Active;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Joint$State$Inactive;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface State extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Joint$State$Active;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Joint$State;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Active implements State {

                @NotNull
                public static final Parcelable.Creator<Active> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AccountId.Joint f89746a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Active((AccountId.Joint) parcel.readParcelable(Active.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Active[i];
                    }
                }

                public Active(AccountId.Joint accountId) {
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    this.f89746a = accountId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Active) && Intrinsics.f(this.f89746a, ((Active) obj2).f89746a);
                }

                public final int hashCode() {
                    return this.f89746a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f89746a, i);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Joint$State$Inactive;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Joint$State;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Inactive implements State {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Inactive f89747a = new Inactive();

                @NotNull
                public static final Parcelable.Creator<Inactive> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Inactive.f89747a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Inactive[i];
                    }
                }

                private Inactive() {
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
                return new Joint((State) parcel.readParcelable(Joint.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Joint(State state) {
            super(pie.a.JOINT);
            Intrinsics.checkNotNullParameter(state, "state");
            this.f89745c = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Joint) && Intrinsics.f(this.f89745c, ((Joint) obj2).f89745c);
        }

        public final int hashCode() {
            return this.f89745c.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89745c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Linked;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Linked extends ProductSpaceIdentifier {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Linked f89748c = new Linked();

        @NotNull
        public static final Parcelable.Creator<Linked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Linked.f89748c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Linked[i];
            }
        }

        private Linked() {
            super(pie.a.LINKED);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Personal;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Personal extends ProductSpaceIdentifier {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Personal f89749c = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.f89749c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        private Personal() {
            super(pie.a.PERSONAL);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Pro;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pro extends ProductSpaceIdentifier {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pro f89750c = new Pro();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pro.f89750c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        private Pro() {
            super(pie.a.PRO);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Restricted;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Restricted extends ProductSpaceIdentifier {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Restricted f89751c = new Restricted();

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Restricted.f89751c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Restricted[i];
            }
        }

        private Restricted() {
            super(pie.a.RESTRICTED);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Teen;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Teen extends ProductSpaceIdentifier {

        @NotNull
        public static final Parcelable.Creator<Teen> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f89752c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Teen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Teen[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Teen(String teenId) {
            super(pie.a.TEEN);
            Intrinsics.checkNotNullParameter(teenId, "teenId");
            this.f89752c = teenId;
            this.d = com.google.android.gms.internal.mlkit_vision_face.a.o(this.f89742b, "_", teenId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Teen) && Intrinsics.f(this.f89752c, ((Teen) obj2).f89752c);
        }

        public final int hashCode() {
            return this.f89752c.hashCode();
        }

        @Override // com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier
        /* JADX INFO: renamed from: m1, reason: from getter */
        public final String getF89742b() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89752c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$TotalWealth;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TotalWealth extends ProductSpaceIdentifier {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TotalWealth f89753c = new TotalWealth();

        @NotNull
        public static final Parcelable.Creator<TotalWealth> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TotalWealth.f89753c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalWealth[i];
            }
        }

        private TotalWealth() {
            super(pie.a.TOTAL_WEALTH);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Youth;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier;", "", "toString", "()Ljava/lang/String;", "State", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Youth extends ProductSpaceIdentifier {

        @NotNull
        public static final Parcelable.Creator<Youth> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final State f89754c;
        public final String d;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Youth$State;", "Landroid/os/Parcelable;", "Active", "Discover", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Youth$State$Active;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Youth$State$Discover;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface State extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Youth$State$Active;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Youth$State;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Active implements State {

                @NotNull
                public static final Parcelable.Creator<Active> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f89755a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Active(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Active[i];
                    }
                }

                public Active(String youthId) {
                    Intrinsics.checkNotNullParameter(youthId, "youthId");
                    this.f89755a = youthId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Active) && Intrinsics.f(this.f89755a, ((Active) obj2).f89755a);
                }

                public final int hashCode() {
                    return this.f89755a.hashCode();
                }

                @Override // com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier.Youth.State
                /* JADX INFO: renamed from: m1, reason: from getter */
                public final String getF89755a() {
                    return this.f89755a;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f89755a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Youth$State$Discover;", "Lcom/revolut/feature/tab/accounts/models/spaces/ProductSpaceIdentifier$Youth$State;", "<init>", "()V", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Discover implements State {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Discover f89756a = new Discover();

                @NotNull
                public static final Parcelable.Creator<Discover> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Discover.f89756a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Discover[i];
                    }
                }

                private Discover() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier.Youth.State
                /* JADX INFO: renamed from: m1 */
                public final String getF89755a() {
                    return "discover";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            /* JADX INFO: renamed from: m1 */
            String getF89755a();
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Youth((State) parcel.readParcelable(Youth.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Youth[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Youth(State state) {
            super(pie.a.YOUTH);
            Intrinsics.checkNotNullParameter(state, "state");
            this.f89754c = state;
            this.d = com.google.android.gms.internal.mlkit_vision_face.a.o(this.f89742b, "_", state.getF89755a());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Youth) && Intrinsics.f(this.f89754c, ((Youth) obj2).f89754c);
        }

        public final int hashCode() {
            return this.f89754c.hashCode();
        }

        @Override // com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier
        /* JADX INFO: renamed from: m1, reason: from getter */
        public final String getF89742b() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89754c, i);
        }
    }

    public ProductSpaceIdentifier(pie.a aVar) {
        this.f89741a = aVar;
        this.f89742b = aVar.getId();
    }

    /* JADX INFO: renamed from: m1, reason: from getter */
    public String getF89742b() {
        return this.f89742b;
    }
}
