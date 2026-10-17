package wf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f296876c;

    public d0(String query, Integer num, String lang) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(lang, "lang");
        this.f296874a = query;
        this.f296875b = lang;
        this.f296876c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f296874a, d0Var.f296874a) && Intrinsics.f(this.f296875b, d0Var.f296875b) && Intrinsics.f(this.f296876c, d0Var.f296876c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f296874a.hashCode() * 31, 31, this.f296875b);
        Integer num = this.f296876c;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
