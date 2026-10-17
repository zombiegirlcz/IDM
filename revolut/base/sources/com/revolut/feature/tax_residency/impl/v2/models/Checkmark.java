package com.revolut.feature.tax_residency.impl.v2.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/Checkmark;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kpe/a", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Checkmark implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Checkmark> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpe.a f90152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90153b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Checkmark(kpe.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Checkmark[i];
        }
    }

    public Checkmark(kpe.a type, String localisation) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(localisation, "localisation");
        this.f90152a = type;
        this.f90153b = localisation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Checkmark)) {
            return false;
        }
        Checkmark checkmark = (Checkmark) obj2;
        return this.f90152a == checkmark.f90152a && Intrinsics.f(this.f90153b, checkmark.f90153b);
    }

    public final int hashCode() {
        return this.f90153b.hashCode() + (this.f90152a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90152a.name());
        dest.writeString(this.f90153b);
    }
}
