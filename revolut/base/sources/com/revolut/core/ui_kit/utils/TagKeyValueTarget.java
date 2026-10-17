package com.revolut.core.ui_kit.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/utils/TagKeyValueTarget;", "Lcom/revolut/core/ui_kit/utils/ParcelableViewTarget;", "", "toString", "()Ljava/lang/String;", "ui_kit_foundation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TagKeyValueTarget implements ParcelableViewTarget {

    @NotNull
    public static final Parcelable.Creator<TagKeyValueTarget> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f58293b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TagKeyValueTarget(parcel.readParcelable(TagKeyValueTarget.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TagKeyValueTarget[i];
        }
    }

    public TagKeyValueTarget(Parcelable tagValue, int i) {
        Intrinsics.checkNotNullParameter(tagValue, "tagValue");
        this.f58292a = i;
        this.f58293b = tagValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TagKeyValueTarget)) {
            return false;
        }
        TagKeyValueTarget tagKeyValueTarget = (TagKeyValueTarget) obj2;
        return this.f58292a == tagKeyValueTarget.f58292a && Intrinsics.f(this.f58293b, tagKeyValueTarget.f58293b);
    }

    public final int hashCode() {
        return this.f58293b.hashCode() + (Integer.hashCode(this.f58292a) * 31);
    }

    @Override // ix0.b2
    public final String j() {
        return "TagKeyValueTarget(tagKey=" + this.f58292a + ", tagValue=" + this.f58293b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f58292a);
        dest.writeParcelable(this.f58293b, i);
    }
}
