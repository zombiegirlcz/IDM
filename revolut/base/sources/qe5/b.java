package qe5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.documents.impl.ui.crypto_documents_screen.CryptoDocumentsScreen;
import com.revolut.retail.core.navigation.BrowserCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qc0.e1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CryptoDocumentsScreen cryptoDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.Y.getValue();
        Intrinsics.h(model);
        l lVar = (l) dVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Continuation continuation = null;
        switch (str.hashCode()) {
            case -1961213249:
                if (str.equals("CRYPTO_TRADING_RULES_ID")) {
                    lVar.C1(u0.b(new BrowserCommand(((f80.b) lVar.f245082t).f("https://www.revolut.com/en-GB/legal/crypto-exchange-trading-rules"))));
                }
                break;
            case -709428956:
                if (str.equals("CRYPTO_TERMS_AND_CONDITIONS_ID")) {
                    lVar.n2(new e1(lVar, continuation, 4), new whi.b(6));
                }
                break;
            case -285434423:
                if (str.equals("CRYPTO_PNL_STATEMENT_SETTING_ID")) {
                    lVar.n2(new i(lVar, null, 2), new whi.b(6));
                }
                break;
            case -224005078:
                if (str.equals("CRYPTO_ACCOUNT_STATEMENT_SETTING_ID")) {
                    lVar.n2(new i(lVar, null, 0), new whi.b(6));
                }
                break;
            case 592156867:
                if (str.equals("CRYPTO_TAX_REPORT_SETTING_ID")) {
                    lVar.n2(new i(lVar, null, 3), new whi.b(6));
                }
                break;
            case 1668544307:
                if (str.equals("CRYPTO_PRIVACY_POLICY_ID")) {
                    lVar.n2(new i(lVar, null, 1), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
