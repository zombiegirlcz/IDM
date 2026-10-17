package com.revolut.feature.credit.application.plugins.api.models.delayed_credit_check;

import android.os.Parcel;
import android.os.Parcelable;
import dx4.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse;", "Landroid/os/Parcelable;", "InProgress", "Rejected", "Offer", "TimeoutPrompt", "Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse$InProgress;", "Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse$Offer;", "Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse$Rejected;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DelayedCreditCheckResponse extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse$InProgress;", "Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InProgress implements DelayedCreditCheckResponse {

        @NotNull
        public static final Parcelable.Creator<InProgress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f66447c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TimeoutPrompt f66448g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f66449h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InProgress(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), TimeoutPrompt.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InProgress[i];
            }
        }

        public InProgress(int i, int i2, String str, String title, String description, String primaryButtonTitle, TimeoutPrompt timeOutPrompt, String fallbackPostActivation) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
            Intrinsics.checkNotNullParameter(timeOutPrompt, "timeOutPrompt");
            Intrinsics.checkNotNullParameter(fallbackPostActivation, "fallbackPostActivation");
            this.f66445a = i;
            this.f66446b = i2;
            this.f66447c = str;
            this.d = title;
            this.e = description;
            this.f = primaryButtonTitle;
            this.f66448g = timeOutPrompt;
            this.f66449h = fallbackPostActivation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InProgress)) {
                return false;
            }
            InProgress inProgress = (InProgress) obj2;
            return this.f66445a == inProgress.f66445a && this.f66446b == inProgress.f66446b && Intrinsics.f(this.f66447c, inProgress.f66447c) && Intrinsics.f(this.d, inProgress.d) && Intrinsics.f(this.e, inProgress.e) && Intrinsics.f(this.f, inProgress.f) && Intrinsics.f(this.f66448g, inProgress.f66448g) && Intrinsics.f(this.f66449h, inProgress.f66449h);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f66446b, Integer.hashCode(this.f66445a) * 31, 31);
            String str = this.f66447c;
            return this.f66449h.hashCode() + ((this.f66448g.hashCode() + p.a.c(p.a.c(p.a.c((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f66445a);
            dest.writeInt(this.f66446b);
            dest.writeString(this.f66447c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            this.f66448g.writeToParcel(dest, i);
            dest.writeString(this.f66449h);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse$Offer;", "Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Offer implements DelayedCreditCheckResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Offer f66450a = new Offer();

        @NotNull
        public static final Parcelable.Creator<Offer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Offer.f66450a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Offer[i];
            }
        }

        private Offer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse$Rejected;", "Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rejected implements DelayedCreditCheckResponse {

        @NotNull
        public static final Parcelable.Creator<Rejected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66451a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rejected(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rejected[i];
            }
        }

        public Rejected(String fallbackPostActivation) {
            Intrinsics.checkNotNullParameter(fallbackPostActivation, "fallbackPostActivation");
            this.f66451a = fallbackPostActivation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Rejected) && Intrinsics.f(this.f66451a, ((Rejected) obj2).f66451a);
        }

        public final int hashCode() {
            return this.f66451a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66451a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/delayed_credit_check/DelayedCreditCheckResponse$TimeoutPrompt;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TimeoutPrompt implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TimeoutPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t1 f66454c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TimeoutPrompt(parcel.readString(), parcel.readString(), (t1) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TimeoutPrompt[i];
            }
        }

        public TimeoutPrompt(String title, String description, t1 actionFooter) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
            this.f66452a = title;
            this.f66453b = description;
            this.f66454c = actionFooter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TimeoutPrompt)) {
                return false;
            }
            TimeoutPrompt timeoutPrompt = (TimeoutPrompt) obj2;
            return Intrinsics.f(this.f66452a, timeoutPrompt.f66452a) && Intrinsics.f(this.f66453b, timeoutPrompt.f66453b) && Intrinsics.f(this.f66454c, timeoutPrompt.f66454c);
        }

        public final int hashCode() {
            return this.f66454c.hashCode() + p.a.c(this.f66452a.hashCode() * 31, 31, this.f66453b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66452a);
            dest.writeString(this.f66453b);
            dest.writeSerializable(this.f66454c);
        }
    }
}
