package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import g8a.u;
import g8a.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pix/api/model/TrustedAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "g8a/u", "g8a/v", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TrustedAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrustedAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f80488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f80490c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrustedAccount(u.valueOf(parcel.readString()), parcel.readString(), v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrustedAccount[i];
        }
    }

    public TrustedAccount(u status, String id10, v type) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f80488a = status;
        this.f80489b = id10;
        this.f80490c = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TrustedAccount)) {
            return false;
        }
        TrustedAccount trustedAccount = (TrustedAccount) obj2;
        return this.f80488a == trustedAccount.f80488a && Intrinsics.f(this.f80489b, trustedAccount.f80489b) && this.f80490c == trustedAccount.f80490c;
    }

    public final int hashCode() {
        return this.f80490c.hashCode() + p.a.c(this.f80488a.hashCode() * 31, 31, this.f80489b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80488a.name());
        dest.writeString(this.f80489b);
        dest.writeString(this.f80490c.name());
    }
}
