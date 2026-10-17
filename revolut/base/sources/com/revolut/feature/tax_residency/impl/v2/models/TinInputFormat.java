package com.revolut.feature.tax_residency.impl.v2.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/TinInputFormat;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TinInputFormat implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TinInputFormat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90184c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TinInputFormat(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TinInputFormat[i];
        }
    }

    public TinInputFormat(String placeholder, String mask, String regexp) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(regexp, "regexp");
        this.f90182a = placeholder;
        this.f90183b = mask;
        this.f90184c = regexp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TinInputFormat)) {
            return false;
        }
        TinInputFormat tinInputFormat = (TinInputFormat) obj2;
        return Intrinsics.f(this.f90182a, tinInputFormat.f90182a) && Intrinsics.f(this.f90183b, tinInputFormat.f90183b) && Intrinsics.f(this.f90184c, tinInputFormat.f90184c);
    }

    public final int hashCode() {
        return this.f90184c.hashCode() + p.a.c(this.f90182a.hashCode() * 31, 31, this.f90183b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90182a);
        dest.writeString(this.f90183b);
        dest.writeString(this.f90184c);
    }
}
