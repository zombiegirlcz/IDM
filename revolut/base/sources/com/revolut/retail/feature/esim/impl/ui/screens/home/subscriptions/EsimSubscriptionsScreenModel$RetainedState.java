package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pij.l0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenModel$RetainedState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class EsimSubscriptionsScreenModel$RetainedState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionsScreenModel$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f101076b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionsScreenModel$RetainedState(parcel.readString(), l0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionsScreenModel$RetainedState[i];
        }
    }

    public EsimSubscriptionsScreenModel$RetainedState(String idempotencyKey, l0 initialNavigationState) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(initialNavigationState, "initialNavigationState");
        this.f101075a = idempotencyKey;
        this.f101076b = initialNavigationState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionsScreenModel$RetainedState)) {
            return false;
        }
        EsimSubscriptionsScreenModel$RetainedState esimSubscriptionsScreenModel$RetainedState = (EsimSubscriptionsScreenModel$RetainedState) obj2;
        return Intrinsics.f(this.f101075a, esimSubscriptionsScreenModel$RetainedState.f101075a) && this.f101076b == esimSubscriptionsScreenModel$RetainedState.f101076b;
    }

    public final int hashCode() {
        return this.f101076b.hashCode() + (this.f101075a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101075a);
        dest.writeString(this.f101076b.name());
    }
}
