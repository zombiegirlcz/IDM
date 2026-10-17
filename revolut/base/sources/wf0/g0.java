package wf0;

import com.revolut.core.faq.data.network.FaqService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo6.b f296886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f296887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FaqService f296888c;
    public final x4l.c d;
    public final x4l.c e;

    public g0(vo6.b faqDataProvider, m faqLanguageRepository, FaqService faqService) {
        Intrinsics.checkNotNullParameter(faqDataProvider, "faqDataProvider");
        Intrinsics.checkNotNullParameter(faqLanguageRepository, "faqLanguageRepository");
        Intrinsics.checkNotNullParameter(faqService, "faqService");
        this.f296886a = faqDataProvider;
        this.f296887b = faqLanguageRepository;
        this.f296888c = faqService;
        this.d = new x4l.c(new f0(this, null, 1), new wd3.a(26), new b(2), new rp1.c(2, 28, null), new uyd.e0(3, 15, null));
        this.e = new x4l.c(new f0(this, null, 0), new wd3.a(27), new b(3), new rp1.c(2, 27, null), new uyd.e0(3, 14, null));
    }
}
