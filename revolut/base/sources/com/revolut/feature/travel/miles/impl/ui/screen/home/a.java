package com.revolut.feature.travel.miles.impl.ui.screen.home;

import com.revolut.feature.travel.miles.impl.ui.screen.home.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2f.d f94349a;

    public a(u2f.d airline) {
        Intrinsics.checkNotNullParameter(airline, "airline");
        this.f94349a = airline;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f94349a, ((a) obj2).f94349a);
    }

    public final int hashCode() {
        return this.f94349a.hashCode();
    }
}
