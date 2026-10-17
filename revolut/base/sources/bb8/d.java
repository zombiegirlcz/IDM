package bb8;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.junior.isa.impl.ui.update_name_screen.UpdateNameScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UpdateNameScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UpdateNameScreen updateNameScreen, Continuation continuation) {
        super(2, continuation);
        this.v = updateNameScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData data = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.R2();
        Intrinsics.h(data);
        j jVar = (j) hVarE3;
        jVar.getClass();
        y yVar = jVar.f14192q;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = d0.F0(data.f52598b.toString()).toString();
        String str = data.f52597a;
        int i = 1;
        String str2 = null;
        if (Intrinsics.f(str, "FIRST_NAME_INPUT_LIST_ID")) {
            jVar.H2(yVar, new avj.o(string, str2, jVar, i));
        } else if (Intrinsics.f(str, "LAST_NAME_INPUT_LIST_ID")) {
            jVar.H2(yVar, new avj.o(str2, string, jVar, i));
        }
        return Unit.f186387a;
    }
}
