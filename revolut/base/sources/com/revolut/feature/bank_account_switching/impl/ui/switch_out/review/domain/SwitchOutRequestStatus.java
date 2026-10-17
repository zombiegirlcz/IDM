package com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.domain.DetailsSection;
import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wn2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/review/domain/SwitchOutRequestStatus;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SwitchOutRequestStatus implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SwitchOutRequestStatus> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn2.a f64064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f64065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BankInformation f64066c;
    public final BankInformation d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f64067g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            mn2.a aVarValueOf = mn2.a.valueOf(parcel.readString());
            d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
            Parcelable.Creator<BankInformation> creator = BankInformation.CREATOR;
            BankInformation bankInformationCreateFromParcel = creator.createFromParcel(parcel);
            BankInformation bankInformationCreateFromParcel2 = creator.createFromParcel(parcel);
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DetailsSection.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SwitchOutRequestStatus(aVarValueOf, dVarValueOf, bankInformationCreateFromParcel, bankInformationCreateFromParcel2, localDate, localDate2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SwitchOutRequestStatus[i];
        }
    }

    public SwitchOutRequestStatus(mn2.a serviceType, d dVar, BankInformation fromBank, BankInformation toBank, LocalDate localDate, LocalDate localDate2, List sections) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(fromBank, "fromBank");
        Intrinsics.checkNotNullParameter(toBank, "toBank");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f64064a = serviceType;
        this.f64065b = dVar;
        this.f64066c = fromBank;
        this.d = toBank;
        this.e = localDate;
        this.f = localDate2;
        this.f64067g = sections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SwitchOutRequestStatus)) {
            return false;
        }
        SwitchOutRequestStatus switchOutRequestStatus = (SwitchOutRequestStatus) obj2;
        return this.f64064a == switchOutRequestStatus.f64064a && this.f64065b == switchOutRequestStatus.f64065b && Intrinsics.f(this.f64066c, switchOutRequestStatus.f64066c) && Intrinsics.f(this.d, switchOutRequestStatus.d) && Intrinsics.f(this.e, switchOutRequestStatus.e) && Intrinsics.f(this.f, switchOutRequestStatus.f) && Intrinsics.f(this.f64067g, switchOutRequestStatus.f64067g);
    }

    public final int hashCode() {
        int iHashCode = this.f64064a.hashCode() * 31;
        d dVar = this.f64065b;
        int iHashCode2 = (this.d.hashCode() + ((this.f64066c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31)) * 31;
        LocalDate localDate = this.e;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        return this.f64067g.hashCode() + ((iHashCode3 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64064a.name());
        d dVar = this.f64065b;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        this.f64066c.writeToParcel(dest, i);
        this.d.writeToParcel(dest, i);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        Iterator itV = p.a.v(this.f64067g, dest);
        while (itV.hasNext()) {
            ((DetailsSection) itV.next()).writeToParcel(dest, i);
        }
    }
}
