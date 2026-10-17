package com.revolut.feature.exchange.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import io3.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wd6.i;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Success", "FreelancerSuccess", "PocketActivationRequired", "InvestSuccess", "Lcom/revolut/feature/exchange/models/ExchangeResult$FreelancerSuccess;", "Lcom/revolut/feature/exchange/models/ExchangeResult$InvestSuccess;", "Lcom/revolut/feature/exchange/models/ExchangeResult$PocketActivationRequired;", "Lcom/revolut/feature/exchange/models/ExchangeResult$Success;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExchangeResult implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeResult$FreelancerSuccess;", "Lcom/revolut/feature/exchange/models/ExchangeResult;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreelancerSuccess extends ExchangeResult {

        @NotNull
        public static final Parcelable.Creator<FreelancerSuccess> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f72148c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreelancerSuccess((d) parcel.readSerializable(), (d) parcel.readSerializable(), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreelancerSuccess[i];
            }
        }

        public FreelancerSuccess(d from, d to6, e exchangeMode) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
            this.f72146a = from;
            this.f72147b = to6;
            this.f72148c = exchangeMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FreelancerSuccess)) {
                return false;
            }
            FreelancerSuccess freelancerSuccess = (FreelancerSuccess) obj2;
            return Intrinsics.f(this.f72146a, freelancerSuccess.f72146a) && Intrinsics.f(this.f72147b, freelancerSuccess.f72147b) && this.f72148c == freelancerSuccess.f72148c;
        }

        public final int hashCode() {
            return this.f72148c.hashCode() + v7.c(this.f72146a.hashCode() * 31, 31, this.f72147b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72146a);
            dest.writeSerializable(this.f72147b);
            dest.writeString(this.f72148c.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeResult$InvestSuccess;", "Lcom/revolut/feature/exchange/models/ExchangeResult;", "<init>", "()V", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvestSuccess extends ExchangeResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvestSuccess f72149a = new InvestSuccess();

        @NotNull
        public static final Parcelable.Creator<InvestSuccess> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InvestSuccess.f72149a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestSuccess[i];
            }
        }

        private InvestSuccess() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeResult$PocketActivationRequired;", "Lcom/revolut/feature/exchange/models/ExchangeResult;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketActivationRequired extends ExchangeResult {

        @NotNull
        public static final Parcelable.Creator<PocketActivationRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f72150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f72151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f72152c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketActivationRequired((b) parcel.readSerializable(), i.valueOf(parcel.readString()), l.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketActivationRequired[i];
            }
        }

        public PocketActivationRequired(b currency, i exchangePocketType, l pocketType, String str) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(exchangePocketType, "exchangePocketType");
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            this.f72150a = currency;
            this.f72151b = exchangePocketType;
            this.f72152c = pocketType;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PocketActivationRequired)) {
                return false;
            }
            PocketActivationRequired pocketActivationRequired = (PocketActivationRequired) obj2;
            return Intrinsics.f(this.f72150a, pocketActivationRequired.f72150a) && this.f72151b == pocketActivationRequired.f72151b && this.f72152c == pocketActivationRequired.f72152c && Intrinsics.f(this.d, pocketActivationRequired.d);
        }

        public final int hashCode() {
            int iC = t61.a.c(this.f72152c, (this.f72151b.hashCode() + (this.f72150a.hashCode() * 31)) * 31, 31);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72150a);
            dest.writeString(this.f72151b.name());
            dest.writeString(this.f72152c.name());
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeResult$Success;", "Lcom/revolut/feature/exchange/models/ExchangeResult;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success extends ExchangeResult {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f72155c;
        public final double d;
        public final String e;
        public final l f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f72156g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f72157h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f72158j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                d dVar2 = (d) parcel.readSerializable();
                e eVarValueOf = e.valueOf(parcel.readString());
                double d = parcel.readDouble();
                if (parcel.readSerializable() == null) {
                    return new Success(dVar, dVar2, eVarValueOf, d, parcel.readString(), l.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }
                throw new ClassCastException();
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(d from, d to6, e exchangeMode, double d, String str, l pocketTypeFrom, String groupId, String legId, String str2, String walletId) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
            Intrinsics.checkNotNullParameter(pocketTypeFrom, "pocketTypeFrom");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(legId, "legId");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f72153a = from;
            this.f72154b = to6;
            this.f72155c = exchangeMode;
            this.d = d;
            this.e = str;
            this.f = pocketTypeFrom;
            this.f72156g = groupId;
            this.f72157h = legId;
            this.i = str2;
            this.f72158j = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Success)) {
                return false;
            }
            Success success = (Success) obj2;
            return Intrinsics.f(this.f72153a, success.f72153a) && Intrinsics.f(this.f72154b, success.f72154b) && this.f72155c == success.f72155c && Double.compare(this.d, success.d) == 0 && Intrinsics.f(this.e, success.e) && this.f == success.f && Intrinsics.f(this.f72156g, success.f72156g) && Intrinsics.f(this.f72157h, success.f72157h) && Intrinsics.f(this.i, success.i) && Intrinsics.f(this.f72158j, success.f72158j);
        }

        public final int hashCode() {
            int iC = m72.b.c(y.g(this.f72155c, v7.c(this.f72153a.hashCode() * 31, 31, this.f72154b), 31), this.d, 961);
            String str = this.e;
            int iC2 = p.a.c(p.a.c(t61.a.c(this.f, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f72156g), 31, this.f72157h);
            String str2 = this.i;
            return this.f72158j.hashCode() + ((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72153a);
            dest.writeSerializable(this.f72154b);
            dest.writeString(this.f72155c.name());
            dest.writeDouble(this.d);
            dest.writeSerializable(null);
            dest.writeString(this.e);
            dest.writeString(this.f.name());
            dest.writeString(this.f72156g);
            dest.writeString(this.f72157h);
            dest.writeString(this.i);
            dest.writeString(this.f72158j);
        }
    }

    private ExchangeResult() {
    }
}
