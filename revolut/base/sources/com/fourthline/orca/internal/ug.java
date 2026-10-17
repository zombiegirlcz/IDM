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
public interface ug extends qg0.a {

    public static final class a implements ug {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f34080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f34081c;
        private final String d;
        private final String e;
        private final Map f;

        public a(Map extractedData, List validationErrors) {
            Intrinsics.checkNotNullParameter(extractedData, "extractedData");
            Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
            this.f34080b = extractedData;
            this.f34081c = validationErrors;
            this.d = "result_analysis_completed";
            this.e = "iglu:com.fourthline.sdk/result_analysis_completed/jsonschema/1-0-0";
            Pair pair = new Pair("result", extractedData);
            ArrayList arrayList = new ArrayList(zhm.w.t(validationErrors, 10));
            Iterator it8 = validationErrors.iterator();
            while (it8.hasNext()) {
                arrayList.add(vf.a((er) it8.next()));
            }
            this.f = zhm.r0.k(pair, new Pair("validation_errors", arrayList));
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f34080b, aVar.f34080b) && Intrinsics.f(this.f34081c, aVar.f34081c);
        }

        @Override // com.fourthline.orca.internal.ug, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return this.f;
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        public String getEventName() {
            return this.d;
        }

        @Override // com.fourthline.orca.internal.ug, com.fourthline.orca.internal.qg0.a, ib.f
        public String getSchema() {
            return this.e;
        }

        public int hashCode() {
            return (this.f34080b.hashCode() * 31) + this.f34081c.hashCode();
        }

        public String toString() {
            return "ResultAnalysisCompleted(extractedData=" + this.f34080b + ", validationErrors=" + this.f34081c + ")";
        }
    }

    public static final class b implements ug {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f34082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f34083c = "result_analysis_failed";
        private final String d = "iglu:com.fourthline.sdk/result_analysis_failed/jsonschema/1-0-0";
        private final Map e;

        public b(Throwable th10) {
            this.f34082b = th10;
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
            return (obj2 instanceof b) && Intrinsics.f(this.f34082b, ((b) obj2).f34082b);
        }

        @Override // com.fourthline.orca.internal.ug, com.fourthline.orca.internal.qg0.a, ib.f
        public Map getAttributes() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        public String getEventName() {
            return this.f34083c;
        }

        @Override // com.fourthline.orca.internal.ug, com.fourthline.orca.internal.qg0.a, ib.f
        public String getSchema() {
            return this.d;
        }

        public int hashCode() {
            Throwable th10 = this.f34082b;
            if (th10 == null) {
                return 0;
            }
            return th10.hashCode();
        }

        public String toString() {
            return "ResultAnalysisFailed(error=" + this.f34082b + ")";
        }
    }

    public static final class c implements ug {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f34084b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f34085c = "result_analysis_started";
        private static final String d = "iglu:com.fourthline.sdk/result_analysis_started/jsonschema/1-0-0";

        private c() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        @Override // com.fourthline.orca.internal.ug, com.fourthline.orca.internal.qg0.a, ib.f
        public /* bridge */ Map getAttributes() {
            return super.getAttributes();
        }

        @Override // com.fourthline.orca.internal.qg0.a, ib.f
        public String getEventName() {
            return f34085c;
        }

        @Override // com.fourthline.orca.internal.ug, com.fourthline.orca.internal.qg0.a, ib.f
        public String getSchema() {
            return d;
        }

        public int hashCode() {
            return -1580408072;
        }

        public String toString() {
            return "ResultAnalysisStarted";
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
