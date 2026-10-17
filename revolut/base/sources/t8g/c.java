package t8g;

import com.revolut.core.ui_kit.delegates.ChatTravelPreviewDelegate;
import com.revolut.core.ui_kit.delegates.s3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import os2.g;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f268893a;

    public c(g gVar) {
        this.f268893a = gVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        s3 s3Var = (s3) obj2;
        String str = s3Var.f54683a.f52079b;
        e eVar = (e) this.f268893a.f229224b;
        if (Intrinsics.f(str, eVar.c3().f310974a)) {
            ChatTravelPreviewDelegate.Model model = s3Var.f54683a;
            Intrinsics.checkNotNullParameter(model, "model");
            Object obj3 = model.f52083j;
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 != null) {
                eVar.V2(new d(eVar, str2, null), new yi5.b(29));
            }
        }
        return Unit.f186387a;
    }
}
