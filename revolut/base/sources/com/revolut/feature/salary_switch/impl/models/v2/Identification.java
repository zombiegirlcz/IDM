package com.revolut.feature.salary_switch.impl.models.v2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kqc.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/v2/Identification;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Identification implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Identification> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f85242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85244c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Identification(d.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Identification[i];
        }
    }

    public Identification(d type, String value, String issuer) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        this.f85242a = type;
        this.f85243b = value;
        this.f85244c = issuer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Identification)) {
            return false;
        }
        Identification identification = (Identification) obj2;
        return this.f85242a == identification.f85242a && Intrinsics.f(this.f85243b, identification.f85243b) && Intrinsics.f(this.f85244c, identification.f85244c);
    }

    public final int hashCode() {
        return this.f85244c.hashCode() + p.a.c(this.f85242a.hashCode() * 31, 31, this.f85243b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85242a.name());
        dest.writeString(this.f85243b);
        dest.writeString(this.f85244c);
    }
}
