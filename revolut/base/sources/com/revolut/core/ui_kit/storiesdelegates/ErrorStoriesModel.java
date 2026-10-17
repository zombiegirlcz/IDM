package com.revolut.core.ui_kit.storiesdelegates;

import android.os.Parcelable;
import bx0.a0;
import bx0.c0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/ErrorStoriesModel;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ErrorStoriesModel implements BaseStoriesModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f58193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f58194c;
    public final TextLocalisedClause d;
    public final StoryColours e;
    public Parcelable f;

    public ErrorStoriesModel(TextLocalisedClause errorTitle, TextLocalisedClause actionButtonTitle) {
        a0 background = new a0();
        StoryColours.INSTANCE.getClass();
        StoryColours storyColours = StoryColours.f58276l;
        Intrinsics.checkNotNullParameter("error", "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        Intrinsics.checkNotNullParameter(actionButtonTitle, "actionButtonTitle");
        Intrinsics.checkNotNullParameter(storyColours, "storyColours");
        this.f58192a = "error";
        this.f58193b = background;
        this.f58194c = errorTitle;
        this.d = actionButtonTitle;
        this.e = storyColours;
        this.f = null;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final StoryColours getI() {
        return this.e;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55221j() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF55217b() {
        return this.f58192a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ErrorStoriesModel)) {
            return false;
        }
        ErrorStoriesModel errorStoriesModel = (ErrorStoriesModel) obj2;
        return Intrinsics.f(this.f58192a, errorStoriesModel.f58192a) && Intrinsics.f(this.f58193b, errorStoriesModel.f58193b) && Intrinsics.f(this.f58194c, errorStoriesModel.f58194c) && Intrinsics.f(this.d, errorStoriesModel.d) && Intrinsics.f(this.e, errorStoriesModel.e) && Intrinsics.f(this.f, errorStoriesModel.f);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getK() {
        return this.f;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: getBackground */
    public final c0 getF58214g() {
        return this.f58193b;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + t61.a.a(t61.a.a((this.f58193b.hashCode() + (this.f58192a.hashCode() * 31)) * 29791, 31, this.f58194c), 31, this.d)) * 31;
        Parcelable parcelable = this.f;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: n1 */
    public final Clause getF58215h() {
        return null;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f = parcelable;
    }
}
