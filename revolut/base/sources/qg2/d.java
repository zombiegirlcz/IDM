package qg2;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245640a;

    public d(String merchantName) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f245640a = merchantName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f245640a, ((d) obj2).f245640a);
    }

    public final int hashCode() {
        return this.f245640a.hashCode();
    }
}
