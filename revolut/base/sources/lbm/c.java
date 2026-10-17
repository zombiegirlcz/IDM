package lbm;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements UnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f193714b;

    public /* synthetic */ c(j jVar, int i) {
        this.f193713a = i;
        this.f193714b = jVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        f fVar = (f) obj2;
        switch (this.f193713a) {
            case 0:
                j jVar = this.f193714b;
                jVar.getClass();
                return new i(jVar, fVar.a() + 1, fVar.d());
            case 1:
                j jVar2 = this.f193714b;
                jVar2.getClass();
                return new i(jVar2, fVar.a());
            default:
                j jVar3 = this.f193714b;
                jVar3.getClass();
                return new g(jVar3);
        }
    }
}
