package ru9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.delegates.chat.e f257493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f257494b;

    public p(com.revolut.core.ui_kit.delegates.chat.e style, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f257493a = style;
        this.f257494b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f257493a.equals(pVar.f257493a) && this.f257494b == pVar.f257494b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257494b) + (this.f257493a.hashCode() * 31);
    }
}
