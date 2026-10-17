package com.revolut.feature.chooser_commands.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/chooser_commands/api/RegionConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_chooser_commands_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegionConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RegionConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65934c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RegionConfiguration(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RegionConfiguration[i];
        }
    }

    public RegionConfiguration(String title, String countryCode, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f65932a = title;
        this.f65933b = countryCode;
        this.f65934c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RegionConfiguration)) {
            return false;
        }
        RegionConfiguration regionConfiguration = (RegionConfiguration) obj2;
        return Intrinsics.f(this.f65932a, regionConfiguration.f65932a) && Intrinsics.f(this.f65933b, regionConfiguration.f65933b) && Intrinsics.f(this.f65934c, regionConfiguration.f65934c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f65932a.hashCode() * 31, 31, this.f65933b);
        String str = this.f65934c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65932a);
        dest.writeString(this.f65933b);
        dest.writeString(this.f65934c);
    }
}
