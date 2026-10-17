package com.revolut.feature.joint.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink;", "Landroid/os/Parcelable;", "Home", "Invitation", "InvitationRemind", "InvitationMcy", "AccountId", "TopUp", "TopUpMethods", "SavingsClosed", "SubaccountClosed", "SavingsCreate", "CardToGooglePay", "FirstPurchase", "CardOrderingSelection", "CardOrdering", "Lcom/revolut/feature/joint/api/models/JointDeeplink$AccountId;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$CardOrdering;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$CardOrderingSelection;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$CardToGooglePay;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$FirstPurchase;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$Home;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$Invitation;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$InvitationMcy;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$InvitationRemind;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$SavingsClosed;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$SavingsCreate;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$SubaccountClosed;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$TopUp;", "Lcom/revolut/feature/joint/api/models/JointDeeplink$TopUpMethods;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JointDeeplink extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$AccountId;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountId implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<AccountId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76467a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountId[i];
            }
        }

        public AccountId(String accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f76467a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountId) && Intrinsics.f(this.f76467a, ((AccountId) obj2).f76467a);
        }

        public final int hashCode() {
            return this.f76467a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76467a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$CardOrdering;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "<init>", "()V", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardOrdering implements JointDeeplink {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardOrdering f76468a = new CardOrdering();

        @NotNull
        public static final Parcelable.Creator<CardOrdering> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardOrdering.f76468a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOrdering[i];
            }
        }

        private CardOrdering() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$CardOrderingSelection;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardOrderingSelection implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<CardOrderingSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f76469a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardOrderingSelection(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOrderingSelection[i];
            }
        }

        public CardOrderingSelection(boolean z) {
            this.f76469a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardOrderingSelection) && this.f76469a == ((CardOrderingSelection) obj2).f76469a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76469a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f76469a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$CardToGooglePay;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardToGooglePay implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<CardToGooglePay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f76470a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardToGooglePay(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardToGooglePay[i];
            }
        }

        public CardToGooglePay(boolean z) {
            this.f76470a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardToGooglePay) && this.f76470a == ((CardToGooglePay) obj2).f76470a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76470a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f76470a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$FirstPurchase;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "<init>", "()V", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FirstPurchase implements JointDeeplink {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FirstPurchase f76471a = new FirstPurchase();

        @NotNull
        public static final Parcelable.Creator<FirstPurchase> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FirstPurchase.f76471a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FirstPurchase[i];
            }
        }

        private FirstPurchase() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$Home;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "<init>", "()V", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home implements JointDeeplink {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f76472a = new Home();

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f76472a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        private Home() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$Invitation;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invitation implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<Invitation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76473a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Invitation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Invitation[i];
            }
        }

        public Invitation(String invitationId) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            this.f76473a = invitationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Invitation) && Intrinsics.f(this.f76473a, ((Invitation) obj2).f76473a);
        }

        public final int hashCode() {
            return this.f76473a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76473a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$InvitationMcy;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvitationMcy implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<InvitationMcy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f76475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76476c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvitationMcy(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvitationMcy[i];
            }
        }

        public InvitationMcy(String pocketType, String str, b currency) {
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f76474a = pocketType;
            this.f76475b = currency;
            this.f76476c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvitationMcy)) {
                return false;
            }
            InvitationMcy invitationMcy = (InvitationMcy) obj2;
            return Intrinsics.f(this.f76474a, invitationMcy.f76474a) && Intrinsics.f(this.f76475b, invitationMcy.f76475b) && Intrinsics.f(this.f76476c, invitationMcy.f76476c);
        }

        public final int hashCode() {
            int iJ = l.j(this.f76475b, this.f76474a.hashCode() * 31, 31);
            String str = this.f76476c;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76474a);
            dest.writeSerializable(this.f76475b);
            dest.writeString(this.f76476c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$InvitationRemind;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvitationRemind implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<InvitationRemind> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76477a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvitationRemind(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvitationRemind[i];
            }
        }

        public InvitationRemind(String invitationId) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            this.f76477a = invitationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvitationRemind) && Intrinsics.f(this.f76477a, ((InvitationRemind) obj2).f76477a);
        }

        public final int hashCode() {
            return this.f76477a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76477a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$SavingsClosed;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsClosed implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<SavingsClosed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76479b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsClosed(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsClosed[i];
            }
        }

        public SavingsClosed(String initiatorName, String accountName) {
            Intrinsics.checkNotNullParameter(initiatorName, "initiatorName");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            this.f76478a = initiatorName;
            this.f76479b = accountName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingsClosed)) {
                return false;
            }
            SavingsClosed savingsClosed = (SavingsClosed) obj2;
            return Intrinsics.f(this.f76478a, savingsClosed.f76478a) && Intrinsics.f(this.f76479b, savingsClosed.f76479b);
        }

        public final int hashCode() {
            return this.f76479b.hashCode() + (this.f76478a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76478a);
            dest.writeString(this.f76479b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$SavingsCreate;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "<init>", "()V", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavingsCreate implements JointDeeplink {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SavingsCreate f76480a = new SavingsCreate();

        @NotNull
        public static final Parcelable.Creator<SavingsCreate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SavingsCreate.f76480a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsCreate[i];
            }
        }

        private SavingsCreate() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$SubaccountClosed;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubaccountClosed implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<SubaccountClosed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76482b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubaccountClosed(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubaccountClosed[i];
            }
        }

        public SubaccountClosed(String initiatorName, String accountName) {
            Intrinsics.checkNotNullParameter(initiatorName, "initiatorName");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            this.f76481a = initiatorName;
            this.f76482b = accountName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubaccountClosed)) {
                return false;
            }
            SubaccountClosed subaccountClosed = (SubaccountClosed) obj2;
            return Intrinsics.f(this.f76481a, subaccountClosed.f76481a) && Intrinsics.f(this.f76482b, subaccountClosed.f76482b);
        }

        public final int hashCode() {
            return this.f76482b.hashCode() + (this.f76481a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76481a);
            dest.writeString(this.f76482b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$TopUp;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUp implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<TopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f76483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f76484b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUp((b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUp[i];
            }
        }

        public TopUp(b bVar, boolean z) {
            this.f76483a = bVar;
            this.f76484b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopUp)) {
                return false;
            }
            TopUp topUp = (TopUp) obj2;
            return Intrinsics.f(this.f76483a, topUp.f76483a) && this.f76484b == topUp.f76484b;
        }

        public final int hashCode() {
            b bVar = this.f76483a;
            return Boolean.hashCode(this.f76484b) + ((bVar == null ? 0 : bVar.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f76483a);
            dest.writeInt(this.f76484b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/models/JointDeeplink$TopUpMethods;", "Lcom/revolut/feature/joint/api/models/JointDeeplink;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUpMethods implements JointDeeplink {

        @NotNull
        public static final Parcelable.Creator<TopUpMethods> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f76485a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUpMethods((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpMethods[i];
            }
        }

        public TopUpMethods(b bVar) {
            this.f76485a = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TopUpMethods) && Intrinsics.f(this.f76485a, ((TopUpMethods) obj2).f76485a);
        }

        public final int hashCode() {
            b bVar = this.f76485a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f76485a);
        }
    }
}
