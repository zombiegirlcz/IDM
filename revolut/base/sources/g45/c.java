package g45;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x35.b f140338a;

    public c(x35.b account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f140338a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f140338a, ((c) obj2).f140338a);
    }

    public final int hashCode() {
        return this.f140338a.hashCode();
    }
}
