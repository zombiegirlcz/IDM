package xzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310017c;
    public final List d;
    public final List e;
    public final d f;

    public n(String key, String title, String str, List instruments, List collections, d fromCollection) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(fromCollection, "fromCollection");
        this.f310015a = key;
        this.f310016b = title;
        this.f310017c = str;
        this.d = instruments;
        this.e = collections;
        this.f = fromCollection;
    }

    @Override // xzg.k
    public final List a() {
        return this.e;
    }

    @Override // xzg.k
    public final String b() {
        return this.f310017c;
    }

    @Override // xzg.k
    public final d c() {
        return this.f;
    }

    @Override // xzg.k
    public final String d() {
        return this.f310015a;
    }

    @Override // xzg.k
    public final String e() {
        return this.f310016b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f310015a, nVar.f310015a) && Intrinsics.f(this.f310016b, nVar.f310016b) && Intrinsics.f(this.f310017c, nVar.f310017c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f310015a.hashCode() * 31, 31, this.f310016b);
        String str = this.f310017c;
        return this.f.hashCode() + p.a.d(p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
