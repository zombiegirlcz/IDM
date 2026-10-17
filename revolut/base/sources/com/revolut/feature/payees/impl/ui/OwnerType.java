package com.revolut.feature.payees.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/OwnerType;", "Landroid/os/Parcelable;", "CurrentUser", "Junior", "Lcom/revolut/feature/payees/impl/ui/OwnerType$CurrentUser;", "Lcom/revolut/feature/payees/impl/ui/OwnerType$Junior;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OwnerType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/OwnerType$CurrentUser;", "Lcom/revolut/feature/payees/impl/ui/OwnerType;", "<init>", "()V", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CurrentUser implements OwnerType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CurrentUser f78992a = new CurrentUser();

        @NotNull
        public static final Parcelable.Creator<CurrentUser> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CurrentUser.f78992a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentUser[i];
            }
        }

        private CurrentUser() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/OwnerType$Junior;", "Lcom/revolut/feature/payees/impl/ui/OwnerType;", "", "toString", "()Ljava/lang/String;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior implements OwnerType {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78994b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public Junior(String id10, String firstName) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            this.f78993a = id10;
            this.f78994b = firstName;
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
            return Intrinsics.f(this.f78993a, junior.f78993a) && Intrinsics.f(this.f78994b, junior.f78994b);
        }

        public final int hashCode() {
            return this.f78994b.hashCode() + (this.f78993a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78993a);
            dest.writeString(this.f78994b);
        }
    }
}
