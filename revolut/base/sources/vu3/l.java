package vu3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f292229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f292231c;

    public l(n type, String url2, ArrayList badges) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.f292229a = type;
        this.f292230b = url2;
        this.f292231c = badges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f292229a == lVar.f292229a && Intrinsics.f(this.f292230b, lVar.f292230b) && this.f292231c.equals(lVar.f292231c);
    }

    public final int hashCode() {
        return this.f292231c.hashCode() + p.a.c(this.f292229a.hashCode() * 31, 31, this.f292230b);
    }
}
