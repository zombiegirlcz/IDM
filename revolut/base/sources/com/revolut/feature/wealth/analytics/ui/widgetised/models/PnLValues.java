package com.revolut.feature.wealth.analytics.ui.widgetised.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/widgetised/models/PnLValues;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PnLValues implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PnLValues> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f95096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f95097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95098c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PnLValues((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PnLValues[i];
        }
    }

    public PnLValues(d total, d realised, d unrealised, d dVar) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(realised, "realised");
        Intrinsics.checkNotNullParameter(unrealised, "unrealised");
        this.f95096a = total;
        this.f95097b = realised;
        this.f95098c = unrealised;
        this.d = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PnLValues)) {
            return false;
        }
        PnLValues pnLValues = (PnLValues) obj2;
        return Intrinsics.f(this.f95096a, pnLValues.f95096a) && Intrinsics.f(this.f95097b, pnLValues.f95097b) && Intrinsics.f(this.f95098c, pnLValues.f95098c) && Intrinsics.f(this.d, pnLValues.d);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f95096a.hashCode() * 31, 31, this.f95097b), 31, this.f95098c);
        d dVar = this.d;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95096a);
        dest.writeSerializable(this.f95097b);
        dest.writeSerializable(this.f95098c);
        dest.writeSerializable(this.d);
    }
}
