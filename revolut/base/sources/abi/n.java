package abi;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zlg.e f2973b;

    public /* synthetic */ n(zlg.e eVar, int i) {
        this.f2972a = i;
        this.f2973b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f2972a) {
            case 0:
                String str = this.f2973b.f323254a;
                ((a) obj2).getClass();
                return new a(str);
            default:
                return sai.f.a((sai.f) obj2, null, 0, this.f2973b.f323254a, false, 3);
        }
    }
}
