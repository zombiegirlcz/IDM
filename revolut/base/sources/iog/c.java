package iog;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PepFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PepFormScreen pepFormScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pepFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String fieldId = textData.f52597a;
        CharSequence text = textData.f52598b;
        com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b bVar = (com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b) this.v.d();
        y yVar = bVar.f94657p;
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Intrinsics.checkNotNullParameter(text, "text");
        switch (k.f163325a[m.valueOf(fieldId).ordinal()]) {
            case 1:
            case 5:
                break;
            case 2:
                bVar.H2(yVar, new a2f.k(5, text));
                break;
            case 3:
                bVar.H2(yVar, new a2f.k(6, text));
                break;
            case 4:
                bVar.H2(yVar, new a2f.k(7, text));
                break;
            case 6:
                bVar.H2(yVar, new a2f.k(8, text));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
