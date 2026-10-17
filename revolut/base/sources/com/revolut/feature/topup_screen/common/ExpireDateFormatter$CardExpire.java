package com.revolut.feature.topup_screen.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/common/ExpireDateFormatter$CardExpire", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpireDateFormatter$CardExpire implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExpireDateFormatter$CardExpire> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90570b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpireDateFormatter$CardExpire(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpireDateFormatter$CardExpire[i];
        }
    }

    public ExpireDateFormatter$CardExpire(int i, int i2) {
        this.f90569a = i;
        this.f90570b = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF90569a() {
        return this.f90569a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF90570b() {
        return this.f90570b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpireDateFormatter$CardExpire)) {
            return false;
        }
        ExpireDateFormatter$CardExpire expireDateFormatter$CardExpire = (ExpireDateFormatter$CardExpire) obj2;
        return this.f90569a == expireDateFormatter$CardExpire.f90569a && this.f90570b == expireDateFormatter$CardExpire.f90570b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90570b) + (Integer.hashCode(this.f90569a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f90569a);
        dest.writeInt(this.f90570b);
    }
}
