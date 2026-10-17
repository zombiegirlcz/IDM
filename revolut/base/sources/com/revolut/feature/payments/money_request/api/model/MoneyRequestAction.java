package com.revolut.feature.payments.money_request.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction;", "Landroid/os/Parcelable;", "Approve", "SharePaymentLink", "Remind", "Cancel", "Reject", "ApmSettings", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$ApmSettings;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$Approve;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$Cancel;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$Reject;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$Remind;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$SharePaymentLink;", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoneyRequestAction implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79590a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$ApmSettings;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApmSettings extends MoneyRequestAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmRecipientSettingsValue f79591b;

        @NotNull
        public static final Parcelable.Creator<ApmSettings> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApmSettings((ApmRecipientSettingsValue) parcel.readParcelable(ApmSettings.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmSettings[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApmSettings(ApmRecipientSettingsValue settings) {
            super("APM_SETTINGS");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f79591b = settings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ApmSettings) && Intrinsics.f(this.f79591b, ((ApmSettings) obj2).f79591b);
        }

        public final int hashCode() {
            return this.f79591b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79591b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$Approve;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction;", "<init>", "()V", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Approve extends MoneyRequestAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Approve f79592b = new Approve();

        @NotNull
        public static final Parcelable.Creator<Approve> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Approve.f79592b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Approve[i];
            }
        }

        private Approve() {
            super("APPROVE");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$Cancel;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction;", "<init>", "()V", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancel extends MoneyRequestAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Cancel f79593b = new Cancel();

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancel.f79593b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancel[i];
            }
        }

        private Cancel() {
            super("CANCEL");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$Reject;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction;", "<init>", "()V", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Reject extends MoneyRequestAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Reject f79594b = new Reject();

        @NotNull
        public static final Parcelable.Creator<Reject> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Reject.f79594b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reject[i];
            }
        }

        private Reject() {
            super("REJECT");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$Remind;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction;", "<init>", "()V", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Remind extends MoneyRequestAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Remind f79595b = new Remind();

        @NotNull
        public static final Parcelable.Creator<Remind> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Remind.f79595b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remind[i];
            }
        }

        private Remind() {
            super("REMIND");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction$SharePaymentLink;", "Lcom/revolut/feature/payments/money_request/api/model/MoneyRequestAction;", "<init>", "()V", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SharePaymentLink extends MoneyRequestAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SharePaymentLink f79596b = new SharePaymentLink();

        @NotNull
        public static final Parcelable.Creator<SharePaymentLink> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SharePaymentLink.f79596b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SharePaymentLink[i];
            }
        }

        private SharePaymentLink() {
            super("SHARE_PAYMENT_LINK");
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

    public MoneyRequestAction(String str) {
        this.f79590a = str;
    }
}
