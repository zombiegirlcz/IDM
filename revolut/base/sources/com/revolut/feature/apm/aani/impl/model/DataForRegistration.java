package com.revolut.feature.apm.aani.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/model/DataForRegistration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DataForRegistration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DataForRegistration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61122c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataForRegistration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DataForRegistration[i];
        }
    }

    public DataForRegistration(String phone, String email, String name, String emiratesId) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(emiratesId, "emiratesId");
        this.f61120a = phone;
        this.f61121b = email;
        this.f61122c = name;
        this.d = emiratesId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DataForRegistration)) {
            return false;
        }
        DataForRegistration dataForRegistration = (DataForRegistration) obj2;
        return Intrinsics.f(this.f61120a, dataForRegistration.f61120a) && Intrinsics.f(this.f61121b, dataForRegistration.f61121b) && Intrinsics.f(this.f61122c, dataForRegistration.f61122c) && Intrinsics.f(this.d, dataForRegistration.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f61120a.hashCode() * 31, 31, this.f61121b), 31, this.f61122c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61120a);
        dest.writeString(this.f61121b);
        dest.writeString(this.f61122c);
        dest.writeString(this.d);
    }
}
