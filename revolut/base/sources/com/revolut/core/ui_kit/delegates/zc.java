package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zc extends PromptContentDelegate.Model.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f55689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f55690b;

    public zc(ResourceImage image, List items) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f55689a = image;
        this.f55690b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zc)) {
            return false;
        }
        zc zcVar = (zc) obj2;
        return this.f55689a.equals(zcVar.f55689a) && Intrinsics.f(this.f55690b, zcVar.f55690b);
    }

    public final int hashCode() {
        return this.f55690b.hashCode() + (this.f55689a.hashCode() * 961);
    }
}
