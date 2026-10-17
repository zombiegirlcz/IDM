package com.revolut.core.ui_kit.delegates;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f55609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f55610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55611c;

    public y(Locale locale, xi0.b currency, int i) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f55609a = locale;
        this.f55610b = currency;
        this.f55611c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f55609a, yVar.f55609a) && Intrinsics.f(this.f55610b, yVar.f55610b) && this.f55611c == yVar.f55611c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55611c) + h30.l.j(this.f55610b, this.f55609a.hashCode() * 31, 31);
    }
}
