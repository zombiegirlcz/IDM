package com.revolut.core.ui_kit.models;

import android.os.Parcelable;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/models/AppTipUIModel;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "aw0/t", "aw0/u", "aw0/v", "aw0/m", "aw0/p", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppTipUIModel implements TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.u f57726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f57727c;
    public final Object d;
    public final aw0.t e;
    public final aw0.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aw0.m f57728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57729h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Parcelable f57730j;

    public AppTipUIModel(String id10, aw0.u uVar, Clause title, Clause subtitle, aw0.t tVar, aw0.p pVar, aw0.m appearance, Object obj2, int i) {
        uVar = (i & 2) != 0 ? null : uVar;
        pVar = (i & 32) != 0 ? null : pVar;
        appearance = (i & 64) != 0 ? aw0.m.DEFAULT : appearance;
        boolean z = (i & 128) == 0;
        obj2 = (i & 256) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this.f57725a = id10;
        this.f57726b = uVar;
        this.f57727c = title;
        this.d = subtitle;
        this.e = tVar;
        this.f = pVar;
        this.f57728g = appearance;
        this.f57729h = z;
        this.i = obj2;
        this.f57730j = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final Clause G() {
        return this.f57727c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AppTipUIModel)) {
            return false;
        }
        AppTipUIModel appTipUIModel = (AppTipUIModel) obj2;
        return Intrinsics.f(this.f57725a, appTipUIModel.f57725a) && Intrinsics.f(this.f57726b, appTipUIModel.f57726b) && Intrinsics.f(this.f57727c, appTipUIModel.f57727c) && Intrinsics.f(this.d, appTipUIModel.d) && Intrinsics.f(this.e, appTipUIModel.e) && Intrinsics.f(this.f, appTipUIModel.f) && this.f57728g == appTipUIModel.f57728g && this.f57729h == appTipUIModel.f57729h && Intrinsics.f(this.i, appTipUIModel.i) && Intrinsics.f(this.f57730j, appTipUIModel.f57730j);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF57730j() {
        return this.f57730j;
    }

    public final int hashCode() {
        int iHashCode = this.f57725a.hashCode() * 31;
        aw0.u uVar = this.f57726b;
        int iB = p.a.b(p.a.b((iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31, 31, this.f57727c), 31, this.d);
        aw0.t tVar = this.e;
        int iHashCode2 = (iB + (tVar == null ? 0 : tVar.hashCode())) * 31;
        aw0.p pVar = this.f;
        int iC = j6.a.c((this.f57728g.hashCode() + ((iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31)) * 31, 31, this.f57729h);
        Object obj2 = this.i;
        int iHashCode3 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Parcelable parcelable = this.f57730j;
        return iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f57730j = parcelable;
    }
}
