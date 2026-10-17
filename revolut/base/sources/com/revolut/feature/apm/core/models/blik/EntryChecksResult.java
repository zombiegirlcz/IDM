package com.revolut.feature.apm.core.models.blik;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Passed", "AcceptanceFlowRequired", "RemediationRequired", "PhoneAlreadyInUse", "Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult$AcceptanceFlowRequired;", "Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult$Passed;", "Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult$PhoneAlreadyInUse;", "Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult$RemediationRequired;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EntryChecksResult implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult$AcceptanceFlowRequired;", "Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptanceFlowRequired extends EntryChecksResult {

        @NotNull
        public static final Parcelable.Creator<AcceptanceFlowRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f61932a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ApmOnboardingStatusTerms.CREATOR, parcel, arrayList, iA, 1);
                }
                return new AcceptanceFlowRequired(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptanceFlowRequired[i];
            }
        }

        public AcceptanceFlowRequired(ArrayList terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f61932a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AcceptanceFlowRequired) && this.f61932a.equals(((AcceptanceFlowRequired) obj2).f61932a);
        }

        public final int hashCode() {
            return this.f61932a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f61932a, dest);
            while (itY.hasNext()) {
                ((ApmOnboardingStatusTerms) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult$Passed;", "Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Passed extends EntryChecksResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Passed f61933a = new Passed();

        @NotNull
        public static final Parcelable.Creator<Passed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Passed.f61933a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Passed[i];
            }
        }

        private Passed() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult$PhoneAlreadyInUse;", "Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PhoneAlreadyInUse extends EntryChecksResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PhoneAlreadyInUse f61934a = new PhoneAlreadyInUse();

        @NotNull
        public static final Parcelable.Creator<PhoneAlreadyInUse> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PhoneAlreadyInUse.f61934a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneAlreadyInUse[i];
            }
        }

        private PhoneAlreadyInUse() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult$RemediationRequired;", "Lcom/revolut/feature/apm/core/models/blik/EntryChecksResult;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemediationRequired extends EntryChecksResult {

        @NotNull
        public static final Parcelable.Creator<RemediationRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61935a;

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
            this.f61935a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemediationRequired) && Intrinsics.f(this.f61935a, ((RemediationRequired) obj2).f61935a);
        }

        public final int hashCode() {
            return this.f61935a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61935a);
        }
    }

    private EntryChecksResult() {
    }
}
