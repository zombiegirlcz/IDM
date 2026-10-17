package lhi;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class u implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195301a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q06.d f195302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f195303c;
    public final Object d;
    public final Object e;

    public u(q06.d deeplinkParser, zm0.c sessionProvider, l93.f cardsInteractor, lfm.c disposable) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.f195302b = deeplinkParser;
        this.f195303c = sessionProvider;
        this.d = cardsInteractor;
        this.e = disposable;
    }

    public String a(s sVar, String str, String str2) {
        String strName = sVar.name();
        Locale locale = Locale.UK;
        StringBuilder sbM = v0.a.m("revolut://app/cryptocurrency-volatility/", str, "/", p.a.r(locale, "UK", strName, locale, "toLowerCase(...)"), "?baseCurrency=");
        sbM.append(str2);
        return sbM.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    @Override // hpa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(ipa.j r13) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lhi.u.b(ipa.j):boolean");
    }

    public u(b90.a pushMessagesTools, q06.d deeplinkParser, t70.g localization, ecm.q retailPreferencesInteractor, uli.f deeplinkSchemeProvider) {
        Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(retailPreferencesInteractor, "retailPreferencesInteractor");
        Intrinsics.checkNotNullParameter(deeplinkSchemeProvider, "deeplinkSchemeProvider");
        this.f195303c = pushMessagesTools;
        this.f195302b = deeplinkParser;
        this.d = localization;
        this.e = retailPreferencesInteractor;
    }
}
