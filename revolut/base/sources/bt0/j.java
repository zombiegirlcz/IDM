package bt0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f18237b;

    public /* synthetic */ j(q qVar, int i) {
        this.f18236a = i;
        this.f18237b = qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f18236a;
        int iIntValue = ((Integer) obj2).intValue();
        ((Float) obj3).floatValue();
        switch (i) {
            case 0:
                q qVar = this.f18237b;
                qVar.g(iIntValue);
                dgm.e eVar = qVar.f56724a;
                if (eVar != null) {
                    eVar.onNext(new i(iIntValue));
                }
                break;
            default:
                q qVar2 = this.f18237b;
                qVar2.g(iIntValue);
                dgm.e eVar2 = qVar2.f56724a;
                if (eVar2 != null) {
                    eVar2.onNext(new i(iIntValue));
                }
                break;
        }
        return Unit.f186387a;
    }
}
