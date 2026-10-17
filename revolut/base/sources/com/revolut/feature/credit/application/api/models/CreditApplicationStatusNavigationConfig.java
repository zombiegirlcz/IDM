package com.revolut.feature.credit.application.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/api/models/CreditApplicationStatusNavigationConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationStatusNavigationConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationStatusNavigationConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66193c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationStatusNavigationConfig(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationStatusNavigationConfig[i];
        }
    }

    public CreditApplicationStatusNavigationConfig(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f66191a = z;
        this.f66192b = z3;
        this.f66193c = z4;
        this.d = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationStatusNavigationConfig)) {
            return false;
        }
        CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig = (CreditApplicationStatusNavigationConfig) obj2;
        return this.f66191a == creditApplicationStatusNavigationConfig.f66191a && this.f66192b == creditApplicationStatusNavigationConfig.f66192b && this.f66193c == creditApplicationStatusNavigationConfig.f66193c && this.d == creditApplicationStatusNavigationConfig.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f66191a) * 31, 31, this.f66192b), 31, this.f66193c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f66191a ? 1 : 0);
        dest.writeInt(this.f66192b ? 1 : 0);
        dest.writeInt(this.f66193c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ CreditApplicationStatusNavigationConfig(boolean z, boolean z3, int i) {
        this(z, false, z3, true);
    }
}
