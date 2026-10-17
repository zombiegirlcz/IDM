package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f54612c;

    public ph(TextLocalisedClause label, Clause value, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f54610a = label;
        this.f54611b = value;
        this.f54612c = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj2;
        return this.f54610a.equals(phVar.f54610a) && this.f54611b.equals(phVar.f54611b) && Intrinsics.f(this.f54612c, phVar.f54612c);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f54610a.hashCode() * 31, 31, this.f54611b);
        Image image = this.f54612c;
        return iB + (image == null ? 0 : image.hashCode());
    }
}
