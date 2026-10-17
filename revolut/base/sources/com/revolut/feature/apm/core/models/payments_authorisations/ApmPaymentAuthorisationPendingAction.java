package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationPendingAction;", "Landroid/os/Parcelable;", "Mandate", "Amendment", "j02/n", "Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationPendingAction$Amendment;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationPendingAction$Mandate;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmPaymentAuthorisationPendingAction extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationPendingAction$Amendment;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationPendingAction;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amendment implements ApmPaymentAuthorisationPendingAction {

        @NotNull
        public static final Parcelable.Creator<Amendment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationAmendment f61990a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amendment(ApmPaymentAuthorisationAmendment.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amendment[i];
            }
        }

        public Amendment(ApmPaymentAuthorisationAmendment item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f61990a = item;
        }

        @Override // com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction
        public final ApmPaymentAuthorisationPaymentMethod B3() {
            return this.f61990a.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Amendment) && Intrinsics.f(this.f61990a, ((Amendment) obj2).f61990a);
        }

        public final int hashCode() {
            return this.f61990a.hashCode();
        }

        @Override // com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction
        /* JADX INFO: renamed from: r5 */
        public final ApmPaymentAuthorisationSummary getF61991a() {
            return this.f61990a.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f61990a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationPendingAction$Mandate;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationPendingAction;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Mandate implements ApmPaymentAuthorisationPendingAction {

        @NotNull
        public static final Parcelable.Creator<Mandate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationSummary f61991a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Mandate(ApmPaymentAuthorisationSummary.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Mandate[i];
            }
        }

        public Mandate(ApmPaymentAuthorisationSummary item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f61991a = item;
        }

        @Override // com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction
        public final ApmPaymentAuthorisationPaymentMethod B3() {
            return this.f61991a.f61994c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Mandate) && Intrinsics.f(this.f61991a, ((Mandate) obj2).f61991a);
        }

        public final int hashCode() {
            return this.f61991a.hashCode();
        }

        @Override // com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction
        /* JADX INFO: renamed from: r5, reason: from getter */
        public final ApmPaymentAuthorisationSummary getF61991a() {
            return this.f61991a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f61991a.writeToParcel(dest, i);
        }
    }

    ApmPaymentAuthorisationPaymentMethod B3();

    /* JADX INFO: renamed from: r5 */
    ApmPaymentAuthorisationSummary getF61991a();
}
