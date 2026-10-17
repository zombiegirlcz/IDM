package wbi;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature_retail_user_declarations.personal_code.PersonalCodeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PersonalCodeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PersonalCodeController personalCodeController, Continuation continuation) {
        super(2, continuation);
        this.v = personalCodeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.P.getValue();
        CharSequence text = textData.f52598b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        String string = text.toString();
        jVar.H2(jVar.f296228q, new pud.b(text, ((zzl.c) jVar.o).a(jVar.f296227p.f97705a, string), jVar, 29));
        return Unit.f186387a;
    }
}
