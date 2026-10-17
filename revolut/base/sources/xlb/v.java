package xlb;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f307006b;

    public /* synthetic */ v(m mVar, int i) {
        this.f307005a = i;
        this.f307006b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f307005a) {
            case 0:
                d dVar = (d) obj2;
                m mVar = this.f307006b;
                return d.a(dVar, mVar.f306989a, mVar.f306990b, mVar.f306991c, mVar.d, null, 16);
            default:
                d dVar2 = (d) obj2;
                m mVar2 = this.f307006b;
                return d.a(dVar2, mVar2.f306989a, mVar2.f306990b, mVar2.f306991c, mVar2.d, null, 16);
        }
    }
}
