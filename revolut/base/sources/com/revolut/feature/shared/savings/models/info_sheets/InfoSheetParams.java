package com.revolut.feature.shared.savings.models.info_sheets;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/InfoSheetParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InfoSheetParams implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86510c;
    public final String d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<InfoSheetParams> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.shared.savings.models.info_sheets.InfoSheetParams$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InfoSheetParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoSheetParams[i];
        }
    }

    public InfoSheetParams(String key, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f86508a = key;
        this.f86509b = str;
        this.f86510c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InfoSheetParams)) {
            return false;
        }
        InfoSheetParams infoSheetParams = (InfoSheetParams) obj2;
        return Intrinsics.f(this.f86508a, infoSheetParams.f86508a) && Intrinsics.f(this.f86509b, infoSheetParams.f86509b) && Intrinsics.f(this.f86510c, infoSheetParams.f86510c) && Intrinsics.f(this.d, infoSheetParams.d);
    }

    public final int hashCode() {
        int iHashCode = this.f86508a.hashCode() * 31;
        String str = this.f86509b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f86510c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86508a);
        dest.writeString(this.f86509b);
        dest.writeString(this.f86510c);
        dest.writeString(this.d);
    }
}
