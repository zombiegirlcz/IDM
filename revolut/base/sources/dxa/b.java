package dxa;

import com.revolut.feature.referrals.common.data.impl.network.services.InviteFriendsMessagingService;
import gim.i;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import le.u1;
import pwa.l;
import pwa.n;
import yhm.m;
import yhm.o;
import ywa.f;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f120922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f120923x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, n nVar, List list, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f120922w = nVar;
        this.f120923x = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f120922w, this.f120923x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                o.b(obj2);
                m.Companion companion = m.INSTANCE;
                InviteFriendsMessagingService inviteFriendsMessagingService = this.v.f120928a;
                String strH = u1.h(this.f120922w, l.f240369a);
                if (strH == null) {
                    strH = "";
                }
                ywa.i iVar = new ywa.i(this.f120923x);
                this.u = 1;
                obj2 = inviteFriendsMessagingService.sendMessages(strH, iVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = ((f) obj2).f317396a;
            m.Companion companion2 = m.INSTANCE;
        } catch (Throwable th10) {
            if (th10 instanceof CancellationException) {
                throw th10;
            }
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        return new m(objA);
    }
}
