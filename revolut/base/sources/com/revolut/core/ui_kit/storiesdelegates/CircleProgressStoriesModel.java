package com.revolut.core.ui_kit.storiesdelegates;

import android.os.Parcelable;
import bx0.c0;
import bx0.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.stories.models.StoryPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r6.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/CircleProgressStoriesModel;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CircleProgressStoriesModel implements BaseStoriesModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoryPage.WithCircleProgress f58179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f58180c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f58181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Image f58182h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Parcelable f58183j;
    public final LargeActionButton.ButtonStyle k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Image f58184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f58185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Parcelable f58186n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f58187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Clause f58188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f58189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Parcelable f58190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StoryColours f58191t;

    public CircleProgressStoriesModel(String listId, StoryPage.WithCircleProgress withCircleProgress, c0 background, Clause clause, Clause title, Clause clause2, LargeActionButton.ButtonStyle buttonStyle, Image image, Clause clause3, Parcelable parcelable, LargeActionButton.ButtonStyle secondaryButtonStyle, Image image2, Clause clause4, Parcelable parcelable2, e buttonsOrientation, int i, Clause progressText, String str, StoryColours storyColours) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
        Intrinsics.checkNotNullParameter(progressText, "progressText");
        Intrinsics.checkNotNullParameter(storyColours, "storyColours");
        this.f58178a = listId;
        this.f58179b = withCircleProgress;
        this.f58180c = background;
        this.d = clause;
        this.e = title;
        this.f = clause2;
        this.f58181g = buttonStyle;
        this.f58182h = image;
        this.i = clause3;
        this.f58183j = parcelable;
        this.k = secondaryButtonStyle;
        this.f58184l = image2;
        this.f58185m = clause4;
        this.f58186n = parcelable2;
        this.o = buttonsOrientation;
        this.f58187p = i;
        this.f58188q = progressText;
        this.f58189r = str;
        this.f58190s = null;
        this.f58191t = storyColours;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final StoryColours getI() {
        return this.f58191t;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55158j() {
        return this.f58179b;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF55154b() {
        return this.f58178a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CircleProgressStoriesModel)) {
            return false;
        }
        CircleProgressStoriesModel circleProgressStoriesModel = (CircleProgressStoriesModel) obj2;
        return Intrinsics.f(this.f58178a, circleProgressStoriesModel.f58178a) && Intrinsics.f(this.f58179b, circleProgressStoriesModel.f58179b) && Intrinsics.f(this.f58180c, circleProgressStoriesModel.f58180c) && Intrinsics.f(this.d, circleProgressStoriesModel.d) && Intrinsics.f(this.e, circleProgressStoriesModel.e) && Intrinsics.f(this.f, circleProgressStoriesModel.f) && Intrinsics.f(this.f58181g, circleProgressStoriesModel.f58181g) && Intrinsics.f(this.f58182h, circleProgressStoriesModel.f58182h) && Intrinsics.f(this.i, circleProgressStoriesModel.i) && Intrinsics.f(this.f58183j, circleProgressStoriesModel.f58183j) && Intrinsics.f(this.k, circleProgressStoriesModel.k) && Intrinsics.f(this.f58184l, circleProgressStoriesModel.f58184l) && Intrinsics.f(this.f58185m, circleProgressStoriesModel.f58185m) && Intrinsics.f(this.f58186n, circleProgressStoriesModel.f58186n) && this.o == circleProgressStoriesModel.o && this.f58187p == circleProgressStoriesModel.f58187p && Intrinsics.f(this.f58188q, circleProgressStoriesModel.f58188q) && Intrinsics.f(this.f58189r, circleProgressStoriesModel.f58189r) && Intrinsics.f(this.f58190s, circleProgressStoriesModel.f58190s) && Intrinsics.f(this.f58191t, circleProgressStoriesModel.f58191t);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getI() {
        return this.f58190s;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: getBackground, reason: from getter */
    public final c0 getF58214g() {
        return this.f58180c;
    }

    public final int hashCode() {
        int iHashCode = this.f58178a.hashCode() * 31;
        StoryPage.WithCircleProgress withCircleProgress = this.f58179b;
        int iHashCode2 = (this.f58180c.hashCode() + ((iHashCode + (withCircleProgress == null ? 0 : withCircleProgress.hashCode())) * 31)) * 31;
        Clause clause = this.d;
        int iA = p.a.a((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
        Clause clause2 = this.f;
        int iD = b.d(this.f58181g, (iA + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        Image image = this.f58182h;
        int iHashCode3 = (iD + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause3 = this.i;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Parcelable parcelable = this.f58183j;
        int iD2 = b.d(this.k, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
        Image image2 = this.f58184l;
        int iHashCode5 = (iD2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Clause clause4 = this.f58185m;
        int iHashCode6 = (iHashCode5 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Parcelable parcelable2 = this.f58186n;
        int iA2 = p.a.a(j6.a.b(this.f58187p, (this.o.hashCode() + ((iHashCode6 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31)) * 31, 31), 31, this.f58188q);
        String str = this.f58189r;
        int iHashCode7 = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        Parcelable parcelable3 = this.f58190s;
        return this.f58191t.hashCode() + ((iHashCode7 + (parcelable3 != null ? parcelable3.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final Clause getF58215h() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f58190s = parcelable;
    }
}
