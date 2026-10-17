package com.revolut.feature.apm.core.models.iris;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingConflict;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus;", "Landroid/os/Parcelable;", "Active", "Pending", "RemediationRequired", "NotRegistered", "Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus$Active;", "Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus$Pending;", "Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus$RemediationRequired;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IrisRegistrationStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus$Active;", "Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Active implements IrisRegistrationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Active f61936a = new Active();

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Active.f61936a;
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004¨\u0006\u001f"}, d2 = {"Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPhone", "phone", "b", "getName", "name", "c", "iban", "d", "x5", "bic", "", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatusTerms;", "e", "Ljava/util/List;", "()Ljava/util/List;", "terms", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict;", "f", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict;", "()Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict;", "conflict", "g", "getAliasValue", "aliasValue", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotRegistered implements IrisRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<NotRegistered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("phone")
        @NotNull
        private final String phone;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("iban")
        @NotNull
        private final String iban;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @b("bic")
        @NotNull
        private final String bic;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @b("terms")
        @NotNull
        private final List<ApmOnboardingStatusTerms> terms;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @b("conflict")
        private final ApmOnboardingConflict conflict;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @b("aliasValue")
        private final String aliasValue;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ApmOnboardingStatusTerms.CREATOR, parcel, arrayList, iA, 1);
                }
                return new NotRegistered(string, string2, string3, string4, arrayList, (ApmOnboardingConflict) parcel.readParcelable(NotRegistered.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotRegistered[i];
            }
        }

        public NotRegistered(String phone, String name, String iban, String bic2, ArrayList terms, ApmOnboardingConflict apmOnboardingConflict, String str) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(iban, "iban");
            Intrinsics.checkNotNullParameter(bic2, "bic");
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.phone = phone;
            this.name = name;
            this.iban = iban;
            this.bic = bic2;
            this.terms = terms;
            this.conflict = apmOnboardingConflict;
            this.aliasValue = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ApmOnboardingConflict getConflict() {
            return this.conflict;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIban() {
            return this.iban;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return Intrinsics.f(this.phone, notRegistered.phone) && Intrinsics.f(this.name, notRegistered.name) && Intrinsics.f(this.iban, notRegistered.iban) && Intrinsics.f(this.bic, notRegistered.bic) && Intrinsics.f(this.terms, notRegistered.terms) && Intrinsics.f(this.conflict, notRegistered.conflict) && Intrinsics.f(this.aliasValue, notRegistered.aliasValue);
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.c(p.a.c(p.a.c(this.phone.hashCode() * 31, 31, this.name), 31, this.iban), 31, this.bic), 31, this.terms);
            ApmOnboardingConflict apmOnboardingConflict = this.conflict;
            int iHashCode = (iD + (apmOnboardingConflict == null ? 0 : apmOnboardingConflict.hashCode())) * 31;
            String str = this.aliasValue;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.phone);
            dest.writeString(this.name);
            dest.writeString(this.iban);
            dest.writeString(this.bic);
            Iterator itV = p.a.v(this.terms, dest);
            while (itV.hasNext()) {
                ((ApmOnboardingStatusTerms) itV.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.conflict, i);
            dest.writeString(this.aliasValue);
        }

        /* JADX INFO: renamed from: x5, reason: from getter */
        public final String getBic() {
            return this.bic;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus$Pending;", "Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pending implements IrisRegistrationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pending f61941a = new Pending();

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pending.f61941a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus$RemediationRequired;", "Lcom/revolut/feature/apm/core/models/iris/IrisRegistrationStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemediationRequired implements IrisRegistrationStatus {

        @NotNull
        public static final Parcelable.Creator<RemediationRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61942a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemediationRequired(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemediationRequired[i];
            }
        }

        public RemediationRequired(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f61942a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemediationRequired) && Intrinsics.f(this.f61942a, ((RemediationRequired) obj2).f61942a);
        }

        public final int hashCode() {
            return this.f61942a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61942a);
        }
    }
}
