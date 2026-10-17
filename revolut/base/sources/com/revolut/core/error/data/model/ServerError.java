package com.revolut.core.error.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/error/data/model/ServerError;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "core_error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServerError implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ServerErrorParams f51364c;
    public final String d;

    @NotNull
    public static final Parcelable.Creator<ServerError> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ServerError(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : ServerErrorParams.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ServerError[i];
        }
    }

    public ServerError(int i, String str, ServerErrorParams serverErrorParams, String str2) {
        this.f51362a = i;
        this.f51363b = str;
        this.f51364c = serverErrorParams;
        this.d = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF51362a() {
        return this.f51362a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF51363b() {
        return this.f51363b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ServerErrorParams getF51364c() {
        return this.f51364c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ServerError)) {
            return false;
        }
        ServerError serverError = (ServerError) obj2;
        return this.f51362a == serverError.f51362a && Intrinsics.f(this.f51363b, serverError.f51363b) && Intrinsics.f(this.f51364c, serverError.f51364c) && Intrinsics.f(this.d, serverError.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f51362a) * 31;
        String str = this.f51363b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ServerErrorParams serverErrorParams = this.f51364c;
        int iHashCode3 = (iHashCode2 + (serverErrorParams == null ? 0 : serverErrorParams.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f51362a);
        dest.writeString(this.f51363b);
        ServerErrorParams serverErrorParams = this.f51364c;
        if (serverErrorParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            serverErrorParams.writeToParcel(dest, i);
        }
        dest.writeString(this.d);
    }

    public /* synthetic */ ServerError(int i, String str) {
        this(i, str, null, null);
    }
}
