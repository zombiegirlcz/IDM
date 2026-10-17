package com.revolut.chat.ui.messagefeedback;

import android.view.View;
import at.r;
import com.revolut.chat.ui.messagefeedback.MessageFeedbackController;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import h50.a;
import h50.c;
import h50.f;
import h50.g;
import h50.i;
import i50.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ui/messagefeedback/MessageFeedbackController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lh50/c;", "Lh50/i;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MessageFeedbackController extends BaseBottomSheetRecyclerController<c, i> {
    public static final /* synthetic */ int X = 0;
    public final a Q;
    public final ActionsDelegate R;
    public final InputTextDelegate S;
    public final LargeActionButtonDelegate T;
    public final List U;
    public final Object V;
    public final Object W;

    public MessageFeedbackController(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.R = actionsDelegate;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.S = inputTextDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.T = largeActionButtonDelegate;
        final int i = 0;
        final int i2 = 1;
        this.U = v.k(actionsDelegate, inputTextDelegate, largeActionButtonDelegate, new ListSubheaderDelegate());
        this.V = w.y0(new Function0(this) { // from class: h50.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageFeedbackController f149414b;

            {
                this.f149414b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                MessageFeedbackController messageFeedbackController = this.f149414b;
                switch (i3) {
                    case 0:
                        int i5 = MessageFeedbackController.X;
                        phm.a aVar = (phm.a) ue0.e.j(messageFeedbackController.m2()).a().get(gp6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp6.a.class, " is not found"));
                        }
                        gp6.a aVar3 = (gp6.a) aVar2.b();
                        i50.a aVar4 = new i50.a();
                        aVar3.getClass();
                        aVar4.f158536b = aVar3;
                        aVar4.f158535a = messageFeedbackController;
                        a aVar5 = messageFeedbackController.Q;
                        aVar5.getClass();
                        aVar4.f158537c = aVar5;
                        return (i50.b) aVar4.mo3783build();
                    default:
                        int i6 = MessageFeedbackController.X;
                        i50.b bVar = (i50.b) messageFeedbackController.V.getValue();
                        a inputData2 = bVar.f158538a;
                        ep6.b bVar2 = (ep6.b) bVar.f158539b.f145259h.get();
                        s.j(bVar2);
                        r mapper = new r(inputData2, bVar2);
                        i50.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        return new h(inputData2, mapper);
                }
            }
        });
        this.W = w.y0(new Function0(this) { // from class: h50.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageFeedbackController f149414b;

            {
                this.f149414b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                MessageFeedbackController messageFeedbackController = this.f149414b;
                switch (i3) {
                    case 0:
                        int i5 = MessageFeedbackController.X;
                        phm.a aVar = (phm.a) ue0.e.j(messageFeedbackController.m2()).a().get(gp6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp6.a.class, " is not found"));
                        }
                        gp6.a aVar3 = (gp6.a) aVar2.b();
                        i50.a aVar4 = new i50.a();
                        aVar3.getClass();
                        aVar4.f158536b = aVar3;
                        aVar4.f158535a = messageFeedbackController;
                        a aVar5 = messageFeedbackController.Q;
                        aVar5.getClass();
                        aVar4.f158537c = aVar5;
                        return (i50.b) aVar4.mo3783build();
                    default:
                        int i6 = MessageFeedbackController.X;
                        i50.b bVar = (i50.b) messageFeedbackController.V.getValue();
                        a inputData2 = bVar.f158538a;
                        ep6.b bVar2 = (ep6.b) bVar.f158539b.f145259h.get();
                        s.j(bVar2);
                        r mapper = new r(inputData2, bVar2);
                        i50.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        return new h(inputData2, mapper);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return null;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f51611c.f121375b), new h50.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.e.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d.f121375b), new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (dli.b) this.W.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.U;
    }
}
