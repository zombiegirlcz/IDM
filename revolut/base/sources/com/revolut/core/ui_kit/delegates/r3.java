package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTilesCollectionDelegate.Model f54656a;

    public r3(ChatTilesCollectionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f54656a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r3) && Intrinsics.f(this.f54656a, ((r3) obj2).f54656a);
    }

    public final int hashCode() {
        return this.f54656a.hashCode();
    }
}
