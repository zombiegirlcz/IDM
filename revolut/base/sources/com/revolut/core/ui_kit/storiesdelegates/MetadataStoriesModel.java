package com.revolut.core.ui_kit.storiesdelegates;

import android.os.Parcelable;
import bx0.c0;
import bx0.k;
import bx0.l;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.stories.models.StoryPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/MetadataStoriesModel;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesModel;", "", "toString", "()Ljava/lang/String;", "bx0/l", "bx0/m", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MetadataStoriesModel implements BaseStoriesModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f58212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f58213c;
    public final Image d;
    public final ArrayList e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f58214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f58215h;
    public final StoryColours i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StoryPage.Metadata f58216j;
    public Parcelable k;

    public MetadataStoriesModel(String listId, Clause title, Clause clause, Image image, ArrayList items, k bottomConfig, c0 background, Clause clause2, StoryColours storyColours, StoryPage.Metadata metadata) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomConfig, "bottomConfig");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(storyColours, "storyColours");
        this.f58211a = listId;
        this.f58212b = title;
        this.f58213c = clause;
        this.d = image;
        this.e = items;
        this.f = bottomConfig;
        this.f58214g = background;
        this.f58215h = clause2;
        this.i = storyColours;
        this.f58216j = metadata;
        this.k = null;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Clause getF58212b() {
        return this.f58212b;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final StoryColours getF58243s() {
        return this.i;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.f58216j;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF52903a() {
        return this.f58211a;
    }

    public final l e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MetadataStoriesModel)) {
            return false;
        }
        MetadataStoriesModel metadataStoriesModel = (MetadataStoriesModel) obj2;
        return Intrinsics.f(this.f58211a, metadataStoriesModel.f58211a) && Intrinsics.f(this.f58212b, metadataStoriesModel.f58212b) && Intrinsics.f(this.f58213c, metadataStoriesModel.f58213c) && Intrinsics.f(this.d, metadataStoriesModel.d) && Intrinsics.f(this.e, metadataStoriesModel.e) && Intrinsics.f(this.f, metadataStoriesModel.f) && Intrinsics.f(this.f58214g, metadataStoriesModel.f58214g) && Intrinsics.f(this.f58215h, metadataStoriesModel.f58215h) && Intrinsics.f(this.i, metadataStoriesModel.i) && Intrinsics.f(this.f58216j, metadataStoriesModel.f58216j) && Intrinsics.f(this.k, metadataStoriesModel.k);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Clause getF58213c() {
        return this.f58213c;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Image getD() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getI() {
        return this.k;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: getBackground, reason: from getter */
    public final c0 getD() {
        return this.f58214g;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f58211a.hashCode() * 31, 31, this.f58212b);
        Clause clause = this.f58213c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.d;
        int iHashCode2 = (this.f58214g.hashCode() + p.a.a(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31), 31, this.f.f19424a)) * 31;
        Clause clause2 = this.f58215h;
        int iHashCode3 = (this.i.hashCode() + ((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31;
        StoryPage.Metadata metadata = this.f58216j;
        int iHashCode4 = (iHashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
        Parcelable parcelable = this.k;
        return iHashCode4 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final List i() {
        return this.e;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final Clause getF58241q() {
        return this.f58215h;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.k = parcelable;
    }
}
