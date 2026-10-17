package py2;

import efm.d0;
import ha3.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import okl.m;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f240649b;

    public /* synthetic */ d(g gVar, int i) {
        this.f240648a = i;
        this.f240649b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f240648a) {
            case 0:
                i cardIdOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(cardIdOptional, "cardIdOptional");
                if (cardIdOptional.d()) {
                    ufm.i iVar = new ufm.i(((x) this.f240649b.f).n((String) cardIdOptional.c()), new pva.c(15, new px0.a(12)), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    return ue0.e.F(iVar, Boolean.TRUE);
                }
                ufm.b bVarM = d0.m(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            default:
                Boolean shouldFinishFlow = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(shouldFinishFlow, "shouldFinishFlow");
                return shouldFinishFlow.booleanValue() ? m.w(null, null, null, 7, this.f240649b.f210298b) : pfm.m.f235744a;
        }
    }
}
