package emc;

import b9k.f;
import kotlin.jvm.internal.Intrinsics;
import plc.o;
import w4l.h;
import w4l.i;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f127649a;

    public e(f templatesRepository) {
        Intrinsics.checkNotNullParameter(templatesRepository, "templatesRepository");
        this.f127649a = templatesRepository;
    }

    public final vkm.d a(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(((w4l.f) this.f127649a.f13816a).e(templateId, loadingStrategy));
    }

    public final vkm.d b(alc.c params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(((w4l.f) this.f127649a.d).e(params, loadingStrategy));
    }

    public final vkm.d c(String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(((w4l.f) this.f127649a.f13818c).e(params, loadingStrategy));
    }

    public final vkm.d d(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        return ((x4l.c) this.f127649a.f).b(templateId, h.f294642c);
    }

    public final vkm.d e(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(((w4l.f) this.f127649a.f13817b).e(new o(portfolioId), loadingStrategy));
    }
}
