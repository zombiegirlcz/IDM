package com.revolut.feature.apm.spin.impl.ui.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.code.data.ApmCodeData;
import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zz1.j;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/settings/AliasOtpData;", "Lcom/revolut/feature/apm/core/code/data/ApmCodeData;", "", "toString", "()Ljava/lang/String;", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AliasOtpData implements ApmCodeData {

    @NotNull
    public static final Parcelable.Creator<AliasOtpData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AliasType f62878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f62879c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AliasOtpData((AliasType) parcel.readParcelable(AliasOtpData.class.getClassLoader()), parcel.readString(), j.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AliasOtpData[i];
        }
    }

    public AliasOtpData(AliasType aliasType, String aliasValue, j operation) {
        Intrinsics.checkNotNullParameter(aliasValue, "aliasValue");
        Intrinsics.checkNotNullParameter(aliasType, "aliasType");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f62877a = aliasValue;
        this.f62878b = aliasType;
        this.f62879c = operation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AliasOtpData)) {
            return false;
        }
        AliasOtpData aliasOtpData = (AliasOtpData) obj2;
        return Intrinsics.f(this.f62877a, aliasOtpData.f62877a) && Intrinsics.f(this.f62878b, aliasOtpData.f62878b) && this.f62879c == aliasOtpData.f62879c;
    }

    public final int hashCode() {
        return this.f62879c.hashCode() + ((this.f62878b.hashCode() + (this.f62877a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62877a);
        dest.writeParcelable(this.f62878b, i);
        dest.writeString(this.f62879c.name());
    }
}
