package com.revolut.sso.impl.ui.document_verification.awaiting_verification;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.document_verification.awaiting_verification.DocumentWaitConfirmScreen;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.t;
import rml.b;
import rml.c;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/ui/document_verification/awaiting_verification/DocumentWaitConfirmScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lrml/b;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lwii/b;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentWaitConfirmScreen extends BaseRecyclerViewScreen<b, IOData$EmptyInput, q> implements wii.b {
    public final ModalTransitionAnimation.Style.POPUP U;
    public final Object V;
    public final int W;
    public final int X;
    public final Object Y;
    public final List Z;

    public DocumentWaitConfirmScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = ModalTransitionAnimation.Style.POPUP.f98391a;
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: rml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentWaitConfirmScreen f255362b;

            {
                this.f255362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarQ2 = this.f255362b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.document_verification.awaiting_verification.di.DocumentWaitConfirmScreenInjector");
                        ljl.c cVar = (ljl.c) bVarQ2;
                        return new t(cVar.f, cVar.f195894g);
                    default:
                        return (c) ((t) this.f255362b.V.getValue()).f196100c.get();
                }
            }
        });
        this.W = R$layout.screen_document_wait;
        this.X = R$id.documentWaitScreen_recyclerView;
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: rml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentWaitConfirmScreen f255362b;

            {
                this.f255362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarQ2 = this.f255362b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.document_verification.awaiting_verification.di.DocumentWaitConfirmScreenInjector");
                        ljl.c cVar = (ljl.c) bVarQ2;
                        return new t(cVar.f, cVar.f195894g);
                    default:
                        return (c) ((t) this.f255362b.V.getValue()).f196100c.get();
                }
            }
        });
        this.Z = u.c(new PromptMarketingContentDelegate());
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0 */
    public final Boolean getV() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (t) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (c) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        this.z = false;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // wii.b
    /* JADX INFO: renamed from: d2 */
    public final ModalTransitionAnimation.Style getK() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.W;
    }
}
