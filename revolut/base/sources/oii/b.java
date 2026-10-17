package oii;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import os2.g;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f225690b;

    public /* synthetic */ b(g gVar, int i) {
        this.f225689a = i;
        this.f225690b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f225689a) {
            case 0:
                g gVar = this.f225690b;
                ((pki.a) gVar.f229224b).e0(gVar);
                break;
            default:
                g gVar2 = this.f225690b;
                ((pki.a) gVar2.f229224b).e0(gVar2);
                break;
        }
        return Unit.f186387a;
    }
}
