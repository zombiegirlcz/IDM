package com.revolut.feature.stories.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoryLink;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoryLink implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoryLink> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoryAction f88795b;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoryLink(parcel.readString(), (StoryAction) parcel.readParcelable(StoryLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryLink[i];
        }
    }

    public StoryLink(String text, StoryAction action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f88794a = text;
        this.f88795b = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoryLink)) {
            return false;
        }
        StoryLink storyLink = (StoryLink) obj2;
        return Intrinsics.f(this.f88794a, storyLink.f88794a) && Intrinsics.f(this.f88795b, storyLink.f88795b);
    }

    public final int hashCode() {
        return this.f88795b.hashCode() + (this.f88794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88794a);
        dest.writeParcelable(this.f88795b, i);
    }
}
