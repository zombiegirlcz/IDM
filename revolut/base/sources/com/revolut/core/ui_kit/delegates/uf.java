package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;

/* JADX INFO: loaded from: classes19.dex */
public final class uf extends RowDelegate.Model.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f54833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f54834b;

    public uf(ResourceImage resourceImage, ResourceImage resourceImage2) {
        this.f54833a = resourceImage;
        this.f54834b = resourceImage2;
    }

    public final Image a() {
        return this.f54833a;
    }

    public final Image b() {
        return this.f54834b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj2;
        return this.f54833a.equals(ufVar.f54833a) && this.f54834b.equals(ufVar.f54834b);
    }

    public final int hashCode() {
        return this.f54834b.hashCode() + (this.f54833a.hashCode() * 31);
    }
}
