package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/core/ui_kit/models/NavBarProductIntro$StoryV1", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class NavBarProductIntro$StoryV1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f57870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f57871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Video f57872c;
    public final Set d;

    @NotNull
    public static final Parcelable.Creator<NavBarProductIntro$StoryV1> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", NavBarProductIntro$StoryV1.class);
            Clause clause2 = (Clause) parcel.readParcelable(NavBarProductIntro$StoryV1.class.getClassLoader());
            Video video = (Video) parcel.readParcelable(NavBarProductIntro$StoryV1.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = prk.o.a(parcel, linkedHashSet, iA, 1);
            }
            return new NavBarProductIntro$StoryV1(clause, clause2, video, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NavBarProductIntro$StoryV1[i];
        }
    }

    public NavBarProductIntro$StoryV1(Clause title, Clause subtitle, Video background, Set highlightedActionIds) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(highlightedActionIds, "highlightedActionIds");
        this.f57870a = title;
        this.f57871b = subtitle;
        this.f57872c = background;
        this.d = highlightedActionIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NavBarProductIntro$StoryV1)) {
            return false;
        }
        NavBarProductIntro$StoryV1 navBarProductIntro$StoryV1 = (NavBarProductIntro$StoryV1) obj2;
        return Intrinsics.f(this.f57870a, navBarProductIntro$StoryV1.f57870a) && Intrinsics.f(this.f57871b, navBarProductIntro$StoryV1.f57871b) && Intrinsics.f(this.f57872c, navBarProductIntro$StoryV1.f57872c) && Intrinsics.f(this.d, navBarProductIntro$StoryV1.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f57872c.hashCode() + p.a.a(this.f57870a.hashCode() * 31, 31, this.f57871b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57870a, i);
        dest.writeParcelable(this.f57871b, i);
        dest.writeParcelable(this.f57872c, i);
        Iterator itV = ehe.n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
