package bvb;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f19013b;

    public /* synthetic */ t(w wVar, int i) {
        this.f19012a = i;
        this.f19013b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l71.d dVar = (l71.d) obj2;
        switch (this.f19012a) {
            case 0:
                ryb.b bVar = (ryb.b) this.f19013b.f19018c;
                return ryb.b.d(bVar.e(dVar), bVar.a(dVar), false);
            default:
                ryb.b bVar2 = (ryb.b) this.f19013b.f19018c;
                return ryb.b.d(bVar2.e(dVar), bVar2.a(dVar), true);
        }
    }
}
