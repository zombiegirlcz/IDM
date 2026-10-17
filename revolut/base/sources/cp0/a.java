package cp0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f107754b;

    public /* synthetic */ a(b bVar, int i) {
        this.f107753a = i;
        this.f107754b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f107753a) {
            case 0:
                b bVar = this.f107754b;
                if (!Boolean.valueOf(bVar.f107762m).equals((Boolean) obj2)) {
                    bVar.b(bVar.f107755a, bVar.a());
                }
                break;
            case 1:
                b bVar2 = this.f107754b;
                if (bVar2.k) {
                    bVar2.b(bVar2.f107755a, bVar2.a());
                }
                break;
            default:
                h01.c cVar = (h01.c) obj2;
                Intrinsics.h(cVar);
                b bVar3 = this.f107754b;
                if (bVar3.i != cVar) {
                    bVar3.i = cVar;
                    if (bVar3.f) {
                        bVar3.b(bVar3.f107755a, bVar3.a());
                    }
                }
                bVar3.g();
                break;
        }
        return Unit.f186387a;
    }
}
