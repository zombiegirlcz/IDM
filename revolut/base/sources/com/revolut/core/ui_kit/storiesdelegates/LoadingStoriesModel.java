package com.revolut.core.ui_kit.storiesdelegates;

import android.os.Parcelable;
import bx0.a0;
import bx0.c0;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/LoadingStoriesModel;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoadingStoriesModel implements BaseStoriesModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f58209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StoryColours f58210c;
    public Parcelable d;

    public LoadingStoriesModel(String listId) {
        a0 background = new a0();
        StoryColours.INSTANCE.getClass();
        StoryColours storyColours = StoryColours.f58276l;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(storyColours, "storyColours");
        this.f58208a = listId;
        this.f58209b = background;
        this.f58210c = storyColours;
        this.d = null;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final StoryColours getF58210c() {
        return this.f58210c;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF58208a() {
        return this.f58208a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoadingStoriesModel)) {
            return false;
        }
        LoadingStoriesModel loadingStoriesModel = (LoadingStoriesModel) obj2;
        return Intrinsics.f(this.f58208a, loadingStoriesModel.f58208a) && Intrinsics.f(this.f58209b, loadingStoriesModel.f58209b) && Intrinsics.f(this.f58210c, loadingStoriesModel.f58210c) && Intrinsics.f(this.d, loadingStoriesModel.d);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getD() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: getBackground */
    public final c0 getF58246c() {
        return this.f58209b;
    }

    public final int hashCode() {
        int iHashCode = (this.f58210c.hashCode() + ((this.f58209b.hashCode() + (this.f58208a.hashCode() * 31)) * 29791)) * 31;
        Parcelable parcelable = this.d;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: n1 */
    public final Clause getF58253p() {
        return null;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.d = parcelable;
    }
}
