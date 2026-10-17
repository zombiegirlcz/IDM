package com.revolut.core.ui_kit.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/utils/TagKeyTarget;", "Lcom/revolut/core/ui_kit/utils/ParcelableViewTarget;", "tagKey", "", "ui_kit_foundation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TagKeyTarget implements ParcelableViewTarget {

    @NotNull
    public static final Parcelable.Creator<TagKeyTarget> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58291a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TagKeyTarget(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TagKeyTarget[i];
        }
    }

    public /* synthetic */ TagKeyTarget(int i) {
        this.f58291a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof TagKeyTarget) {
            return this.f58291a == ((TagKeyTarget) obj2).f58291a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58291a);
    }

    @Override // ix0.b2
    public final String j() {
        return j6.a.l(this.f58291a, "TagKeyTarget(tagKey=", ")");
    }

    public final String toString() {
        return j6.a.l(this.f58291a, "TagKeyTarget(tagKey=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f58291a);
    }
}
