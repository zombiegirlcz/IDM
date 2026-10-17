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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/ImageStoriesModel;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImageStoriesModel implements BaseStoriesModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoryPage f58196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f58197c;
    public final Clause d;
    public final Clause e;
    public final c0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f58198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Image f58199h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Parcelable f58200j;
    public final LargeActionButton.ButtonStyle k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Image f58201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f58202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Parcelable f58203n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Image f58204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f58205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final StoryColours f58206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Parcelable f58207s;

    public ImageStoriesModel(String listId, StoryPage storyPage, Clause clause, Clause title, Clause clause2, c0 background, LargeActionButton.ButtonStyle buttonStyle, Image image, Clause clause3, Parcelable parcelable, LargeActionButton.ButtonStyle secondaryButtonStyle, Image image2, Clause clause4, Parcelable parcelable2, e buttonsOrientation, Image image3, String str, StoryColours storyColours) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
        Intrinsics.checkNotNullParameter(storyColours, "storyColours");
        this.f58195a = listId;
        this.f58196b = storyPage;
        this.f58197c = clause;
        this.d = title;
        this.e = clause2;
        this.f = background;
        this.f58198g = buttonStyle;
        this.f58199h = image;
        this.i = clause3;
        this.f58200j = parcelable;
        this.k = secondaryButtonStyle;
        this.f58201l = image2;
        this.f58202m = clause4;
        this.f58203n = parcelable2;
        this.o = buttonsOrientation;
        this.f58204p = image3;
        this.f58205q = str;
        this.f58206r = storyColours;
        this.f58207s = null;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final StoryColours getI() {
        return this.f58206r;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51674g() {
        return this.f58196b;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF52014a() {
        return this.f58195a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ImageStoriesModel)) {
            return false;
        }
        ImageStoriesModel imageStoriesModel = (ImageStoriesModel) obj2;
        return Intrinsics.f(this.f58195a, imageStoriesModel.f58195a) && Intrinsics.f(this.f58196b, imageStoriesModel.f58196b) && Intrinsics.f(this.f58197c, imageStoriesModel.f58197c) && Intrinsics.f(this.d, imageStoriesModel.d) && Intrinsics.f(this.e, imageStoriesModel.e) && Intrinsics.f(this.f, imageStoriesModel.f) && Intrinsics.f(this.f58198g, imageStoriesModel.f58198g) && Intrinsics.f(this.f58199h, imageStoriesModel.f58199h) && Intrinsics.f(this.i, imageStoriesModel.i) && Intrinsics.f(this.f58200j, imageStoriesModel.f58200j) && Intrinsics.f(this.k, imageStoriesModel.k) && Intrinsics.f(this.f58201l, imageStoriesModel.f58201l) && Intrinsics.f(this.f58202m, imageStoriesModel.f58202m) && Intrinsics.f(this.f58203n, imageStoriesModel.f58203n) && this.o == imageStoriesModel.o && Intrinsics.f(this.f58204p, imageStoriesModel.f58204p) && Intrinsics.f(this.f58205q, imageStoriesModel.f58205q) && Intrinsics.f(this.f58206r, imageStoriesModel.f58206r) && Intrinsics.f(this.f58207s, imageStoriesModel.f58207s);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF52024q() {
        return this.f58207s;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: getBackground, reason: from getter */
    public final c0 getF58214g() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.f58195a.hashCode() * 31;
        StoryPage storyPage = this.f58196b;
        int iHashCode2 = (iHashCode + (storyPage == null ? 0 : storyPage.hashCode())) * 31;
        Clause clause = this.f58197c;
        int iA = p.a.a((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        Clause clause2 = this.e;
        int iD = b.d(this.f58198g, (this.f.hashCode() + ((iA + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31, 31);
        Image image = this.f58199h;
        int iHashCode3 = (iD + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause3 = this.i;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Parcelable parcelable = this.f58200j;
        int iD2 = b.d(this.k, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
        Image image2 = this.f58201l;
        int iHashCode5 = (iD2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Clause clause4 = this.f58202m;
        int iHashCode6 = (iHashCode5 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Parcelable parcelable2 = this.f58203n;
        int iHashCode7 = (this.o.hashCode() + ((iHashCode6 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31)) * 31;
        Image image3 = this.f58204p;
        int iHashCode8 = (iHashCode7 + (image3 == null ? 0 : image3.hashCode())) * 31;
        String str = this.f58205q;
        int iHashCode9 = (this.f58206r.hashCode() + ((iHashCode8 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Parcelable parcelable3 = this.f58207s;
        return iHashCode9 + (parcelable3 != null ? parcelable3.hashCode() : 0);
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final Clause getF58215h() {
        return this.f58197c;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f58207s = parcelable;
    }
}
