package mki;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f206460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TransitionAnimation f206461b;

    public b(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f206460a = controller;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.kompot.navigable.a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.kompot.navigable.a] */
    public final com.revolut.kompot.navigable.a a(boolean z) {
        com.revolut.kompot.navigable.a aVar = this.f206460a;
        com.revolut.kompot.navigable.a aVar2 = aVar.f98405m;
        ?? r06 = aVar;
        while (true) {
            com.revolut.kompot.navigable.a aVar3 = aVar2;
            ?? r110 = r06;
            ?? r09 = aVar3;
            if (r09 == 0) {
                break;
            }
            if (r110.y2().f98422h) {
                return r110;
            }
            qji.c cVar = r09 instanceof qji.c ? (qji.c) r09 : null;
            if (cVar == null || (z && cVar.b())) {
                break;
            }
            aVar2 = r09.f98405m;
            r06 = r09;
        }
        return null;
    }

    public final ModalDestination.Style b() {
        ModalDestination.Style.Companion companion = ModalDestination.Style.INSTANCE;
        TransitionAnimation transitionAnimation = this.f206461b;
        companion.getClass();
        return ModalDestination.Style.Companion.a(transitionAnimation);
    }

    public final boolean c() {
        b bVarQ2;
        com.revolut.kompot.navigable.a aVarA = a(true);
        ModalDestination.Style styleB = (aVarA == null || (bVarQ2 = aVarA.q2()) == null) ? null : bVarQ2.b();
        if (Intrinsics.f(styleB, ModalDestination.Style.POPUP.f98311a) || Intrinsics.f(styleB, ModalDestination.Style.BOTTOM_DIALOG.f98301a) || Intrinsics.f(styleB, ModalDestination.Style.FullscreenPaged.f98310a) || (styleB instanceof ModalDestination.Style.ExpandableBottomDialog) || (styleB instanceof ModalDestination.Style.ContextualAlert)) {
            return false;
        }
        if (Intrinsics.f(styleB, ModalDestination.Style.FULLSCREEN_FADE.f98307a) || Intrinsics.f(styleB, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a) || Intrinsics.f(styleB, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a) || (styleB instanceof ModalDestination.Style.Custom) || styleB == null) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean d() {
        return a(true) != null;
    }
}
