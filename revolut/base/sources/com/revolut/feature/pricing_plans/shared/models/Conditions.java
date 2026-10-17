package com.revolut.feature.pricing_plans.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfa.b;
import yfa.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/shared/models/Conditions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Conditions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Conditions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f80949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f80950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f80951c;
    public final yfa.a d;
    public final Boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf2 = null;
            c cVarValueOf = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            yfa.a aVarValueOf = parcel.readInt() == 0 ? null : yfa.a.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Conditions(cVarValueOf, boolValueOf, bVarValueOf, aVarValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Conditions[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Conditions() {
        this(null, 0 == true ? 1 : 0, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Conditions)) {
            return false;
        }
        Conditions conditions = (Conditions) obj2;
        return this.f80949a == conditions.f80949a && Intrinsics.f(this.f80950b, conditions.f80950b) && this.f80951c == conditions.f80951c && this.d == conditions.d && Intrinsics.f(this.e, conditions.e);
    }

    public final int hashCode() {
        c cVar = this.f80949a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        Boolean bool = this.f80950b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        b bVar = this.f80951c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        yfa.a aVar = this.d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool2 = this.e;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        c cVar = this.f80949a;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        Boolean bool = this.f80950b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        b bVar = this.f80951c;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        yfa.a aVar = this.d;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
    }

    public Conditions(c cVar, Boolean bool, b bVar, yfa.a aVar, Boolean bool2) {
        this.f80949a = cVar;
        this.f80950b = bool;
        this.f80951c = bVar;
        this.d = aVar;
        this.e = bool2;
    }

    public /* synthetic */ Conditions(c cVar, Boolean bool, int i) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : bool, null, null, null);
    }
}
