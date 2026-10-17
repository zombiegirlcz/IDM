package com.revolut.feature.stories.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/MultiBarTooltip;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiBarTooltip implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MultiBarTooltip> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f88772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88774c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultiBarTooltip(parcel.readFloat(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultiBarTooltip[i];
        }
    }

    public MultiBarTooltip(float f, int i, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f88772a = f;
        this.f88773b = label;
        this.f88774c = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF88774c() {
        return this.f88774c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF88772a() {
        return this.f88772a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultiBarTooltip)) {
            return false;
        }
        MultiBarTooltip multiBarTooltip = (MultiBarTooltip) obj2;
        return Float.compare(this.f88772a, multiBarTooltip.f88772a) == 0 && Intrinsics.f(this.f88773b, multiBarTooltip.f88773b) && this.f88774c == multiBarTooltip.f88774c;
    }

    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF88773b() {
        return this.f88773b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88774c) + p.a.c(Float.hashCode(this.f88772a) * 31, 31, this.f88773b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.f88772a);
        dest.writeString(this.f88773b);
        dest.writeInt(this.f88774c);
    }
}
