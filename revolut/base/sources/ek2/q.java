package ek2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tk2.a f126949b;

    public /* synthetic */ q(tk2.a aVar, int i) {
        this.f126948a = i;
        this.f126949b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f126948a) {
            case 0:
                return b.a((b) obj2, this.f126949b.f271833a, null, null, null, null, false, false, false, false, 510);
            default:
                wk2.k kVar = (wk2.k) obj2;
                tk2.a aVar = this.f126949b;
                return wk2.k.a(kVar, false, null, false, false, false, 0, 0, 0, aVar.f271834b == tk2.o.LIST, aVar.f271833a, null, null, null, null, 15615);
        }
    }
}
