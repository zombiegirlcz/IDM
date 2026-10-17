package com.revolut.shared.feature.selfserve.entity.config.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/selfserve/entity/config/api/models/Tag;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Tag implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Tag> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104884b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Tag(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Tag[i];
        }
    }

    public Tag(int i, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f104883a = i;
        this.f104884b = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Tag)) {
            return false;
        }
        Tag tag2 = (Tag) obj2;
        return this.f104883a == tag2.f104883a && Intrinsics.f(this.f104884b, tag2.f104884b);
    }

    public final int hashCode() {
        return this.f104884b.hashCode() + (Integer.hashCode(this.f104883a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f104883a);
        dest.writeString(this.f104884b);
    }
}
