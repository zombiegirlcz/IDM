package com.revolut.retail.core.navigation;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/FragmentNavigateCommand;", "Lcom/revolut/retail/core/navigation/BaseFragmentNavigateCommand;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class FragmentNavigateCommand extends BaseFragmentNavigateCommand {

    @NotNull
    public static final Parcelable.Creator<FragmentNavigateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentDestination f98651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f98652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98653c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f98654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f98655h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f98656j;
    public final Intent k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            FragmentDestination fragmentDestinationCreateFromParcel = FragmentDestination.CREATOR.createFromParcel(parcel);
            Parcelable parcelable = parcel.readParcelable(FragmentNavigateCommand.class.getClassLoader());
            boolean z4 = false;
            boolean z6 = true;
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z = z3;
            }
            return new FragmentNavigateCommand(fragmentDestinationCreateFromParcel, parcelable, z11, z4, z6, z, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Intent) parcel.readParcelable(FragmentNavigateCommand.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FragmentNavigateCommand[i];
        }
    }

    public FragmentNavigateCommand(FragmentDestination destination, Parcelable parcelable, boolean z, boolean z3, boolean z4, boolean z6, int i, int i2, int i3, int i5, Intent intent) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f98651a = destination;
        this.f98652b = parcelable;
        this.f98653c = z;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f98654g = i;
        this.f98655h = i2;
        this.i = i3;
        this.f98656j = i5;
        this.k = intent;
    }

    public static FragmentNavigateCommand a(FragmentNavigateCommand fragmentNavigateCommand, int i, int i2, int i3, int i5, int i6) {
        FragmentDestination destination = fragmentNavigateCommand.f98651a;
        Parcelable parcelable = fragmentNavigateCommand.f98652b;
        boolean z = (i6 & 4) != 0 ? fragmentNavigateCommand.f98653c : true;
        boolean z3 = fragmentNavigateCommand.d;
        boolean z4 = fragmentNavigateCommand.e;
        boolean z6 = fragmentNavigateCommand.f;
        if ((i6 & 64) != 0) {
            i = fragmentNavigateCommand.f98654g;
        }
        int i21 = i;
        if ((i6 & 128) != 0) {
            i2 = fragmentNavigateCommand.f98655h;
        }
        int i22 = i2;
        int i32 = (i6 & 256) != 0 ? fragmentNavigateCommand.i : i3;
        int i33 = (i6 & 512) != 0 ? fragmentNavigateCommand.f98656j : i5;
        Intent intent = fragmentNavigateCommand.k;
        fragmentNavigateCommand.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new FragmentNavigateCommand(destination, parcelable, z, z3, z4, z6, i21, i22, i32, i33, intent);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Parcelable getF98652b() {
        return this.f98652b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FragmentNavigateCommand)) {
            return false;
        }
        FragmentNavigateCommand fragmentNavigateCommand = (FragmentNavigateCommand) obj2;
        return Intrinsics.f(this.f98651a, fragmentNavigateCommand.f98651a) && Intrinsics.f(this.f98652b, fragmentNavigateCommand.f98652b) && this.f98653c == fragmentNavigateCommand.f98653c && this.d == fragmentNavigateCommand.d && this.e == fragmentNavigateCommand.e && this.f == fragmentNavigateCommand.f && this.f98654g == fragmentNavigateCommand.f98654g && this.f98655h == fragmentNavigateCommand.f98655h && this.i == fragmentNavigateCommand.i && this.f98656j == fragmentNavigateCommand.f98656j && Intrinsics.f(this.k, fragmentNavigateCommand.k);
    }

    public final int hashCode() {
        int iHashCode = this.f98651a.f98650a.hashCode() * 31;
        Parcelable parcelable = this.f98652b;
        int iB = j6.a.b(this.f98656j, j6.a.b(this.i, j6.a.b(this.f98655h, j6.a.b(this.f98654g, j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f98653c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31), 31);
        Intent intent = this.k;
        return iB + (intent != null ? intent.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98651a.writeToParcel(dest, i);
        dest.writeParcelable(this.f98652b, i);
        dest.writeInt(this.f98653c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f98654g);
        dest.writeInt(this.f98655h);
        dest.writeInt(this.i);
        dest.writeInt(this.f98656j);
        dest.writeParcelable(this.k, i);
    }

    public /* synthetic */ FragmentNavigateCommand(FragmentDestination fragmentDestination, Parcelable parcelable, boolean z, int i) {
        this(fragmentDestination, (i & 2) != 0 ? null : parcelable, (i & 4) != 0 ? false : z, false, true, false, 0, 0, 0, 0, null);
    }
}
