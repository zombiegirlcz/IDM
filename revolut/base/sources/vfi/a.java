package vfi;

import dgi.c;
import kotlin.jvm.internal.Intrinsics;
import lk0.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f288659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288660b;

    public a(c searchParams, String str) {
        Intrinsics.checkNotNullParameter(searchParams, "searchParams");
        this.f288659a = searchParams;
        this.f288660b = str;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        return 50;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f288659a, aVar.f288659a) && Intrinsics.f(this.f288660b, aVar.f288660b);
    }

    public final int hashCode() {
        int iB = j6.a.b(50, this.f288659a.hashCode() * 31, 31);
        String str = this.f288660b;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
