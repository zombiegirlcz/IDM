package qsb;

import com.revolut.feature.retail.main_screen.container.models.action_payload.ChecklistPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import efm.d0;
import jf0.c;
import jf0.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.i;
import q06.k;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f248796a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f248796a = navigator;
    }

    public static ChecklistPayload b(c cVar) {
        return Intrinsics.f(cVar.e(1), "adoption-journey") ? ChecklistPayload.AdoptionJourneyDeeplinkAction.f82755a : new ChecklistPayload.FincrimeChecklist(Boolean.parseBoolean((String) cVar.d.get("useCache")));
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "adoption-journey") || Intrinsics.f(cVar.e(1), "user-checklist");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        return new i(new q06.a(new MainScreenContainerActionData(new MainScreenContainerActionId("CHECKLIST_ACTION_ID"), b(cVar))));
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new pu9.a(this, deeplink, 10), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
