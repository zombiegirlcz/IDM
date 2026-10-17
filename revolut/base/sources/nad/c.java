package nad;

import java.util.ArrayList;
import java.util.List;
import kad.a;
import kad.d;
import kad.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f213854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f213855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a19.a f213856c;
    public final usc.b d;
    public final yp.b e;

    public c(z70.a contextProvider, zk0.b fileSystemRepository, a19.a appAvailabilityResolver, usc.b screenshotsInteractor, yp.b appStoreNavigationFactory) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(appAvailabilityResolver, "appAvailabilityResolver");
        Intrinsics.checkNotNullParameter(screenshotsInteractor, "screenshotsInteractor");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        this.f213854a = contextProvider;
        this.f213855b = fileSystemRepository;
        this.f213856c = appAvailabilityResolver;
        this.d = screenshotsInteractor;
        this.e = appStoreNavigationFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kad.a r8, kad.f r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nad.c.a(kad.a, kad.f, gim.c):java.lang.Object");
    }

    public final ArrayList b(boolean z) {
        List listK = v.k(kad.b.f182460c, kad.c.f182461c, d.f182462c);
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listK) {
                if (this.f213856c.a((e) obj2)) {
                    arrayList.add(obj2);
                }
            }
            listK = arrayList;
        }
        return d0.F0(a.C1040a.f182459a, listK);
    }
}
