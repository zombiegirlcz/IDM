package com.revolut.feature.blocked_merchants.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/blocked_merchants/api/model/BlockMerchantsTabConfig;", "Landroid/os/Parcelable;", "All", "OnlyJunior", "Lcom/revolut/feature/blocked_merchants/api/model/BlockMerchantsTabConfig$All;", "Lcom/revolut/feature/blocked_merchants/api/model/BlockMerchantsTabConfig$OnlyJunior;", "feature_blocked_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BlockMerchantsTabConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/api/model/BlockMerchantsTabConfig$All;", "Lcom/revolut/feature/blocked_merchants/api/model/BlockMerchantsTabConfig;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class All implements BlockMerchantsTabConfig {

        @NotNull
        public static final Parcelable.Creator<All> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64203a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new All(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new All[i];
            }
        }

        public All(String str) {
            this.f64203a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof All) && Intrinsics.f(this.f64203a, ((All) obj2).f64203a);
        }

        public final int hashCode() {
            String str = this.f64203a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64203a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/api/model/BlockMerchantsTabConfig$OnlyJunior;", "Lcom/revolut/feature/blocked_merchants/api/model/BlockMerchantsTabConfig;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnlyJunior implements BlockMerchantsTabConfig {

        @NotNull
        public static final Parcelable.Creator<OnlyJunior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64206c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OnlyJunior(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnlyJunior[i];
            }
        }

        public OnlyJunior(String preselectedUserTabId, String firstName, String juniorWalletId) {
            Intrinsics.checkNotNullParameter(preselectedUserTabId, "preselectedUserTabId");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(juniorWalletId, "juniorWalletId");
            this.f64204a = preselectedUserTabId;
            this.f64205b = firstName;
            this.f64206c = juniorWalletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OnlyJunior)) {
                return false;
            }
            OnlyJunior onlyJunior = (OnlyJunior) obj2;
            return Intrinsics.f(this.f64204a, onlyJunior.f64204a) && Intrinsics.f(this.f64205b, onlyJunior.f64205b) && Intrinsics.f(this.f64206c, onlyJunior.f64206c);
        }

        public final int hashCode() {
            return this.f64206c.hashCode() + p.a.c(this.f64204a.hashCode() * 31, 31, this.f64205b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64204a);
            dest.writeString(this.f64205b);
            dest.writeString(this.f64206c);
        }
    }
}
