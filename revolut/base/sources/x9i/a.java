package x9i;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature_restricted_access_malware.impl.R$string;
import fnc.s;
import i2i.o;
import kotlin.jvm.internal.Intrinsics;
import rf3.k;
import rf3.l;
import ue0.e;
import ufm.c;
import ufm.i;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f303745a;

    public a(s chatStartUpInfoProvider) {
        Intrinsics.checkNotNullParameter(chatStartUpInfoProvider, "chatStartUpInfoProvider");
        this.f303745a = chatStartUpInfoProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PromptMarketingContentDelegate.Model.Button a() {
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.fincrime_malicious_software_prompt_chat_with_us, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        s sVar = this.f303745a;
        c cVar = new c(new k((l) sVar.f136657b, 0 == true ? 1 : 0), 0 == true ? 1 : 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        i iVar = new i(cVar, new i2i.a(22, new i30.a(sVar, 0 == true ? 1 : 0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        Object objE = e.I(iVar, h0.f322473a, new o(14)).e();
        Intrinsics.checkNotNullExpressionValue(objE, "blockingGet(...)");
        if (((Boolean) objE).booleanValue()) {
            return button;
        }
        return null;
    }
}
