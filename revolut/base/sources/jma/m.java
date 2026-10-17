package jma;

import com.revolut.feature.retail.main_screen.container.models.action_payload.SeasonalThemeUpdateActionPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements sla.g, sla.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f176509a;

    public m(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f176509a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "halloween-theme-apply") || Intrinsics.f(cVar.e(1), "christmas-theme-apply");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String str;
        MainScreenContainerActionId mainScreenContainerActionId = new MainScreenContainerActionId("seasonalThemeUpdateActionId");
        String strE = cVar.e(1);
        if (Intrinsics.f(strE, "halloween-theme-apply")) {
            str = "halloween";
        } else {
            if (!Intrinsics.f(strE, "christmas-theme-apply")) {
                throw new IllegalStateException(a10.b.s("Seasonal theme deeplink ", cVar.e(1), " is not supported"));
            }
            str = "christmas";
        }
        return new q06.i(new q06.a(new MainScreenContainerActionData(mainScreenContainerActionId, new SeasonalThemeUpdateActionPayload(str))));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new fag.g(this, deeplink, 16), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
