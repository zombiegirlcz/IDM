package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/EarnOptionsBottomSheetParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EarnOptionsBottomSheetParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EarnOptionsBottomSheetParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f83942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f83944c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EarnOptionsBottomSheetParams(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0 ? i.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EarnOptionsBottomSheetParams[i];
        }
    }

    public EarnOptionsBottomSheetParams() {
        this(7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EarnOptionsBottomSheetParams)) {
            return false;
        }
        EarnOptionsBottomSheetParams earnOptionsBottomSheetParams = (EarnOptionsBottomSheetParams) obj2;
        return Intrinsics.f(this.f83942a, earnOptionsBottomSheetParams.f83942a) && Intrinsics.f(this.f83943b, earnOptionsBottomSheetParams.f83943b) && this.f83944c == earnOptionsBottomSheetParams.f83944c;
    }

    public final int hashCode() {
        Double d = this.f83942a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.f83943b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.f83944c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Double d = this.f83942a;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        dest.writeString(this.f83943b);
        i iVar = this.f83944c;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
    }

    public EarnOptionsBottomSheetParams(Double d, String str, i iVar) {
        this.f83942a = d;
        this.f83943b = str;
        this.f83944c = iVar;
    }

    public /* synthetic */ EarnOptionsBottomSheetParams(int i, Double d) {
        this((i & 1) != 0 ? null : d, null, null);
    }
}
