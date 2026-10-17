package com.revolut.core.ui_kit.storiesdelegates;

import android.os.Parcelable;
import bx0.c0;
import bx0.d0;
import bx0.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.stories.models.StoryPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r6.b;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/MultibarStoriesModel;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibarStoriesModel implements BaseStoriesModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoryPage.WithMultiBarChart f58218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f58219c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f58220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Image f58221h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Parcelable f58222j;
    public final LargeActionButton.ButtonStyle k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Image f58223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f58224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Parcelable f58225n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f58226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f58227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f58228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final StoryColours f58229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Parcelable f58230t;

    public MultibarStoriesModel(String listId, StoryPage.WithMultiBarChart withMultiBarChart, c0 background, Clause clause, Clause title, Clause clause2, LargeActionButton.ButtonStyle buttonStyle, Image image, Clause clause3, Parcelable parcelable, LargeActionButton.ButtonStyle secondaryButtonStyle, Image image2, Clause clause4, Parcelable parcelable2, e buttonsOrientation, ArrayList barItems, d0 d0Var, String str, StoryColours storyColours) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
        Intrinsics.checkNotNullParameter(barItems, "barItems");
        Intrinsics.checkNotNullParameter(storyColours, "storyColours");
        this.f58217a = listId;
        this.f58218b = withMultiBarChart;
        this.f58219c = background;
        this.d = clause;
        this.e = title;
        this.f = clause2;
        this.f58220g = buttonStyle;
        this.f58221h = image;
        this.i = clause3;
        this.f58222j = parcelable;
        this.k = secondaryButtonStyle;
        this.f58223l = image2;
        this.f58224m = clause4;
        this.f58225n = parcelable2;
        this.o = buttonsOrientation;
        this.f58226p = barItems;
        this.f58227q = d0Var;
        this.f58228r = str;
        this.f58229s = storyColours;
        this.f58230t = null;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Clause getE() {
        return this.e;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final StoryColours getI() {
        return this.f58229s;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getE() {
        return this.f58218b;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF53634a() {
        return this.f58217a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Clause getF() {
        return this.f;
    }

    public final List e() {
        return this.f58226p;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultibarStoriesModel)) {
            return false;
        }
        MultibarStoriesModel multibarStoriesModel = (MultibarStoriesModel) obj2;
        return Intrinsics.f(this.f58217a, multibarStoriesModel.f58217a) && Intrinsics.f(this.f58218b, multibarStoriesModel.f58218b) && Intrinsics.f(this.f58219c, multibarStoriesModel.f58219c) && Intrinsics.f(this.d, multibarStoriesModel.d) && Intrinsics.f(this.e, multibarStoriesModel.e) && Intrinsics.f(this.f, multibarStoriesModel.f) && Intrinsics.f(this.f58220g, multibarStoriesModel.f58220g) && Intrinsics.f(this.f58221h, multibarStoriesModel.f58221h) && Intrinsics.f(this.i, multibarStoriesModel.i) && Intrinsics.f(this.f58222j, multibarStoriesModel.f58222j) && Intrinsics.f(this.k, multibarStoriesModel.k) && Intrinsics.f(this.f58223l, multibarStoriesModel.f58223l) && Intrinsics.f(this.f58224m, multibarStoriesModel.f58224m) && Intrinsics.f(this.f58225n, multibarStoriesModel.f58225n) && this.o == multibarStoriesModel.o && Intrinsics.f(this.f58226p, multibarStoriesModel.f58226p) && Intrinsics.f(this.f58227q, multibarStoriesModel.f58227q) && Intrinsics.f(this.f58228r, multibarStoriesModel.f58228r) && Intrinsics.f(this.f58229s, multibarStoriesModel.f58229s) && Intrinsics.f(this.f58230t, multibarStoriesModel.f58230t);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Parcelable getF58222j() {
        return this.f58222j;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Image getF58221h() {
        return this.f58221h;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getE() {
        return this.f58230t;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: getBackground, reason: from getter */
    public final c0 getF58214g() {
        return this.f58219c;
    }

    public final int hashCode() {
        int iHashCode = this.f58217a.hashCode() * 31;
        StoryPage.WithMultiBarChart withMultiBarChart = this.f58218b;
        int iHashCode2 = (this.f58219c.hashCode() + ((iHashCode + (withMultiBarChart == null ? 0 : withMultiBarChart.hashCode())) * 31)) * 31;
        Clause clause = this.d;
        int iA = p.a.a((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
        Clause clause2 = this.f;
        int iD = b.d(this.f58220g, (iA + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        Image image = this.f58221h;
        int iHashCode3 = (iD + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause3 = this.i;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Parcelable parcelable = this.f58222j;
        int iD2 = b.d(this.k, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
        Image image2 = this.f58223l;
        int iHashCode5 = (iD2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Clause clause4 = this.f58224m;
        int iHashCode6 = (iHashCode5 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Parcelable parcelable2 = this.f58225n;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f58226p, (this.o.hashCode() + ((iHashCode6 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31)) * 31, 31);
        d0 d0Var = this.f58227q;
        int iHashCode7 = (iB + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        String str = this.f58228r;
        int iHashCode8 = (this.f58229s.hashCode() + ((iHashCode7 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Parcelable parcelable3 = this.f58230t;
        return iHashCode8 + (parcelable3 != null ? parcelable3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final LargeActionButton.ButtonStyle getF58220g() {
        return this.f58220g;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Clause getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final e getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getF58228r() {
        return this.f58228r;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Parcelable getF58225n() {
        return this.f58225n;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final Clause getF58215h() {
        return this.d;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Image getF58223l() {
        return this.f58223l;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final LargeActionButton.ButtonStyle getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Clause getF58224m() {
        return this.f58224m;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final d0 getF58227q() {
        return this.f58227q;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f58230t = parcelable;
    }
}
