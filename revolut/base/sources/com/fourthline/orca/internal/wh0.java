package com.fourthline.orca.internal;

import android.os.SystemClock;
import com.fourthline.orca.internal.qg0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class wh0 implements b80 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34687c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f34688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f34689b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b extends qg0.a {

        public static final class a implements b, ib.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34690b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final long f34691c;
            private final String d;
            private final String e;
            private final Map f;

            public a(String moduleName, long j2) {
                Intrinsics.checkNotNullParameter(moduleName, "moduleName");
                this.f34690b = moduleName;
                this.f34691c = j2;
                this.d = "iglu:com.fourthline.sdk/flow_completed/jsonschema/1-0-0";
                this.e = "flow_completed";
                this.f = zhm.r0.k(new Pair("name", moduleName), new Pair("elapsed_time", Long.valueOf(getElapsedTime())));
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.f34690b, aVar.f34690b) && this.f34691c == aVar.f34691c;
            }

            @Override // com.fourthline.orca.internal.wh0.b, com.fourthline.orca.internal.qg0.a, ib.f
            public Map getAttributes() {
                return this.f;
            }

            public long getElapsedTime() {
                return this.f34691c;
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public String getEventName() {
                return this.e;
            }

            @Override // com.fourthline.orca.internal.wh0.b, com.fourthline.orca.internal.qg0.a, ib.f
            public String getSchema() {
                return this.d;
            }

            public int hashCode() {
                return (this.f34690b.hashCode() * 31) + Long.hashCode(this.f34691c);
            }

            public String toString() {
                return "ModuleCompleted(moduleName=" + this.f34690b + ", elapsedTime=" + this.f34691c + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.wh0$b$b, reason: collision with other inner class name */
        public static final class C0305b implements b, ib.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34692b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Throwable f34693c;
            private final long d;
            private final String e;
            private final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Map f34694g;

            public C0305b(String moduleName, Throwable error, long j2) {
                Intrinsics.checkNotNullParameter(moduleName, "moduleName");
                Intrinsics.checkNotNullParameter(error, "error");
                this.f34692b = moduleName;
                this.f34693c = error;
                this.d = j2;
                this.e = "iglu:com.fourthline.sdk/flow_failed/jsonschema/1-0-0";
                this.f = "flow_failed";
                aim.f builder = new aim.f();
                builder.putAll(rg0.a(error));
                builder.put("name", moduleName);
                builder.put("elapsed_time", Long.valueOf(getElapsedTime()));
                Intrinsics.checkNotNullParameter(builder, "builder");
                this.f34694g = builder.b();
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0305b)) {
                    return false;
                }
                C0305b c0305b = (C0305b) obj2;
                return Intrinsics.f(this.f34692b, c0305b.f34692b) && Intrinsics.f(this.f34693c, c0305b.f34693c) && this.d == c0305b.d;
            }

            @Override // com.fourthline.orca.internal.wh0.b, com.fourthline.orca.internal.qg0.a, ib.f
            public Map getAttributes() {
                return this.f34694g;
            }

            public long getElapsedTime() {
                return this.d;
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public String getEventName() {
                return this.f;
            }

            @Override // com.fourthline.orca.internal.wh0.b, com.fourthline.orca.internal.qg0.a, ib.f
            public String getSchema() {
                return this.e;
            }

            public int hashCode() {
                return (((this.f34692b.hashCode() * 31) + this.f34693c.hashCode()) * 31) + Long.hashCode(this.d);
            }

            public String toString() {
                return "ModuleFailed(moduleName=" + this.f34692b + ", error=" + this.f34693c + ", elapsedTime=" + this.d + ")";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f34695b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f34696c;
            private final String d;
            private final Map e;

            public c(String moduleName) {
                Intrinsics.checkNotNullParameter(moduleName, "moduleName");
                this.f34695b = moduleName;
                this.f34696c = "iglu:com.fourthline.sdk/flow_started/jsonschema/1-0-0";
                this.d = "flow_started";
                this.e = zhm.q0.c(new Pair("name", moduleName));
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f34695b, ((c) obj2).f34695b);
            }

            @Override // com.fourthline.orca.internal.wh0.b, com.fourthline.orca.internal.qg0.a, ib.f
            public Map getAttributes() {
                return this.e;
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public String getEventName() {
                return this.d;
            }

            @Override // com.fourthline.orca.internal.wh0.b, com.fourthline.orca.internal.qg0.a, ib.f
            public String getSchema() {
                return this.f34696c;
            }

            public int hashCode() {
                return this.f34695b.hashCode();
            }

            public String toString() {
                return "ModuleStarted(moduleName=" + this.f34695b + ")";
            }
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        @NotNull
        default Map getAttributes() {
            return zhm.r0.g();
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        @NotNull
        /* bridge */ /* synthetic */ default String getSchema() {
            return "";
        }
    }

    public wh0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f34688a = tracker;
        this.f34689b = new LinkedHashMap();
    }

    @Override // com.fourthline.orca.internal.b80
    public void a(c80 analyticsContext, ny nyVar) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        this.f34689b.put(analyticsContext.getName(), Long.valueOf(b()));
        analyticsContext.a(nyVar);
        this.f34688a.a(analyticsContext);
        a(this.f34688a, nyVar);
        a(new b.c(analyticsContext.getName()));
    }

    @Override // com.fourthline.orca.internal.b80
    public void b(c80 analyticsContext) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        a(new b.a(analyticsContext.getName(), a(analyticsContext.getName())));
        this.f34688a.a(analyticsContext.getIdentifier());
        a(this.f34688a, analyticsContext.getName());
        this.f34689b.remove(analyticsContext.getName());
    }

    @Override // com.fourthline.orca.internal.b80
    public void a(c80 analyticsContext, kh0 error) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        Intrinsics.checkNotNullParameter(error, "error");
        a(new b.C0305b(analyticsContext.getName(), error, a(analyticsContext.getName())));
        this.f34688a.a(analyticsContext.getIdentifier());
        this.f34689b.remove(analyticsContext.getName());
    }

    private final long b() {
        return SystemClock.uptimeMillis();
    }

    private final void a(b bVar) {
        this.f34688a.a(bVar);
    }

    private final void a(sg0 sg0Var, ny nyVar) {
        uf ufVar;
        if (nyVar instanceof dj) {
            ufVar = new uf(((dj) nyVar).getIb.b.Analysis java.lang.String().getEnabled());
        } else {
            ufVar = nyVar instanceof um ? new uf(((um) nyVar).g()) : null;
        }
        if (ufVar != null) {
            sg0Var.a(ufVar);
        }
    }

    private final void a(sg0 sg0Var, String str) {
        String str2 = Intrinsics.f(str, "document") ? ib.b.Analysis : null;
        if (str2 != null) {
            sg0Var.a(str2);
        }
    }

    private final long a(String str) {
        Long l2 = (Long) this.f34689b.get(str);
        if (l2 == null) {
            return -1L;
        }
        return b() - l2.longValue();
    }
}
