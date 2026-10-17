package com.revolut.feature.remote_stories.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/remote_stories/impl/ui/StoriesEventsMetadata;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoriesEventsMetadata implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoriesEventsMetadata> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81981c;
    public final String d;
    public final String e;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoriesEventsMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoriesEventsMetadata[i];
        }
    }

    public StoriesEventsMetadata(String str, String str2, String str3, String str4, String str5) {
        this.f81979a = str;
        this.f81980b = str2;
        this.f81981c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoriesEventsMetadata)) {
            return false;
        }
        StoriesEventsMetadata storiesEventsMetadata = (StoriesEventsMetadata) obj2;
        return Intrinsics.f(this.f81979a, storiesEventsMetadata.f81979a) && Intrinsics.f(this.f81980b, storiesEventsMetadata.f81980b) && Intrinsics.f(this.f81981c, storiesEventsMetadata.f81981c) && Intrinsics.f(this.d, storiesEventsMetadata.d) && Intrinsics.f(this.e, storiesEventsMetadata.e);
    }

    public final int hashCode() {
        String str = this.f81979a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81980b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81981c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81979a);
        dest.writeString(this.f81980b);
        dest.writeString(this.f81981c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
