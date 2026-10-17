package com.revolut.feature.apm.core.models.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmTransferPayerSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmTransferPayerSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmTransferPayerSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f62180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f62182c;
    public final LocalDate d;
    public final LocalDate e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new ApmTransferPayerSettings(z3, parcel.readInt() == 0 ? z : true, (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmTransferPayerSettings[i];
        }
    }

    public ApmTransferPayerSettings(boolean z, boolean z3, LocalDate selectedExpiryDate, LocalDate minExpiryDate, LocalDate maxExpiryDate) {
        Intrinsics.checkNotNullParameter(selectedExpiryDate, "selectedExpiryDate");
        Intrinsics.checkNotNullParameter(minExpiryDate, "minExpiryDate");
        Intrinsics.checkNotNullParameter(maxExpiryDate, "maxExpiryDate");
        this.f62180a = z;
        this.f62181b = z3;
        this.f62182c = selectedExpiryDate;
        this.d = minExpiryDate;
        this.e = maxExpiryDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmTransferPayerSettings)) {
            return false;
        }
        ApmTransferPayerSettings apmTransferPayerSettings = (ApmTransferPayerSettings) obj2;
        return this.f62180a == apmTransferPayerSettings.f62180a && this.f62181b == apmTransferPayerSettings.f62181b && Intrinsics.f(this.f62182c, apmTransferPayerSettings.f62182c) && Intrinsics.f(this.d, apmTransferPayerSettings.d) && Intrinsics.f(this.e, apmTransferPayerSettings.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + y.a(y.a(j6.a.c(Boolean.hashCode(this.f62180a) * 31, 31, this.f62181b), 31, this.f62182c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f62180a ? 1 : 0);
        dest.writeInt(this.f62181b ? 1 : 0);
        dest.writeSerializable(this.f62182c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
