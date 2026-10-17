package yt8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316676a;

    public m(String remainingTopUpString) {
        Intrinsics.checkNotNullParameter(remainingTopUpString, "remainingTopUpString");
        this.f316676a = remainingTopUpString;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f316676a, ((m) obj2).f316676a);
    }

    public final int hashCode() {
        return this.f316676a.hashCode();
    }
}
