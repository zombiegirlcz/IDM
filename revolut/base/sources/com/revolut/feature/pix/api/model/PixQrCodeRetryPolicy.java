package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeRetryPolicy;", "Landroid/os/Parcelable;", "", "NOT_ALLOWED", "ALLOWED_3_TIMES_7_DAYS", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeRetryPolicy implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PixQrCodeRetryPolicy[] $VALUES;
    public static final PixQrCodeRetryPolicy ALLOWED_3_TIMES_7_DAYS;

    @NotNull
    public static final Parcelable.Creator<PixQrCodeRetryPolicy> CREATOR;
    public static final PixQrCodeRetryPolicy NOT_ALLOWED;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PixQrCodeRetryPolicy.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeRetryPolicy[i];
        }
    }

    static {
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy = new PixQrCodeRetryPolicy("NOT_ALLOWED", 0);
        NOT_ALLOWED = pixQrCodeRetryPolicy;
        PixQrCodeRetryPolicy pixQrCodeRetryPolicy2 = new PixQrCodeRetryPolicy("ALLOWED_3_TIMES_7_DAYS", 1);
        ALLOWED_3_TIMES_7_DAYS = pixQrCodeRetryPolicy2;
        PixQrCodeRetryPolicy[] pixQrCodeRetryPolicyArr = {pixQrCodeRetryPolicy, pixQrCodeRetryPolicy2};
        $VALUES = pixQrCodeRetryPolicyArr;
        $ENTRIES = s.n(pixQrCodeRetryPolicyArr);
        CREATOR = new a();
    }

    public static PixQrCodeRetryPolicy valueOf(String str) {
        return (PixQrCodeRetryPolicy) Enum.valueOf(PixQrCodeRetryPolicy.class, str);
    }

    public static PixQrCodeRetryPolicy[] values() {
        return (PixQrCodeRetryPolicy[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
