package com.revolut.feature.apm.core.models.multibanco;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus;", "Landroid/os/Parcelable;", "Registered", "Pending", "NotRegistered", "Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus$Pending;", "Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus$Registered;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultibancoRegistrationStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationTerms;", "a", "Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationTerms;", "()Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationTerms;", "terms", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotRegistered implements MultibancoRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<NotRegistered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("terms")
        @NotNull
        private final MultibancoRegistrationTerms terms;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotRegistered(MultibancoRegistrationTerms.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotRegistered[i];
            }
        }

        public NotRegistered(MultibancoRegistrationTerms terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.terms = terms;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MultibancoRegistrationTerms getTerms() {
            return this.terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NotRegistered) && Intrinsics.f(this.terms, ((NotRegistered) obj2).terms);
        }

        public final int hashCode() {
            return this.terms.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.terms.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus$Pending;", "Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pending implements MultibancoRegistrationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pending f61944a = new Pending();

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pending.f61944a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        private Pending() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus$Registered;", "Lcom/revolut/feature/apm/core/models/multibanco/MultibancoRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "pin", "b", "c", "ids", "d", "participantCode", "applicationCode", "bankHash", "f", "j", "revolutCardId", "g", "z", "serviceCardNumber", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Registered implements MultibancoRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<Registered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("pin")
        @NotNull
        private final String pin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("ids")
        @NotNull
        private final String ids;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("participantCode")
        @NotNull
        private final String participantCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @b("applicationCode")
        @NotNull
        private final String applicationCode;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @b("bankHash")
        @NotNull
        private final String bankHash;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @b("revolutCardId")
        @NotNull
        private final String revolutCardId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @b("serviceCardNumber")
        @NotNull
        private final String serviceCardNumber;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Registered(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Registered[i];
            }
        }

        public Registered(String pin, String ids, String participantCode, String applicationCode, String bankHash, String revolutCardId, String serviceCardNumber) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(ids, "ids");
            Intrinsics.checkNotNullParameter(participantCode, "participantCode");
            Intrinsics.checkNotNullParameter(applicationCode, "applicationCode");
            Intrinsics.checkNotNullParameter(bankHash, "bankHash");
            Intrinsics.checkNotNullParameter(revolutCardId, "revolutCardId");
            Intrinsics.checkNotNullParameter(serviceCardNumber, "serviceCardNumber");
            this.pin = pin;
            this.ids = ids;
            this.participantCode = participantCode;
            this.applicationCode = applicationCode;
            this.bankHash = bankHash;
            this.revolutCardId = revolutCardId;
            this.serviceCardNumber = serviceCardNumber;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApplicationCode() {
            return this.applicationCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBankHash() {
            return this.bankHash;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getIds() {
            return this.ids;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getParticipantCode() {
            return this.participantCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPin() {
            return this.pin;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Registered)) {
                return false;
            }
            Registered registered = (Registered) obj2;
            return Intrinsics.f(this.pin, registered.pin) && Intrinsics.f(this.ids, registered.ids) && Intrinsics.f(this.participantCode, registered.participantCode) && Intrinsics.f(this.applicationCode, registered.applicationCode) && Intrinsics.f(this.bankHash, registered.bankHash) && Intrinsics.f(this.revolutCardId, registered.revolutCardId) && Intrinsics.f(this.serviceCardNumber, registered.serviceCardNumber);
        }

        public final int hashCode() {
            return this.serviceCardNumber.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.pin.hashCode() * 31, 31, this.ids), 31, this.participantCode), 31, this.applicationCode), 31, this.bankHash), 31, this.revolutCardId);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getRevolutCardId() {
            return this.revolutCardId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.pin);
            dest.writeString(this.ids);
            dest.writeString(this.participantCode);
            dest.writeString(this.applicationCode);
            dest.writeString(this.bankHash);
            dest.writeString(this.revolutCardId);
            dest.writeString(this.serviceCardNumber);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getServiceCardNumber() {
            return this.serviceCardNumber;
        }
    }
}
