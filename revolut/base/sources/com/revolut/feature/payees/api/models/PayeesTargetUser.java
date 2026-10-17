package com.revolut.feature.payees.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payees/api/models/PayeesTargetUser;", "Landroid/os/Parcelable;", "All", "Junior", "Lcom/revolut/feature/payees/api/models/PayeesTargetUser$All;", "Lcom/revolut/feature/payees/api/models/PayeesTargetUser$Junior;", "feature_payees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayeesTargetUser extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payees/api/models/PayeesTargetUser$All;", "Lcom/revolut/feature/payees/api/models/PayeesTargetUser;", "<init>", "()V", "feature_payees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class All implements PayeesTargetUser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final All f78988a = new All();

        @NotNull
        public static final Parcelable.Creator<All> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return All.f78988a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new All[i];
            }
        }

        private All() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/api/models/PayeesTargetUser$Junior;", "Lcom/revolut/feature/payees/api/models/PayeesTargetUser;", "", "toString", "()Ljava/lang/String;", "feature_payees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior implements PayeesTargetUser {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78990b;

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

        public Junior(String juniorId, String firstName) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            this.f78989a = juniorId;
            this.f78990b = firstName;
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
            return Intrinsics.f(this.f78989a, junior.f78989a) && Intrinsics.f(this.f78990b, junior.f78990b);
        }

        public final int hashCode() {
            return this.f78990b.hashCode() + (this.f78989a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78989a);
            dest.writeString(this.f78990b);
        }
    }
}
