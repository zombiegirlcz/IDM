package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/DebtorAlias;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DebtorAlias implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DebtorAlias> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasType f62017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62018b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DebtorAlias((AliasType) parcel.readParcelable(DebtorAlias.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DebtorAlias[i];
        }
    }

    public DebtorAlias(AliasType type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f62017a = type;
        this.f62018b = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DebtorAlias)) {
            return false;
        }
        DebtorAlias debtorAlias = (DebtorAlias) obj2;
        return Intrinsics.f(this.f62017a, debtorAlias.f62017a) && Intrinsics.f(this.f62018b, debtorAlias.f62018b);
    }

    public final int hashCode() {
        return this.f62018b.hashCode() + (this.f62017a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62017a, i);
        dest.writeString(this.f62018b);
    }
}
