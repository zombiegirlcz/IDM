package zb;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r implements wb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f320794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f320795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb.c f320796c;
    public final wb.g d;
    public final s e;

    public r(j jVar, String str, wb.c cVar, wb.g gVar, s sVar) {
        this.f320794a = jVar;
        this.f320795b = str;
        this.f320796c = cVar;
        this.d = gVar;
        this.e = sVar;
    }

    public final void a(wb.d dVar, wb.j jVar) {
        if (dVar == null) {
            throw new NullPointerException("Null event");
        }
        String str = this.f320795b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        wb.g gVar = this.d;
        if (gVar == null) {
            throw new NullPointerException("Null transformer");
        }
        s sVar = this.e;
        ec.d dVar2 = sVar.f320799c;
        wb.a aVar = (wb.a) dVar;
        wb.f fVar = aVar.f295986c;
        j jVarB = this.f320794a.b(aVar.f295985b);
        h hVar = new h();
        hVar.f = new HashMap();
        hVar.d = Long.valueOf(sVar.f320797a.b());
        hVar.e = Long.valueOf(sVar.f320798b.b());
        hVar.f320768a = str;
        hVar.f320770c = new m(this.f320796c, (byte[]) gVar.apply(aVar.f295984a));
        hVar.f320769b = null;
        if (fVar != null && fVar.a() != null) {
            hVar.f320771g = fVar.a();
        }
        ec.b bVar = (ec.b) dVar2;
        bVar.f124395b.execute(new ec.a(bVar, jVarB, jVar, hVar.b(), 0));
    }

    public final void b(wb.d dVar) {
        a(dVar, new pd.h(22));
    }
}
