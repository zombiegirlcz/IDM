package h45;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x35.b f149317a;

    public h(x35.b account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f149317a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f149317a, ((h) obj2).f149317a);
    }

    public final int hashCode() {
        return this.f149317a.hashCode();
    }
}
