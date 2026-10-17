package xzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310008c;
    public final List d;
    public final d e;

    public l(String key, String title, String str, List collections, d fromCollection) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(fromCollection, "fromCollection");
        this.f310006a = key;
        this.f310007b = title;
        this.f310008c = str;
        this.d = collections;
        this.e = fromCollection;
    }

    @Override // xzg.k
    public final List a() {
        return this.d;
    }

    @Override // xzg.k
    public final String b() {
        return this.f310008c;
    }

    @Override // xzg.k
    public final d c() {
        return this.e;
    }

    @Override // xzg.k
    public final String d() {
        return this.f310006a;
    }

    @Override // xzg.k
    public final String e() {
        return this.f310007b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f310006a, lVar.f310006a) && Intrinsics.f(this.f310007b, lVar.f310007b) && Intrinsics.f(this.f310008c, lVar.f310008c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f310006a.hashCode() * 31, 31, this.f310007b);
        String str = this.f310008c;
        return this.e.hashCode() + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
