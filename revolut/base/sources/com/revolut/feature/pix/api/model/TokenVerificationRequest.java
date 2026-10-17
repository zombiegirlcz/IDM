package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pix/api/model/TokenVerificationRequest;", "Landroid/os/Parcelable;", "Operation", "Email", "Phone", "Lcom/revolut/feature/pix/api/model/TokenVerificationRequest$Email;", "Lcom/revolut/feature/pix/api/model/TokenVerificationRequest$Phone;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TokenVerificationRequest implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/TokenVerificationRequest$Email;", "Lcom/revolut/feature/pix/api/model/TokenVerificationRequest;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email extends TokenVerificationRequest {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Operation f80485b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readString(), Operation.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(String value, Operation operation) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f80484a = value;
            this.f80485b = operation;
        }

        @Override // com.revolut.feature.pix.api.model.TokenVerificationRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Operation getF80487b() {
            return this.f80485b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Email)) {
                return false;
            }
            Email email = (Email) obj2;
            return Intrinsics.f(this.f80484a, email.f80484a) && this.f80485b == email.f80485b;
        }

        @Override // com.revolut.feature.pix.api.model.TokenVerificationRequest
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF80486a() {
            return this.f80484a;
        }

        public final int hashCode() {
            return this.f80485b.hashCode() + (this.f80484a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80484a);
            this.f80485b.writeToParcel(dest, i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/api/model/TokenVerificationRequest$Operation;", "Landroid/os/Parcelable;", "", "CREATE_ALIAS", "CONFIRM_CLAIM", "DENY_CLAIM", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Operation implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Operation[] $VALUES;
        public static final Operation CONFIRM_CLAIM;
        public static final Operation CREATE_ALIAS;

        @NotNull
        public static final Parcelable.Creator<Operation> CREATOR;
        public static final Operation DENY_CLAIM;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Operation.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Operation[i];
            }
        }

        static {
            Operation operation = new Operation("CREATE_ALIAS", 0);
            CREATE_ALIAS = operation;
            Operation operation2 = new Operation("CONFIRM_CLAIM", 1);
            CONFIRM_CLAIM = operation2;
            Operation operation3 = new Operation("DENY_CLAIM", 2);
            DENY_CLAIM = operation3;
            Operation[] operationArr = {operation, operation2, operation3};
            $VALUES = operationArr;
            $ENTRIES = s.n(operationArr);
            CREATOR = new a();
        }

        public static Operation valueOf(String str) {
            return (Operation) Enum.valueOf(Operation.class, str);
        }

        public static Operation[] values() {
            return (Operation[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/TokenVerificationRequest$Phone;", "Lcom/revolut/feature/pix/api/model/TokenVerificationRequest;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone extends TokenVerificationRequest {

        @NotNull
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Operation f80487b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Phone(parcel.readString(), Operation.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Phone[i];
            }
        }

        public Phone(String value, Operation operation) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f80486a = value;
            this.f80487b = operation;
        }

        @Override // com.revolut.feature.pix.api.model.TokenVerificationRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Operation getF80487b() {
            return this.f80487b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) obj2;
            return Intrinsics.f(this.f80486a, phone.f80486a) && this.f80487b == phone.f80487b;
        }

        @Override // com.revolut.feature.pix.api.model.TokenVerificationRequest
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF80486a() {
            return this.f80486a;
        }

        public final int hashCode() {
            return this.f80487b.hashCode() + (this.f80486a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80486a);
            this.f80487b.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Operation getF80487b();

    /* JADX INFO: renamed from: getValue */
    public abstract String getF80486a();
}
