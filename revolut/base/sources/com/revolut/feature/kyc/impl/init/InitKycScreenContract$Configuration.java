package com.revolut.feature.kyc.impl.init;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/init/InitKycScreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitKycScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InitKycScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f77822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f77823c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            NaviCommand naviCommand;
            b bVar;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(InitKycScreenContract$Configuration.class.getClassLoader());
            b bVar2 = (b) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z3 = true;
                naviCommand = naviCommand2;
                bVar = bVar2;
                z4 = true;
            } else {
                z3 = true;
                naviCommand = naviCommand2;
                bVar = bVar2;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new InitKycScreenContract$Configuration(z6, naviCommand, bVar, z4, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InitKycScreenContract$Configuration[i];
        }
    }

    public InitKycScreenContract$Configuration(boolean z, NaviCommand naviCommand, b bVar, boolean z3, boolean z4) {
        this.f77821a = z;
        this.f77822b = naviCommand;
        this.f77823c = bVar;
        this.d = z3;
        this.e = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InitKycScreenContract$Configuration)) {
            return false;
        }
        InitKycScreenContract$Configuration initKycScreenContract$Configuration = (InitKycScreenContract$Configuration) obj2;
        return this.f77821a == initKycScreenContract$Configuration.f77821a && Intrinsics.f(this.f77822b, initKycScreenContract$Configuration.f77822b) && Intrinsics.f(this.f77823c, initKycScreenContract$Configuration.f77823c) && this.d == initKycScreenContract$Configuration.d && this.e == initKycScreenContract$Configuration.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f77821a) * 31;
        NaviCommand naviCommand = this.f77822b;
        int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        b bVar = this.f77823c;
        return Boolean.hashCode(this.e) + j6.a.c((iHashCode2 + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f77821a ? 1 : 0);
        dest.writeParcelable(this.f77822b, i);
        dest.writeSerializable(this.f77823c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
