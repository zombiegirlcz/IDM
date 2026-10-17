package a5k;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ skm.l f1476c;

    public /* synthetic */ p(t tVar, skm.l lVar, int i) {
        this.f1474a = i;
        this.f1475b = tVar;
        this.f1476c = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1474a) {
            case 0:
                t.Z2(this.f1475b, this.f1476c, d.f1441a);
                break;
            case 1:
                t.Z2(this.f1475b, this.f1476c, e.f1443a);
                break;
            default:
                t.Z2(this.f1475b, this.f1476c, e.f1443a);
                break;
        }
        return Unit.f186387a;
    }
}
