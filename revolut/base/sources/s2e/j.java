package s2e;

import kotlin.jvm.functions.Function1;
import q2e.s0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f259298b;

    public /* synthetic */ j(s0 s0Var, int i) {
        this.f259297a = i;
        this.f259298b = s0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f259297a) {
            case 0:
                return e.a((e) obj2, null, null, this.f259298b.d, 3);
            case 1:
                return t2e.g.a((t2e.g) obj2, null, null, null, null, null, this.f259298b.f241621a, 31);
            case 2:
                return u2e.e.a((u2e.e) obj2, null, null, this.f259298b.f241623c, 3);
            default:
                return v2e.l.a((v2e.l) obj2, null, null, null, false, false, false, false, null, null, null, this.f259298b.f241622b, 1023);
        }
    }
}
