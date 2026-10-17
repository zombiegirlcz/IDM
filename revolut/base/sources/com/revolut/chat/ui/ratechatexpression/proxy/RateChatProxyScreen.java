package com.revolut.chat.ui.ratechatexpression.proxy;

import android.view.View;
import com.revolut.chat.ui.ratechatexpression.proxy.RateChatProxyScreen;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import dli.c;
import java.util.List;
import k50.y;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import rp0.g1;
import rp0.x0;
import t50.b;
import t50.d;
import t50.f;
import t50.g;
import t50.h;
import t50.i;
import t50.l;
import t50.u;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/ratechatexpression/proxy/RateChatProxyScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lt50/i;", "Lk50/y;", "Lno/d1;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RateChatProxyScreen extends BaseBottomSheetRecyclerController<i, y> implements d1 {
    public static final /* synthetic */ int Z = 0;
    public final h Q;
    public final RowDelegate R;
    public final RateEmojiDelegate S;
    public final InputTextDelegate T;
    public final ActionsDelegate U;
    public final LargeActionButtonDelegate V;
    public final List W;
    public final Object X;
    public final Object Y;

    public RateChatProxyScreen(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        RateEmojiDelegate rateEmojiDelegate = new RateEmojiDelegate();
        this.S = rateEmojiDelegate;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.T = inputTextDelegate;
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.U = actionsDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.V = largeActionButtonDelegate;
        final int i = 0;
        final int i2 = 1;
        this.W = v.k(rowDelegate, rateEmojiDelegate, inputTextDelegate, actionsDelegate, listSubheaderDelegate, largeActionButtonDelegate);
        this.X = w.y0(new Function0(this) { // from class: t50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RateChatProxyScreen f268014b;

            {
                this.f268014b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                cli.n nVar;
                int i3 = i;
                RateChatProxyScreen rateChatProxyScreen = this.f268014b;
                switch (i3) {
                    case 0:
                        int i5 = RateChatProxyScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(rateChatProxyScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                        }
                        h30.n nVar2 = ((h30.n) ((h30.a) aVar2.b())).f148930w;
                        h hVar = rateChatProxyScreen.Q;
                        hVar.getClass();
                        return new h30.v(nVar2, rateChatProxyScreen, hVar);
                    default:
                        int i6 = RateChatProxyScreen.Z;
                        h30.v vVar = (h30.v) rateChatProxyScreen.X.getValue();
                        h inputData2 = vVar.f148972a;
                        gff.a mapperDefault = vVar.f148974c;
                        gff.a mapperOneClick = vVar.d;
                        u50.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        Intrinsics.checkNotNullParameter(mapperDefault, "mapperDefault");
                        Intrinsics.checkNotNullParameter(mapperOneClick, "mapperOneClick");
                        z30.j jVar = inputData2.f268017b;
                        if (jVar instanceof z30.g) {
                            Object obj2 = mapperDefault.get();
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            nVar = (cli.n) obj2;
                        } else {
                            if (!(jVar instanceof z30.f) && !(jVar instanceof z30.h) && !(jVar instanceof z30.i)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Object obj3 = mapperOneClick.get();
                            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                            nVar = (cli.n) obj3;
                        }
                        s30.b bVar = new s30.b((v20.o) vVar.f148973b.U.get());
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) vVar.e.get();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        x0 x0Var = g1.Companion;
                        View decorView = controller.m2().getWindow().getDecorView();
                        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                        return new u(inputData2, nVar, bVar, new s50.e(x0.a(x0Var, decorView)));
                }
            }
        });
        this.Y = w.y0(new Function0(this) { // from class: t50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RateChatProxyScreen f268014b;

            {
                this.f268014b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                cli.n nVar;
                int i3 = i2;
                RateChatProxyScreen rateChatProxyScreen = this.f268014b;
                switch (i3) {
                    case 0:
                        int i5 = RateChatProxyScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(rateChatProxyScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                        }
                        h30.n nVar2 = ((h30.n) ((h30.a) aVar2.b())).f148930w;
                        h hVar = rateChatProxyScreen.Q;
                        hVar.getClass();
                        return new h30.v(nVar2, rateChatProxyScreen, hVar);
                    default:
                        int i6 = RateChatProxyScreen.Z;
                        h30.v vVar = (h30.v) rateChatProxyScreen.X.getValue();
                        h inputData2 = vVar.f148972a;
                        gff.a mapperDefault = vVar.f148974c;
                        gff.a mapperOneClick = vVar.d;
                        u50.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        Intrinsics.checkNotNullParameter(mapperDefault, "mapperDefault");
                        Intrinsics.checkNotNullParameter(mapperOneClick, "mapperOneClick");
                        z30.j jVar = inputData2.f268017b;
                        if (jVar instanceof z30.g) {
                            Object obj2 = mapperDefault.get();
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            nVar = (cli.n) obj2;
                        } else {
                            if (!(jVar instanceof z30.f) && !(jVar instanceof z30.h) && !(jVar instanceof z30.i)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Object obj3 = mapperOneClick.get();
                            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                            nVar = (cli.n) obj3;
                        }
                        s30.b bVar = new s30.b((v20.o) vVar.f148973b.U.get());
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) vVar.e.get();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        x0 x0Var = g1.Companion;
                        View decorView = controller.m2().getWindow().getDecorView();
                        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                        return new u(inputData2, nVar, bVar, new s50.e(x0.a(x0Var, decorView)));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h30.v) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((c) this.O.getValue()).h().setTag("RateChatExpressionScreen_recyclerView");
        Continuation continuation = null;
        a.g2(this, rd0.e.b(this.R.f53218h), null, new b(this, null), 3);
        a.g2(this, rd0.e.b(this.S.f53143c), null, new t50.c(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(this.U.f51611c.f121375b), null, new d(this, null), 3);
        a.g2(this, rd0.e.b(this.T.e.f121375b), null, new t50.e(this, null), 3);
        a.g2(this, rd0.e.b(this.V.d.f121375b), null, new f(this, null), 3);
        a.g2(this, i3(), null, new t50.c(this, continuation, 1), 3);
        a.g2(this, e3(), null, new g(this, continuation, 0), 3);
        a.g2(this, f3(), null, new g(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        if (z) {
            u uVar = (u) R2();
            uVar.H2(uVar.f268032s, new t3b.g(19));
        }
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getW() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.Y.getValue();
    }
}
