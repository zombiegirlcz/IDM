package com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/brazil/payment_confirmation/BrazilPaymentConsentInput;", "Landroid/os/Parcelable;", "<init>", "()V", "Regular", "Handoff", "Lcom/revolut/feature/external_accounts/api/model/brazil/payment_confirmation/BrazilPaymentConsentInput$Handoff;", "Lcom/revolut/feature/external_accounts/api/model/brazil/payment_confirmation/BrazilPaymentConsentInput$Regular;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrazilPaymentConsentInput implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/brazil/payment_confirmation/BrazilPaymentConsentInput$Handoff;", "Lcom/revolut/feature/external_accounts/api/model/brazil/payment_confirmation/BrazilPaymentConsentInput;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Handoff extends BrazilPaymentConsentInput {

        @NotNull
        public static final Parcelable.Creator<Handoff> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72234a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Handoff(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Handoff[i];
            }
        }

        public Handoff(String paymentCode) {
            Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
            this.f72234a = paymentCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Handoff) && Intrinsics.f(this.f72234a, ((Handoff) obj2).f72234a);
        }

        public final int hashCode() {
            return this.f72234a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72234a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/brazil/payment_confirmation/BrazilPaymentConsentInput$Regular;", "Lcom/revolut/feature/external_accounts/api/model/brazil/payment_confirmation/BrazilPaymentConsentInput;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular extends BrazilPaymentConsentInput {

        @NotNull
        public static final Parcelable.Creator<Regular> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f72237c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Regular(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Regular[i];
            }
        }

        public Regular(String clientId, String requestUri, String str, String str2) {
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(requestUri, "requestUri");
            this.f72235a = clientId;
            this.f72236b = requestUri;
            this.f72237c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) obj2;
            return Intrinsics.f(this.f72235a, regular.f72235a) && Intrinsics.f(this.f72236b, regular.f72236b) && Intrinsics.f(this.f72237c, regular.f72237c) && Intrinsics.f(this.d, regular.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f72235a.hashCode() * 31, 31, this.f72236b);
            String str = this.f72237c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72235a);
            dest.writeString(this.f72236b);
            dest.writeString(this.f72237c);
            dest.writeString(this.d);
        }
    }

    private BrazilPaymentConsentInput() {
    }
}
