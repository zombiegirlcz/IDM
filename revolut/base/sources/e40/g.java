package e40;

import android.content.Context;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.in_app_calls.CallActivity;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import v30.c0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f122348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n30.n f122349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be7.h f122350c;

    public g(k chatRequestPendingActionsDelegate, n30.n chatInteractor, be7.h inAppCalls) {
        Intrinsics.checkNotNullParameter(chatRequestPendingActionsDelegate, "chatRequestPendingActionsDelegate");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(inAppCalls, "inAppCalls");
        this.f122348a = chatRequestPendingActionsDelegate;
        this.f122349b = chatInteractor;
        this.f122350c = inAppCalls;
    }

    public static ChatTarget.Messages h(r40.k kVar) {
        ChatFeed support;
        w30.n nVar = kVar.f251339a;
        c0 c0Var = nVar.f294114s;
        UUID uuid = nVar.f294102a;
        UUID uuid2 = nVar.f294113r;
        int i = d.f122344c[c0Var.ordinal()];
        if (i == 1) {
            support = new ChatFeed.Support(uuid, uuid2, null, 4);
        } else if (i == 2) {
            support = new ChatFeed.Assistant(uuid2, null, false, 6);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            support = uuid2 != null ? new ChatFeed.PrivateBanking(uuid2) : new ChatFeed.Support(uuid, null, null, 6);
        }
        return new ChatTarget.Messages(support, null, null, 6);
    }

    @Override // i49.c
    public final boolean a(com.revolut.core.ui_kit.delegates.t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof r40.l) || (obj2 instanceof r40.k);
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        r10.v vVar = this.f122348a.f122355a;
        Continuation continuation = null;
        int i = 9;
        efm.r rVarDistinctUntilChanged = ue0.e.E(rd0.e.c(new cqh.m(mo3.a.g(((m30.g) vVar.f250863b).b(), null, new e07.k(17), 1), vVar, 18), kotlin.coroutines.g.f186406a), f0.f322471a).map(new e31.e(8, new e1d.h(15))).distinctUntilChanged().map(new e31.e(i, new e2j.j(vVar, i))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        vkm.d dVarB = rd0.e.b(rVarDistinctUntilChanged);
        int i2 = 3;
        c9k.k kVar = new c9k.k(i2, 21, continuation);
        h0 h0Var = h0.f322473a;
        return rd0.e.e(rd0.e.e(dVarB, h0Var, kVar), h0Var, new c9k.k(i2, 20, continuation));
    }

    @Override // i49.c
    public final Object g(com.revolut.core.ui_kit.delegates.t tVar, Continuation continuation) {
        ActionWidgetDelegate.Model model = tVar.f54722b;
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        Object obj2 = model.f51596l;
        boolean z = obj2 instanceof r40.l;
        j49.c cVar = j49.c.f171322a;
        if (z) {
            r40.l lVar = (r40.l) obj2;
            r40.n nVar = lVar.f251349h;
            boolean zF = Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a);
            k kVar = this.f122348a;
            if (zF) {
                gim.c cVar2 = (gim.c) continuation;
                int i = h.f122351a[nVar.f251354a.ordinal()];
                return (i == 1 || i == 2) ? k.b(lVar) : i != 3 ? cVar : kVar.c(lVar, cVar2);
            }
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
                gim.c cVar3 = (gim.c) continuation;
                int i2 = h.f122351a[nVar.f251355b.ordinal()];
                return (i2 == 1 || i2 == 2) ? k.b(lVar) : i2 != 3 ? cVar : kVar.c(lVar, cVar3);
            }
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a)) {
                return kVar.a(lVar, (gim.c) continuation);
            }
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
                return k.b(lVar);
            }
        } else if (obj2 instanceof r40.k) {
            return i((r40.k) obj2, aVar, (gim.c) continuation);
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r9 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r11.a(r9, r0) == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(r40.k r9, com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.g.i(r40.k, com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a, gim.c):java.lang.Object");
    }

    public final Object j(r40.k kVar, r40.i iVar, e eVar) {
        int i = d.f122343b[iVar.ordinal()];
        j49.a aVar = j49.a.f171320a;
        be7.h hVar = this.f122350c;
        switch (i) {
            case 1:
                return j49.c.f171322a;
            case 2:
                return k(kVar, eVar);
            case 3:
                return new j49.b(new ChatFlowDestination(h(kVar), true));
            case 4:
                Context context = ((com.revolut.feature.in_app_calls.a) hVar).f74790a.getContext();
                CallActivity.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(CallActivity.Companion.a(1, context));
                return aVar;
            case 5:
                Context context2 = ((com.revolut.feature.in_app_calls.a) hVar).f74790a.getContext();
                CallActivity.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                context2.startActivity(CallActivity.Companion.a(2, context2));
                return aVar;
            case 6:
            case 7:
                return new j49.b(new ChatFlowDestination(h(kVar), true));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(r40.k r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof e40.f
            if (r0 == 0) goto L13
            r0 = r9
            e40.f r0 = (e40.f) r0
            int r1 = r0.f122347x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122347x = r1
            goto L18
        L13:
            e40.f r0 = new e40.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122347x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            r40.k r8 = r0.u
            yhm.o.b(r9)
            goto L49
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r9)
            w30.n r9 = r8.f251339a
            java.util.UUID r9 = r9.f294102a
            n30.n r2 = r7.f122349b
            pfm.h r9 = r2.j(r9)
            r0.u = r8
            r0.f122347x = r3
            java.lang.Object r9 = nim.a.a(r9, r0)
            if (r9 != r1) goto L49
            return r1
        L49:
            j49.b r9 = new j49.b
            com.revolut.chat.navigation.ChatFlowDestination r0 = new com.revolut.chat.navigation.ChatFlowDestination
            com.revolut.chat.domain.model.ChatTarget$Messages r1 = new com.revolut.chat.domain.model.ChatTarget$Messages
            w30.n r8 = r8.f251339a
            java.util.UUID r2 = r8.f294113r
            java.util.UUID r8 = r8.f294102a
            com.revolut.chat.domain.model.ChatFeed$Support r4 = new com.revolut.chat.domain.model.ChatFeed$Support
            r5 = 4
            r6 = 0
            r4.<init>(r8, r2, r6, r5)
            r8 = 6
            r1.<init>(r4, r6, r6, r8)
            r0.<init>(r1, r3)
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.g.k(r40.k, gim.c):java.lang.Object");
    }
}
