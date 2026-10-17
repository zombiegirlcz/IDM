package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends ActionWidgetDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f54266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54267c;
    public final String d;

    public i(int i, Clause clause, ResourceImage resourceImage, boolean z) {
        resourceImage = (i & 2) != 0 ? null : resourceImage;
        z = (i & 4) != 0 ? true : z;
        String str = (i & 8) == 0 ? "slot-progress-todo-tile-primary-button-tag" : null;
        this.f54265a = clause;
        this.f54266b = resourceImage;
        this.f54267c = z;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f54265a, iVar.f54265a) && Intrinsics.f(this.f54266b, iVar.f54266b) && this.f54267c == iVar.f54267c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f54265a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Image image = this.f54266b;
        int iC = j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f54267c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
