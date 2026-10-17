package v8g;

import com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate;
import com.revolut.core.ui_kit.delegates.r3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tul.b f286766a;

    public d(tul.b bVar) {
        this.f286766a = bVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        r3 r3Var = (r3) obj2;
        String str = r3Var.f54656a.f52060b;
        h hVar = (h) this.f286766a.f274637b;
        if (Intrinsics.f(str, hVar.c3().f310974a)) {
            ChatTilesCollectionDelegate.Model model = r3Var.f54656a;
            Intrinsics.checkNotNullParameter(model, "model");
            Object obj3 = model.f52064j;
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 != null) {
                hVar.V2(new g(hVar, str2, null), new yi5.b(29));
            }
        }
        return Unit.f186387a;
    }
}
