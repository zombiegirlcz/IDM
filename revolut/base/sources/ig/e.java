package ig;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f161047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.e f161048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eg.b f161049c;
    public final g d;
    public final gg.a e;
    public final hlm.c f;

    public e(CoroutineContext backgroundDispatcher, df.e firebaseInstallationsApi, eg.b appInfo, g configsFetcher, gg.a lazySettingsCache) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(lazySettingsCache, "lazySettingsCache");
        this.f161047a = backgroundDispatcher;
        this.f161048b = firebaseInstallationsApi;
        this.f161049c = appInfo;
        this.d = configsFetcher;
        this.e = lazySettingsCache;
        this.f = hlm.d.a();
    }

    @Override // ig.p
    public final Double a() {
        h hVar = e().f161065b;
        if (hVar != null) {
            return hVar.f161053b;
        }
        Intrinsics.r("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:44:0x00af, B:46:0x00b9, B:49:0x00c2, B:52:0x015c, B:36:0x008a, B:38:0x0094, B:41:0x009d), top: B:61:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:44:0x00af, B:46:0x00b9, B:49:0x00c2, B:52:0x015c, B:36:0x008a, B:38:0x0094, B:41:0x009d), top: B:61:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    @Override // ig.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.e.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ig.p
    public final Boolean c() {
        h hVar = e().f161065b;
        if (hVar != null) {
            return hVar.f161052a;
        }
        Intrinsics.r("sessionConfigs");
        throw null;
    }

    @Override // ig.p
    public final kotlin.time.b d() {
        h hVar = e().f161065b;
        if (hVar == null) {
            Intrinsics.r("sessionConfigs");
            throw null;
        }
        Integer num = hVar.f161054c;
        if (num == null) {
            return null;
        }
        b.Companion companion = kotlin.time.b.INSTANCE;
        return new kotlin.time.b(kotlin.time.c.g(num.intValue(), pkm.e.SECONDS));
    }

    public final o e() {
        Object obj2 = this.e.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "lazySettingsCache.get()");
        return (o) obj2;
    }
}
