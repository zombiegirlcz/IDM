package com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/authorisation_request/screens/payment_info/PixAuthorisationPaymentInfoScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixAuthorisationPaymentInfoScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixAuthorisationPaymentInfoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f80587a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PixAuthorisationPaymentInfoScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new PixAuthorisationPaymentInfoScreenContract$InputData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixAuthorisationPaymentInfoScreenContract$InputData[i];
        }
    }

    public PixAuthorisationPaymentInfoScreenContract$InputData(List additionalInformation) {
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        this.f80587a = additionalInformation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PixAuthorisationPaymentInfoScreenContract$InputData) && Intrinsics.f(this.f80587a, ((PixAuthorisationPaymentInfoScreenContract$InputData) obj2).f80587a);
    }

    public final int hashCode() {
        return this.f80587a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f80587a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
