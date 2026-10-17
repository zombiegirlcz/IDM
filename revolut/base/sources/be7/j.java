package be7;

import com.revolut.feature.in_app_calls.InAppCallsDisabledException;
import hh0.d;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f14699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg0.a f14700b;

    public j(z70.a contextProvider, xg0.a dynamicDelivery, hh0.e cloudMessagingTokenProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(cloudMessagingTokenProvider, "cloudMessagingTokenProvider");
        this.f14699a = contextProvider;
        this.f14700b = dynamicDelivery;
    }

    public final Set a() throws IOException {
        Pair[] elements = {new Pair("InAppCalls", "true"), new Pair("InAppCalls.Module.Installed", d0.k0(((oi0.b) this.f14700b).d(this.f14699a.getContext(), h0.f322473a).f305465b, null, null, null, 0, null, 63)), new Pair("InAppCalls.Enabled", "true"), new Pair("InAppCalls.TokenProvider", d.Firebase.toString())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    public final void b(String str) {
        InAppCallsDisabledException inAppCallsDisabledException = new InAppCallsDisabledException("Unable to handle Twilio Push notification");
        aim.o oVar = new aim.o();
        oVar.add(new Pair("InAppCalls.CallId", String.valueOf(str)));
        oVar.addAll(a());
        aim.o oVarA = y0.a(oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "InAppCalls", null, inAppCallsDisabledException, oVarA);
    }
}
