package com.revolut.feature.profile.impl.ui.details.email.check_inbox;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.profile.impl.ui.details.email.check_inbox.CheckInboxScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fma.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import tma.c;
import tma.h;
import tma.i;
import tma.j;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/email/check_inbox/CheckInboxScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltma/h;", "Ldli/a;", "Ltma/j;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckInboxScreen extends ViewController<h> implements a {
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public CheckInboxScreen(CheckInboxScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new tl7.a(6));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckInboxScreen f272168b;

            {
                this.f272168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CheckInboxScreen checkInboxScreen = this.f272168b;
                        return dli.f.a(checkInboxScreen, (i) checkInboxScreen.O.getValue(), u.c((PromptMarketingContentDelegate) checkInboxScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (i) ((fma.d) this.f272168b.N.getValue()).f136083c.get();
                }
            }
        });
        this.M = R$layout.screen_prompt;
        this.N = w.y0(new sw6.a(this, inputData, 29));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: tma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckInboxScreen f272168b;

            {
                this.f272168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CheckInboxScreen checkInboxScreen = this.f272168b;
                        return dli.f.a(checkInboxScreen, (i) checkInboxScreen.O.getValue(), u.c((PromptMarketingContentDelegate) checkInboxScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (i) ((fma.d) this.f272168b.N.getValue()).f136083c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.K;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), null, new tma.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), null, new tma.d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
