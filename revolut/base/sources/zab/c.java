package zab;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f320598b;

    public /* synthetic */ c(d dVar, int i) {
        this.f320597a = i;
        this.f320598b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f320597a) {
            case 0:
                d dVar = this.f320598b;
                dVar.f320603h.onNext(new Data(Boolean.TRUE, null, false, 2, null));
                ihm.j jVar = dVar.i;
                Unit unit = Unit.f186387a;
                jVar.onNext(unit);
                return unit;
            case 1:
                d dVar2 = this.f320598b;
                dVar2.f.onNext(new Data(Boolean.TRUE, null, false, 2, null));
                ihm.j jVar2 = dVar2.i;
                Unit unit2 = Unit.f186387a;
                jVar2.onNext(unit2);
                return unit2;
            default:
                d dVar3 = this.f320598b;
                dVar3.f320602g.onNext(new Data(Boolean.TRUE, null, false, 2, null));
                ihm.j jVar3 = dVar3.i;
                Unit unit3 = Unit.f186387a;
                jVar3.onNext(unit3);
                return unit3;
        }
    }
}
