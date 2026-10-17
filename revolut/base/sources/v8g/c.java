package v8g;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.o3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tul.b f286765a;

    public c(tul.b bVar) {
        this.f286765a = bVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        o3 o3Var = (o3) obj2;
        String str = o3Var.f54528a.f52060b;
        h hVar = (h) this.f286765a.f274637b;
        if (Intrinsics.f(str, hVar.c3().f310974a)) {
            VoucherSmallTileDelegate.Model model = o3Var.f54529b;
            Intrinsics.checkNotNullParameter(model, "model");
            Object obj3 = model.f53623w;
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 != null) {
                hVar.V2(new f(hVar, str2, null), new yi5.b(29));
            }
        }
        return Unit.f186387a;
    }
}
