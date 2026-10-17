package ved;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public Ref$BooleanRef u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f288278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f288279x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(2, continuation);
        this.f288279x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.f288279x, continuation);
        nVar.f288278w = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (vkm.q.y(r11, r0, r10) == r7) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            ved.o r3 = r10.f288279x
            rp0.g1 r6 = r3.f288284t
            java.lang.Object r0 = r10.f288278w
            r2 = r0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r0 = r10.v
            r8 = 1
            r9 = 2
            r4 = 0
            if (r0 == 0) goto L28
            if (r0 == r8) goto L22
            if (r0 != r9) goto L1a
            yhm.o.b(r11)
            goto L88
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            kotlin.jvm.internal.Ref$BooleanRef r0 = r10.u
            yhm.o.b(r11)
            goto L44
        L28:
            yhm.o.b(r11)
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            uv1.c0 r0 = new uv1.c0
            r5 = 3
            r0.<init>(r1, r2, r3, r4, r5)
            r10.f288278w = r4
            r10.u = r1
            r10.v = r8
            java.lang.Object r11 = r3.p2(r10, r0)
            if (r11 != r7) goto L43
            goto L87
        L43:
            r0 = r1
        L44:
            ped.a r11 = r3.u
            com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreenContract$InputData r1 = r3.f288281q
            com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem r1 = r1.f86714a
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails r1 = r1.getF86877b()
            java.lang.String r1 = r1.f86864b
            boolean r2 = r0.f186407a
            ped.b r11 = (ped.b) r11
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration r11 = r11.a(r1, r2)
            r1 = r6
            rp0.k1 r1 = (rp0.k1) r1
            r1.d(r11)
            boolean r11 = r0.f186407a
            if (r11 == 0) goto L8d
            vea.n r11 = new vea.n
            r0 = 11
            r11.<init>(r0)
            r3.x2(r11)
            rp0.k1 r6 = (rp0.k1) r6
            ihm.f r11 = r6.d
            vkm.d r11 = rd0.e.b(r11)
            tk9.i r0 = new tk9.i
            r1 = 13
            r0.<init>(r9, r1, r4)
            r10.f288278w = r4
            r10.u = r4
            r10.v = r9
            java.lang.Object r11 = vkm.q.y(r11, r0, r10)
            if (r11 != r7) goto L88
        L87:
            return r7
        L88:
            ved.h$a r11 = ved.h.a.f288270a
            r3.v2(r11)
        L8d:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ved.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
