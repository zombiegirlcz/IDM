package mza;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210734c;

    public e(String str, String label, String deeplink) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f210732a = str;
        this.f210733b = label;
        this.f210734c = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f210732a, eVar.f210732a) && Intrinsics.f(this.f210733b, eVar.f210733b) && Intrinsics.f(this.f210734c, eVar.f210734c);
    }

    public final int hashCode() {
        String str = this.f210732a;
        return this.f210734c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f210733b);
    }
}
