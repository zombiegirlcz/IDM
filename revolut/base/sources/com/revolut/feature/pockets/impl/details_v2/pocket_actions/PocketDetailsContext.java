package com.revolut.feature.pockets.impl.details_v2.pocket_actions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n38.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_actions/PocketDetailsContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "FreelancerPocketContext", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketDetailsContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PocketDetailsContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f80831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80833c;
    public final boolean d;
    public final q e;
    public final FreelancerPocketContext f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_actions/PocketDetailsContext$FreelancerPocketContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreelancerPocketContext implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FreelancerPocketContext> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f80834a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreelancerPocketContext(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreelancerPocketContext[i];
            }
        }

        public FreelancerPocketContext(boolean z) {
            this.f80834a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FreelancerPocketContext) && this.f80834a == ((FreelancerPocketContext) obj2).f80834a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f80834a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f80834a ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z6 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z11 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new PocketDetailsContext(z6, z11, z3, z4, parcel.readInt() == 0 ? null : q.valueOf(parcel.readString()), parcel.readInt() != 0 ? FreelancerPocketContext.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketDetailsContext[i];
        }
    }

    public PocketDetailsContext(boolean z, boolean z3, boolean z4, boolean z6, q qVar, FreelancerPocketContext freelancerPocketContext) {
        this.f80831a = z;
        this.f80832b = z3;
        this.f80833c = z4;
        this.d = z6;
        this.e = qVar;
        this.f = freelancerPocketContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketDetailsContext)) {
            return false;
        }
        PocketDetailsContext pocketDetailsContext = (PocketDetailsContext) obj2;
        return this.f80831a == pocketDetailsContext.f80831a && this.f80832b == pocketDetailsContext.f80832b && this.f80833c == pocketDetailsContext.f80833c && this.d == pocketDetailsContext.d && this.e == pocketDetailsContext.e && Intrinsics.f(this.f, pocketDetailsContext.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f80831a) * 31, 31, this.f80832b), 31, this.f80833c), 31, this.d);
        q qVar = this.e;
        int iHashCode = (iC + (qVar == null ? 0 : qVar.hashCode())) * 31;
        FreelancerPocketContext freelancerPocketContext = this.f;
        return iHashCode + (freelancerPocketContext != null ? Boolean.hashCode(freelancerPocketContext.f80834a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f80831a ? 1 : 0);
        dest.writeInt(this.f80832b ? 1 : 0);
        dest.writeInt(this.f80833c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        q qVar = this.e;
        if (qVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(qVar.name());
        }
        FreelancerPocketContext freelancerPocketContext = this.f;
        if (freelancerPocketContext == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerPocketContext.writeToParcel(dest, i);
        }
    }
}
