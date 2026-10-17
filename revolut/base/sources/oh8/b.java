package oh8;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih0.b f225322a;

    public b(ih0.b remoteConfig) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.f225322a = remoteConfig;
    }

    public final long a(String str, long j2, e eVar) {
        Long l2 = null;
        try {
            long jD = ((ii0.b) this.f225322a).d(str);
            Long lValueOf = Long.valueOf(jD);
            long j3 = eVar.f186451a;
            if (jD <= eVar.f186452b && j3 <= jD) {
                l2 = lValueOf;
            }
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e, h0Var);
        }
        if (l2 != null) {
            j2 = l2.longValue();
        }
        b.Companion companion = kotlin.time.b.INSTANCE;
        return kotlin.time.c.h(j2, pkm.e.MILLISECONDS);
    }
}
