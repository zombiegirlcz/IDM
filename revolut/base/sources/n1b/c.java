package n1b;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import l1b.i;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f211307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f211308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f211309c;

    public c(f80.a uriHelper, i deeplinkParser) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f211307a = uriHelper;
        this.f211308b = deeplinkParser;
        this.f211309c = v.k("credit/onboarding_pcw/ftc", "referral-code", "revolut-pay/join", "co-brands/promo");
    }

    public final boolean a(String str) {
        String path = ((f80.b) this.f211307a).f(str).getPath();
        if (path == null) {
            path = "";
        }
        List list = this.f211309c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (d0.J(path, (String) it8.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
