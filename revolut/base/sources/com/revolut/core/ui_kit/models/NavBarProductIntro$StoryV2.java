package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "HighlightedItems", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavBarProductIntro$StoryV2 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f57873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f57874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HighlightedItems f57875c;

    @NotNull
    public static final Parcelable.Creator<NavBarProductIntro$StoryV2> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems;", "Landroid/os/Parcelable;", "Actions", "SmallAction", "ViewFinderTarget", "Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems$Actions;", "Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems$SmallAction;", "Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems$ViewFinderTarget;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface HighlightedItems extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems$Actions;", "Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Actions implements HighlightedItems {

            @NotNull
            public static final Parcelable.Creator<Actions> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f57876a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = prk.o.a(parcel, linkedHashSet, iA, 1);
                    }
                    return new Actions(linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Actions[i];
                }
            }

            public Actions(Set highlightedActionIds) {
                Intrinsics.checkNotNullParameter(highlightedActionIds, "highlightedActionIds");
                this.f57876a = highlightedActionIds;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Actions) && Intrinsics.f(this.f57876a, ((Actions) obj2).f57876a);
            }

            public final int hashCode() {
                return this.f57876a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = ehe.n.v(this.f57876a, dest);
                while (itV.hasNext()) {
                    dest.writeString((String) itV.next());
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems$SmallAction;", "Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SmallAction implements HighlightedItems {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SmallAction f57877a = new SmallAction();

            @NotNull
            public static final Parcelable.Creator<SmallAction> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SmallAction.f57877a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SmallAction[i];
                }
            }

            private SmallAction() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems$ViewFinderTarget;", "Lcom/revolut/core/ui_kit/models/NavBarProductIntro$StoryV2$HighlightedItems;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ViewFinderTarget implements HighlightedItems {

            @NotNull
            public static final Parcelable.Creator<ViewFinderTarget> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ParcelableViewTarget f57878a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ViewFinderTarget((ParcelableViewTarget) parcel.readParcelable(ViewFinderTarget.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ViewFinderTarget[i];
                }
            }

            public ViewFinderTarget(ParcelableViewTarget target) {
                Intrinsics.checkNotNullParameter(target, "target");
                this.f57878a = target;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ViewFinderTarget) && Intrinsics.f(this.f57878a, ((ViewFinderTarget) obj2).f57878a);
            }

            public final int hashCode() {
                return this.f57878a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57878a, i);
            }
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NavBarProductIntro$StoryV2((Clause) parcel.readParcelable(NavBarProductIntro$StoryV2.class.getClassLoader()), (Clause) parcel.readParcelable(NavBarProductIntro$StoryV2.class.getClassLoader()), (HighlightedItems) parcel.readParcelable(NavBarProductIntro$StoryV2.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NavBarProductIntro$StoryV2[i];
        }
    }

    public NavBarProductIntro$StoryV2(Clause title, Clause clause, HighlightedItems highlightedItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(highlightedItems, "highlightedItems");
        this.f57873a = title;
        this.f57874b = clause;
        this.f57875c = highlightedItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NavBarProductIntro$StoryV2)) {
            return false;
        }
        NavBarProductIntro$StoryV2 navBarProductIntro$StoryV2 = (NavBarProductIntro$StoryV2) obj2;
        return Intrinsics.f(this.f57873a, navBarProductIntro$StoryV2.f57873a) && Intrinsics.f(this.f57874b, navBarProductIntro$StoryV2.f57874b) && Intrinsics.f(this.f57875c, navBarProductIntro$StoryV2.f57875c);
    }

    public final int hashCode() {
        int iHashCode = this.f57873a.hashCode() * 31;
        Clause clause = this.f57874b;
        return this.f57875c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57873a, i);
        dest.writeParcelable(this.f57874b, i);
        dest.writeParcelable(this.f57875c, i);
    }
}
