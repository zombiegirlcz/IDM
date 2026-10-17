package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p5 implements q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5 f54576a;

    public p5(o5 interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        this.f54576a = interaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p5) && Intrinsics.f(this.f54576a, ((p5) obj2).f54576a);
    }

    public final int hashCode() {
        return this.f54576a.hashCode();
    }
}
