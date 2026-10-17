package fg0;

import com.revolut.core.faq.data.network.PigeonService;
import dp4.a1;
import dp4.f1;
import f2i.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wf0.m;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo6.b f134869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f134870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PigeonService f134871c;
    public final xf0.k d;
    public final a e;
    public final ne0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f134872g;

    public e(vo6.b faqDataProvider, m faqLanguageRepository, PigeonService pigeonService, xf0.k pigeonFaqDao, a pigeonDetailsJsonConverter, ne0.j nodeDetailsCache) {
        Intrinsics.checkNotNullParameter(faqDataProvider, "faqDataProvider");
        Intrinsics.checkNotNullParameter(faqLanguageRepository, "faqLanguageRepository");
        Intrinsics.checkNotNullParameter(pigeonService, "pigeonService");
        Intrinsics.checkNotNullParameter(pigeonFaqDao, "pigeonFaqDao");
        Intrinsics.checkNotNullParameter(pigeonDetailsJsonConverter, "pigeonDetailsJsonConverter");
        Intrinsics.checkNotNullParameter(nodeDetailsCache, "nodeDetailsCache");
        this.f134869a = faqDataProvider;
        this.f134870b = faqLanguageRepository;
        this.f134871c = pigeonService;
        this.d = pigeonFaqDao;
        this.e = pigeonDetailsJsonConverter;
        this.f = nodeDetailsCache;
        Continuation continuation = null;
        a1 a1Var = new a1(this, continuation, 27);
        int i = 0;
        x xVar = new x(1, this, e.class, "getNodeFromMemory", "getNodeFromMemory(Lcom/revolut/core/faq/data/repository/pigeon/PigeonNodeDetailRepositoryImpl$NodeRequest;)Lcom/revolut/core/model/faq/PigeonNodeDetails;", i, 15);
        int i2 = 2;
        this.f134872g = new x4l.c(a1Var, xVar, new a97.i(i2, this, e.class, "putNodeToMemory", "putNodeToMemory(Lcom/revolut/core/faq/data/repository/pigeon/PigeonNodeDetailRepositoryImpl$NodeRequest;Lcom/revolut/core/model/faq/PigeonNodeDetails;)V", i, 28), new exe.k(i2, this, e.class, "getNodeFromStorage", "getNodeFromStorage(Lcom/revolut/core/faq/data/repository/pigeon/PigeonNodeDetailRepositoryImpl$NodeRequest;)Lcom/revolut/core/model/faq/PigeonNodeDetails;", 4, 4), new f1(this, continuation, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(fg0.e r11, zf0.c r12, java.lang.String r13, java.lang.String r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fg0.e.a(fg0.e, zf0.c, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
