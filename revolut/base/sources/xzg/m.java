package xzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310011c;
    public final List d;
    public final List e;
    public final d f;

    public m(String key, String title, String str, List currencies, List collections, d fromCollection) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(fromCollection, "fromCollection");
        this.f310009a = key;
        this.f310010b = title;
        this.f310011c = str;
        this.d = currencies;
        this.e = collections;
        this.f = fromCollection;
    }

    @Override // xzg.k
    public final List a() {
        return this.e;
    }

    @Override // xzg.k
    public final String b() {
        return this.f310011c;
    }

    @Override // xzg.k
    public final d c() {
        return this.f;
    }

    @Override // xzg.k
    public final String d() {
        return this.f310009a;
    }

    @Override // xzg.k
    public final String e() {
        return this.f310010b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f310009a, mVar.f310009a) && Intrinsics.f(this.f310010b, mVar.f310010b) && Intrinsics.f(this.f310011c, mVar.f310011c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f310009a.hashCode() * 31, 31, this.f310010b);
        String str = this.f310011c;
        return this.f.hashCode() + p.a.d(p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
