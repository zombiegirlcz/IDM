package ipa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f167701c;

    public i(String id10, String name, l priority) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f167699a = id10;
        this.f167700b = name;
        this.f167701c = priority;
    }

    public final String a() {
        return this.f167699a;
    }

    public final String b() {
        return this.f167700b;
    }

    public final l c() {
        return this.f167701c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f167699a, iVar.f167699a) && Intrinsics.f(this.f167700b, iVar.f167700b) && this.f167701c == iVar.f167701c;
    }

    public final int hashCode() {
        return this.f167701c.hashCode() + p.a.c(this.f167699a.hashCode() * 31, 961, this.f167700b);
    }

    public /* synthetic */ i(String str, String str2, l lVar, int i) {
        this(str, str2, lVar);
    }
}
