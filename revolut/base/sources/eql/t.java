package eql;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.sso.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.v = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        c0 c0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            akl.z zVar = c0Var.f128494q;
            this.u = 1;
            zVar.getClass();
            akl.y yVar = new akl.y(zVar, continuation, 2);
            p0 p0Var = p0.f264001a;
            objJ = e0.J(elm.f.f127540b, yVar, this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objJ = obj2;
        }
        if (((Boolean) objJ).booleanValue()) {
            c0.g3(c0Var);
        } else {
            PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("UAE_PASS_ONBOARDING_PROMPT", new TextLocalisedClause(R$string.revolut_sso_uae_linking_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_uae_linking_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new CdnImage("uae_pass_logo", "mobile/sso/uae_pass", null, null, null, null, Constants.TAG_FC_SPEED_MODE), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.revolut_sso_uae_linking_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30));
            l block = new l(c0Var, 8);
            Intrinsics.checkNotNullParameter(block, "block");
            promptMarketingScreen.H = block;
            yji.n.P2(c0Var, promptMarketingScreen, null, null, 3);
        }
        return Unit.f186387a;
    }
}
