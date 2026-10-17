package k50;

import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.domain.model.ChatMode;
import com.revolut.chat.ui.chat_profile.ChatProfileInputData;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import com.revolut.kompot.common.ModalDestination;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class x3 extends gim.i implements Function2 {
    public h0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181284w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f181285x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(j4 j4Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f181284w = j4Var;
        this.f181285x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x3(this.f181284w, this.f181285x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x3) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC3;
        h0 h0Var;
        ChatProfileInputData support;
        j4 j4Var = this.f181284w;
        j30.c cVar = j4Var.f181134s;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            h0 h0Var2 = (h0) ((vkm.j2) j4Var.f181140w0.f22677a).getValue();
            this.u = h0Var2;
            this.v = 1;
            objC3 = j4Var.c3(this);
            if (objC3 == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = this.u;
            yhm.o.b(obj2);
            objC3 = obj2;
        }
        ChatMode chatMode = (ChatMode) objC3;
        UUID uuid = h0Var.f181079a;
        v30.s sVar = h0Var.f181084j;
        m1 m1Var = h0Var.d;
        boolean z = h0Var.f181085l;
        v30.c0 c0Var = h0Var.f181083h;
        boolean z3 = false;
        boolean z4 = h0Var.f181094x == v0.MESSAGES;
        int[] iArr = w3.f181273a;
        int i2 = iArr[c0Var.ordinal()];
        if (i2 == 1) {
            aim.e eVarB = zhm.u.b();
            if (sVar == v30.s.ULTRA || sVar == v30.s.PRIVATE) {
                z3 = true;
            } else {
                cVar.getClass();
            }
            if (z && !z3) {
                eVarB.add(o40.a.MAKE_CALL);
            }
            if (z4) {
                if (((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.ChatSearchMessages.f50979c)) {
                    eVarB.add(o40.a.SEARCH);
                }
            }
            if (!m1Var.f181178a.isEmpty()) {
                eVarB.add(o40.a.DOWNLOAD_TRANSCRIPT);
            }
            support = new ChatProfileInputData.Support(zhm.u.a(eVarB), sVar, chatMode, uuid);
        } else if (i2 == 2) {
            AgentInfo agentInfo = (AgentInfo) h0Var.f181081c.getContent();
            aim.e eVarB2 = zhm.u.b();
            if (z) {
                eVarB2.add(o40.a.MAKE_CALL);
            }
            if (z4) {
                if (((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.ChatSearchMessages.f50979c)) {
                    eVarB2.add(o40.a.SEARCH);
                }
            }
            if (!m1Var.f181178a.isEmpty()) {
                eVarB2.add(o40.a.DOWNLOAD_TRANSCRIPT);
            }
            eVarB2.add(o40.a.START_FEEDBACK_FLOW);
            support = new ChatProfileInputData.PrivateBanking(agentInfo, zhm.u.a(eVarB2), h0Var.f181084j, chatMode, uuid);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aim.e eVarB3 = zhm.u.b();
            if (z4) {
                if (((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.AirSearchMessages.f50966c)) {
                    eVarB3.add(o40.a.SEARCH);
                }
            }
            eVarB3.add(o40.a.START_FEEDBACK_FLOW);
            support = new ChatProfileInputData.Assistant(zhm.u.a(eVarB3), chatMode, uuid);
        }
        int i3 = iArr[c0Var.ordinal()];
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        cVar.getClass();
        j4Var.f2(new ChatProfileScreen(support), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new k2(j4Var, 3));
        return Unit.f186387a;
    }
}
