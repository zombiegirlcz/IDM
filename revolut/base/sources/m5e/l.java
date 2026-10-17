package m5e;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4e.d f202922b;

    public /* synthetic */ l(x4e.d dVar, int i) {
        this.f202921a = i;
        this.f202922b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202921a) {
            case 0:
                return h.c((h) obj2, null, null, null, null, null, this.f202922b, null, null, null, null, null, null, null, null, null, 32735);
            default:
                return v5e.e.a((v5e.e) obj2, this.f202922b, null, 2);
        }
    }
}
