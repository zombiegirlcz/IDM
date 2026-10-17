package j4e;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mp.p;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f171373b;

    public /* synthetic */ b(p pVar, int i) {
        this.f171372a = i;
        this.f171373b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f171372a) {
            case 0:
                ((a) this.f171373b.d).a(g4e.a.START);
                break;
            case 1:
                ((a) this.f171373b.d).a(g4e.a.COMPLETE);
                break;
            default:
                ((a) this.f171373b.d).a(g4e.a.ERROR);
                break;
        }
        return Unit.f186387a;
    }
}
