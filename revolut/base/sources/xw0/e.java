package xw0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f309311b;

    public /* synthetic */ e(f fVar, int i) {
        this.f309310a = i;
        this.f309311b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f309310a) {
            case 0:
                f fVar = this.f309311b;
                boolean z = fVar.f309313b;
                if (z) {
                    fVar.f309313b = false;
                    d dVar = fVar.d;
                    if (dVar != null) {
                        dVar.c();
                        dVar.f309309j = null;
                        dVar.k = null;
                    }
                    fVar.d = null;
                }
                if (z) {
                    fVar.a();
                }
                return Unit.f186387a;
            default:
                ihm.f fVar2 = this.f309311b.e;
                Unit unit = Unit.f186387a;
                fVar2.onNext(unit);
                return unit;
        }
    }
}
