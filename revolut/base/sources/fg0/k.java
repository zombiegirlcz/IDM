package fg0;

import com.revolut.core.faq.data.network.PigeonService;
import dp4.a1;
import dp4.f1;
import f2i.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wf0.j0;
import wf0.m;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo6.b f134877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f134878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PigeonService f134879c;
    public final xf0.k d;
    public final j0 e;
    public final ne0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f134880g;

    public k(vo6.b faqDataProvider, m faqLanguageRepository, PigeonService pigeonService, xf0.k pigeonFaqDao, j0 faqSettingsRepository, g pigeonTreeConverter, ne0.j treeNodeCache) {
        Intrinsics.checkNotNullParameter(faqDataProvider, "faqDataProvider");
        Intrinsics.checkNotNullParameter(faqLanguageRepository, "faqLanguageRepository");
        Intrinsics.checkNotNullParameter(pigeonService, "pigeonService");
        Intrinsics.checkNotNullParameter(pigeonFaqDao, "pigeonFaqDao");
        Intrinsics.checkNotNullParameter(faqSettingsRepository, "faqSettingsRepository");
        Intrinsics.checkNotNullParameter(pigeonTreeConverter, "pigeonTreeConverter");
        Intrinsics.checkNotNullParameter(treeNodeCache, "treeNodeCache");
        this.f134877a = faqDataProvider;
        this.f134878b = faqLanguageRepository;
        this.f134879c = pigeonService;
        this.d = pigeonFaqDao;
        this.e = faqSettingsRepository;
        this.f = treeNodeCache;
        Continuation continuation = null;
        a1 a1Var = new a1(this, continuation, 28);
        int i = 0;
        x xVar = new x(1, this, k.class, "getNodesFromMemoryCache", "getNodesFromMemoryCache(Lcom/revolut/core/faq/data/db/model/FaqLangKey;)Ljava/util/List;", i, 16);
        int i2 = 2;
        this.f134880g = new x4l.c(a1Var, xVar, new a97.i(i2, this, k.class, "putNodesToMemoryCache", "putNodesToMemoryCache(Lcom/revolut/core/faq/data/db/model/FaqLangKey;Ljava/util/List;)V", i, 29), new exe.k(i2, this, k.class, "getNodesFromStorage", "getNodesFromStorage(Lcom/revolut/core/faq/data/db/model/FaqLangKey;)Ljava/util/List;", 4, 5), new f1(this, continuation, 17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(fg0.k r13, zf0.c r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fg0.k.a(fg0.k, zf0.c, gim.c):java.io.Serializable");
    }
}
