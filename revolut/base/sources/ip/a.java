package ip;

import az0.l1;
import bmm.t;
import ijj.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lm.c;
import lp.q1;
import voi.h;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements hf0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f163346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f163347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f163348c;
    public final List d;

    public a(c contextAccessor, c coldStartDetectionDelegate, b defaultUiConfiguration, h appConfiguration, List appScopedInitables) {
        Intrinsics.checkNotNullParameter(contextAccessor, "contextAccessor");
        Intrinsics.checkNotNullParameter(coldStartDetectionDelegate, "coldStartDetectionDelegate");
        Intrinsics.checkNotNullParameter(defaultUiConfiguration, "defaultUiConfiguration");
        Intrinsics.checkNotNullParameter(appConfiguration, "appConfiguration");
        Intrinsics.checkNotNullParameter(appScopedInitables, "appScopedInitables");
        l1 appDeclarationProvider = new l1(contextAccessor, defaultUiConfiguration, appConfiguration, appScopedInitables, coldStartDetectionDelegate, 3);
        r coreActivityComponentProvider = new r(28);
        ii4.b flowComponentsFactoryProvider = new ii4.b(contextAccessor, 22);
        Intrinsics.checkNotNullParameter(contextAccessor, "contextAccessor");
        Intrinsics.checkNotNullParameter(appDeclarationProvider, "appDeclarationProvider");
        Intrinsics.checkNotNullParameter(coreActivityComponentProvider, "coreActivityComponentProvider");
        Intrinsics.checkNotNullParameter(flowComponentsFactoryProvider, "flowComponentsFactoryProvider");
        this.f163346a = j.b(new androidx.lifecycle.b(appDeclarationProvider, 15));
        this.f163347b = j.b(new t(this, coreActivityComponentProvider, 7));
        this.f163348c = j.b(new ao.a(flowComponentsFactoryProvider, 1, this, contextAccessor));
        this.d = appScopedInitables;
    }

    public final q1 b() {
        return (q1) this.f163346a.getValue();
    }
}
