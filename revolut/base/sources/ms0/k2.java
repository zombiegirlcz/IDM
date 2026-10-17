package ms0;

import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductIntroView f208310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3 f208311c;

    public /* synthetic */ k2(ProductIntroView productIntroView, g3 g3Var, int i) {
        this.f208309a = i;
        this.f208310b = productIntroView;
        this.f208311c = g3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        h3 h3VarO;
        int i = this.f208309a;
        g3 g3Var = this.f208311c;
        ProductIntroView productIntroView = this.f208310b;
        Throwable error = (Throwable) obj3;
        switch (i) {
            case 0:
                ProductIntroView.Companion companion = ProductIntroView.INSTANCE;
                if (error == null) {
                    o2 model = g3Var.f208260a;
                    r2 story = g3Var.f208261b;
                    Intrinsics.checkNotNullParameter(model, "model");
                    Intrinsics.checkNotNullParameter(story, "story");
                    productIntroView.j0(new g3(model, story, true));
                }
                break;
            default:
                ProductIntroView.Companion companion2 = ProductIntroView.INSTANCE;
                if (error != null) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    h3VarO = new d3(g3Var.f208260a, error);
                } else {
                    h3VarO = g3Var.o();
                }
                productIntroView.j0(h3VarO);
                break;
        }
        return Unit.f186387a;
    }
}
