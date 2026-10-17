package com.revolut.feature.stories.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/MultiBarItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiBarItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MultiBarItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f88769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f88771c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultiBarItem(parcel.readFloat(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultiBarItem[i];
        }
    }

    public MultiBarItem(float f, String title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f88769a = f;
        this.f88770b = title;
        this.f88771c = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF88769a() {
        return this.f88769a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF88771c() {
        return this.f88771c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultiBarItem)) {
            return false;
        }
        MultiBarItem multiBarItem = (MultiBarItem) obj2;
        return Float.compare(this.f88769a, multiBarItem.f88769a) == 0 && Intrinsics.f(this.f88770b, multiBarItem.f88770b) && this.f88771c == multiBarItem.f88771c;
    }

    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF88770b() {
        return this.f88770b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88771c) + p.a.c(Float.hashCode(this.f88769a) * 31, 31, this.f88770b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.f88769a);
        dest.writeString(this.f88770b);
        dest.writeInt(this.f88771c ? 1 : 0);
    }
}
