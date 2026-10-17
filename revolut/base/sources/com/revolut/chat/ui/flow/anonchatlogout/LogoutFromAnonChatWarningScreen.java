package com.revolut.chat.ui.flow.anonchatlogout;

import android.view.View;
import b50.a;
import cli.k;
import com.revolut.chat.ui.flow.anonchatlogout.LogoutFromAnonChatWarningScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import h30.b0;
import h30.c0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/chat/ui/flow/anonchatlogout/LogoutFromAnonChatWarningScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lb50/a;", "Lcli/k;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LogoutFromAnonChatWarningScreen extends BaseBottomSheetRecyclerController<a, k> {
    public static final /* synthetic */ int T = 0;
    public final f0 Q = f0.f322471a;
    public final Object R;
    public final Object S;

    public LogoutFromAnonChatWarningScreen() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: b50.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogoutFromAnonChatWarningScreen f12421b;

            {
                this.f12421b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LogoutFromAnonChatWarningScreen logoutFromAnonChatWarningScreen = this.f12421b;
                switch (i2) {
                    case 0:
                        int i3 = LogoutFromAnonChatWarningScreen.T;
                        qji.b bVarU2 = logoutFromAnonChatWarningScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.chat.ui.flow.anonchatlogout.di.LogoutFromAnonChatWarningScreenInjector");
                        return (c0) ((b0) ((c50.a) bVarU2).c().mo3808a(logoutFromAnonChatWarningScreen)).mo3783build();
                    default:
                        int i5 = LogoutFromAnonChatWarningScreen.T;
                        switch (((c0) logoutFromAnonChatWarningScreen.R.getValue()).f148877a) {
                            case 0:
                                return new c(new f());
                            default:
                                return new c(new f());
                        }
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: b50.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogoutFromAnonChatWarningScreen f12421b;

            {
                this.f12421b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LogoutFromAnonChatWarningScreen logoutFromAnonChatWarningScreen = this.f12421b;
                switch (i22) {
                    case 0:
                        int i3 = LogoutFromAnonChatWarningScreen.T;
                        qji.b bVarU2 = logoutFromAnonChatWarningScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.chat.ui.flow.anonchatlogout.di.LogoutFromAnonChatWarningScreenInjector");
                        return (c0) ((b0) ((c50.a) bVarU2).c().mo3808a(logoutFromAnonChatWarningScreen)).mo3783build();
                    default:
                        int i5 = LogoutFromAnonChatWarningScreen.T;
                        switch (((c0) logoutFromAnonChatWarningScreen.R.getValue()).f148877a) {
                            case 0:
                                return new c(new f());
                            default:
                                return new c(new f());
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (b50.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new b50.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new b50.e(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (b50.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return this.Q;
    }
}
