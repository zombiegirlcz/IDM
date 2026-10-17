package com.revolut.feature.card_contactless_limit.impl.ui.mvp;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_contactless_limit.api.Mode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_contactless_limit/impl/ui/mvp/RevolutCardResetScaScreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_contactless_limit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutCardResetScaScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevolutCardResetScaScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f64530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64532c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f64533g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Integer num;
            boolean z4;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Mode mode = (Mode) parcel.readParcelable(RevolutCardResetScaScreenContract$Configuration.class.getClassLoader());
            int i = parcel.readInt();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                z3 = true;
                num = numValueOf;
                z4 = true;
            } else {
                z3 = true;
                num = numValueOf;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z3;
            } else {
                z6 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z6 = z;
            }
            return new RevolutCardResetScaScreenContract$Configuration(mode, i, z11, num, z4, z3, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutCardResetScaScreenContract$Configuration[i];
        }
    }

    public RevolutCardResetScaScreenContract$Configuration(Mode mode, int i, boolean z, Integer num, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f64530a = mode;
        this.f64531b = i;
        this.f64532c = z;
        this.d = num;
        this.e = z3;
        this.f = z4;
        this.f64533g = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutCardResetScaScreenContract$Configuration)) {
            return false;
        }
        RevolutCardResetScaScreenContract$Configuration revolutCardResetScaScreenContract$Configuration = (RevolutCardResetScaScreenContract$Configuration) obj2;
        return Intrinsics.f(this.f64530a, revolutCardResetScaScreenContract$Configuration.f64530a) && this.f64531b == revolutCardResetScaScreenContract$Configuration.f64531b && this.f64532c == revolutCardResetScaScreenContract$Configuration.f64532c && Intrinsics.f(this.d, revolutCardResetScaScreenContract$Configuration.d) && this.e == revolutCardResetScaScreenContract$Configuration.e && this.f == revolutCardResetScaScreenContract$Configuration.f && this.f64533g == revolutCardResetScaScreenContract$Configuration.f64533g;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.f64531b, this.f64530a.hashCode() * 31, 31), 31, this.f64532c);
        Integer num = this.d;
        return Boolean.hashCode(this.f64533g) + j6.a.c(j6.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64530a, i);
        dest.writeInt(this.f64531b);
        dest.writeInt(this.f64532c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f64533g ? 1 : 0);
    }
}
