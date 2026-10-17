package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ad extends PromptContentDelegate.Model.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Media f53677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53678b;

    public ad(Media media, boolean z) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f53677a = media;
        this.f53678b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj2;
        return Intrinsics.f(this.f53677a, adVar.f53677a) && this.f53678b == adVar.f53678b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53678b) + (this.f53677a.hashCode() * 31);
    }
}
