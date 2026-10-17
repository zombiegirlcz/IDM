package com.revolut.feature.retail.savings.api.navigation.providers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/api/navigation/providers/SavingsNavigationProvider$TopUpConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsNavigationProvider$TopUpConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SavingsNavigationProvider$TopUpConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f83184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f83186c;
    public final boolean d;
    public final boolean e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f83187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TransitionAnimation f83188h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            TransitionAnimation transitionAnimation;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            s sVar = (s) parcel.readSerializable();
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z6 = false;
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                z3 = z;
                z = true;
            } else {
                z3 = z;
            }
            TransitionAnimation transitionAnimation2 = (TransitionAnimation) parcel.readParcelable(SavingsNavigationProvider$TopUpConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                transitionAnimation = transitionAnimation2;
                z4 = true;
            } else {
                z4 = z3;
                transitionAnimation = transitionAnimation2;
            }
            return new SavingsNavigationProvider$TopUpConfig(sVar, string, lValueOf, z11, z6, numValueOf, z, transitionAnimation, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsNavigationProvider$TopUpConfig[i];
        }
    }

    public SavingsNavigationProvider$TopUpConfig(s vault, String str, Long l2, boolean z, boolean z3, Integer num, boolean z4, TransitionAnimation transitionAnimation, boolean z6) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        this.f83184a = vault;
        this.f83185b = str;
        this.f83186c = l2;
        this.d = z;
        this.e = z3;
        this.f = num;
        this.f83187g = z4;
        this.f83188h = transitionAnimation;
        this.i = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsNavigationProvider$TopUpConfig)) {
            return false;
        }
        SavingsNavigationProvider$TopUpConfig savingsNavigationProvider$TopUpConfig = (SavingsNavigationProvider$TopUpConfig) obj2;
        return Intrinsics.f(this.f83184a, savingsNavigationProvider$TopUpConfig.f83184a) && Intrinsics.f(this.f83185b, savingsNavigationProvider$TopUpConfig.f83185b) && Intrinsics.f(this.f83186c, savingsNavigationProvider$TopUpConfig.f83186c) && this.d == savingsNavigationProvider$TopUpConfig.d && this.e == savingsNavigationProvider$TopUpConfig.e && Intrinsics.f(this.f, savingsNavigationProvider$TopUpConfig.f) && this.f83187g == savingsNavigationProvider$TopUpConfig.f83187g && Intrinsics.f(this.f83188h, savingsNavigationProvider$TopUpConfig.f83188h) && this.i == savingsNavigationProvider$TopUpConfig.i;
    }

    public final int hashCode() {
        int iHashCode = this.f83184a.hashCode() * 31;
        String str = this.f83185b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f83186c;
        int iC = j6.a.c(j6.a.c((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d), 31, this.e);
        Integer num = this.f;
        int iC2 = j6.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.f83187g);
        TransitionAnimation transitionAnimation = this.f83188h;
        return Boolean.hashCode(this.i) + ((iC2 + (transitionAnimation != null ? transitionAnimation.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f83184a);
        dest.writeString(this.f83185b);
        Long l2 = this.f83186c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        Integer num = this.f;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f83187g ? 1 : 0);
        dest.writeParcelable(this.f83188h, i);
        dest.writeInt(this.i ? 1 : 0);
    }

    public /* synthetic */ SavingsNavigationProvider$TopUpConfig(s sVar, String str, Long l2, boolean z, boolean z3, boolean z4, int i) {
        this(sVar, str, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? true : z, false, null, (i & 64) != 0 ? false : z3, null, (i & 256) != 0 ? false : z4);
    }
}
