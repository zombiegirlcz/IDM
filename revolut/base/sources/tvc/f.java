package tvc;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f274748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f274749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f274750c;
    public final Object d;
    public final Clause e;

    public f(m header, List items, boolean z, Clause mainButtonText, Clause clause) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(mainButtonText, "mainButtonText");
        this.f274748a = header;
        this.f274749b = items;
        this.f274750c = z;
        this.d = mainButtonText;
        this.e = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f274749b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f274748a.equals(fVar.f274748a) && Intrinsics.f(this.f274749b, fVar.f274749b) && this.f274750c == fVar.f274750c && this.d.equals(fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iB = p.a.b(j6.a.c(p.a.d(this.f274748a.hashCode() * 31, 31, this.f274749b), 31, this.f274750c), 31, this.d);
        Clause clause = this.e;
        return iB + (clause == null ? 0 : clause.hashCode());
    }
}
