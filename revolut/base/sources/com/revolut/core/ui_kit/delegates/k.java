package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends ActionWidgetDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f54355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f54356c;
    public final Image d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f54357g;

    public k(Clause clause, Clause clause2, ResourceImage resourceImage, ResourceImage resourceImage2, int i) {
        resourceImage = (i & 4) != 0 ? null : resourceImage;
        resourceImage2 = (i & 8) != 0 ? null : resourceImage2;
        boolean z = (i & 16) == 0;
        String str = (i & 64) != 0 ? null : "slot-progress-todo-tile-primary-button-tag";
        String str2 = (i & 128) == 0 ? "slot-progress-todo-tile-secondary-button-tag" : null;
        this.f54354a = clause;
        this.f54355b = clause2;
        this.f54356c = resourceImage;
        this.d = resourceImage2;
        this.e = z;
        this.f = str;
        this.f54357g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f54354a, kVar.f54354a) && Intrinsics.f(this.f54355b, kVar.f54355b) && Intrinsics.f(this.f54356c, kVar.f54356c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f54357g, kVar.f54357g);
    }

    public final int hashCode() {
        Clause clause = this.f54354a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f54355b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f54356c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.d;
        int iC = j6.a.c(j6.a.c((iHashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.e), 31, true);
        String str = this.f;
        int iHashCode4 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54357g;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
