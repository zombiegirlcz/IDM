package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestSettings;
import com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection;", "Landroid/os/Parcelable;", "Outgoing", "Incoming", "AcceptMoneyRequest", "Draft", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection$AcceptMoneyRequest;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection$Draft;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection$Incoming;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection$Outgoing;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ApmTransferDirection implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f62293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62294b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection$AcceptMoneyRequest;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptMoneyRequest extends ApmTransferDirection {

        @NotNull
        public static final Parcelable.Creator<AcceptMoneyRequest> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ApmTransferRecipient.Outgoing f62295c;
        public final MoneyRequest d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcceptMoneyRequest((ApmTransferRecipient.Outgoing) parcel.readParcelable(AcceptMoneyRequest.class.getClassLoader()), (MoneyRequest) parcel.readParcelable(AcceptMoneyRequest.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptMoneyRequest[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AcceptMoneyRequest(ApmTransferRecipient.Outgoing recipient, MoneyRequest moneyRequest, boolean z) {
            super(f.OUTGOING, z);
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
            this.f62295c = recipient;
            this.d = moneyRequest;
            this.e = z;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        /* JADX INFO: renamed from: a */
        public final boolean getD() {
            MoneyRequestSettings moneyRequestSettings = this.d.f60324q;
            return moneyRequestSettings != null && moneyRequestSettings.f60351a;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        /* JADX INFO: renamed from: b */
        public final boolean getE() {
            MoneyRequestSettings moneyRequestSettings = this.d.f60324q;
            return moneyRequestSettings != null && moneyRequestSettings.f60352b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AcceptMoneyRequest)) {
                return false;
            }
            AcceptMoneyRequest acceptMoneyRequest = (AcceptMoneyRequest) obj2;
            return Intrinsics.f(this.f62295c, acceptMoneyRequest.f62295c) && Intrinsics.f(this.d, acceptMoneyRequest.d) && this.e == acceptMoneyRequest.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + (this.f62295c.hashCode() * 31)) * 31);
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        public final ApmTransferRecipient t0() {
            return this.f62295c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62295c, i);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection$Draft;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Draft extends ApmTransferDirection {

        @NotNull
        public static final Parcelable.Creator<Draft> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ApmPaymentDraft f62296c;
        public final ApmTransferRecipient.Outgoing d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Draft((ApmPaymentDraft) parcel.readParcelable(Draft.class.getClassLoader()), (ApmTransferRecipient.Outgoing) parcel.readParcelable(Draft.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Draft[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Draft(ApmPaymentDraft draft, ApmTransferRecipient.Outgoing recipient) {
            super(f.OUTGOING, true);
            Intrinsics.checkNotNullParameter(draft, "draft");
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f62296c = draft;
            this.d = recipient;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        /* JADX INFO: renamed from: a */
        public final boolean getD() {
            return this.f62296c.d.f62198c.f62199a;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        /* JADX INFO: renamed from: b */
        public final boolean getE() {
            return this.f62296c.d.f62198c.f62200b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Draft)) {
                return false;
            }
            Draft draft = (Draft) obj2;
            return Intrinsics.f(this.f62296c, draft.f62296c) && Intrinsics.f(this.d, draft.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.f62296c.hashCode() * 31);
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        public final ApmTransferRecipient t0() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62296c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection$Incoming;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Incoming extends ApmTransferDirection {

        @NotNull
        public static final Parcelable.Creator<Incoming> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ApmTransferRecipient.Contact f62297c;
        public final ApmTransferPayerSettings d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Incoming(ApmTransferRecipient.Contact.CREATOR.createFromParcel(parcel), (ApmTransferPayerSettings) parcel.readParcelable(Incoming.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Incoming[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Incoming(ApmTransferRecipient.Contact recipient, ApmTransferPayerSettings apmTransferPayerSettings) {
            super(f.INCOMING, false);
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f62297c = recipient;
            this.d = apmTransferPayerSettings;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        /* JADX INFO: renamed from: a */
        public final boolean getD() {
            return true;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        /* JADX INFO: renamed from: b */
        public final boolean getE() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Incoming)) {
                return false;
            }
            Incoming incoming = (Incoming) obj2;
            return Intrinsics.f(this.f62297c, incoming.f62297c) && Intrinsics.f(this.d, incoming.d);
        }

        public final int hashCode() {
            int iHashCode = this.f62297c.f62299a.hashCode() * 31;
            ApmTransferPayerSettings apmTransferPayerSettings = this.d;
            return iHashCode + (apmTransferPayerSettings == null ? 0 : apmTransferPayerSettings.hashCode());
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        public final ApmTransferRecipient t0() {
            return this.f62297c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62297c.writeToParcel(dest, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection$Outgoing;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferDirection;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Outgoing extends ApmTransferDirection {

        @NotNull
        public static final Parcelable.Creator<Outgoing> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ApmTransferRecipient.Outgoing f62298c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Outgoing((ApmTransferRecipient.Outgoing) parcel.readParcelable(Outgoing.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Outgoing[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Outgoing(ApmTransferRecipient.Outgoing recipient, boolean z, boolean z3) {
            super(f.OUTGOING, true);
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f62298c = recipient;
            this.d = z;
            this.e = z3;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Outgoing)) {
                return false;
            }
            Outgoing outgoing = (Outgoing) obj2;
            return Intrinsics.f(this.f62298c, outgoing.f62298c) && this.d == outgoing.d && this.e == outgoing.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.c(this.f62298c.hashCode() * 31, 31, this.d);
        }

        @Override // com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection
        public final ApmTransferRecipient t0() {
            return this.f62298c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62298c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    public ApmTransferDirection(f fVar, boolean z) {
        this.f62293a = fVar;
        this.f62294b = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean getD();

    /* JADX INFO: renamed from: b */
    public abstract boolean getE();

    public abstract ApmTransferRecipient t0();
}
