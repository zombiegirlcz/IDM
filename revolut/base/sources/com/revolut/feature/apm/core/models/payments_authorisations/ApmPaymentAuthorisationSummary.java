package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmPaymentAuthorisationSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmPaymentAuthorisationSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentAuthorisationState f61993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmPaymentAuthorisationPaymentMethod f61994c;
    public final Creditor d;
    public final LocalDateTime e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PaymentMethodDetails f61995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDateTime f61996h;
    public final DeactivationReason i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDateTime f61997j;
    public final LocalDateTime k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDateTime f61998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LocalDateTime f61999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AuthorisationFrequency f62000n;
    public final AuthorisationFrequency o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f62001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Settings f62002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ExecutionType f62003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InitiationChannel f62004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ApmPaymentAuthorisationAmount f62005t;
    public final Authorisation u;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PaymentAuthorisationState paymentAuthorisationState;
            AuthorisationFrequency authorisationFrequencyCreateFromParcel;
            AuthorisationFrequency authorisationFrequency;
            Settings settingsCreateFromParcel;
            Settings settings;
            ExecutionType executionTypeCreateFromParcel;
            ExecutionType executionType;
            InitiationChannel initiationChannelCreateFromParcel;
            InitiationChannel initiationChannel;
            ApmPaymentAuthorisationAmount apmPaymentAuthorisationAmountCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            PaymentAuthorisationState paymentAuthorisationStateCreateFromParcel = parcel.readInt() == 0 ? null : PaymentAuthorisationState.CREATOR.createFromParcel(parcel);
            ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethodCreateFromParcel = parcel.readInt() == 0 ? null : ApmPaymentAuthorisationPaymentMethod.CREATOR.createFromParcel(parcel);
            Creditor creditorCreateFromParcel = parcel.readInt() == 0 ? null : Creditor.CREATOR.createFromParcel(parcel);
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) parcel.readParcelable(ApmPaymentAuthorisationSummary.class.getClassLoader());
            LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
            DeactivationReason deactivationReasonCreateFromParcel = parcel.readInt() == 0 ? null : DeactivationReason.CREATOR.createFromParcel(parcel);
            LocalDateTime localDateTime3 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime4 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime5 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime6 = (LocalDateTime) parcel.readSerializable();
            AuthorisationFrequency authorisationFrequencyCreateFromParcel2 = parcel.readInt() == 0 ? null : AuthorisationFrequency.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                paymentAuthorisationState = paymentAuthorisationStateCreateFromParcel;
                authorisationFrequencyCreateFromParcel = null;
            } else {
                paymentAuthorisationState = paymentAuthorisationStateCreateFromParcel;
                authorisationFrequencyCreateFromParcel = AuthorisationFrequency.CREATOR.createFromParcel(parcel);
            }
            AuthorisationFrequency authorisationFrequency2 = authorisationFrequencyCreateFromParcel;
            d dVar2 = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                authorisationFrequency = authorisationFrequency2;
                settingsCreateFromParcel = null;
            } else {
                authorisationFrequency = authorisationFrequency2;
                settingsCreateFromParcel = Settings.CREATOR.createFromParcel(parcel);
            }
            Settings settings2 = settingsCreateFromParcel;
            if (parcel.readInt() == 0) {
                settings = settings2;
                executionTypeCreateFromParcel = null;
            } else {
                settings = settings2;
                executionTypeCreateFromParcel = ExecutionType.CREATOR.createFromParcel(parcel);
            }
            ExecutionType executionType2 = executionTypeCreateFromParcel;
            if (parcel.readInt() == 0) {
                executionType = executionType2;
                initiationChannelCreateFromParcel = null;
            } else {
                executionType = executionType2;
                initiationChannelCreateFromParcel = InitiationChannel.CREATOR.createFromParcel(parcel);
            }
            InitiationChannel initiationChannel2 = initiationChannelCreateFromParcel;
            if (parcel.readInt() == 0) {
                initiationChannel = initiationChannel2;
                apmPaymentAuthorisationAmountCreateFromParcel = null;
            } else {
                initiationChannel = initiationChannel2;
                apmPaymentAuthorisationAmountCreateFromParcel = ApmPaymentAuthorisationAmount.CREATOR.createFromParcel(parcel);
            }
            return new ApmPaymentAuthorisationSummary(string, paymentAuthorisationState, apmPaymentAuthorisationPaymentMethodCreateFromParcel, creditorCreateFromParcel, localDateTime, dVar, paymentMethodDetails, localDateTime2, deactivationReasonCreateFromParcel, localDateTime3, localDateTime4, localDateTime5, localDateTime6, authorisationFrequencyCreateFromParcel2, authorisationFrequency, dVar2, settings, executionType, initiationChannel, apmPaymentAuthorisationAmountCreateFromParcel, parcel.readInt() == 0 ? null : Authorisation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPaymentAuthorisationSummary[i];
        }
    }

    public ApmPaymentAuthorisationSummary(String id10, PaymentAuthorisationState paymentAuthorisationState, ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod, Creditor creditor, LocalDateTime localDateTime, d dVar, PaymentMethodDetails paymentMethodDetails, LocalDateTime localDateTime2, DeactivationReason deactivationReason, LocalDateTime createdDate, LocalDateTime localDateTime3, LocalDateTime localDateTime4, LocalDateTime localDateTime5, AuthorisationFrequency authorisationFrequency, AuthorisationFrequency authorisationFrequency2, d dVar2, Settings settings, ExecutionType executionType, InitiationChannel initiationChannel, ApmPaymentAuthorisationAmount apmPaymentAuthorisationAmount, Authorisation authorisation) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentMethodDetails, "paymentMethodDetails");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f61992a = id10;
        this.f61993b = paymentAuthorisationState;
        this.f61994c = apmPaymentAuthorisationPaymentMethod;
        this.d = creditor;
        this.e = localDateTime;
        this.f = dVar;
        this.f61995g = paymentMethodDetails;
        this.f61996h = localDateTime2;
        this.i = deactivationReason;
        this.f61997j = createdDate;
        this.k = localDateTime3;
        this.f61998l = localDateTime4;
        this.f61999m = localDateTime5;
        this.f62000n = authorisationFrequency;
        this.o = authorisationFrequency2;
        this.f62001p = dVar2;
        this.f62002q = settings;
        this.f62003r = executionType;
        this.f62004s = initiationChannel;
        this.f62005t = apmPaymentAuthorisationAmount;
        this.u = authorisation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmPaymentAuthorisationSummary)) {
            return false;
        }
        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = (ApmPaymentAuthorisationSummary) obj2;
        return Intrinsics.f(this.f61992a, apmPaymentAuthorisationSummary.f61992a) && this.f61993b == apmPaymentAuthorisationSummary.f61993b && this.f61994c == apmPaymentAuthorisationSummary.f61994c && Intrinsics.f(this.d, apmPaymentAuthorisationSummary.d) && Intrinsics.f(this.e, apmPaymentAuthorisationSummary.e) && Intrinsics.f(this.f, apmPaymentAuthorisationSummary.f) && Intrinsics.f(this.f61995g, apmPaymentAuthorisationSummary.f61995g) && Intrinsics.f(this.f61996h, apmPaymentAuthorisationSummary.f61996h) && this.i == apmPaymentAuthorisationSummary.i && Intrinsics.f(this.f61997j, apmPaymentAuthorisationSummary.f61997j) && Intrinsics.f(this.k, apmPaymentAuthorisationSummary.k) && Intrinsics.f(this.f61998l, apmPaymentAuthorisationSummary.f61998l) && Intrinsics.f(this.f61999m, apmPaymentAuthorisationSummary.f61999m) && this.f62000n == apmPaymentAuthorisationSummary.f62000n && this.o == apmPaymentAuthorisationSummary.o && Intrinsics.f(this.f62001p, apmPaymentAuthorisationSummary.f62001p) && Intrinsics.f(this.f62002q, apmPaymentAuthorisationSummary.f62002q) && this.f62003r == apmPaymentAuthorisationSummary.f62003r && this.f62004s == apmPaymentAuthorisationSummary.f62004s && Intrinsics.f(this.f62005t, apmPaymentAuthorisationSummary.f62005t) && Intrinsics.f(this.u, apmPaymentAuthorisationSummary.u);
    }

    public final int hashCode() {
        int iHashCode = this.f61992a.hashCode() * 31;
        PaymentAuthorisationState paymentAuthorisationState = this.f61993b;
        int iHashCode2 = (iHashCode + (paymentAuthorisationState == null ? 0 : paymentAuthorisationState.hashCode())) * 31;
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod = this.f61994c;
        int iHashCode3 = (iHashCode2 + (apmPaymentAuthorisationPaymentMethod == null ? 0 : apmPaymentAuthorisationPaymentMethod.hashCode())) * 31;
        Creditor creditor = this.d;
        int iHashCode4 = (iHashCode3 + (creditor == null ? 0 : creditor.hashCode())) * 31;
        LocalDateTime localDateTime = this.e;
        int iHashCode5 = (iHashCode4 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        d dVar = this.f;
        int iHashCode6 = (this.f61995g.hashCode() + ((iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        LocalDateTime localDateTime2 = this.f61996h;
        int iHashCode7 = (iHashCode6 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        DeactivationReason deactivationReason = this.i;
        int i = v7.i(this.f61997j, (iHashCode7 + (deactivationReason == null ? 0 : deactivationReason.hashCode())) * 31, 31);
        LocalDateTime localDateTime3 = this.k;
        int iHashCode8 = (i + (localDateTime3 == null ? 0 : localDateTime3.hashCode())) * 31;
        LocalDateTime localDateTime4 = this.f61998l;
        int iHashCode9 = (iHashCode8 + (localDateTime4 == null ? 0 : localDateTime4.hashCode())) * 31;
        LocalDateTime localDateTime5 = this.f61999m;
        int iHashCode10 = (iHashCode9 + (localDateTime5 == null ? 0 : localDateTime5.hashCode())) * 31;
        AuthorisationFrequency authorisationFrequency = this.f62000n;
        int iHashCode11 = (iHashCode10 + (authorisationFrequency == null ? 0 : authorisationFrequency.hashCode())) * 31;
        AuthorisationFrequency authorisationFrequency2 = this.o;
        int iHashCode12 = (iHashCode11 + (authorisationFrequency2 == null ? 0 : authorisationFrequency2.hashCode())) * 31;
        d dVar2 = this.f62001p;
        int iHashCode13 = (iHashCode12 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Settings settings = this.f62002q;
        int iHashCode14 = (iHashCode13 + (settings == null ? 0 : settings.hashCode())) * 31;
        ExecutionType executionType = this.f62003r;
        int iHashCode15 = (iHashCode14 + (executionType == null ? 0 : executionType.hashCode())) * 31;
        InitiationChannel initiationChannel = this.f62004s;
        int iHashCode16 = (iHashCode15 + (initiationChannel == null ? 0 : initiationChannel.hashCode())) * 31;
        ApmPaymentAuthorisationAmount apmPaymentAuthorisationAmount = this.f62005t;
        int iHashCode17 = (iHashCode16 + (apmPaymentAuthorisationAmount == null ? 0 : apmPaymentAuthorisationAmount.hashCode())) * 31;
        Authorisation authorisation = this.u;
        return iHashCode17 + (authorisation != null ? authorisation.f62006a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61992a);
        PaymentAuthorisationState paymentAuthorisationState = this.f61993b;
        if (paymentAuthorisationState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentAuthorisationState.writeToParcel(dest, i);
        }
        ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod = this.f61994c;
        if (apmPaymentAuthorisationPaymentMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apmPaymentAuthorisationPaymentMethod.writeToParcel(dest, i);
        }
        Creditor creditor = this.d;
        if (creditor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditor.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeParcelable(this.f61995g, i);
        dest.writeSerializable(this.f61996h);
        DeactivationReason deactivationReason = this.i;
        if (deactivationReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deactivationReason.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f61997j);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f61998l);
        dest.writeSerializable(this.f61999m);
        AuthorisationFrequency authorisationFrequency = this.f62000n;
        if (authorisationFrequency == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            authorisationFrequency.writeToParcel(dest, i);
        }
        AuthorisationFrequency authorisationFrequency2 = this.o;
        if (authorisationFrequency2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            authorisationFrequency2.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f62001p);
        Settings settings = this.f62002q;
        if (settings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            settings.writeToParcel(dest, i);
        }
        ExecutionType executionType = this.f62003r;
        if (executionType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            executionType.writeToParcel(dest, i);
        }
        InitiationChannel initiationChannel = this.f62004s;
        if (initiationChannel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            initiationChannel.writeToParcel(dest, i);
        }
        ApmPaymentAuthorisationAmount apmPaymentAuthorisationAmount = this.f62005t;
        if (apmPaymentAuthorisationAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apmPaymentAuthorisationAmount.writeToParcel(dest, i);
        }
        Authorisation authorisation = this.u;
        if (authorisation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            authorisation.writeToParcel(dest, i);
        }
    }
}
