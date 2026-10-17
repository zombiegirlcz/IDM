package ami;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements xli.b {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih0.b f6463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f6464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f6465c;

    public r(ih0.b remoteConfig) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter("EID_DEEPLINK_UNIFIED_RULES_RETAIL", "allowlistKey");
        Intrinsics.checkNotNullParameter("EID_DEEPLINK_UNIFIED_DENYLIST_RULES_RETAIL", "denylistKey");
        this.f6463a = remoteConfig;
        final int i = 0;
        this.f6464b = yhm.j.b(new Function0(this) { // from class: ami.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6462b;

            {
                this.f6462b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.f6462b.a("EID_DEEPLINK_UNIFIED_RULES_RETAIL");
                    default:
                        return this.f6462b.a("EID_DEEPLINK_UNIFIED_DENYLIST_RULES_RETAIL");
                }
            }
        });
        final int i2 = 1;
        this.f6465c = yhm.j.b(new Function0(this) { // from class: ami.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6462b;

            {
                this.f6462b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f6462b.a("EID_DEEPLINK_UNIFIED_RULES_RETAIL");
                    default:
                        return this.f6462b.a("EID_DEEPLINK_UNIFIED_DENYLIST_RULES_RETAIL");
                }
            }
        });
    }

    public final xli.a a(String str) {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = (xli.a) ((ii0.b) this.f6463a).f(str, null, xli.a.INSTANCE.serializer());
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "UnifiedDeeplinkConfigProviderImpl", "Failed to read unified deeplink config from remote config", thA, h0Var);
        }
        return (xli.a) (objA instanceof yhm.n ? null : objA);
    }
}
