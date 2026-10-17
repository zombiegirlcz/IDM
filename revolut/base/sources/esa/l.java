package esa;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6k.e f128929b;

    public /* synthetic */ l(b6k.e eVar, int i) {
        this.f128928a = i;
        this.f128929b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128928a) {
            case 0:
                return d.a((d) obj2, null, null, null, this.f128929b, 7);
            default:
                return gq5.e.a((gq5.e) obj2, null, null, this.f128929b, 3);
        }
    }
}
