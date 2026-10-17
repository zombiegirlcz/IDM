package y0m;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1m.a f310230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f310231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f310232c;
    public g d;

    public final synchronized g a() {
        g gVarE;
        try {
            if (this.d == null && this.f310232c != null) {
                h hVar = this.f310231b;
                g gVarA = hVar != null ? hVar.a() : null;
                f1m.a aVar = this.f310230a;
                if (aVar != null) {
                    i iVar = this.f310232c;
                    Intrinsics.h(iVar);
                    gVarE = iVar.e(aVar, gVarA);
                } else {
                    gVarE = null;
                }
                this.d = gVarE;
                this.f310230a = null;
                this.f310231b = null;
                this.f310232c = null;
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.d;
    }
}
