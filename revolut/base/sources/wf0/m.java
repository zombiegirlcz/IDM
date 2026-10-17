package wf0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f296901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo6.b f296902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0.b f296903c;

    public m(j0 faqSettingsRepository, vo6.b faqDataProvider, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(faqSettingsRepository, "faqSettingsRepository");
        Intrinsics.checkNotNullParameter(faqDataProvider, "faqDataProvider");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f296901a = faqSettingsRepository;
        this.f296902b = faqDataProvider;
        this.f296903c = languageProvider;
    }

    public final String a() {
        Locale localeA = ((s80.b) this.f296903c).a();
        return com.google.android.gms.internal.mlkit_vision_face.a.o(localeA.getLanguage(), "-", localeA.getCountry());
    }

    public final ufm.i b() {
        efm.d0 d0VarI0;
        String currentLocale = a();
        j0 j0Var = this.f296901a;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        h0 h0Var = j0Var.f296897c;
        if (h0Var == null || !Intrinsics.f(h0Var.a(), currentLocale)) {
            ufm.c cVar = new ufm.c(new to7.f(j0Var, currentLocale, 26), 2);
            Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
            d0VarI0 = te0.w.i0(cVar);
        } else {
            d0VarI0 = efm.d0.m(h0Var.b());
            Intrinsics.checkNotNullExpressionValue(d0VarI0, "just(...)");
        }
        ufm.i iVar = new ufm.i(this.f296902b.f290871a.f(false), new vif.c(new vn8.a(3), 28), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(te0.w.H0(d0VarI0, iVar), new w4l.c(new wb3.k(currentLocale, 3), 25), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}
