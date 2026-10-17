package com.revolut.feature.credit.application.close.ui.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.close.models.CreditApplicationClosePayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/close/ui/legacy/CreditApplicationCloseLegacyContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_close_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationCloseLegacyContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationCloseLegacyContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationClosePayload f66219b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationCloseLegacyContract$Configuration((CreditApplicationClosePayload) parcel.readParcelable(CreditApplicationCloseLegacyContract$Configuration.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationCloseLegacyContract$Configuration[i];
        }
    }

    public CreditApplicationCloseLegacyContract$Configuration(CreditApplicationClosePayload payload, String flowName) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f66218a = flowName;
        this.f66219b = payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationCloseLegacyContract$Configuration)) {
            return false;
        }
        CreditApplicationCloseLegacyContract$Configuration creditApplicationCloseLegacyContract$Configuration = (CreditApplicationCloseLegacyContract$Configuration) obj2;
        return Intrinsics.f(this.f66218a, creditApplicationCloseLegacyContract$Configuration.f66218a) && Intrinsics.f(this.f66219b, creditApplicationCloseLegacyContract$Configuration.f66219b);
    }

    public final int hashCode() {
        return this.f66219b.hashCode() + (this.f66218a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66218a);
        dest.writeParcelable(this.f66219b, i);
    }
}
