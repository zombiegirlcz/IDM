package com.revolut.feature.freelancer.common.models.acquiring_order;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrder$Id", "Landroid/os/Parcelable;", "value", "", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AcquiringOrder$Id implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AcquiringOrder$Id> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73342a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new AcquiringOrder$Id(v7.t(parcel, "parcel", "value"));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AcquiringOrder$Id[i];
        }
    }

    public /* synthetic */ AcquiringOrder$Id(String str) {
        this.f73342a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof AcquiringOrder$Id) {
            return Intrinsics.f(this.f73342a, ((AcquiringOrder$Id) obj2).f73342a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f73342a.hashCode();
    }

    public final String toString() {
        return p.a.p("Id(value=", this.f73342a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73342a);
    }
}
