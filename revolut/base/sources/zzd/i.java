package zzd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ DocumentsHubScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DocumentsHubScreen documentsHubScreen, Continuation continuation) {
        super(2, continuation);
        this.u = documentsHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r4)
            com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreen r4 = r3.u
            zzd.s r4 = r4.d()
            com.revolut.feature.statements.impl.ui.documents_hub.a r4 = (com.revolut.feature.statements.impl.ui.documents_hub.a) r4
            cli.y r0 = r4.A
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            zzd.q r0 = (zzd.q) r0
            a0e.r r0 = r0.e
            r1 = 0
            if (r0 == 0) goto L27
            com.revolut.data.model.Data r2 = r0.e
            if (r2 == 0) goto L27
            java.lang.Throwable r2 = r2.getError()
            goto L28
        L27:
            r2 = r1
        L28:
            if (r2 != 0) goto L3d
            if (r0 == 0) goto L34
            com.revolut.data.model.Data r0 = r0.f367g
            if (r0 == 0) goto L34
            java.lang.Throwable r1 = r0.getError()
        L34:
            if (r1 == 0) goto L37
            goto L3d
        L37:
            vii.b r4 = r4.z
            r4.a()
            goto L48
        L3d:
            a0e.d r4 = r4.f88365t
            a0e.q r4 = (a0e.q) r4
            vkm.z1 r4 = r4.f362x
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r4.k(r0)
        L48:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zzd.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
