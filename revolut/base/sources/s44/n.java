package s44;

import fy4.u;
import fy4.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import til.r;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f259764b;

    public /* synthetic */ n(p pVar, int i) {
        this.f259763a = i;
        this.f259764b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f259763a) {
            case 0:
                w it8 = (w) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof u) {
                    p pVar = this.f259764b;
                    pVar.C2(new i(((g) ((j2) pVar.f259769t.f22677a).getValue()).e));
                }
                break;
            default:
                if (((r) obj2) instanceof til.q) {
                    this.f259764b.I2(w4l.i.f294643c);
                }
                break;
        }
        return Unit.f186387a;
    }
}
