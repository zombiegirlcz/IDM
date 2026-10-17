package com.revolut.kompot.common.transition;

import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import jji.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ZoomTransitionAnimation.Default a(TransitionAnimation.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new ZoomTransitionAnimation.Default(null, 0 == true ? 1 : 0, 126);
    }

    public static final ZoomTransitionAnimation.Widgets b(TransitionAnimation.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new ZoomTransitionAnimation.Widgets(0);
    }

    public static final ParcelableViewTarget c(z zVar, ZoomTransitionAnimation descriptor) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ZoomTarget f98370a = descriptor.getF98370a();
        String id10 = descriptor.getF98371b();
        if (f98370a == null) {
            if (id10 == null) {
                return null;
            }
            Intrinsics.checkNotNullParameter(id10, "id");
            return new ListIdTarget(id10);
        }
        if (f98370a instanceof ZoomTarget.ListId) {
            String id11 = ((ZoomTarget.ListId) f98370a).f98364a;
            Intrinsics.checkNotNullParameter(id11, "id");
            return new ListIdTarget(id11);
        }
        if (f98370a instanceof ZoomTarget.ViewId) {
            return new ViewIdTarget(((ZoomTarget.ViewId) f98370a).f98365a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ZoomTransitionAnimation.Default d(TransitionAnimation.Companion companion, ZoomTarget sourceTarget, HomeOverlayConfig homeOverlayConfig) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(sourceTarget, "sourceTarget");
        return new ZoomTransitionAnimation.Default(sourceTarget, homeOverlayConfig, 94);
    }
}
