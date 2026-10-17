package d6j;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ncj.g f111566b;

    public /* synthetic */ k0(ncj.g gVar, int i) {
        this.f111565a = i;
        this.f111566b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f111565a) {
            case 0:
                return o.f((o) obj2, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, this.f111566b, null, null, false, null, 32505855);
            default:
                return ldj.c.a((ldj.c) obj2, null, this.f111566b, null, 5);
        }
    }
}
