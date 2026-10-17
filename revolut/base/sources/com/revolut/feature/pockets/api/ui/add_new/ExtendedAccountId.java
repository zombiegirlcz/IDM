package com.revolut.feature.pockets.api.ui.add_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId;", "Landroid/os/Parcelable;", "Companion", "Personal", "Joint", "Junior", "a", "Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId$Joint;", "Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId$Junior;", "Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId$Personal;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExtendedAccountId extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f80794a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId$Joint;", "Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId;", "", "toString", "()Ljava/lang/String;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint implements ExtendedAccountId {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80789b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(String id10, String walletId) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f80788a = id10;
            this.f80789b = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Joint)) {
                return false;
            }
            Joint joint = (Joint) obj2;
            return Intrinsics.f(this.f80788a, joint.f80788a) && Intrinsics.f(this.f80789b, joint.f80789b);
        }

        public final int hashCode() {
            return this.f80789b.hashCode() + (this.f80788a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80788a);
            dest.writeString(this.f80789b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId$Junior;", "Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId;", "", "toString", "()Ljava/lang/String;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior implements ExtendedAccountId {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f80792c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public Junior(String juniorId, String firstName, String walletId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f80790a = juniorId;
            this.f80791b = firstName;
            this.f80792c = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Junior)) {
                return false;
            }
            Junior junior = (Junior) obj2;
            return Intrinsics.f(this.f80790a, junior.f80790a) && Intrinsics.f(this.f80791b, junior.f80791b) && Intrinsics.f(this.f80792c, junior.f80792c);
        }

        public final int hashCode() {
            return this.f80792c.hashCode() + p.a.c(this.f80790a.hashCode() * 31, 31, this.f80791b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80790a);
            dest.writeString(this.f80791b);
            dest.writeString(this.f80792c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId$Personal;", "Lcom/revolut/feature/pockets/api/ui/add_new/ExtendedAccountId;", "<init>", "()V", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Personal implements ExtendedAccountId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Personal f80793a = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.f80793a;
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

    /* JADX INFO: renamed from: com.revolut.feature.pockets.api.ui.add_new.ExtendedAccountId$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f80794a = new Companion();

        private Companion() {
        }

        public static ExtendedAccountId a(AccountId accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            if (accountId instanceof AccountId.Joint) {
                AccountId.Joint joint = (AccountId.Joint) accountId;
                return new Joint(joint.f51412a, joint.f51413b);
            }
            if (accountId.equals(AccountId.Personal.f51414a)) {
                return Personal.f80793a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    default AccountId o2() {
        if (this instanceof Joint) {
            Joint joint = (Joint) this;
            return new AccountId.Joint(joint.f80788a, joint.f80789b);
        }
        if (this instanceof Junior) {
            Junior junior = (Junior) this;
            return new AccountId.Joint(junior.f80790a, junior.f80792c);
        }
        if (equals(Personal.f80793a)) {
            return AccountId.Personal.f51414a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
