package com.revolut.feature.acquiring.lite_pos.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import cd1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/TaxRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TaxRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f60695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60696c;
    public final String d;
    public final double e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxRate(parcel.readString(), h.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxRate[i];
        }
    }

    public TaxRate(String id10, h state, String name, String type, double d) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f60694a = id10;
        this.f60695b = state;
        this.f60696c = name;
        this.d = type;
        this.e = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxRate)) {
            return false;
        }
        TaxRate taxRate = (TaxRate) obj2;
        return Intrinsics.f(this.f60694a, taxRate.f60694a) && this.f60695b == taxRate.f60695b && Intrinsics.f(this.f60696c, taxRate.f60696c) && Intrinsics.f(this.d, taxRate.d) && Double.compare(this.e, taxRate.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + p.a.c(p.a.c((this.f60695b.hashCode() + (this.f60694a.hashCode() * 31)) * 31, 31, this.f60696c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60694a);
        dest.writeString(this.f60695b.name());
        dest.writeString(this.f60696c);
        dest.writeString(this.d);
        dest.writeDouble(this.e);
    }
}
