package jqg;

import android.print.PrintAttributes;
import android.print.PrintManager;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreen;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import yhm.o;
import zsc.p;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ VaultTermsViewerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(VaultTermsViewerScreen vaultTermsViewerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = vaultTermsViewerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            default:
                return new d(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        VaultTermsViewerScreen vaultTermsViewerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                vaultTermsViewerScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr = VaultTermsViewerScreen.S;
                String strE = a0.E(ty0.c.a((ty0.c) ((wpg.k) vaultTermsViewerScreen.Q.getValue()).d.get(), vaultTermsViewerScreen.K.f94753b, vaultTermsViewerScreen.m2(), null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString(), p.SPACE_CHAR, '_');
                Object systemService = vaultTermsViewerScreen.m2().getSystemService("print");
                PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
                if (printManager != null) {
                    printManager.print(strE, vaultTermsViewerScreen.e3().f.createPrintDocumentAdapter(strE), new PrintAttributes.Builder().build());
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.vaults.impl.ui.details.terms_viewer.a aVar4 = (com.revolut.feature.vaults.impl.ui.details.terms_viewer.a) vaultTermsViewerScreen.R2();
                if (aVar4.o.d != null) {
                    aVar4.B2();
                }
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.vaults.impl.ui.details.terms_viewer.a aVar6 = (com.revolut.feature.vaults.impl.ui.details.terms_viewer.a) vaultTermsViewerScreen.R2();
                aVar6.H2(aVar6.f94759r, new jpl.e(4));
                aVar6.f94758q.a();
                break;
        }
        return Unit.f186387a;
    }
}
