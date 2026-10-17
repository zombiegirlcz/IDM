package ami;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f6449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1j.b f6450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f6451c;

    public i(l kompotDeeplinkGatewayResolver, t1j.b legacyDeeplinkPatternProvider, n sideEffectRegistry) {
        Intrinsics.checkNotNullParameter(kompotDeeplinkGatewayResolver, "kompotDeeplinkGatewayResolver");
        Intrinsics.checkNotNullParameter(legacyDeeplinkPatternProvider, "legacyDeeplinkPatternProvider");
        Intrinsics.checkNotNullParameter(sideEffectRegistry, "sideEffectRegistry");
        this.f6449a = kompotDeeplinkGatewayResolver;
        this.f6450b = legacyDeeplinkPatternProvider;
        this.f6451c = sideEffectRegistry;
    }

    public final String a(zli.b deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        l lVar = this.f6449a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        k kVarA = lVar.a(deeplink);
        Object obj2 = null;
        String strA = kVarA != null ? kVarA.f6453b : null;
        if (strA == null) {
            String str = deeplink.f323279b;
            String strG0 = d0.G0(d0.z0(str, "?", str), '/');
            String normalizedPath = d0.W(strG0) ? "/" : "/".concat(strG0);
            Intrinsics.checkNotNullParameter(normalizedPath, "normalizedPath");
            strA = ((s06.d) ((q06.f) this.f6450b.f267380b)).a(normalizedPath);
            if (strA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("No legacy deeplink pattern found for ".concat(normalizedPath));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "DeeplinkTrackingTemplateProvider", null, illegalStateException, h0Var);
            }
            if (strA == null) {
                awa.b bVarB = this.f6451c.b(deeplink);
                if (bVarB == null) {
                    return null;
                }
                Iterator it8 = bVarB.f10755b.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (hx7.l.s(deeplink, (String) next) != null) {
                        obj2 = next;
                        break;
                    }
                }
                return (String) obj2;
            }
        }
        return strA;
    }
}
