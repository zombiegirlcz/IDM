package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface yg extends qg0.a {

    public static final class a implements yg {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final nd1 f35285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f35286c;
        private final List d;
        private final String e;
        private final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f35287g;

        public a(nd1 expectations, Map extractedData, List validationErrors) {
            Intrinsics.checkNotNullParameter(expectations, "expectations");
            Intrinsics.checkNotNullParameter(extractedData, "extractedData");
            Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
            this.f35285b = expectations;
            this.f35286c = extractedData;
            this.d = validationErrors;
            this.e = "step_analysis_completed";
            this.f = "iglu:com.fourthline.sdk/step_analysis_completed/jsonschema/1-0-0";
            Pair pair = new Pair("expectations", zg.b(expectations));
            Pair pair2 = new Pair("result", extractedData);
            ArrayList arrayList = new ArrayList(zhm.w.t(validationErrors, 10));
            Iterator it8 = validationErrors.iterator();
            while (it8.hasNext()) {
                arrayList.add(vf.a((er) it8.next()));
            }
            this.f35287g = zhm.r0.k(pair, pair2, new Pair("validation_errors", arrayList));
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f35285b, aVar.f35285b) && Intrinsics.f(this.f35286c, aVar.f35286c) && Intrinsics.f(this.d, aVar.d);
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return this.f35287g;
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        public String getEventName() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public String getSchema() {
            return this.f;
        }

        public int hashCode() {
            return (((this.f35285b.hashCode() * 31) + this.f35286c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "StepAnalysisCompleted(expectations=" + this.f35285b + ", extractedData=" + this.f35286c + ", validationErrors=" + this.d + ")";
        }
    }

    public static final class b implements yg {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f35288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35289c = "step_analysis_failed";
        private final String d = "iglu:com.fourthline.sdk/step_analysis_failed/jsonschema/1-0-0";
        private final Map e;

        public b(Throwable th10) {
            this.f35288b = th10;
            aim.f builder = new aim.f();
            if (th10 != null) {
                builder.putAll(rg0.a(th10));
            } else {
                builder.put("error", "n/a");
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            this.e = builder.b();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f35288b, ((b) obj2).f35288b);
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        public String getEventName() {
            return this.f35289c;
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public String getSchema() {
            return this.d;
        }

        public int hashCode() {
            Throwable th10 = this.f35288b;
            if (th10 == null) {
                return 0;
            }
            return th10.hashCode();
        }

        public String toString() {
            return "StepAnalysisFailed(error=" + this.f35288b + ")";
        }
    }

    public static final class c implements yg {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final nd1 f35290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final er f35291c;
        private final String d;
        private final String e;
        private final Map f;

        public c(nd1 expectations, er validationError) {
            Intrinsics.checkNotNullParameter(expectations, "expectations");
            Intrinsics.checkNotNullParameter(validationError, "validationError");
            this.f35290b = expectations;
            this.f35291c = validationError;
            this.d = "step_analysis_repeat_error";
            this.e = "iglu:com.fourthline.sdk/step_analysis_repeat_error/jsonschema/1-0-0";
            this.f = zhm.r0.k(new Pair("expectations", zg.b(expectations)), new Pair("validation_error", vf.a(validationError)));
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f35290b, cVar.f35290b) && Intrinsics.f(this.f35291c, cVar.f35291c);
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return this.f;
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        public String getEventName() {
            return this.d;
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public String getSchema() {
            return this.e;
        }

        public int hashCode() {
            return (this.f35290b.hashCode() * 31) + this.f35291c.hashCode();
        }

        public String toString() {
            return "StepAnalysisRepeatError(expectations=" + this.f35290b + ", validationError=" + this.f35291c + ")";
        }
    }

    public static final class d implements yg {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final nd1 f35292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35293c;
        private final String d;
        private final Map e;

        public d(nd1 expectations) {
            Intrinsics.checkNotNullParameter(expectations, "expectations");
            this.f35292b = expectations;
            this.f35293c = "step_analysis_started";
            this.d = "iglu:com.fourthline.sdk/step_analysis_started/jsonschema/1-0-0";
            this.e = zhm.q0.c(new Pair("expectations", zg.b(expectations)));
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f35292b, ((d) obj2).f35292b);
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        public String getEventName() {
            return this.f35293c;
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public String getSchema() {
            return this.d;
        }

        public int hashCode() {
            return this.f35292b.hashCode();
        }

        public String toString() {
            return "StepAnalysisStarted(expectations=" + this.f35292b + ")";
        }
    }

    public static final class e implements yg {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f35294b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f35295c = "step_analysis_timeout";
        private static final String d = "iglu:com.fourthline.sdk/step_analysis_timeout/jsonschema/1-0-0";

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ Map getAttributes() {
            return super.getAttributes();
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        public String getEventName() {
            return f35295c;
        }

        @Override // com.fourthline.orca.internal.yg, com.fourthline.orca.internal.qg0.a, ib.f
        public String getSchema() {
            return d;
        }

        public int hashCode() {
            return 507710328;
        }

        public String toString() {
            return "StepAnalysisTimeout";
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
