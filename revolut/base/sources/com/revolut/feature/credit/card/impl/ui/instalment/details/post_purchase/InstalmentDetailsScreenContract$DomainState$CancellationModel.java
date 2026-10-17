package com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$DomainState$CancellationModel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstalmentDetailsScreenContract$DomainState$CancellationModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InstalmentDetailsScreenContract$DomainState$CancellationModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f69365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f69367c;
    public final LocalDate d;
    public final LocalDate e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstalmentDetailsScreenContract$DomainState$CancellationModel((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstalmentDetailsScreenContract$DomainState$CancellationModel[i];
        }
    }

    public InstalmentDetailsScreenContract$DomainState$CancellationModel(d remainingPlanAmount, d dVar, d dVar2, LocalDate repaymentDueDate, LocalDate nextStatementDate, String str) {
        Intrinsics.checkNotNullParameter(remainingPlanAmount, "remainingPlanAmount");
        Intrinsics.checkNotNullParameter(repaymentDueDate, "repaymentDueDate");
        Intrinsics.checkNotNullParameter(nextStatementDate, "nextStatementDate");
        this.f69365a = remainingPlanAmount;
        this.f69366b = dVar;
        this.f69367c = dVar2;
        this.d = repaymentDueDate;
        this.e = nextStatementDate;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstalmentDetailsScreenContract$DomainState$CancellationModel)) {
            return false;
        }
        InstalmentDetailsScreenContract$DomainState$CancellationModel instalmentDetailsScreenContract$DomainState$CancellationModel = (InstalmentDetailsScreenContract$DomainState$CancellationModel) obj2;
        return Intrinsics.f(this.f69365a, instalmentDetailsScreenContract$DomainState$CancellationModel.f69365a) && Intrinsics.f(this.f69366b, instalmentDetailsScreenContract$DomainState$CancellationModel.f69366b) && Intrinsics.f(this.f69367c, instalmentDetailsScreenContract$DomainState$CancellationModel.f69367c) && Intrinsics.f(this.d, instalmentDetailsScreenContract$DomainState$CancellationModel.d) && Intrinsics.f(this.e, instalmentDetailsScreenContract$DomainState$CancellationModel.e) && Intrinsics.f(this.f, instalmentDetailsScreenContract$DomainState$CancellationModel.f);
    }

    public final int hashCode() {
        int iHashCode = this.f69365a.hashCode() * 31;
        d dVar = this.f69366b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f69367c;
        int iA = y.a(y.a((iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return iA + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f69365a);
        dest.writeSerializable(this.f69366b);
        dest.writeSerializable(this.f69367c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
    }
}
