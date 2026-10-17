package wf0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    @NotNull
    private static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf0.a f296895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xf0.e f296896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h0 f296897c;

    public j0(xf0.a faqDao, vo6.b faqDataProvider, xf0.e faqSettingsDao) {
        Intrinsics.checkNotNullParameter(faqDao, "faqDao");
        Intrinsics.checkNotNullParameter(faqDataProvider, "faqDataProvider");
        Intrinsics.checkNotNullParameter(faqSettingsDao, "faqSettingsDao");
        this.f296895a = faqDao;
        this.f296896b = faqSettingsDao;
    }

    public final String a(String str) {
        return a10.b.t(str, "lang", "faq_modified_time_", str);
    }

    public final pfm.r b(String lang, String time) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(time, "time");
        pfm.n nVar = new pfm.n(new tif.e(this, 8, lang, time), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        return te0.w.g0(nVar);
    }
}
