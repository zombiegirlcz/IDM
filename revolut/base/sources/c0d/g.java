package c0d;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ne0.o;
import ozc.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f20239b;

    public /* synthetic */ g(k kVar, int i) {
        this.f20238a = i;
        this.f20239b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20238a) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ((qri.b) this.f20239b.k).m();
            default:
                ty0.a it8 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ozc.f fVar = this.f20239b.k;
                String link = it8.f275445a;
                r0 r0Var = (r0) fVar;
                r0Var.getClass();
                Intrinsics.checkNotNullParameter(link, "link");
                pfm.h hVar = new pfm.h(new o(r0Var, link, 25), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
        }
    }
}
