package m50;

import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import e60.s;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import te0.w;
import ufm.n;
import y20.b1;
import y20.h0;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e60.i f202781w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, e60.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f202781w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f202781w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k kVar = this.v;
        if (i == 0) {
            o.b(obj2);
            b1 b1Var = (b1) kVar.f202783m;
            b1Var.getClass();
            ufm.c cVar = new ufm.c(new h0(b1Var, 0), 2);
            Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
            n nVarI0 = w.i0(cVar);
            this.u = 1;
            objB = nim.a.b(nVarI0, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objB = obj2;
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        e60.i iVar = this.f202781w;
        if (zBooleanValue) {
            ((s) kVar.f202782l).T(iVar);
        } else {
            yji.n.P2(kVar, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.chat_messages_screen_attach_file_explanation_title, null, null, 14), new TextLocalisedClause(R$string.chat_messages_screen_attach_file_explanation_message, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D015", null, null, null, 30), PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.chat_common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.d, false, (String) null, 54), null, null, null, null, null, null, 65360)), null, new lul.d(kVar, iVar, 23), 1);
        }
        return Unit.f186387a;
    }
}
