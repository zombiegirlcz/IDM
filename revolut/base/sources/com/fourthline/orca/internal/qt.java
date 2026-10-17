package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qt implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ot f32532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32534c;

    private qt(ot otVar, e4m.e eVar, e4m.e eVar2) {
        this.f32532a = otVar;
        this.f32533b = eVar;
        this.f32534c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vt get() {
        return a(this.f32532a, (mb.d) this.f32533b.get(), (us) this.f32534c.get());
    }

    public static qt a(ot otVar, e4m.e eVar, e4m.e eVar2) {
        return new qt(otVar, eVar, eVar2);
    }

    public static vt a(ot otVar, mb.d dVar, us usVar) {
        vt vtVarA = otVar.a(dVar, usVar);
        vc.s.k(vtVarA);
        return vtVarA;
    }
}
