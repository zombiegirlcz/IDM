package rga;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i90.b f254048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f254049b;

    public c(i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f254048a = uuidUtils;
        this.f254049b = new ConcurrentHashMap();
    }

    public final String a(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        String value = y.u(this.f254048a, "toString(...)");
        this.f254049b.put(tag2, value);
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    public final String b(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        String value = (String) this.f254049b.get(tag2);
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "PriceQuoteTraceIdHolder", p.a.p("Price quote trace id requested for tag '", tag2, "' but not generated"), null, h0Var);
        return null;
    }
}
