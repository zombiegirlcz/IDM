package i1e;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0h.b f157625b;

    public /* synthetic */ p(n0h.b bVar, int i) {
        this.f157624a = i;
        this.f157625b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f157624a) {
            case 0:
                return g.a((g) obj2, null, false, this.f157625b, 3);
            default:
                return j1k.d.a((j1k.d) obj2, null, this.f157625b, 3);
        }
    }
}
