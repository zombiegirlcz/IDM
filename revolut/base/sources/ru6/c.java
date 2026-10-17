package ru6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr6.o f257448a;

    public c(nr6.o initiationPage) {
        Intrinsics.checkNotNullParameter(initiationPage, "initiationPage");
        this.f257448a = initiationPage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f257448a, ((c) obj2).f257448a);
    }

    public final int hashCode() {
        return this.f257448a.hashCode();
    }
}
