package p40;

import android.content.IntentSender;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.kompot.common.ExternalDestination;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChatProfileScreen f232775w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ChatProfileScreen chatProfileScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f232775w = chatProfileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f232775w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f232775w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f232775w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f232775w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((uh0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = null;
        ChatProfileScreen chatProfileScreen = this.f232775w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = chatProfileScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.chat.ui.chat_profile.profile_screen.b bVar = (com.revolut.chat.ui.chat_profile.profile_screen.b) lVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "learn_more")) {
                    bVar.v.getClass();
                    bVar.C1(new ExternalDestination.Browser("https://www.revolut.com/legal/rita-disclaimer/?geo-redirect=true", null));
                }
                break;
            case 1:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.chat.ui.chat_profile.profile_screen.b) chatProfileScreen.R2()).I2(popupMenuItem.getF55254b());
                break;
            case 2:
                uh0.b bVar2 = (uh0.b) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = ChatProfileScreen.f51125a0;
                try {
                    bVar2.a(chatProfileScreen.m2(), 60431);
                } catch (IntentSender.SendIntentException e) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unable to start Twilio install confirmation dialog", e);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            default:
                ai aiVar = (ai) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = chatProfileScreen.R2();
                String tabId = aiVar.f53687a;
                com.revolut.chat.ui.chat_profile.profile_screen.b bVar3 = (com.revolut.chat.ui.chat_profile.profile_screen.b) lVarE32;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                Iterator<E> it8 = k.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((k) next).getId(), tabId)) {
                            obj3 = next;
                        }
                    }
                }
                k kVar = (k) obj3;
                if (kVar != null) {
                    bVar3.H2(bVar3.A, new oxd.m(kVar, 15));
                }
                break;
        }
        return Unit.f186387a;
    }
}
