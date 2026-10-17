package com.revolut.feature.credit.core.ui.progress;

import android.os.Parcel;
import android.os.Parcelable;
import ho.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/core/ui/progress/CreditProgressContract$AnalyticsConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditProgressContract$AnalyticsConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditProgressContract$AnalyticsConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f69847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f69848b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditProgressContract$AnalyticsConfig((n) parcel.readSerializable(), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditProgressContract$AnalyticsConfig[i];
        }
    }

    public CreditProgressContract$AnalyticsConfig(n nVar, n nVar2) {
        this.f69847a = nVar;
        this.f69848b = nVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditProgressContract$AnalyticsConfig)) {
            return false;
        }
        CreditProgressContract$AnalyticsConfig creditProgressContract$AnalyticsConfig = (CreditProgressContract$AnalyticsConfig) obj2;
        return Intrinsics.f(this.f69847a, creditProgressContract$AnalyticsConfig.f69847a) && Intrinsics.f(this.f69848b, creditProgressContract$AnalyticsConfig.f69848b);
    }

    public final int hashCode() {
        n nVar = this.f69847a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        n nVar2 = this.f69848b;
        return iHashCode + (nVar2 != null ? nVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f69847a);
        dest.writeSerializable(this.f69848b);
    }

    public CreditProgressContract$AnalyticsConfig() {
        this(null, null);
    }
}
