package oo;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import kotlin.text.m;
import kotlin.text.o;
import po.c;
import po.e;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f226967a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f226968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f226969c;

    public a() {
        e eVar = new e(new Regex("\\b\\d+(?:\\D+\\d+)*\\b"));
        e eVar2 = new e(new Regex("[<{]+.*?[>}]+"));
        this.f226968b = eVar2;
        this.f226969c = v.k(new c(new Regex("\\?.*")), new e(new Regex("\\b(?:X:\\d+:[A-Z0-9]{3,}|[A-Z][A-Z0-9]{0,3}\\d?[A-Z0-9]{0,3}|[A-Z0-9]{0,3}\\d?[A-Z][A-Z0-9]{0,3})\\b")), new e(new Regex("\\b[0-9a-f]{8}-([0-9a-f]{4}-){3}[0-9a-f]{12}\\b")), eVar, eVar2);
    }

    public final String a(String str) {
        String str2;
        String rawDeeplinkUri = Uri.decode(str);
        Intrinsics.checkNotNullExpressionValue(rawDeeplinkUri, "decode(...)");
        b bVar = this.f226967a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(rawDeeplinkUri, "rawDeeplinkUri");
        Regex regex = bVar.f226970a;
        Regex.Companion companion = Regex.INSTANCE;
        o oVarB = regex.b(rawDeeplinkUri);
        if (oVarB == null || (str2 = (String) ((m) oVarB.c()).get(1)) == null || d0.W(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = Intrinsics.f(oVarB != null ? (String) ((m) oVarB.c()).get(0) : null, "app/") ? "/" : null;
        }
        if (str2 == null) {
            return null;
        }
        String input = str2;
        for (po.a aVar : this.f226969c) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(input, "input");
            input = aVar.a().replace(input, aVar.b());
        }
        String str3 = d0.W(input) ? null : input;
        return str3 == null ? str2 : str3;
    }
}
