package m9;

import d9.p;
import k9.l;
import p9.h0;
import x9.o;

/* JADX INFO: loaded from: classes16.dex */
public abstract class i extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f203600h = l.b();
    public static final long i = (((l.AUTO_DETECT_FIELDS.d() | l.AUTO_DETECT_GETTERS.d()) | l.AUTO_DETECT_IS_GETTERS.d()) | l.AUTO_DETECT_SETTERS.d()) | l.AUTO_DETECT_CREATORS.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f203601c;
    public final s9.g d;
    public final i2b.a e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cnm.c f203602g;

    public i(a aVar, s9.g gVar, h0 h0Var, o oVar, cnm.c cVar) {
        super(aVar, f203600h);
        this.f203601c = h0Var;
        this.d = gVar;
        this.f = oVar;
        this.e = g.f203595c;
        this.f203602g = cVar;
    }

    @Override // p9.u
    public final Class a(Class cls) {
        this.f203601c.getClass();
        return null;
    }

    @Override // m9.h
    public final f f(Class cls) {
        this.f203602g.getClass();
        return f.f203594a;
    }

    @Override // m9.h
    public final p h(Class cls) {
        this.f203602g.getClass();
        return p.f112313h;
    }

    public abstract i k(long j2);

    public final i l(l... lVarArr) {
        long j2 = this.f203598a;
        long j3 = j2;
        for (l lVar : lVarArr) {
            j3 &= ~lVar.d();
        }
        return j3 == j2 ? this : k(j3);
    }

    public i(i iVar, long j2) {
        super(iVar, j2);
        this.f203601c = iVar.f203601c;
        this.d = iVar.d;
        this.f = iVar.f;
        this.e = iVar.e;
        this.f203602g = iVar.f203602g;
    }
}
