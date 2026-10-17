package ru;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257355a;

    public b0(List accounts) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f257355a = accounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f257355a, ((b0) obj2).f257355a);
    }

    public final int hashCode() {
        return this.f257355a.hashCode();
    }
}
