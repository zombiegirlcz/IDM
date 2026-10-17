package com.revolut.feature.credit.application.plugins.api.models.birth_place;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m70.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/birth_place/BirthCity;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BirthCity implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BirthCity f66300c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66302b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<BirthCity> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BirthCity(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BirthCity[i];
        }
    }

    static {
        t0 t0Var = t0.f186434a;
        a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        f66300c = new BirthCity("", "");
    }

    public BirthCity(String postcode, String name) {
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f66301a = postcode;
        this.f66302b = name;
    }

    public static BirthCity a(BirthCity birthCity, String name) {
        String postcode = birthCity.f66301a;
        birthCity.getClass();
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(name, "name");
        return new BirthCity(postcode, name);
    }

    public final String b() {
        StringBuilder sb6 = new StringBuilder();
        String str = this.f66301a;
        if (str.length() > 0) {
            sb6.append(str);
            sb6.append(" - ");
        }
        sb6.append(this.f66302b);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BirthCity)) {
            return false;
        }
        BirthCity birthCity = (BirthCity) obj2;
        return Intrinsics.f(this.f66301a, birthCity.f66301a) && Intrinsics.f(this.f66302b, birthCity.f66302b);
    }

    public final int hashCode() {
        return this.f66302b.hashCode() + (this.f66301a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66301a);
        dest.writeString(this.f66302b);
    }
}
