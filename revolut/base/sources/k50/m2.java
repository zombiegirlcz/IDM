package k50;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f181184b;

    public /* synthetic */ m2(j4 j4Var, int i) {
        this.f181183a = i;
        this.f181184b = j4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.f181183a) {
            case 0:
                j4 j4Var = this.f181184b;
                j4Var.H2(j4Var.f181140w0, new l2(10));
                return Unit.f186387a;
            case 1:
                j4 j4Var2 = this.f181184b;
                if (((h0) ((vkm.j2) j4Var2.f181140w0.f22677a).getValue()).f181083h == v30.c0.ASSISTANT) {
                    j4Var2.f181134s.getClass();
                    z = true;
                } else {
                    z = false;
                }
                if (j4Var2.f181135s0 == null && z) {
                    return ((l30.e) j4Var2.f181122a0).a(j4Var2.o.f51175b);
                }
                return l30.f.MESSAGES;
            default:
                return ((l80.f) this.f181184b.V).g().getZone();
        }
    }
}
