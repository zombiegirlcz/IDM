package com.revolut.feature.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.j;
import pi3.m;
import pi3.o;
import pi3.q;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPreconditions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PreorderPreconditions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PreorderPreconditions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f65878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f65879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f65880c;
    public final q d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PreorderPreconditions(parcel.readInt() == 0 ? null : o.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : j.valueOf(parcel.readString()), parcel.readInt() != 0 ? q.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PreorderPreconditions[i];
        }
    }

    public PreorderPreconditions(o oVar, m mVar, j jVar, q qVar) {
        this.f65878a = oVar;
        this.f65879b = mVar;
        this.f65880c = jVar;
        this.d = qVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PreorderPreconditions)) {
            return false;
        }
        PreorderPreconditions preorderPreconditions = (PreorderPreconditions) obj2;
        return this.f65878a == preorderPreconditions.f65878a && this.f65879b == preorderPreconditions.f65879b && this.f65880c == preorderPreconditions.f65880c && this.d == preorderPreconditions.d;
    }

    public final int hashCode() {
        o oVar = this.f65878a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        m mVar = this.f65879b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        j jVar = this.f65880c;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        q qVar = this.d;
        return iHashCode3 + (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        o oVar = this.f65878a;
        if (oVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oVar.name());
        }
        m mVar = this.f65879b;
        if (mVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(mVar.name());
        }
        j jVar = this.f65880c;
        if (jVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(jVar.name());
        }
        q qVar = this.d;
        if (qVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(qVar.name());
        }
    }
}
