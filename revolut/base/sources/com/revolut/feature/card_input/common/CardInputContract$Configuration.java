package com.revolut.feature.card_input.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_input/common/CardInputContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_input_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardInputContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardInputContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64746c;
    public final int d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f64747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f64748h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f64749j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CardInputContract$ScreenMode f64750l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new CardInputContract$Configuration(string, i, i2, i3, numValueOf, numValueOf2, numValueOf3, z4, string2, z3, parcel.readString(), CardInputContract$ScreenMode.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardInputContract$Configuration[i];
        }
    }

    public CardInputContract$Configuration(String flowName, int i, int i2, int i3, Integer num, Integer num2, Integer num3, boolean z, String str, boolean z3, String str2, CardInputContract$ScreenMode screenMode) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        this.f64744a = flowName;
        this.f64745b = i;
        this.f64746c = i2;
        this.d = i3;
        this.e = num;
        this.f = num2;
        this.f64747g = num3;
        this.f64748h = z;
        this.i = str;
        this.f64749j = z3;
        this.k = str2;
        this.f64750l = screenMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardInputContract$Configuration)) {
            return false;
        }
        CardInputContract$Configuration cardInputContract$Configuration = (CardInputContract$Configuration) obj2;
        return Intrinsics.f(this.f64744a, cardInputContract$Configuration.f64744a) && this.f64745b == cardInputContract$Configuration.f64745b && this.f64746c == cardInputContract$Configuration.f64746c && this.d == cardInputContract$Configuration.d && Intrinsics.f(this.e, cardInputContract$Configuration.e) && Intrinsics.f(this.f, cardInputContract$Configuration.f) && Intrinsics.f(this.f64747g, cardInputContract$Configuration.f64747g) && this.f64748h == cardInputContract$Configuration.f64748h && Intrinsics.f(this.i, cardInputContract$Configuration.i) && this.f64749j == cardInputContract$Configuration.f64749j && Intrinsics.f(this.k, cardInputContract$Configuration.k) && this.f64750l == cardInputContract$Configuration.f64750l;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, j6.a.b(this.f64746c, j6.a.b(this.f64745b, this.f64744a.hashCode() * 31, 31), 31), 31);
        Integer num = this.e;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f64747g;
        int iC = j6.a.c((iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.f64748h);
        String str = this.i;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f64749j);
        String str2 = this.k;
        return this.f64750l.hashCode() + ((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64744a);
        dest.writeInt(this.f64745b);
        dest.writeInt(this.f64746c);
        dest.writeInt(this.d);
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        Integer num3 = this.f64747g;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        dest.writeInt(this.f64748h ? 1 : 0);
        dest.writeString(this.i);
        dest.writeInt(this.f64749j ? 1 : 0);
        dest.writeString(this.k);
        this.f64750l.writeToParcel(dest, i);
    }
}
