package com.revolut.feature.select.payment.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/select/payment/api/navigation/SelectPaymentFlowProvider$ScreenConfiguration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_select_payment_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectPaymentFlowProvider$ScreenConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelectPaymentFlowProvider$ScreenConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f85804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f85805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f85806c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectPaymentFlowProvider$ScreenConfiguration((Clause) parcel.readParcelable(SelectPaymentFlowProvider$ScreenConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(SelectPaymentFlowProvider$ScreenConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(SelectPaymentFlowProvider$ScreenConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(SelectPaymentFlowProvider$ScreenConfiguration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectPaymentFlowProvider$ScreenConfiguration[i];
        }
    }

    public SelectPaymentFlowProvider$ScreenConfiguration(Clause title, Clause subtitle, Clause primaryButtonText, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f85804a = title;
        this.f85805b = subtitle;
        this.f85806c = primaryButtonText;
        this.d = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectPaymentFlowProvider$ScreenConfiguration)) {
            return false;
        }
        SelectPaymentFlowProvider$ScreenConfiguration selectPaymentFlowProvider$ScreenConfiguration = (SelectPaymentFlowProvider$ScreenConfiguration) obj2;
        return Intrinsics.f(this.f85804a, selectPaymentFlowProvider$ScreenConfiguration.f85804a) && Intrinsics.f(this.f85805b, selectPaymentFlowProvider$ScreenConfiguration.f85805b) && Intrinsics.f(this.f85806c, selectPaymentFlowProvider$ScreenConfiguration.f85806c) && Intrinsics.f(this.d, selectPaymentFlowProvider$ScreenConfiguration.d);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(this.f85804a.hashCode() * 31, 31, this.f85805b), 31, this.f85806c);
        Clause clause = this.d;
        return iA + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f85804a, i);
        dest.writeParcelable(this.f85805b, i);
        dest.writeParcelable(this.f85806c, i);
        dest.writeParcelable(this.d, i);
    }
}
