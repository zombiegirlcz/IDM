package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/ui_kit/delegates/ConditionalAmountDelegate$ConditionalAmountItem$Toggle", "Lcom/revolut/core/ui_kit/delegates/ConditionalAmountDelegate$ConditionalAmountItem$Clickable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConditionalAmountDelegate$ConditionalAmountItem$Toggle implements ConditionalAmountDelegate$ConditionalAmountItem$Clickable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f52121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f52122c;
    public final boolean d;
    public Parcelable e;
    public final Object f;

    public ConditionalAmountDelegate$ConditionalAmountItem$Toggle(String listId, TextLocalisedClause text, ResourceImage resourceImage, boolean z, dx4.l lVar, int i) {
        z = (i & 8) != 0 ? true : z;
        lVar = (i & 32) != 0 ? null : lVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f52120a = listId;
        this.f52121b = text;
        this.f52122c = resourceImage;
        this.d = z;
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
    public final String getF52120a() {
        return this.f52120a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConditionalAmountDelegate$ConditionalAmountItem$Toggle)) {
            return false;
        }
        ConditionalAmountDelegate$ConditionalAmountItem$Toggle conditionalAmountDelegate$ConditionalAmountItem$Toggle = (ConditionalAmountDelegate$ConditionalAmountItem$Toggle) obj2;
        return Intrinsics.f(this.f52120a, conditionalAmountDelegate$ConditionalAmountItem$Toggle.f52120a) && this.f52121b.equals(conditionalAmountDelegate$ConditionalAmountItem$Toggle.f52121b) && Intrinsics.f(this.f52122c, conditionalAmountDelegate$ConditionalAmountItem$Toggle.f52122c) && this.d == conditionalAmountDelegate$ConditionalAmountItem$Toggle.d && Intrinsics.f(this.e, conditionalAmountDelegate$ConditionalAmountItem$Toggle.e) && Intrinsics.f(this.f, conditionalAmountDelegate$ConditionalAmountItem$Toggle.f);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getE() {
        return this.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f52120a.hashCode() * 31, 31, this.f52121b);
        Image image = this.f52122c;
        int iC = j6.a.c((iA + (image == null ? 0 : image.hashCode())) * 31, 31, this.d);
        Parcelable parcelable = this.e;
        int iHashCode = (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Object obj2 = this.f;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.e = parcelable;
    }
}
