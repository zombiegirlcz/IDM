package wl5;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p1c.c;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f298421b;

    public /* synthetic */ k(s sVar, int i) {
        this.f298420a = i;
        this.f298421b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f298420a) {
            case 0:
                if (((p1c.c) obj2) instanceof c.a) {
                    s sVar = this.f298421b;
                    sVar.n2(new o(sVar, null, 0), new whi.b(6));
                }
                break;
            default:
                xi0.b bVar = (xi0.b) d0.d0(((g0i.a) obj2).f139494a);
                if (bVar != null) {
                    this.f298421b.x2(new vgc.b(5, bVar));
                }
                break;
        }
        return Unit.f186387a;
    }
}
