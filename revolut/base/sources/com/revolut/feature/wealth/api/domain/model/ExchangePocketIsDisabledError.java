package com.revolut.feature.wealth.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/ExchangePocketIsDisabledError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "Payload", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangePocketIsDisabledError extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Payload f95225a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/ExchangePocketIsDisabledError$Payload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Payload implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Payload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95227b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Payload(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(String str, b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f95226a = currency;
            this.f95227b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj2;
            return Intrinsics.f(this.f95226a, payload.f95226a) && Intrinsics.f(this.f95227b, payload.f95227b);
        }

        public final int hashCode() {
            int iHashCode = this.f95226a.hashCode() * 31;
            String str = this.f95227b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95226a);
            dest.writeString(this.f95227b);
        }
    }

    public ExchangePocketIsDisabledError(Payload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f95225a = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ExchangePocketIsDisabledError) && Intrinsics.f(this.f95225a, ((ExchangePocketIsDisabledError) obj2).f95225a);
    }

    public final int hashCode() {
        return this.f95225a.hashCode();
    }
}
