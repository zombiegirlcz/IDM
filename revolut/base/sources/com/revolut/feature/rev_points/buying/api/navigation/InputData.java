package com.revolut.feature.rev_points.buying.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/buying/api/navigation/InputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_buying_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f83553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f83555c;
    public final Function1 d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputData(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Function1) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InputData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputData() {
        this(false, (Integer) null, (Function1) (0 == true ? 1 : 0), 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InputData)) {
            return false;
        }
        InputData inputData = (InputData) obj2;
        return this.f83553a == inputData.f83553a && this.f83554b == inputData.f83554b && Intrinsics.f(this.f83555c, inputData.f83555c) && Intrinsics.f(this.d, inputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f83553a) * 31, 31, this.f83554b);
        Integer num = this.f83555c;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Function1 function1 = this.d;
        return iHashCode + (function1 != null ? function1.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f83553a ? 1 : 0);
        dest.writeInt(this.f83554b ? 1 : 0);
        Integer num = this.f83555c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeSerializable((Serializable) this.d);
    }

    public InputData(boolean z, boolean z3, Integer num, Function1 function1) {
        this.f83553a = z;
        this.f83554b = z3;
        this.f83555c = num;
        this.d = function1;
    }

    public /* synthetic */ InputData(boolean z, Integer num, Function1 function1, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : function1);
    }
}
