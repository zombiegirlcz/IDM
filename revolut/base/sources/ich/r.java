package ich;

import cli.y;
import i2l.e0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a f160287b;

    public /* synthetic */ r(com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar, int i) {
        this.f160286a = i;
        this.f160287b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f160286a) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List list = (List) ((l) ((j2) this.f160287b.A.f22677a).getValue()).f160276h.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                return l.a(update, null, null, null, false, null, null, null, null, list, 255);
            default:
                jch.m result = (jch.m) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof jch.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list2 = ((jch.l) result).f172805a;
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar = this.f160287b;
                y yVar = aVar.A;
                if (!Intrinsics.f(((l) ((j2) yVar.f22677a).getValue()).i, list2)) {
                    aVar.H2(yVar, new e0(list2, 5));
                    aVar.f95612x.b(Unit.f186387a);
                }
                return Unit.f186387a;
        }
    }
}
