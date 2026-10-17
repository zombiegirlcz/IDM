package e0m;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f121747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f121748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f121749c;

    public f(zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f121747a = regexMatcher;
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.p0;
        Pair pair = new Pair(bVar, "^[A-Z,a-z]{1,2}\\d[A-Z,a-z\\d]?\\s*\\d[A-Z,a-z]{2}");
        wi0.b bVar2 = wi0.b.Y1;
        this.f121748b = r0.k(pair, new Pair(bVar2, "\\d{5}"));
        this.f121749c = r0.k(new Pair(bVar, "|([A-Z,a-z]{0,2})|([A-Z,a-z]\\d{1,2}\\s*\\d?)|([A-Z,a-z]\\d\\s*\\d[A-Z,a-z]{0,2})|([A-Z,a-z]\\d{2}\\s*\\d[A-Z,a-z]{1,2})|([A-Z,a-z]\\d[A-Z,a-z]\\s*\\d?)|([A-Z,a-z]\\d[A-Z,a-z]\\s*\\d[A-Z,a-z]{1,2})|([A-Z,a-z]{2}\\d{1,2}\\s*\\d?)|([A-Z,a-z]{2}\\d{1,2}\\s*\\d[A-Z,a-z]{1,2})|([A-Z,a-z]{2}\\d[A-Z,a-z]\\s*\\d?)|([A-Z,a-z]{2}\\d[A-Z,a-z]\\s*\\d[A-Z,a-z]{1,2})"), new Pair(bVar2, "^[0-9]*$"), new Pair(wi0.b.X0, "^[0-9]{3}-?[0-9]{1}-?[0-9]{3}"));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final boolean a(String text, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String str = (String) this.f121749c.get(countryCode);
        if (str != null) {
            return ((zzl.c) this.f121747a).a(str, text);
        }
        return true;
    }
}
