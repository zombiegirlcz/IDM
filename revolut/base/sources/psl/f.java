package psl;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jsl.o f239521b;

    public /* synthetic */ f(jsl.o oVar, int i) {
        this.f239520a = i;
        this.f239521b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f239520a) {
            case 0:
                return jsl.a0.a((jsl.a0) obj2, null, null, null, null, null, this.f239521b, null, null, null, null, null, null, 4063);
            default:
                return jsl.y.a((jsl.y) obj2, null, null, this.f239521b, null, null, null, null, 123);
        }
    }
}
