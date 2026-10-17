package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends ActionWidgetDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f54312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54313c;

    public j(Clause clause, ResourceImage resourceImage, int i) {
        resourceImage = (i & 2) != 0 ? null : resourceImage;
        this.f54311a = clause;
        this.f54312b = resourceImage;
        this.f54313c = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f54311a, jVar.f54311a) && Intrinsics.f(this.f54312b, jVar.f54312b) && this.f54313c == jVar.f54313c;
    }

    public final int hashCode() {
        Clause clause = this.f54311a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Image image = this.f54312b;
        return j6.a.c((iHashCode + (image != null ? image.hashCode() : 0)) * 31, 31, this.f54313c);
    }
}
