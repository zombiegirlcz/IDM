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

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/SimpleStoriesModel;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SimpleStoriesModel implements BaseStoriesModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f58232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f58233c;
    public final c0 d;
    public final LargeActionButton.ButtonStyle e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f58234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Parcelable f58235h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f58236j;
    public final Image k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f58237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Parcelable f58238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final StoryPage.Simple f58239n;
    public Parcelable o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f58240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Clause f58241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f58242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final StoryColours f58243s;

    public SimpleStoriesModel(String listId, Clause title, Clause clause, c0 background, LargeActionButton.ButtonStyle buttonStyle, Image image, Clause clause2, Parcelable parcelable, boolean z, LargeActionButton.ButtonStyle secondaryButtonStyle, Image image2, Clause clause3, Parcelable parcelable2, StoryPage.Simple simple, e buttonsOrientation, Clause clause4, String str, StoryColours storyColours) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
        Intrinsics.checkNotNullParameter(storyColours, "storyColours");
        this.f58231a = listId;
        this.f58232b = title;
        this.f58233c = clause;
        this.d = background;
        this.e = buttonStyle;
        this.f = image;
        this.f58234g = clause2;
        this.f58235h = parcelable;
        this.i = z;
        this.f58236j = secondaryButtonStyle;
        this.k = image2;
        this.f58237l = clause3;
        this.f58238m = parcelable2;
        this.f58239n = simple;
        this.o = null;
        this.f58240p = buttonsOrientation;
        this.f58241q = clause4;
        this.f58242r = str;
        this.f58243s = storyColours;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Clause getF58232b() {
        return this.f58232b;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final StoryColours getI() {
        return this.f58243s;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55158j() {
        return this.f58239n;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF55154b() {
        return this.f58231a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Clause getF58233c() {
        return this.f58233c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Parcelable getF58235h() {
        return this.f58235h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SimpleStoriesModel)) {
            return false;
        }
        SimpleStoriesModel simpleStoriesModel = (SimpleStoriesModel) obj2;
        return Intrinsics.f(this.f58231a, simpleStoriesModel.f58231a) && Intrinsics.f(this.f58232b, simpleStoriesModel.f58232b) && Intrinsics.f(this.f58233c, simpleStoriesModel.f58233c) && Intrinsics.f(this.d, simpleStoriesModel.d) && Intrinsics.f(this.e, simpleStoriesModel.e) && Intrinsics.f(this.f, simpleStoriesModel.f) && Intrinsics.f(this.f58234g, simpleStoriesModel.f58234g) && Intrinsics.f(this.f58235h, simpleStoriesModel.f58235h) && this.i == simpleStoriesModel.i && Intrinsics.f(this.f58236j, simpleStoriesModel.f58236j) && Intrinsics.f(this.k, simpleStoriesModel.k) && Intrinsics.f(this.f58237l, simpleStoriesModel.f58237l) && Intrinsics.f(this.f58238m, simpleStoriesModel.f58238m) && Intrinsics.f(this.f58239n, simpleStoriesModel.f58239n) && Intrinsics.f(this.o, simpleStoriesModel.o) && this.f58240p == simpleStoriesModel.f58240p && Intrinsics.f(this.f58241q, simpleStoriesModel.f58241q) && Intrinsics.f(this.f58242r, simpleStoriesModel.f58242r) && Intrinsics.f(this.f58243s, simpleStoriesModel.f58243s);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Image getF() {
        return this.f;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getI() {
        return this.o;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: getBackground, reason: from getter */
    public final c0 getF58214g() {
        return this.d;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f58231a.hashCode() * 31, 31, this.f58232b);
        Clause clause = this.f58233c;
        int iD = b.d(this.e, (this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31);
        Image image = this.f;
        int iHashCode = (iD + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause2 = this.f58234g;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Parcelable parcelable = this.f58235h;
        int iD2 = b.d(this.f58236j, j6.a.c((iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.i), 31);
        Image image2 = this.k;
        int iHashCode3 = (iD2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Clause clause3 = this.f58237l;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Parcelable parcelable2 = this.f58238m;
        int iHashCode5 = (iHashCode4 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31;
        StoryPage.Simple simple = this.f58239n;
        int iHashCode6 = (iHashCode5 + (simple == null ? 0 : simple.hashCode())) * 31;
        Parcelable parcelable3 = this.o;
        int iHashCode7 = (this.f58240p.hashCode() + ((iHashCode6 + (parcelable3 == null ? 0 : parcelable3.hashCode())) * 31)) * 31;
        Clause clause4 = this.f58241q;
        int iHashCode8 = (iHashCode7 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        String str = this.f58242r;
        return this.f58243s.hashCode() + ((iHashCode8 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final LargeActionButton.ButtonStyle getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Clause getF58234g() {
        return this.f58234g;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final e getF58240p() {
        return this.f58240p;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getF58242r() {
        return this.f58242r;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Parcelable getF58238m() {
        return this.f58238m;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final Clause getF58215h() {
        return this.f58241q;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Image getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final LargeActionButton.ButtonStyle getF58236j() {
        return this.f58236j;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Clause getF58237l() {
        return this.f58237l;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.o = parcelable;
    }
}
