package com.revolut.feature.pockets.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/pockets/api/navigation/PocketListType;", "Landroid/os/Parcelable;", "<init>", "()V", "Main", "Joint", "Pro", "RevXFiat", "Lcom/revolut/feature/pockets/api/navigation/PocketListType$Joint;", "Lcom/revolut/feature/pockets/api/navigation/PocketListType$Main;", "Lcom/revolut/feature/pockets/api/navigation/PocketListType$Pro;", "Lcom/revolut/feature/pockets/api/navigation/PocketListType$RevXFiat;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PocketListType implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/api/navigation/PocketListType$Joint;", "Lcom/revolut/feature/pockets/api/navigation/PocketListType;", "", "toString", "()Ljava/lang/String;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint extends PocketListType {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId.Joint f80779a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint((AccountId.Joint) parcel.readParcelable(Joint.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(AccountId.Joint accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f80779a = accountId;
        }

        @Override // com.revolut.feature.pockets.api.navigation.PocketListType
        public final l a() {
            return l.CURRENT;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Joint) && Intrinsics.f(this.f80779a, ((Joint) obj2).f80779a);
        }

        @Override // com.revolut.feature.pockets.api.navigation.PocketListType
        public final AccountId getAccountId() {
            return this.f80779a;
        }

        public final int hashCode() {
            return this.f80779a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80779a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pockets/api/navigation/PocketListType$Main;", "Lcom/revolut/feature/pockets/api/navigation/PocketListType;", "<init>", "()V", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Main extends PocketListType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Main f80780a = new Main();

        @NotNull
        public static final Parcelable.Creator<Main> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Main.f80780a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Main[i];
            }
        }

        private Main() {
        }

        @Override // com.revolut.feature.pockets.api.navigation.PocketListType
        public final l a() {
            return l.CURRENT;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.pockets.api.navigation.PocketListType
        public final /* bridge */ /* synthetic */ AccountId getAccountId() {
            return AccountId.Personal.f51414a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pockets/api/navigation/PocketListType$Pro;", "Lcom/revolut/feature/pockets/api/navigation/PocketListType;", "<init>", "()V", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pro extends PocketListType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pro f80781a = new Pro();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pro.f80781a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        private Pro() {
        }

        @Override // com.revolut.feature.pockets.api.navigation.PocketListType
        public final l a() {
            return l.MERCHANT;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.pockets.api.navigation.PocketListType
        public final /* bridge */ /* synthetic */ AccountId getAccountId() {
            return AccountId.Personal.f51414a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pockets/api/navigation/PocketListType$RevXFiat;", "Lcom/revolut/feature/pockets/api/navigation/PocketListType;", "<init>", "()V", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevXFiat extends PocketListType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevXFiat f80782a = new RevXFiat();

        @NotNull
        public static final Parcelable.Creator<RevXFiat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevXFiat.f80782a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevXFiat[i];
            }
        }

        private RevXFiat() {
        }

        @Override // com.revolut.feature.pockets.api.navigation.PocketListType
        public final l a() {
            return l.REVX_FIAT;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.pockets.api.navigation.PocketListType
        public final /* bridge */ /* synthetic */ AccountId getAccountId() {
            return AccountId.Personal.f51414a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private PocketListType() {
    }

    public abstract l a();

    public abstract AccountId getAccountId();
}
