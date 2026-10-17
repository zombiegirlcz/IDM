package ry3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import whf.p;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f258208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f258210c;

    public b(List documents, List accounts, p pVar) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f258208a = documents;
        this.f258209b = accounts;
        this.f258210c = pVar;
    }

    public final boolean a() {
        if (!this.f258208a.isEmpty() || !this.f258209b.isEmpty()) {
            return true;
        }
        p pVar = this.f258210c;
        List list = pVar != null ? pVar.f297646a : null;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f258208a, bVar.f258208a) && Intrinsics.f(this.f258209b, bVar.f258209b) && Intrinsics.f(this.f258210c, bVar.f258210c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f258208a.hashCode() * 31, 31, this.f258209b);
        p pVar = this.f258210c;
        return iD + (pVar == null ? 0 : pVar.hashCode());
    }
}
