package msb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f208647b;

    public /* synthetic */ d(g gVar, int i) {
        this.f208646a = i;
        this.f208647b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ipa.j jVar = (ipa.j) obj2;
        switch (this.f208646a) {
            case 0:
                ihm.j jVar2 = this.f208647b.d;
                od0.i.Companion.getClass();
                jVar2.onNext(od0.h.a(jVar));
                break;
            default:
                ihm.j jVar3 = this.f208647b.d;
                od0.i.Companion.getClass();
                jVar3.onNext(od0.i.f224256b);
                break;
        }
        return Unit.f186387a;
    }
}
