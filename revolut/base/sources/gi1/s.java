package gi1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mi1.a f144051b;

    public /* synthetic */ s(mi1.a aVar, int i) {
        this.f144050a = i;
        this.f144051b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144050a) {
            case 0:
                return k.a((k) obj2, null, null, null, null, false, null, null, null, null, this.f144051b, null, 49151);
            default:
                return ji1.e.a((ji1.e) obj2, this.f144051b, null, null, 6);
        }
    }
}
