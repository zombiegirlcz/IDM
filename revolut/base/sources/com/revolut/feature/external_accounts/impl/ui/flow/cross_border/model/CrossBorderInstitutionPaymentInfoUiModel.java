package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model;

import android.os.Parcel;
import android.os.Parcelable;
import io3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/model/CrossBorderInstitutionPaymentInfoUiModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CrossBorderInstitutionPaymentInfoUiModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CrossBorderInstitutionPaymentInfoUiModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f72909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f72910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72911c;
    public final boolean d;
    public final b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            n nVar;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            n nVarValueOf = n.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z3 = true;
                nVar = nVarValueOf;
                z4 = true;
            } else {
                z3 = true;
                nVar = nVarValueOf;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new CrossBorderInstitutionPaymentInfoUiModel(z6, nVar, z4, z3, (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CrossBorderInstitutionPaymentInfoUiModel[i];
        }
    }

    public CrossBorderInstitutionPaymentInfoUiModel(boolean z, n topUpSystem, boolean z3, boolean z4, b bVar) {
        Intrinsics.checkNotNullParameter(topUpSystem, "topUpSystem");
        this.f72909a = z;
        this.f72910b = topUpSystem;
        this.f72911c = z3;
        this.d = z4;
        this.e = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CrossBorderInstitutionPaymentInfoUiModel)) {
            return false;
        }
        CrossBorderInstitutionPaymentInfoUiModel crossBorderInstitutionPaymentInfoUiModel = (CrossBorderInstitutionPaymentInfoUiModel) obj2;
        return this.f72909a == crossBorderInstitutionPaymentInfoUiModel.f72909a && this.f72910b == crossBorderInstitutionPaymentInfoUiModel.f72910b && this.f72911c == crossBorderInstitutionPaymentInfoUiModel.f72911c && this.d == crossBorderInstitutionPaymentInfoUiModel.d && Intrinsics.f(this.e, crossBorderInstitutionPaymentInfoUiModel.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f72910b.hashCode() + (Boolean.hashCode(this.f72909a) * 31)) * 31, 31, this.f72911c), 31, this.d);
        b bVar = this.e;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f72909a ? 1 : 0);
        dest.writeString(this.f72910b.name());
        dest.writeInt(this.f72911c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeSerializable(this.e);
    }
}
