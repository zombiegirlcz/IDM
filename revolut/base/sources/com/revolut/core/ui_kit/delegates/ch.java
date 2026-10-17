package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmartTileSendMoneyDelegate.Model f53759b;

    public ch(String text, SmartTileSendMoneyDelegate.Model model) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f53758a = text;
        this.f53759b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj2;
        return Intrinsics.f(this.f53758a, chVar.f53758a) && Intrinsics.f(this.f53759b, chVar.f53759b);
    }

    public final int hashCode() {
        return this.f53759b.hashCode() + (this.f53758a.hashCode() * 31);
    }
}
