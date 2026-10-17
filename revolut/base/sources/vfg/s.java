package vfg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rfm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288637a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f288638b;

    public /* synthetic */ s(t tVar) {
        this.f288638b = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f288637a) {
            case 0:
                lk0.g gVar = (lk0.g) this.f288638b.f288641c.f();
                if (gVar != null) {
                    u uVarG = efm.k.g(gVar);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            default:
                t tVar = this.f288638b;
                v48.d dVar = new v48.d(tVar, 24);
                gfg.c.Companion.getClass();
                vf0.p pVar = new vf0.p(20);
                vdl.a aVar = new vdl.a(tVar, 19);
                wfm.j jVarA = yk0.d.a();
                return new lk0.d(dVar, new s(tVar), aVar, gfg.a.f143405b, pVar, new vf0.p(19), jVarA);
        }
    }

    public /* synthetic */ s(t tVar, yk0.d dVar) {
        this.f288638b = tVar;
    }
}
