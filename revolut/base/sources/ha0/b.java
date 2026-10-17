package ha0;

import eim.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f150346b;

    public /* synthetic */ b(c cVar, int i) {
        this.f150345a = i;
        this.f150346b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f150345a;
        c cVar = this.f150346b;
        switch (i) {
            case 0:
                m.Companion companion = m.INSTANCE;
                Unit unit = Unit.f186387a;
                cVar.resumeWith(unit);
                return unit;
            default:
                m.Companion companion2 = m.INSTANCE;
                Unit unit2 = Unit.f186387a;
                cVar.resumeWith(unit2);
                return unit2;
        }
    }
}
