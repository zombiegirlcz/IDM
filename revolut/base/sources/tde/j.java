package tde;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f269989c;

    public j(String title, String body, i iVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f269987a = title;
        this.f269988b = body;
        this.f269989c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f269987a, jVar.f269987a) && Intrinsics.f(this.f269988b, jVar.f269988b) && Intrinsics.f(this.f269989c, jVar.f269989c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f269987a.hashCode() * 31, 31, this.f269988b);
        i iVar = this.f269989c;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }
}
