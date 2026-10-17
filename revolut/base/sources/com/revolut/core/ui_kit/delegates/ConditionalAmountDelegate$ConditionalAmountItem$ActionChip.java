package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/core/ui_kit/delegates/ConditionalAmountDelegate$ConditionalAmountItem$ActionChip", "Lcom/revolut/core/ui_kit/delegates/ConditionalAmountDelegate$ConditionalAmountItem$Clickable;", "", "toString", "()Ljava/lang/String;", "ip0/gc", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConditionalAmountDelegate$ConditionalAmountItem$ActionChip implements ConditionalAmountDelegate$ConditionalAmountItem$Clickable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f52118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f52119c;
    public final ip0.gc d;
    public Parcelable e;
    public final Object f;

    public ConditionalAmountDelegate$ConditionalAmountItem$ActionChip(String listId, Image image, Clause label, ip0.gc state, dx4.l lVar, int i) {
        image = (i & 2) != 0 ? null : image;
        state = (i & 8) != 0 ? ip0.gc.ACTIVE : state;
        lVar = (i & 32) != 0 ? null : lVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f52117a = listId;
        this.f52118b = image;
        this.f52119c = label;
        this.d = state;
        this.e = null;
        this.f = lVar;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getF() {
        return this.f;
    }

    @Override // ip0.jc
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF52117a() {
        return this.f52117a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConditionalAmountDelegate$ConditionalAmountItem$ActionChip)) {
            return false;
        }
        ConditionalAmountDelegate$ConditionalAmountItem$ActionChip conditionalAmountDelegate$ConditionalAmountItem$ActionChip = (ConditionalAmountDelegate$ConditionalAmountItem$ActionChip) obj2;
        return Intrinsics.f(this.f52117a, conditionalAmountDelegate$ConditionalAmountItem$ActionChip.f52117a) && Intrinsics.f(this.f52118b, conditionalAmountDelegate$ConditionalAmountItem$ActionChip.f52118b) && Intrinsics.f(this.f52119c, conditionalAmountDelegate$ConditionalAmountItem$ActionChip.f52119c) && this.d == conditionalAmountDelegate$ConditionalAmountItem$ActionChip.d && Intrinsics.f(this.e, conditionalAmountDelegate$ConditionalAmountItem$ActionChip.e) && Intrinsics.f(this.f, conditionalAmountDelegate$ConditionalAmountItem$ActionChip.f);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getE() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.f52117a.hashCode() * 31;
        Image image = this.f52118b;
        int iHashCode2 = (this.d.hashCode() + p.a.a((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f52119c)) * 31;
        Parcelable parcelable = this.e;
        int iHashCode3 = (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Object obj2 = this.f;
        return iHashCode3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.e = parcelable;
    }
}
