package com.fourthline.orca.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class db implements v90, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f27688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f27689c;
    private final a d;

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.db$a$a, reason: collision with other inner class name */
        public static final class C0183a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27691a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ db f27692b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0183a(db dbVar, Continuation continuation) {
                super(2, continuation);
                this.f27692b = dbVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0183a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                return new C0183a(this.f27692b, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f27691a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Network[] allNetworks = this.f27692b.f27688b.getAllNetworks();
                Intrinsics.checkNotNullExpressionValue(allNetworks, "getAllNetworks(...)");
                if (allNetworks.length == 0) {
                    jr0.a(jr0.f30017a, "network_connection_lost", null, zhm.q0.c(new Pair("isPublic", Boolean.FALSE)), 2, null);
                }
                return Unit.f186387a;
            }
        }

        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            String str = "unknown";
            Pair pair = new Pair("network_type", networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(2) ? "bluetooth" : networkCapabilities.hasTransport(8) ? "usb" : "unknown");
            Pair pair2 = new Pair("vpn_connected", Boolean.valueOf(networkCapabilities.hasTransport(4)));
            Boolean bool = Boolean.FALSE;
            Map mapK = zhm.r0.k(pair, pair2, new Pair("isPublic", bool));
            if (mapK.equals(db.this.f27689c)) {
                return;
            }
            db.this.f27689c = mapK;
            jr0 jr0Var = jr0.f30017a;
            if (networkCapabilities.hasTransport(1)) {
                str = "wifi";
            } else if (networkCapabilities.hasTransport(0)) {
                str = "cellular";
            } else if (networkCapabilities.hasTransport(3)) {
                str = "ethernet";
            } else if (networkCapabilities.hasTransport(2)) {
                str = "bluetooth";
            } else if (networkCapabilities.hasTransport(8)) {
                str = "usb";
            }
            jr0.a(jr0Var, "network_connection_connected", null, zhm.r0.k(new Pair("network_type", str), new Pair("vpn_connected", Boolean.valueOf(networkCapabilities.hasTransport(4))), new Pair("isPublic", bool)), 2, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            db dbVar = db.this;
            skm.e0.C(dbVar, null, null, new C0183a(dbVar, null), 3);
        }
    }

    public db(ConnectivityManager connectivityManager, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27687a = coroutineScope;
        this.f27688b = connectivityManager;
        this.f27689c = zhm.r0.g();
        this.d = new a();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f27688b.unregisterNetworkCallback(this.d);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f27687a.getF74819h();
    }

    @Override // com.fourthline.orca.internal.v90
    public void a() {
        this.f27688b.registerDefaultNetworkCallback(this.d);
    }
}
