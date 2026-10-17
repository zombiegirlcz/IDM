package com.revolut.feature.in_app_calls;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/in_app_calls/ActiveCallData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_in_app_calls_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActiveCallData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActiveCallData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f74771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74773c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActiveCallData(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActiveCallData[i];
        }
    }

    public ActiveCallData(long j2, String str, String str2, String str3) {
        this.f74771a = j2;
        this.f74772b = str;
        this.f74773c = str2;
        this.d = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF74772b() {
        return this.f74772b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActiveCallData)) {
            return false;
        }
        ActiveCallData activeCallData = (ActiveCallData) obj2;
        return this.f74771a == activeCallData.f74771a && Intrinsics.f(this.f74772b, activeCallData.f74772b) && Intrinsics.f(this.f74773c, activeCallData.f74773c) && Intrinsics.f(this.d, activeCallData.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f74771a) * 31;
        String str = this.f74772b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74773c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f74771a);
        dest.writeString(this.f74772b);
        dest.writeString(this.f74773c);
        dest.writeString(this.d);
    }
}
