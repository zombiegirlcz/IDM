package sx8;

import com.google.firebase.messaging.t;
import efm.d0;
import k3l.i;
import k3l.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import pfm.m;
import rs8.a;
import tm.g;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements mm.b, g3l.d, ym.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt8.d f266370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3l.a f266371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ju8.f f266372c;
    public final e d;
    public final g e;

    public d(t actionDelegateFactory, mt8.d kycInteractor, g3l.a statusDialogViewConfigurationDispatcher, ju8.f documentResultObserver, e loadingHandler) {
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(documentResultObserver, "documentResultObserver");
        Intrinsics.checkNotNullParameter(loadingHandler, "loadingHandler");
        this.f266370a = kycInteractor;
        this.f266371b = statusDialogViewConfigurationDispatcher;
        this.f266372c = documentResultObserver;
        this.d = loadingHandler;
        this.e = actionDelegateFactory.f(new a(this, 0));
    }

    @Override // ym.c
    public final void J2() {
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        f action = (f) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.e.a(action);
    }

    @Override // g3l.d
    public final d0 b(j result) {
        efm.b bVar;
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.f(result.a().getF104385a(), "KYC_INTERNAL_UPLOAD_DONE_DIALOG_ID")) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (result instanceof k3l.g) {
            bVar = (h) this.f266372c.c0(a.C1416a.f257039a);
        } else {
            if (!(result instanceof k3l.f) && !(result instanceof k3l.h) && !(result instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = m.f235744a;
        }
        return bVar.D(Boolean.TRUE);
    }

    @Override // ym.c
    public final d0 g3(ym.b loadingData) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        return this.d.g3(loadingData);
    }

    @Override // ym.c
    public final int getLevel() {
        return 0;
    }
}
