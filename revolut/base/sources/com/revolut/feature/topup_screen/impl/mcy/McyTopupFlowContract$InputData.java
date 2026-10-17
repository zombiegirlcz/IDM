package com.revolut.feature.topup_screen.impl.mcy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.mcy.McyTopUpMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import h30.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "TopupSelectCountry", "AccountVerification", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$InputData$AccountVerification;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$InputData$TopupSelectCountry;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class McyTopupFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$InputData$AccountVerification;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountVerification extends McyTopupFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AccountVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopUpMethodsContext f91045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TopupMethodType f91047c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountVerification(TopupMethodType.valueOf(parcel.readString()), (TopUpMethodsContext) parcel.readParcelable(AccountVerification.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountVerification[i];
            }
        }

        public AccountVerification(TopupMethodType topUpMethodType, TopUpMethodsContext topUpMethodsContext, d amount, String str) {
            Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(topUpMethodType, "topUpMethodType");
            this.f91045a = topUpMethodsContext;
            this.f91046b = amount;
            this.f91047c = topUpMethodType;
            this.d = str;
        }

        @Override // com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData
        /* JADX INFO: renamed from: Z0, reason: from getter */
        public final d getF91049b() {
            return this.f91046b;
        }

        @Override // com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TopUpMethodsContext getF91048a() {
            return this.f91045a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountVerification)) {
                return false;
            }
            AccountVerification accountVerification = (AccountVerification) obj2;
            return Intrinsics.f(this.f91045a, accountVerification.f91045a) && Intrinsics.f(this.f91046b, accountVerification.f91046b) && this.f91047c == accountVerification.f91047c && Intrinsics.f(this.d, accountVerification.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f91047c.hashCode() + v7.c(this.f91045a.hashCode() * 31, 31, this.f91046b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91045a, i);
            dest.writeSerializable(this.f91046b);
            dest.writeString(this.f91047c.name());
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$InputData$TopupSelectCountry;", "Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopupSelectCountry extends McyTopupFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<TopupSelectCountry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopUpMethodsContext f91048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f91050c;
        public final McyTopUpMethod d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopupSelectCountry((TopUpMethodsContext) parcel.readParcelable(TopupSelectCountry.class.getClassLoader()), (d) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), (McyTopUpMethod) parcel.readParcelable(TopupSelectCountry.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopupSelectCountry[i];
            }
        }

        public TopupSelectCountry(TopUpMethodsContext topUpMethodsContext, d amount, xi0.b baseCurrency, McyTopUpMethod mcyTopUpMethod) {
            Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            this.f91048a = topUpMethodsContext;
            this.f91049b = amount;
            this.f91050c = baseCurrency;
            this.d = mcyTopUpMethod;
        }

        @Override // com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData
        /* JADX INFO: renamed from: Z0, reason: from getter */
        public final d getF91049b() {
            return this.f91049b;
        }

        @Override // com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TopUpMethodsContext getF91048a() {
            return this.f91048a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopupSelectCountry)) {
                return false;
            }
            TopupSelectCountry topupSelectCountry = (TopupSelectCountry) obj2;
            return Intrinsics.f(this.f91048a, topupSelectCountry.f91048a) && Intrinsics.f(this.f91049b, topupSelectCountry.f91049b) && Intrinsics.f(this.f91050c, topupSelectCountry.f91050c) && Intrinsics.f(this.d, topupSelectCountry.d);
        }

        public final int hashCode() {
            int iJ = l.j(this.f91050c, v7.c(this.f91048a.hashCode() * 31, 31, this.f91049b), 31);
            McyTopUpMethod mcyTopUpMethod = this.d;
            return iJ + (mcyTopUpMethod == null ? 0 : mcyTopUpMethod.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91048a, i);
            dest.writeSerializable(this.f91049b);
            dest.writeSerializable(this.f91050c);
            dest.writeParcelable(this.d, i);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public abstract d getF91049b();

    /* JADX INFO: renamed from: a */
    public abstract TopUpMethodsContext getF91048a();
}
