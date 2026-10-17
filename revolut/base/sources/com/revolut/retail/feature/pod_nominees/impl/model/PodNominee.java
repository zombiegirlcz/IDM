package com.revolut.retail.feature.pod_nominees.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/model/PodNominee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PodNominee implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f102619c;
    public final String d;
    public final LocalDate e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Address f102620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f102621h;

    @NotNull
    public static final Parcelable.Creator<PodNominee> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PodNominee(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readString(), (Address) parcel.readParcelable(PodNominee.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodNominee[i];
        }
    }

    public PodNominee(String id10, String firstName, String lastName, String displayName, LocalDate dateOfBirth, String str, Address address, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        this.f102617a = id10;
        this.f102618b = firstName;
        this.f102619c = lastName;
        this.d = displayName;
        this.e = dateOfBirth;
        this.f = str;
        this.f102620g = address;
        this.f102621h = i;
    }

    public static PodNominee a(PodNominee podNominee, String str, String lastName, String displayName, LocalDate dateOfBirth, String str2, Address address, int i, int i2) {
        String firstName = str;
        String id10 = podNominee.f102617a;
        if ((i2 & 2) != 0) {
            firstName = podNominee.f102618b;
        }
        if ((i2 & 4) != 0) {
            lastName = podNominee.f102619c;
        }
        if ((i2 & 8) != 0) {
            displayName = podNominee.d;
        }
        if ((i2 & 16) != 0) {
            dateOfBirth = podNominee.e;
        }
        if ((i2 & 32) != 0) {
            str2 = podNominee.f;
        }
        if ((i2 & 64) != 0) {
            address = podNominee.f102620g;
        }
        if ((i2 & 128) != 0) {
            i = podNominee.f102621h;
        }
        int i3 = i;
        podNominee.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Address address2 = address;
        String str3 = str2;
        LocalDate localDate = dateOfBirth;
        String str4 = displayName;
        return new PodNominee(id10, firstName, lastName, str4, localDate, str3, address2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PodNominee)) {
            return false;
        }
        PodNominee podNominee = (PodNominee) obj2;
        return Intrinsics.f(this.f102617a, podNominee.f102617a) && Intrinsics.f(this.f102618b, podNominee.f102618b) && Intrinsics.f(this.f102619c, podNominee.f102619c) && Intrinsics.f(this.d, podNominee.d) && Intrinsics.f(this.e, podNominee.e) && Intrinsics.f(this.f, podNominee.f) && Intrinsics.f(this.f102620g, podNominee.f102620g) && this.f102621h == podNominee.f102621h;
    }

    public final int hashCode() {
        int iA = y.a(a.c(a.c(a.c(this.f102617a.hashCode() * 31, 31, this.f102618b), 31, this.f102619c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Address address = this.f102620g;
        return Integer.hashCode(this.f102621h) + ((iHashCode + (address != null ? address.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102617a);
        dest.writeString(this.f102618b);
        dest.writeString(this.f102619c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
        dest.writeParcelable(this.f102620g, i);
        dest.writeInt(this.f102621h);
    }
}
