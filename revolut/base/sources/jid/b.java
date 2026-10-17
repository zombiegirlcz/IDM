package jid;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174428a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f174429b;

    public /* synthetic */ b(d dVar) {
        this.f174429b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f174428a) {
            case 0:
                d dVar = this.f174429b;
                jch.p pVar = new jch.p(dVar, 19);
                mid.l lVar = new mid.l(12);
                jhi.a aVar = new jhi.a(22);
                return new lk0.d(pVar, new b(dVar), new jeg.g(dVar, 20), lVar, aVar, new jhi.a(21), yk0.d.a());
            default:
                lk0.g gVar = (lk0.g) this.f174429b.f174431b.f();
                if (gVar != null) {
                    rfm.u uVarG = efm.k.g(gVar);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
        }
    }

    public /* synthetic */ b(d dVar, yk0.d dVar2) {
        this.f174429b = dVar;
    }
}
