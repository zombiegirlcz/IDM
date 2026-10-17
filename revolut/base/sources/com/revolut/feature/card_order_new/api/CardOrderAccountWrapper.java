package com.revolut.feature.card_order_new.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderAccountWrapper;", "Landroid/os/Parcelable;", "Regular", "Junior", "Lcom/revolut/feature/card_order_new/api/CardOrderAccountWrapper$Junior;", "Lcom/revolut/feature/card_order_new/api/CardOrderAccountWrapper$Regular;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardOrderAccountWrapper extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderAccountWrapper$Junior;", "Lcom/revolut/feature/card_order_new/api/CardOrderAccountWrapper;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior implements CardOrderAccountWrapper {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64935c;

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

        public Junior(String juniorId, String walletId, String firstName) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            this.f64933a = juniorId;
            this.f64934b = walletId;
            this.f64935c = firstName;
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
            return Intrinsics.f(this.f64933a, junior.f64933a) && Intrinsics.f(this.f64934b, junior.f64934b) && Intrinsics.f(this.f64935c, junior.f64935c);
        }

        public final int hashCode() {
            return this.f64935c.hashCode() + p.a.c(this.f64933a.hashCode() * 31, 31, this.f64934b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64933a);
            dest.writeString(this.f64934b);
            dest.writeString(this.f64935c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderAccountWrapper$Regular;", "Lcom/revolut/feature/card_order_new/api/CardOrderAccountWrapper;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular implements CardOrderAccountWrapper {

        @NotNull
        public static final Parcelable.Creator<Regular> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f64936a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Regular((AccountId) parcel.readParcelable(Regular.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Regular[i];
            }
        }

        public Regular(AccountId accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f64936a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Regular) && Intrinsics.f(this.f64936a, ((Regular) obj2).f64936a);
        }

        public final int hashCode() {
            return this.f64936a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64936a, i);
        }
    }
}
