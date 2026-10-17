package com.revolut.feature.core.model.domain.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/core/model/domain/wallet/WalletId;", "Landroid/os/Parcelable;", "id", "", "feature_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletId implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WalletId> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66106a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new WalletId(v7.t(parcel, "parcel", "id"));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WalletId[i];
        }
    }

    public /* synthetic */ WalletId(String str) {
        this.f66106a = str;
    }

    public static final /* synthetic */ WalletId a(String str) {
        return new WalletId(str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final /* synthetic */ String getF66106a() {
        return this.f66106a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof WalletId) {
            return Intrinsics.f(this.f66106a, ((WalletId) obj2).f66106a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f66106a.hashCode();
    }

    public final String toString() {
        return p.a.p("WalletId(id=", this.f66106a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66106a);
    }
}
