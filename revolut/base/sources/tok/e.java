package tok;

import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.bottomsheet.WaitlistInvitationBottomsheetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WaitlistInvitationBottomsheetScreen f273235w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(WaitlistInvitationBottomsheetScreen waitlistInvitationBottomsheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f273235w = waitlistInvitationBottomsheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f273235w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f273235w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f273235w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WaitlistInvitationBottomsheetScreen waitlistInvitationBottomsheetScreen = this.f273235w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) waitlistInvitationBottomsheetScreen.R.getValue();
                String url2 = aVar.f275445a;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                hVar.l2(new tgk.f(hVar, url2, null, 24), new yi5.b(26));
                break;
            case 1:
                String url3 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar2 = (h) waitlistInvitationBottomsheetScreen.R.getValue();
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(url3, "url");
                hVar2.l2(new tgk.f(hVar2, url3, null, 24), new yi5.b(26));
                break;
            default:
                String url4 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar3 = (h) waitlistInvitationBottomsheetScreen.R.getValue();
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(url4, "url");
                hVar3.l2(new tgk.f(hVar3, url4, null, 24), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
