package vl0;

import androidx.biometric.BiometricManager;
import e8.r;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import pkm.e;
import rd0.d;
import wl0.o;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    public static final long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricManager f290164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final usc.a f290165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f290166c;
    public final r d;
    public static final /* synthetic */ KProperty[] e = {o0.f186429a.j(new h0(c.class, "biometricTypeInternal", "getBiometricTypeInternal()Lcom/revolut/core/security/biometrics/prompt/BiometricType;", 0))};

    @NotNull
    public static final b Companion = new b();

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f = kotlin.time.c.g(15, e.SECONDS);
    }

    public c(BiometricManager biometricManager, usc.a fingerprintManager, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(biometricManager, "biometricManager");
        Intrinsics.checkNotNullParameter(fingerprintManager, "fingerprintManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f290164a = biometricManager;
        this.f290165b = fingerprintManager;
        this.f290166c = coroutineScope;
        this.d = new r((Function0) new vch.a(this, 13));
    }

    public final int a() {
        try {
            return this.f290164a.canAuthenticate(15);
        } catch (Exception e2) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, e2, h0Var);
            return -1;
        }
    }

    public final o b() {
        return (o) this.d.b(e[0]);
    }
}
