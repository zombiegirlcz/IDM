package fji;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        PromptMarketingContentDelegate.Model model = (PromptMarketingContentDelegate.Model) obj2;
        r rVar = (r) ((o) this.receiver);
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        rVar.C2(new k(model));
        return Unit.f186387a;
    }
}
