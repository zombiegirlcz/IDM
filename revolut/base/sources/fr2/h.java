package fr2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f137388c;

    public h(String title, Long l2, String progress) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f137386a = title;
        this.f137387b = progress;
        this.f137388c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f137386a, hVar.f137386a) && Intrinsics.f(this.f137387b, hVar.f137387b) && Intrinsics.f(this.f137388c, hVar.f137388c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f137386a.hashCode() * 31, 31, this.f137387b);
        Long l2 = this.f137388c;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
