package rf;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import grl.b4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import tf.g;
import ulm.v0;
import ulm.w0;
import ulm.x0;
import wf.e;
import xf.d0;
import xf.f0;
import xf.m0;
import xf.z;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends mf.d implements uf.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qf.a f253668h = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f253669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GaugeManager f253670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f253671c;
    public final z d;
    public final WeakReference e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f253672g;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(e eVar) {
        mf.c cVarA = mf.c.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(cVarA);
        this.d = f0.newBuilder();
        this.e = new WeakReference(this);
        this.f253671c = eVar;
        this.f253670b = gaugeManager;
        this.f253669a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public final void J(long j2) {
        z zVar = this.d;
        zVar.c();
        ((f0) zVar.f49761b).setResponsePayloadBytes(j2);
    }

    public final void T(long j2) {
        z zVar = this.d;
        zVar.c();
        ((f0) zVar.f49761b).setTimeToResponseCompletedUs(j2);
        if (SessionManager.getInstance().perfSession().f49591c) {
            this.f253670b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f49590b);
        }
    }

    public final void W(String str) {
        x0 x0VarD;
        int iLastIndexOf;
        if (str != null) {
            x0.Companion.getClass();
            x0 x0VarD2 = w0.d(str);
            if (x0VarD2 != null) {
                v0 v0VarG = x0VarD2.g();
                Intrinsics.checkNotNullParameter("", "username");
                v0VarG.f281157b = jmm.a.a("", 0, false, " \"':;<=>@[]^`{}|/\\?#", 0, 123);
                Intrinsics.checkNotNullParameter("", "password");
                v0VarG.f281158c = jmm.a.a("", 0, false, " \"':;<=>@[]^`{}|/\\?#", 0, 123);
                v0VarG.f281159g = null;
                v0VarG.f281160h = null;
                str = v0VarG.toString();
            }
            if (str.length() > 2000) {
                str = (str.charAt(b4.EXPIRED_OR_INVALID_KEY_VALUE) != '/' && (x0VarD = w0.d(str)) != null && x0VarD.b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, b4.EXPIRED_OR_INVALID_KEY_VALUE);
            }
            z zVar = this.d;
            zVar.c();
            ((f0) zVar.f49761b).setUrl(str);
        }
    }

    @Override // uf.a
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            f253668h.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        z zVar = this.d;
        if (!((f0) zVar.f49761b).hasClientStartTimeUs() || ((f0) zVar.f49761b).hasTimeToResponseCompletedUs()) {
            return;
        }
        this.f253669a.add(perfSession);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.e);
        unregisterForAppState();
        synchronized (this.f253669a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f253669a) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        m0[] m0VarArrB = PerfSession.b(listUnmodifiableList);
        if (m0VarArrB != null) {
            z zVar = this.d;
            List listAsList = Arrays.asList(m0VarArrB);
            zVar.c();
            ((f0) zVar.f49761b).addAllPerfSessions(listAsList);
        }
        f0 f0Var = (f0) this.d.a();
        String str = this.f;
        if (str == null) {
            Pattern pattern = g.f270143a;
        } else if (g.f270143a.matcher(str).matches()) {
            f253668h.a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (this.f253672g) {
            return;
        }
        e eVar = this.f253671c;
        eVar.i.execute(new vf.c(eVar, 3, f0Var, getAppState()));
        this.f253672g = true;
    }

    public final void c(String str) {
        d0 d0Var;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    d0Var = d0.OPTIONS;
                    break;
                case "GET":
                    d0Var = d0.GET;
                    break;
                case "PUT":
                    d0Var = d0.PUT;
                    break;
                case "HEAD":
                    d0Var = d0.HEAD;
                    break;
                case "POST":
                    d0Var = d0.POST;
                    break;
                case "PATCH":
                    d0Var = d0.PATCH;
                    break;
                case "TRACE":
                    d0Var = d0.TRACE;
                    break;
                case "CONNECT":
                    d0Var = d0.CONNECT;
                    break;
                case "DELETE":
                    d0Var = d0.DELETE;
                    break;
                default:
                    d0Var = d0.HTTP_METHOD_UNKNOWN;
                    break;
            }
            z zVar = this.d;
            zVar.c();
            ((f0) zVar.f49761b).setHttpMethod(d0Var);
        }
    }

    public final void d(int i) {
        z zVar = this.d;
        zVar.c();
        ((f0) zVar.f49761b).setHttpResponseCode(i);
    }

    public final void e(long j2) {
        z zVar = this.d;
        zVar.c();
        ((f0) zVar.f49761b).setRequestPayloadBytes(j2);
    }

    public final void j(long j2) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.e);
        z zVar = this.d;
        zVar.c();
        ((f0) zVar.f49761b).setClientStartTimeUs(j2);
        a(perfSession);
        if (perfSession.f49591c) {
            this.f253670b.collectGaugeMetricOnce(perfSession.f49590b);
        }
    }

    public final void z(String str) {
        z zVar = this.d;
        if (str == null) {
            zVar.c();
            ((f0) zVar.f49761b).clearResponseContentType();
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            zVar.c();
            ((f0) zVar.f49761b).setResponseContentType(str);
            return;
        }
        f253668h.f("The content type of the response is not a valid content-type:".concat(str));
    }
}
