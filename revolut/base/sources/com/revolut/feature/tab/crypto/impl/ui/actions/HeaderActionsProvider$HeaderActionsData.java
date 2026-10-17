package com.revolut.feature.tab.crypto.impl.ui.actions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tab/crypto/impl/ui/actions/HeaderActionsProvider$HeaderActionsData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HeaderActionsProvider$HeaderActionsData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HeaderActionsProvider$HeaderActionsData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f89794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89796c;
    public final boolean d;
    public final n e;

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
            return new HeaderActionsProvider$HeaderActionsData(z6, z11, z3, z4, parcel.readInt() == 0 ? null : n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HeaderActionsProvider$HeaderActionsData[i];
        }
    }

    public HeaderActionsProvider$HeaderActionsData(boolean z, boolean z3, boolean z4, boolean z6, n nVar) {
        this.f89794a = z;
        this.f89795b = z3;
        this.f89796c = z4;
        this.d = z6;
        this.e = nVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HeaderActionsProvider$HeaderActionsData)) {
            return false;
        }
        HeaderActionsProvider$HeaderActionsData headerActionsProvider$HeaderActionsData = (HeaderActionsProvider$HeaderActionsData) obj2;
        return this.f89794a == headerActionsProvider$HeaderActionsData.f89794a && this.f89795b == headerActionsProvider$HeaderActionsData.f89795b && this.f89796c == headerActionsProvider$HeaderActionsData.f89796c && this.d == headerActionsProvider$HeaderActionsData.d && this.e == headerActionsProvider$HeaderActionsData.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f89794a) * 31, 31, this.f89795b), 31, this.f89796c), 31, this.d);
        n nVar = this.e;
        return iC + (nVar == null ? 0 : nVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f89794a ? 1 : 0);
        dest.writeInt(this.f89795b ? 1 : 0);
        dest.writeInt(this.f89796c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        n nVar = this.e;
        if (nVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(nVar.name());
        }
    }
}
