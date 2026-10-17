package sa0;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes19.dex */
public abstract class k extends oki.h implements a {
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f261214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qa0.b f261215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f261216r;

    public k(b mapper, c70.a clipboard, qa0.b externalNavigationExtension, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.o = mapper;
        this.f261214p = clipboard;
        this.f261215q = externalNavigationExtension;
        this.f261216r = bottomDialogExtension;
    }

    public final FormScreen I2() {
        return (FormScreen) ((ya0.a) ((j2) getState().f22677a).getValue()).b();
    }

    public final void J2() {
        C2(new ya0.b(((ya0.a) ((j2) getState().f22677a).getValue()).b()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ad0.a, java.lang.Object] */
    public final void K2(Action action) {
        if (action instanceof Action.Dismiss) {
            B2();
            return;
        }
        if (action instanceof Action.Deeplink) {
            this.f261215q.Z2(((Action.Deeplink) action).f63226c);
        } else {
            if (action != null && !(action instanceof Action.Submit)) {
                throw new NoWhenBranchMatchedException();
            }
            L2((FormScreen) this.o.j(I2(), (Action.Submit) action));
            J2();
        }
    }

    public abstract void L2(FormScreen formScreen);

    public void T(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(this.f261216r, false, null, 3);
    }
}
