package cpi;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f107960b;

    public /* synthetic */ j(m mVar, int i) {
        this.f107959a = i;
        this.f107960b = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f107959a) {
            case 0:
                return (lte.c) this.f107960b.a().f168370h.get();
            case 1:
                return this.f107960b.a().b();
            case 2:
                phm.a aVar = (phm.a) j6.a.i(this.f107960b.f107964a, poi.b.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return ((poi.b) aVar2.b()).f();
                }
                throw new IllegalStateException(a0.d.q("Api ", poi.b.class, " is not found"));
            case 3:
                m mVar = this.f107960b;
                mVar.getClass();
                return new yoi.b(new h(mVar, 2), new yoi.a());
            case 4:
                return new j(this.f107960b, 2);
            case 5:
                m mVar2 = this.f107960b;
                return new zoi.a(new j(mVar2, 0), new j(mVar2, 1));
            case 6:
                return new api.a(this.f107960b.f107964a);
            case 7:
                return new h(this.f107960b, 1);
            default:
                return new i(this.f107960b);
        }
    }
}
