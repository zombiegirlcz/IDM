package y7d;

import com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.AskAiScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AskAiScreen f311468b;

    public /* synthetic */ b(AskAiScreen askAiScreen, int i) {
        this.f311467a = i;
        this.f311468b = askAiScreen;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f311467a;
        AskAiScreen askAiScreen = this.f311468b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = AskAiScreen.j0;
                qji.b bVarQ2 = askAiScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.di.AskAiScreenInjector");
                r7d.t tVar = (r7d.t) ((v7d.a) bVarQ2);
                return new r7d.b(tVar.f252174b, tVar.f252175c, askAiScreen);
            case 1:
                KProperty[] kPropertyArr2 = AskAiScreen.j0;
                return (n) ((r7d.b) askAiScreen.X.getValue()).f252100p.get();
            case 2:
                List delegates = askAiScreen.f86217d0;
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                return new a(7, delegates, false);
            default:
                KProperty[] kPropertyArr3 = AskAiScreen.j0;
                x xVar = (x) askAiScreen.T2();
                if (xVar.B) {
                    xVar.f311498t.Q();
                }
                return Unit.f186387a;
        }
    }
}
