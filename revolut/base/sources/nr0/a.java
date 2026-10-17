package nr0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f218502b;

    public /* synthetic */ a(e eVar, int i) {
        this.f218501a = i;
        this.f218502b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f218501a) {
            case 0:
                h01.c cVar = (h01.c) obj2;
                Intrinsics.h(cVar);
                e eVar = this.f218502b;
                if (eVar.i != cVar) {
                    eVar.i = cVar;
                    if (eVar.f218515h > 0) {
                        eVar.d();
                    }
                }
                break;
            case 1:
                e eVar2 = this.f218502b;
                if (eVar2.k > 0) {
                    eVar2.d();
                }
                break;
            default:
                e eVar3 = this.f218502b;
                if (eVar3.f218518m > 0) {
                    eVar3.d();
                }
                break;
        }
        return Unit.f186387a;
    }
}
