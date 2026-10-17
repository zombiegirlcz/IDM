package ms0;

import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms0.w2;
import ms0.y2;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f208466b;

    public /* synthetic */ v2(b3 b3Var, int i) {
        this.f208465a = i;
        this.f208466b = b3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.d0 d0VarI;
        int i = this.f208465a;
        b3 b3Var = this.f208466b;
        switch (i) {
            case 0:
                w2 command = (w2) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                if (command instanceof w2.a) {
                    d0VarI = efm.d0.m(y2.a.f208495a);
                } else {
                    if (!(command instanceof x2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pfm.z zVar = new pfm.z(b3Var.f208190b.b(((x2) command).f208486a).z(5000L, TimeUnit.MILLISECONDS, hhm.f.f152430b), 0, new h4d.d(command, 27), null);
                    Intrinsics.checkNotNullExpressionValue(zVar, "toSingle(...)");
                    d0VarI = ue0.e.I(zVar, zhm.h0.f322473a, new mqg.b(21));
                }
                efm.c0 c0Var = hfm.c.f152030a;
                m70.a.p(c0Var);
                return d0VarI.n(c0Var);
            default:
                kl.b0 b0Var = b3Var.f208191c;
                y2 y2Var = (y2) obj2;
                if (y2Var instanceof z2) {
                    String url2 = ((z2) y2Var).f208501a;
                    Intrinsics.checkNotNullParameter(url2, "url");
                    ArrayDeque arrayDeque = b3Var.d;
                    arrayDeque.addLast(url2);
                    while (arrayDeque.size() > 20) {
                        arrayDeque.remove(0);
                    }
                    ProductIntroView productIntroView = (ProductIntroView) b0Var.f185144b;
                    h3 state = productIntroView.f56311w.p(true, b3Var);
                    Intrinsics.checkNotNullParameter(state, "state");
                    ProductIntroView.Companion companion = ProductIntroView.INSTANCE;
                    productIntroView.j0(state);
                } else if (y2Var instanceof y2.b) {
                    ProductIntroView productIntroView2 = (ProductIntroView) b0Var.f185144b;
                    h3 state2 = productIntroView2.f56311w.p(false, b3Var);
                    Intrinsics.checkNotNullParameter(state2, "state");
                    ProductIntroView.Companion companion2 = ProductIntroView.INSTANCE;
                    productIntroView2.j0(state2);
                } else if (!(y2Var instanceof y2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
