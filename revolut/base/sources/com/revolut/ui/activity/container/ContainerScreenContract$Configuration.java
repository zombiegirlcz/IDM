package com.revolut.ui.activity.container;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/ui/activity/container/ContainerScreenContract$Configuration", "Landroid/os/Parcelable;", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ContainerScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContainerScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ewl.d f107069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f107070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107071c;
    public final Bundle d;
    public final String e;
    public final Integer f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ewl.d dVarValueOf = ewl.d.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContainerScreenContract$Configuration(dVarValueOf, boolValueOf, parcel.readString(), parcel.readBundle(ContainerScreenContract$Configuration.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContainerScreenContract$Configuration[i];
        }
    }

    public ContainerScreenContract$Configuration(ewl.d mode, Boolean bool, String str, Bundle bundle, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f107069a = mode;
        this.f107070b = bool;
        this.f107071c = str;
        this.d = bundle;
        this.e = str2;
        this.f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && ContainerScreenContract$Configuration.class.equals(obj2.getClass())) {
            ContainerScreenContract$Configuration containerScreenContract$Configuration = (ContainerScreenContract$Configuration) obj2;
            if (this.f107069a == containerScreenContract$Configuration.f107069a && Intrinsics.f(this.f107070b, containerScreenContract$Configuration.f107070b) && Intrinsics.f(this.f107071c, containerScreenContract$Configuration.f107071c) && Intrinsics.f(this.e, containerScreenContract$Configuration.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f107069a, this.f107070b, this.f107071c, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f107069a.name());
        Boolean bool = this.f107070b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeString(this.f107071c);
        dest.writeBundle(this.d);
        dest.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    public ContainerScreenContract$Configuration() {
        this(ewl.d.FULL_SCREEN, null, null, null, null, null);
    }
}
