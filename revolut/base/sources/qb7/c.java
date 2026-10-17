package qb7;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.screens.create_secret_phrase.CreateSecretPhraseScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pig.y;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreateSecretPhraseScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreateSecretPhraseScreen createSecretPhraseScreen, Continuation continuation) {
        super(2, continuation);
        this.v = createSecretPhraseScreen;
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
        String str = textData.f52597a;
        CharSequence charSequence = textData.f52598b;
        boolean zF = Intrinsics.f(str, "LIST_ID_SECRET_PHRASE");
        CreateSecretPhraseScreen createSecretPhraseScreen = this.v;
        if (zF) {
            g gVarE3 = createSecretPhraseScreen.R2();
            String text = charSequence.toString();
            gVarE3.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            gVarE3.H2(gVarE3.f244131p, new y(text, gVarE3, 27));
        } else if (Intrinsics.f(str, "LIST_ID_CONFIRM_PHRASE")) {
            g gVarE32 = createSecretPhraseScreen.R2();
            String text2 = charSequence.toString();
            gVarE32.getClass();
            Intrinsics.checkNotNullParameter(text2, "text");
            gVarE32.H2(gVarE32.f244131p, new y(text2, gVarE32, 28));
        }
        return Unit.f186387a;
    }
}
