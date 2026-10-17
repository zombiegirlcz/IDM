package sf3;

import aii.p;
import aii.u;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xii.b, p {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f262329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f262330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f262331c;

    public c(j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f262329a = chatFeatureToggles;
        this.f262330b = y0.b(this);
        this.f262331c = y0.b("assistant");
    }

    @Override // xii.b
    public final Set a() {
        return this.f262331c;
    }

    @Override // aii.p
    public final void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // xii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination e(lg0.e r6) {
        /*
            r5 = this;
            java.lang.String r0 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            j30.c r1 = r5.f262329a
            rf3.d r1 = (rf3.d) r1
            boolean r1 = r1.d()
            r2 = 0
            if (r1 == 0) goto L4b
            r1 = 1
            z50.c.f319402b = r1
            java.util.LinkedHashMap r6 = r6.f195041c
            java.lang.String r3 = "entryPoint"
            java.lang.String r6 = lg0.g.a(r3, r6)
            if (r6 == 0) goto L2d
            int r4 = r6.length()
            if (r4 <= 0) goto L24
            goto L25
        L24:
            r6 = r2
        L25:
            if (r6 == 0) goto L2d
            com.revolut.chat.domain.model.ChatEntryPoint r0 = new com.revolut.chat.domain.model.ChatEntryPoint
            r0.<init>(r6)
            goto L33
        L2d:
            com.revolut.chat.domain.model.ChatEntryPoint r6 = new com.revolut.chat.domain.model.ChatEntryPoint
            r6.<init>(r0)
            r0 = r6
        L33:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            z50.c.f319403c = r0
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r6 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f160140a
            java.lang.String r0 = r0.f83420a
            com.revolut.core.ui_kit.views.slider_layout.SliderLayout$SlidingSpec r3 = new com.revolut.core.ui_kit.views.slider_layout.SliderLayout$SlidingSpec
            dy0.o r4 = dy0.o.BOTTOM
            r3.<init>(r4, r1)
            r1 = 12
            r6.<init>(r0, r3, r2, r1)
            return r6
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sf3.c.e(lg0.e):com.revolut.kompot.common.ParcelableDestination");
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f262330b;
    }
}
