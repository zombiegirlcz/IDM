package com.revolut.feature.apm.swish.impl.ui.home.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.swish.impl.domain.SwishPaymentLimits;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/ui/home/domain/AreaContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AreaContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AreaContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SwishPaymentLimits f62929b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AreaContent(parcel.readString(), SwishPaymentLimits.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AreaContent[i];
        }
    }

    public AreaContent(String phone, SwishPaymentLimits paymentLimits) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(paymentLimits, "paymentLimits");
        this.f62928a = phone;
        this.f62929b = paymentLimits;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AreaContent)) {
            return false;
        }
        AreaContent areaContent = (AreaContent) obj2;
        return Intrinsics.f(this.f62928a, areaContent.f62928a) && Intrinsics.f(this.f62929b, areaContent.f62929b);
    }

    public final int hashCode() {
        return this.f62929b.hashCode() + (this.f62928a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62928a);
        this.f62929b.writeToParcel(dest, i);
    }
}
