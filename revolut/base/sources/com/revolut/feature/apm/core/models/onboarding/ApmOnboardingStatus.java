package com.revolut.feature.apm.core.models.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus;", "Landroid/os/Parcelable;", "Active", "Pending", "PendingUserAction", "NotRegistered", "RemediationRequired", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$Active;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$NotRegistered;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$Pending;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$PendingUserAction;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$RemediationRequired;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmOnboardingStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$Active;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Active implements ApmOnboardingStatus {

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmOnboardingStatusDetails f61967a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Active(parcel.readInt() == 0 ? null : ApmOnboardingStatusDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        public Active(ApmOnboardingStatusDetails apmOnboardingStatusDetails) {
            this.f61967a = apmOnboardingStatusDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Active) && Intrinsics.f(this.f61967a, ((Active) obj2).f61967a);
        }

        public final int hashCode() {
            ApmOnboardingStatusDetails apmOnboardingStatusDetails = this.f61967a;
            if (apmOnboardingStatusDetails == null) {
                return 0;
            }
            return apmOnboardingStatusDetails.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ApmOnboardingStatusDetails apmOnboardingStatusDetails = this.f61967a;
            if (apmOnboardingStatusDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apmOnboardingStatusDetails.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$NotRegistered;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotRegistered implements ApmOnboardingStatus {

        @NotNull
        public static final Parcelable.Creator<NotRegistered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61970c;
        public final ArrayList d;
        public final List e;
        public final ApmOnboardingStatusUserDetailsDetails f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f61971g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Boolean f61972h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ApmOnboardingStatusTerms.CREATOR, parcel, arrayList2, iA, 1);
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                Boolean boolValueOf = null;
                ApmOnboardingStatusUserDetailsDetails apmOnboardingStatusUserDetailsDetailsCreateFromParcel = parcel.readInt() == 0 ? null : ApmOnboardingStatusUserDetailsDetails.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    arrayList = new ArrayList(i2);
                    int iA2 = 0;
                    while (iA2 != i2) {
                        iA2 = org.bouncycastle.jcajce.provider.digest.a.a(ApmOnboardingAccountDetails.CREATOR, parcel, arrayList, iA2, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NotRegistered(string, string2, string3, arrayList2, arrayListCreateStringArrayList, apmOnboardingStatusUserDetailsDetailsCreateFromParcel, arrayList, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotRegistered[i];
            }
        }

        public NotRegistered(String name, String str, String str2, ArrayList terms, List termsUris, ApmOnboardingStatusUserDetailsDetails apmOnboardingStatusUserDetailsDetails, ArrayList arrayList, Boolean bool) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(terms, "terms");
            Intrinsics.checkNotNullParameter(termsUris, "termsUris");
            this.f61968a = name;
            this.f61969b = str;
            this.f61970c = str2;
            this.d = terms;
            this.e = termsUris;
            this.f = apmOnboardingStatusUserDetailsDetails;
            this.f61971g = arrayList;
            this.f61972h = bool;
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
            return Intrinsics.f(this.f61968a, notRegistered.f61968a) && Intrinsics.f(this.f61969b, notRegistered.f61969b) && Intrinsics.f(this.f61970c, notRegistered.f61970c) && this.d.equals(notRegistered.d) && Intrinsics.f(this.e, notRegistered.e) && Intrinsics.f(this.f, notRegistered.f) && Intrinsics.f(this.f61971g, notRegistered.f61971g) && Intrinsics.f(this.f61972h, notRegistered.f61972h);
        }

        public final int hashCode() {
            int iHashCode = this.f61968a.hashCode() * 31;
            String str = this.f61969b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f61970c;
            int iD = p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.e);
            ApmOnboardingStatusUserDetailsDetails apmOnboardingStatusUserDetailsDetails = this.f;
            int iHashCode3 = (iD + (apmOnboardingStatusUserDetailsDetails == null ? 0 : apmOnboardingStatusUserDetailsDetails.hashCode())) * 31;
            List list = this.f61971g;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.f61972h;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61968a);
            dest.writeString(this.f61969b);
            dest.writeString(this.f61970c);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                ((ApmOnboardingStatusTerms) itY.next()).writeToParcel(dest, i);
            }
            dest.writeStringList(this.e);
            ApmOnboardingStatusUserDetailsDetails apmOnboardingStatusUserDetailsDetails = this.f;
            if (apmOnboardingStatusUserDetailsDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                apmOnboardingStatusUserDetailsDetails.writeToParcel(dest, i);
            }
            List list = this.f61971g;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    ((ApmOnboardingAccountDetails) itQ.next()).writeToParcel(dest, i);
                }
            }
            Boolean bool = this.f61972h;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$Pending;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pending implements ApmOnboardingStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pending f61973a = new Pending();

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pending.f61973a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$PendingUserAction;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PendingUserAction implements ApmOnboardingStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PendingUserAction f61974a = new PendingUserAction();

        @NotNull
        public static final Parcelable.Creator<PendingUserAction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PendingUserAction.f61974a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingUserAction[i];
            }
        }

        private PendingUserAction() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus$RemediationRequired;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingStatus;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemediationRequired implements ApmOnboardingStatus {

        @NotNull
        public static final Parcelable.Creator<RemediationRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61975a;

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
            this.f61975a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemediationRequired) && Intrinsics.f(this.f61975a, ((RemediationRequired) obj2).f61975a);
        }

        public final int hashCode() {
            return this.f61975a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61975a);
        }
    }
}
