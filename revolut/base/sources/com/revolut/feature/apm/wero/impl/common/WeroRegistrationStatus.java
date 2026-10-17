package com.revolut.feature.apm.wero.impl.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus;", "Landroid/os/Parcelable;", "Pending", "Active", "NotRegistered", "Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus$Active;", "Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus$Pending;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WeroRegistrationStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus$Active;", "Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus;", "<init>", "()V", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Active implements WeroRegistrationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Active f63035a = new Active();

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Active.f63035a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        private Active() {
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPhone", "phone", "b", "getEmail", "email", "c", "getName", "name", "d", "E", "accountNumber", "e", "x5", "bic", "", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatusTerms;", "f", "Ljava/util/List;", "()Ljava/util/List;", "terms", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotRegistered implements WeroRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<NotRegistered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("phone")
        @NotNull
        private final String phone;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("email")
        @NotNull
        private final String email;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @b("accountNumber")
        @NotNull
        private final String accountNumber;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @b("bic")
        @NotNull
        private final String bic;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @b("terms")
        @NotNull
        private final List<ApmOnboardingStatusTerms> terms;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(NotRegistered.class, parcel, arrayList, iE, 1);
                }
                return new NotRegistered(string, string2, string3, string4, string5, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotRegistered[i];
            }
        }

        public NotRegistered(String phone, String email, String name, String accountNumber, String bic2, ArrayList terms) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(bic2, "bic");
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.phone = phone;
            this.email = email;
            this.name = name;
            this.accountNumber = accountNumber;
            this.bic = bic2;
            this.terms = terms;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getTerms() {
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
            if (!(obj2 instanceof NotRegistered)) {
                return false;
            }
            NotRegistered notRegistered = (NotRegistered) obj2;
            return Intrinsics.f(this.phone, notRegistered.phone) && Intrinsics.f(this.email, notRegistered.email) && Intrinsics.f(this.name, notRegistered.name) && Intrinsics.f(this.accountNumber, notRegistered.accountNumber) && Intrinsics.f(this.bic, notRegistered.bic) && Intrinsics.f(this.terms, notRegistered.terms);
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final int hashCode() {
            return this.terms.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.phone.hashCode() * 31, 31, this.email), 31, this.name), 31, this.accountNumber), 31, this.bic);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.phone);
            dest.writeString(this.email);
            dest.writeString(this.name);
            dest.writeString(this.accountNumber);
            dest.writeString(this.bic);
            Iterator itV = p.a.v(this.terms, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }

        /* JADX INFO: renamed from: x5, reason: from getter */
        public final String getBic() {
            return this.bic;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus$Pending;", "Lcom/revolut/feature/apm/wero/impl/common/WeroRegistrationStatus;", "<init>", "()V", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pending implements WeroRegistrationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pending f63039a = new Pending();

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pending.f63039a;
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
}
