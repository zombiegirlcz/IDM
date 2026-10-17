package ip0;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class s60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PromptMarketingContentDelegate.Model f166308b;

    public /* synthetic */ s60(PromptMarketingContentDelegate.Model model, int i) {
        this.f166307a = i;
        this.f166308b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        aw0.n6 it8 = (aw0.n6) obj2;
        switch (this.f166307a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f166308b;
    }
}
