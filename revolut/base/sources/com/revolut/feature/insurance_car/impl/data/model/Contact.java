package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kl7.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Contact;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kl7/e", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Contact implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Contact> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f75198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75200c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Contact(e.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Contact[i];
        }
    }

    public Contact(e type, String value, String displayValue, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        this.f75198a = type;
        this.f75199b = value;
        this.f75200c = displayValue;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj2;
        return this.f75198a == contact.f75198a && Intrinsics.f(this.f75199b, contact.f75199b) && Intrinsics.f(this.f75200c, contact.f75200c) && Intrinsics.f(this.d, contact.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f75198a.hashCode() * 31, 31, this.f75199b), 31, this.f75200c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75198a.name());
        dest.writeString(this.f75199b);
        dest.writeString(this.f75200c);
        dest.writeString(this.d);
    }
}
