package com.revolut.feature.external_accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe6.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/Mandate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Mandate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Mandate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MandateConstraints f72226c;
    public final c d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Mandate(parcel.readString(), parcel.readString(), MandateConstraints.CREATOR.createFromParcel(parcel), c.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Mandate[i];
        }
    }

    public Mandate(String id10, String institutionId, MandateConstraints constraints, c state, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f72224a = id10;
        this.f72225b = institutionId;
        this.f72226c = constraints;
        this.d = state;
        this.e = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final MandateConstraints getF72226c() {
        return this.f72226c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF72225b() {
        return this.f72225b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Mandate)) {
            return false;
        }
        Mandate mandate = (Mandate) obj2;
        return Intrinsics.f(this.f72224a, mandate.f72224a) && Intrinsics.f(this.f72225b, mandate.f72225b) && Intrinsics.f(this.f72226c, mandate.f72226c) && this.d == mandate.d && this.e == mandate.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f72226c.hashCode() + p.a.c(this.f72224a.hashCode() * 31, 31, this.f72225b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72224a);
        dest.writeString(this.f72225b);
        this.f72226c.writeToParcel(dest, i);
        dest.writeString(this.d.name());
        dest.writeInt(this.e ? 1 : 0);
    }
}
