package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151888c;
    public final String d;

    public s(String name, String providerDescription, String iconUrl, String deeplink) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(providerDescription, "providerDescription");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f151886a = name;
        this.f151887b = providerDescription;
        this.f151888c = iconUrl;
        this.d = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f151886a, sVar.f151886a) && Intrinsics.f(this.f151887b, sVar.f151887b) && Intrinsics.f(this.f151888c, sVar.f151888c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f151886a.hashCode() * 31, 31, this.f151887b), 31, this.f151888c);
    }
}
