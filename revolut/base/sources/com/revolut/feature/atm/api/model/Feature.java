package com.revolut.feature.atm.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sj2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/atm/api/model/Feature;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "sj2/d", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Feature implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Feature> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f63142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63143b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Feature(d.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Feature[i];
        }
    }

    public Feature(d code, String name) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f63142a = code;
        this.f63143b = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj2;
        return this.f63142a == feature.f63142a && Intrinsics.f(this.f63143b, feature.f63143b);
    }

    public final int hashCode() {
        return this.f63143b.hashCode() + (this.f63142a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63142a.name());
        dest.writeString(this.f63143b);
    }
}
