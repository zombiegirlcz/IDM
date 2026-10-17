package y5j;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b90.a f311099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q06.d f311100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.g f311101c;

    public k(b90.a pushMessagesTools, q06.d deeplinkParser, t70.g localization, uli.f deeplinkSchemeProvider) {
        Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(deeplinkSchemeProvider, "deeplinkSchemeProvider");
        this.f311099a = pushMessagesTools;
        this.f311100b = deeplinkParser;
        this.f311101c = localization;
    }

    public final String a(i iVar, String str, String str2) {
        String strName = iVar.name();
        Locale locale = Locale.UK;
        StringBuilder sbM = v0.a.m("revolut://app/commodities-volatility/", str, "/", p.a.r(locale, "UK", strName, locale, "toLowerCase(...)"), "?baseCurrency=");
        sbM.append(str2);
        return sbM.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // hpa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(ipa.j r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5j.k.b(ipa.j):boolean");
    }
}
