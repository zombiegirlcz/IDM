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

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f120925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f120926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f120927y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, n nVar, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f120925w = nVar;
        this.f120926x = str;
        this.f120927y = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f120925w, this.f120926x, this.f120927y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
                InviteFriendsMessagingService inviteFriendsMessagingService = this.v.f120928a;
                String strH = u1.h(this.f120925w, l.f240369a);
                if (strH == null) {
                    strH = "";
                }
                ywa.c cVar = new ywa.c(this.f120926x, this.f120927y);
                this.u = 1;
                obj2 = inviteFriendsMessagingService.validateFriends(strH, cVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = (rwa.i) obj2;
            m.Companion companion = m.INSTANCE;
        } catch (Throwable th10) {
            if (th10 instanceof CancellationException) {
                throw th10;
            }
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        return new m(objA);
    }
}
