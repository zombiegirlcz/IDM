package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCode;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrCode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrCode> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[][] f80418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80419b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int[][] iArr;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                iArr = null;
            } else {
                int i = parcel.readInt();
                int[][] iArr2 = new int[i][];
                for (int i2 = 0; i2 != i; i2++) {
                    iArr2[i2] = parcel.createIntArray();
                }
                iArr = iArr2;
            }
            return new PixQrCode(iArr, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCode[i];
        }
    }

    public PixQrCode(int[][] iArr, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f80418a = iArr;
        this.f80419b = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!PixQrCode.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.pix.api.model.PixQrCode");
        PixQrCode pixQrCode = (PixQrCode) obj2;
        return Intrinsics.f(this.f80419b, pixQrCode.f80419b) && n.b(this.f80418a, pixQrCode.f80418a);
    }

    public final int hashCode() {
        int[][] iArr = this.f80418a;
        return this.f80419b.hashCode() + ((iArr != null ? Arrays.deepHashCode(iArr) : 0) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int[][] iArr = this.f80418a;
        if (iArr == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            int length = iArr.length;
            dest.writeInt(length);
            for (int i2 = 0; i2 != length; i2++) {
                dest.writeIntArray(iArr[i2]);
            }
        }
        dest.writeString(this.f80419b);
    }
}
