package nnk;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f217712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217713b;

    public c(Data terms, boolean z) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f217712a = terms;
        this.f217713b = z;
    }

    public static c a(c cVar, Data terms, int i) {
        if ((i & 1) != 0) {
            terms = cVar.f217712a;
        }
        boolean z = (i & 2) != 0 ? cVar.f217713b : true;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(terms, "terms");
        return new c(terms, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f217712a, cVar.f217712a) && this.f217713b == cVar.f217713b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217713b) + (this.f217712a.hashCode() * 31);
    }
}
