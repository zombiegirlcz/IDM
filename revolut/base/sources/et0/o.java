package et0;

import et0.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f129077b;

    public /* synthetic */ o(p pVar, int i) {
        this.f129076a = i;
        this.f129077b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f129076a;
        p pVar = this.f129077b;
        switch (i) {
            case 0:
                gw0.b it8 = (gw0.b) obj2;
                p.a aVar = p.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                Function1 function1 = pVar.f129082c;
                if (function1 != null) {
                    function1.invoke(it8);
                }
                break;
            case 1:
                gw0.b it9 = (gw0.b) obj2;
                p.a aVar2 = p.Companion;
                Intrinsics.checkNotNullParameter(it9, "it");
                Function1 function12 = pVar.d;
                if (function12 != null) {
                    function12.invoke(it9);
                }
                break;
            case 2:
                gw0.g it10 = (gw0.g) obj2;
                p.a aVar3 = p.Companion;
                Intrinsics.checkNotNullParameter(it10, "it");
                Function1 function13 = pVar.f129082c;
                if (function13 != null) {
                    function13.invoke(it10);
                }
                break;
            default:
                gw0.g it11 = (gw0.g) obj2;
                p.a aVar4 = p.Companion;
                Intrinsics.checkNotNullParameter(it11, "it");
                Function1 function14 = pVar.d;
                if (function14 != null) {
                    function14.invoke(it11);
                }
                break;
        }
        return Unit.f186387a;
    }
}
