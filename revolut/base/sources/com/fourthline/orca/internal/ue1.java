package com.fourthline.orca.internal;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface ue1 extends ib.f {

    public static final class a implements ib.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f34066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f34067c = "iglu:com.fourthline.sdk/workflow_completed/jsonschema/1-0-0";
        private final String d = "workflow_completed";
        private final Map e = zhm.q0.c(new Pair("elapsed_time", Long.valueOf(getElapsedTime())));

        public a(long j2) {
            this.f34066b = j2;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f34066b == ((a) obj2).f34066b;
        }

        @Override // ib.f
        public Map getAttributes() {
            return this.e;
        }

        public long getElapsedTime() {
            return this.f34066b;
        }

        @Override // ib.f
        public String getEventName() {
            return this.d;
        }

        @Override // ib.f
        public String getSchema() {
            return this.f34067c;
        }

        public int hashCode() {
            return Long.hashCode(this.f34066b);
        }

        public String toString() {
            return "WorkflowCompleted(elapsedTime=" + this.f34066b + ")";
        }
    }

    public static final class b implements ue1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f34068b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f34069c = "iglu:com.fourthline.sdk/workflow_configured/jsonschema/1-0-0";
        private static final String d = "workflow_configured";

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        @Override // com.fourthline.orca.internal.ue1, ib.f
        public /* bridge */ Map getAttributes() {
            return super.getAttributes();
        }

        @Override // com.fourthline.orca.internal.ue1, ib.f
        public String getEventName() {
            return d;
        }

        @Override // com.fourthline.orca.internal.ue1, ib.f
        public String getSchema() {
            return f34069c;
        }

        public int hashCode() {
            return 1852223898;
        }

        public String toString() {
            return "WorkflowConfigured";
        }
    }

    public static final class c implements ib.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f34070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f34071c;
        private final String d;
        private final String e;
        private final Map f;

        public c(Throwable error, long j2) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f34070b = error;
            this.f34071c = j2;
            this.d = "iglu:com.fourthline.sdk/workflow_failed/jsonschema/1-0-0";
            this.e = "workflow_failed";
            aim.f builder = new aim.f();
            builder.putAll(rg0.a(error));
            builder.put("elapsed_time", Long.valueOf(getElapsedTime()));
            Intrinsics.checkNotNullParameter(builder, "builder");
            this.f = builder.b();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f34070b, cVar.f34070b) && this.f34071c == cVar.f34071c;
        }

        @Override // ib.f
        public Map getAttributes() {
            return this.f;
        }

        public long getElapsedTime() {
            return this.f34071c;
        }

        @Override // ib.f
        public String getEventName() {
            return this.e;
        }

        @Override // ib.f
        public String getSchema() {
            return this.d;
        }

        public int hashCode() {
            return (this.f34070b.hashCode() * 31) + Long.hashCode(this.f34071c);
        }

        public String toString() {
            return "WorkflowFailed(error=" + this.f34070b + ", elapsedTime=" + this.f34071c + ")";
        }
    }

    public static final class d implements ue1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f34072b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f34073c = "iglu:com.fourthline.sdk/workflow_started/jsonschema/1-0-0";
        private static final String d = "workflow_started";

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        @Override // com.fourthline.orca.internal.ue1, ib.f
        public /* bridge */ Map getAttributes() {
            return super.getAttributes();
        }

        @Override // com.fourthline.orca.internal.ue1, ib.f
        public String getEventName() {
            return d;
        }

        @Override // com.fourthline.orca.internal.ue1, ib.f
        public String getSchema() {
            return f34073c;
        }

        public int hashCode() {
            return 989996709;
        }

        public String toString() {
            return "WorkflowStarted";
        }
    }

    @Override // ib.f
    @NotNull
    default Map getAttributes() {
        return zhm.r0.g();
    }

    @Override // ib.f
    @NotNull
    /* synthetic */ String getEventName();

    @Override // ib.f
    @NotNull
    /* bridge */ /* synthetic */ default String getSchema() {
        return "";
    }
}
