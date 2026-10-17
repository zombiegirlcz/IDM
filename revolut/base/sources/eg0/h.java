package eg0;

import bbg.c0;
import com.revolut.core.faq.data.network.LightenedFaqService;
import dp4.a1;
import dp4.f1;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import wf0.j0;
import wf0.m;
import wkm.l;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo6.b f125516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f125517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LightenedFaqService f125518c;
    public final j0 d;
    public final xf0.g e;
    public final xf0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f125519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ne0.j f125520h;
    public final ne0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f125521j;
    public final x4l.c k;

    public h(vo6.b faqDataProvider, m faqLanguageRepository, LightenedFaqService lightenedFaqService, j0 faqSettingsRepository, xf0.g lightenedFaqDao, xf0.a faqDao, i treeHelper, ne0.j faqTreeCache, ne0.j faqCache) {
        Intrinsics.checkNotNullParameter(faqDataProvider, "faqDataProvider");
        Intrinsics.checkNotNullParameter(faqLanguageRepository, "faqLanguageRepository");
        Intrinsics.checkNotNullParameter(lightenedFaqService, "lightenedFaqService");
        Intrinsics.checkNotNullParameter(faqSettingsRepository, "faqSettingsRepository");
        Intrinsics.checkNotNullParameter(lightenedFaqDao, "lightenedFaqDao");
        Intrinsics.checkNotNullParameter(faqDao, "faqDao");
        Intrinsics.checkNotNullParameter(treeHelper, "treeHelper");
        Intrinsics.checkNotNullParameter(faqTreeCache, "faqTreeCache");
        Intrinsics.checkNotNullParameter(faqCache, "faqCache");
        this.f125516a = faqDataProvider;
        this.f125517b = faqLanguageRepository;
        this.f125518c = lightenedFaqService;
        this.d = faqSettingsRepository;
        this.e = lightenedFaqDao;
        this.f = faqDao;
        this.f125519g = treeHelper;
        this.f125520h = faqTreeCache;
        this.i = faqCache;
        Continuation continuation = null;
        int i = 0;
        this.f125521j = new x4l.c(new a1(this, continuation, 14), new dkm.a(1, this, h.class, "getFaqTreeFromMemoryCache", "getFaqTreeFromMemoryCache(Lcom/revolut/core/faq/data/db/model/FaqLangKey;)Ljava/util/List;", i, 26), new a97.i(2, this, h.class, "putFaqTreeToMemoryCache", "putFaqTreeToMemoryCache(Lcom/revolut/core/faq/data/db/model/FaqLangKey;Ljava/util/List;)V", i, 24), new cyc.c(2, this, h.class, "getFaqTreeFromStorage", "getFaqTreeFromStorage(Lcom/revolut/core/faq/data/db/model/FaqLangKey;)Ljava/util/List;", 4, 16), new f1(this, continuation, 8));
        this.k = new x4l.c(new a1(this, continuation, 13), new dkm.a(1, this, h.class, "getFaqNodeFromMemory", "getFaqNodeFromMemory(Lcom/revolut/core/faq/data/repository/faq/LightenedFaqRepositoryImpl$FaqArticleRequest;)Lcom/revolut/core/model/faq/FaqEntry;", 0, 25), new a97.i(2, this, h.class, "putFaqNodeToMemory", "putFaqNodeToMemory(Lcom/revolut/core/faq/data/repository/faq/LightenedFaqRepositoryImpl$FaqArticleRequest;Lcom/revolut/core/model/faq/FaqEntry;)V", 0, 22), new a97.i(2, this, h.class, "getFaqNodeFromStorage", "getFaqNodeFromStorage(Lcom/revolut/core/faq/data/repository/faq/LightenedFaqRepositoryImpl$FaqArticleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 23), new f1(this, continuation, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(eg0.h r4, eg0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof eg0.d
            if (r0 == 0) goto L16
            r0 = r6
            eg0.d r0 = (eg0.d) r0
            int r1 = r0.f125511w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f125511w = r1
            goto L1b
        L16:
            eg0.d r0 = new eg0.d
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125511w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L4a
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            xf0.a r4 = r4.f
            java.lang.String r6 = r5.f125510c
            zf0.c r5 = r5.f125508a
            java.lang.String r5 = r5.e
            efm.k r4 = r4.c(r6, r5)
            r0.f125511w = r3
            java.lang.Object r6 = nim.a.i(r4, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            zf0.b r6 = (zf0.b) r6
            if (r6 == 0) goto L53
            aj0.c r4 = bg0.a.a(r6)
            return r4
        L53:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: eg0.h.a(eg0.h, eg0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(eg0.h r16, zf0.c r17, java.lang.String r18, java.lang.String r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg0.h.b(eg0.h, zf0.c, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r14 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(zf0.c r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg0.h.c(zf0.c, gim.c):java.io.Serializable");
    }

    public final l d(boolean z) {
        r rVarX = this.f125517b.b().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return q.Q(rd0.e.b(rVarX), new c0((Continuation) null, this, z, 1));
    }
}
