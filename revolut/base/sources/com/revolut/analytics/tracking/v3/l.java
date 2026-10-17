package com.revolut.analytics.tracking.v3;

import com.google.firebase.messaging.t;
import com.google.protobuf.d2;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.AnalyticEvent;
import com.revolut.tracking.v3.SettingsAccessibilityContext;
import com.revolut.tracking.v3.SettingsAppLifecycleContext;
import com.revolut.tracking.v3.SettingsDeeplinkContext;
import com.revolut.tracking.v3.SettingsExtensionsContext;
import com.revolut.tracking.v3.SettingsFeaturesContext;
import com.revolut.tracking.v3.SettingsLockContext;
import com.revolut.tracking.v3.SettingsMultifactorContext;
import com.revolut.tracking.v3.SettingsPermissionsContext;
import com.revolut.tracking.v3.SettingsProductOptInSourceContext;
import com.revolut.tracking.v3.SettingsSecurityContext;
import com.revolut.tracking.v3.SettingsThemingContext;
import com.revolut.tracking.v3.SettingsThirdPartySdkContext;
import com.revolut.tracking.v3.SettingsUnlockContext;
import com.revolut.tracking.v3.SuspiciousAppContext;
import d9.e1;
import grl.fb;
import grl.fc;
import grl.hb;
import grl.hc;
import grl.jb;
import grl.mb;
import grl.ob;
import grl.wb;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.Job;
import no.j2;
import no.n2;
import no.o;
import no.o2;
import no.p;
import no.p2;
import no.u2;
import no.z;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import uo.q0;
import uo.s;

/* JADX INFO: loaded from: classes.dex */
public final class l extends nri.a implements j2, o {

    @NotNull
    public static final n2 Companion = new n2();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f50338r = Duration.ofDays(1).toMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final afe.b f50339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bfe.f f50340c;
    public final uo.b d;
    public final q0 e;
    public final uo.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ue0.c f50341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gpk.c f50342h;
    public final d4m.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f50343j;
    public final p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f50344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ef0.b f50345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f86.a f50346n;
    public WeakReference o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Job f50347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f50348q;

    public l(afe.b suspiciousAppDetector, bfe.f overlayAppDetector, uo.b activeScreenHolder, q0 screenNameFinder, uo.l productMapper, ue0.c storage, gpk.c coroutineScopeProvider, d4m.a tracker, t settingsInfoProvider, p eventNotifier, s sessionIdProvider, ef0.b currentTimeProvider, f86.a deviceLockProtectionChecker) {
        Intrinsics.checkNotNullParameter(suspiciousAppDetector, "suspiciousAppDetector");
        Intrinsics.checkNotNullParameter(overlayAppDetector, "overlayAppDetector");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(settingsInfoProvider, "settingsInfoProvider");
        Intrinsics.checkNotNullParameter(eventNotifier, "eventNotifier");
        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(deviceLockProtectionChecker, "deviceLockProtectionChecker");
        this.f50339b = suspiciousAppDetector;
        this.f50340c = overlayAppDetector;
        this.d = activeScreenHolder;
        this.e = screenNameFinder;
        this.f = productMapper;
        this.f50341g = storage;
        this.f50342h = coroutineScopeProvider;
        this.i = tracker;
        this.f50343j = settingsInfoProvider;
        this.k = eventNotifier;
        this.f50344l = sessionIdProvider;
        this.f50345m = currentTimeProvider;
        this.f50346n = deviceLockProtectionChecker;
    }

    public static String k3(w0 w0Var) {
        if (w0Var instanceof SettingsAccessibilityContext) {
            return "a";
        }
        if (w0Var instanceof SettingsExtensionsContext) {
            return "e";
        }
        if (w0Var instanceof SettingsFeaturesContext) {
            return "f";
        }
        if (w0Var instanceof SettingsPermissionsContext) {
            return a0.d.n("p:", ((SettingsPermissionsContext) w0Var).getKindValue());
        }
        if (w0Var instanceof SettingsSecurityContext) {
            return a0.d.n("s:", ((SettingsSecurityContext) w0Var).getKindValue());
        }
        if (w0Var instanceof SettingsThemingContext) {
            return "t";
        }
        if (w0Var instanceof SettingsUnlockContext) {
            return "u";
        }
        if (w0Var instanceof SuspiciousAppContext) {
            return j6.a.q("s:", ((SuspiciousAppContext) w0Var).getPackageName());
        }
        if (w0Var instanceof SettingsLockContext) {
            return "sl";
        }
        throw new IllegalArgumentException("Unexpected context type: ".concat(w0Var.getClass().getSimpleName()));
    }

    public static int l3(d2 d2Var) {
        return Arrays.hashCode(d2Var != null ? d2Var.toByteArray() : null);
    }

    public static /* synthetic */ void n3(l lVar, AnalyticsProduct analyticsProduct, Function0 function0, int i) {
        if ((i & 1) != 0) {
            analyticsProduct = null;
        }
        lVar.m3(analyticsProduct, false, function0);
    }

    public static o2 s3(d2 d2Var) {
        return ((d2Var instanceof SettingsAppLifecycleContext) || (d2Var instanceof SettingsDeeplinkContext) || (d2Var instanceof SettingsFeaturesContext) || (d2Var instanceof SettingsMultifactorContext) || (d2Var instanceof SettingsProductOptInSourceContext) || (d2Var instanceof SettingsThemingContext) || (d2Var instanceof SettingsThirdPartySdkContext) || (d2Var instanceof SettingsUnlockContext)) ? o2.SEND_ALWAYS : d2Var instanceof SuspiciousAppContext ? o2.SEND_ONLY_CHANGES_IN_SCOPE_OF_SESSION : d2Var instanceof SettingsLockContext ? o2.SEND_PER_DAY_OR_CHANGES : o2.SEND_ONLY_CHANGES;
    }

    @Override // nri.a
    public final void i3() {
        if (this.f50348q) {
            return;
        }
        this.f50348q = true;
        z zVar = (z) this.k;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        zVar.f217891p.add(this);
    }

    public final void j3(AnalyticEvent event) {
        Class clsE0;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.hasAnyContext()) {
            com.google.protobuf.g anyContext = event.getAnyContext();
            w0 w0VarD0 = null;
            if (anyContext != null && (clsE0 = e1.e0(anyContext)) != null && (clsE0.equals(SettingsAccessibilityContext.class) || clsE0.equals(SettingsExtensionsContext.class) || clsE0.equals(SettingsFeaturesContext.class) || clsE0.equals(SettingsMultifactorContext.class) || clsE0.equals(SettingsPermissionsContext.class) || clsE0.equals(SettingsSecurityContext.class) || clsE0.equals(SettingsThemingContext.class) || clsE0.equals(SettingsUnlockContext.class) || clsE0.equals(SuspiciousAppContext.class) || clsE0.equals(SettingsLockContext.class) || clsE0.equals(SettingsProductOptInSourceContext.class))) {
                w0VarD0 = e1.d0(anyContext);
            }
            if (w0VarD0 == null) {
                return;
            }
            int i = p2.d[s3(w0VarD0).ordinal()];
            if (i != 1) {
                Class cls = Integer.TYPE;
                ue0.c cVar = this.f50341g;
                if (i == 2) {
                    String strK3 = k3(w0VarD0);
                    cVar.G(this.f50344l.a(), j6.a.q("session_", strK3), wim.z.d(o0.b(String.class)));
                    cVar.G(Integer.valueOf(l3(w0VarD0)), strK3, wim.z.d(o0.b(cls)));
                } else if (i == 3) {
                    cVar.G(Integer.valueOf(l3(w0VarD0)), k3(w0VarD0), wim.z.d(o0.b(cls)));
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strK32 = k3(w0VarD0);
                    cVar.G(Long.valueOf(this.f50345m.a() + f50338r), j6.a.q("expiration_timestamp_", strK32), wim.z.d(o0.b(Long.TYPE)));
                    cVar.G(Integer.valueOf(l3(w0VarD0)), strK32, wim.z.d(o0.b(cls)));
                }
            }
        }
    }

    public final void m3(AnalyticsProduct analyticsProduct, boolean z, Function0 function0) {
        i3();
        e0.C(this.f50342h.c(), null, null, new u2(function0, this, analyticsProduct, z, null), 3);
    }

    public final void o3(Boolean bool, jb outcome, hb hbVar, fb fbVar) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        n3(this, null, new bib.b(bool, outcome, hbVar, fbVar, 22), 3);
    }

    public final void p3(go.a permissionsState) {
        mb mbVar;
        ob obVar;
        Intrinsics.checkNotNullParameter(permissionsState, "permissionsState");
        switch (p2.f217828a[permissionsState.f145060a.ordinal()]) {
            case 1:
                mbVar = mb.PushNotifications;
                break;
            case 2:
                mbVar = mb.ContactsAccess;
                break;
            case 3:
                mbVar = mb.FaceRecognition;
                break;
            case 4:
                mbVar = mb.FingerprintRecognition;
                break;
            case 5:
                mbVar = mb.Microphone;
                break;
            case 6:
                mbVar = mb.Camera;
                break;
            case 7:
                mbVar = mb.Bluetooth;
                break;
            case 8:
                mbVar = mb.CalendarAccess;
                break;
            case 9:
                mbVar = mb.Location;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        boolean z = permissionsState.f145061b;
        if (z) {
            obVar = ob.Enabled;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            obVar = ob.Disabled;
        }
        m3(AnalyticsProduct.Shared.Environment.f, true, new bmm.t(mbVar, obVar, 10));
    }

    public final void q3(final wb kind, final boolean z, final String str, final String str2, final String str3) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        m3(AnalyticsProduct.Shared.FinCrime.f, true, new Function0() { // from class: no.k2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                SettingsSecurityContext.a aVarNewBuilder = SettingsSecurityContext.newBuilder();
                aVarNewBuilder.c();
                ((SettingsSecurityContext) aVarNewBuilder.f49761b).setKind(kind);
                aVarNewBuilder.c();
                ((SettingsSecurityContext) aVarNewBuilder.f49761b).setResult(z);
                String str4 = str;
                if (str4 != null) {
                    aVarNewBuilder.c();
                    ((SettingsSecurityContext) aVarNewBuilder.f49761b).setReasons(str4);
                }
                String str5 = str2;
                if (str5 != null) {
                    aVarNewBuilder.c();
                    ((SettingsSecurityContext) aVarNewBuilder.f49761b).setSessionId(str5);
                }
                String str6 = str3;
                if (str6 != null) {
                    aVarNewBuilder.c();
                    ((SettingsSecurityContext) aVarNewBuilder.f49761b).setProtectionVersion(str6);
                }
                com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            }
        });
    }

    public final void r3(fc method, hc outcome) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        n3(this, null, new ni1.a(method, outcome, 12), 3);
    }
}
