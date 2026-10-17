package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentFileSideKt;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.orca.internal.qg0;
import com.fourthline.orca.internal.yg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jq implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f30000a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.jq$a$a, reason: collision with other inner class name */
        public static final class C0229a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f30001b;

            public C0229a(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f30001b = error;
            }

            public final Throwable a() {
                return this.f30001b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0229a) && Intrinsics.f(this.f30001b, ((C0229a) obj2).f30001b);
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f30001b.hashCode();
            }

            public String toString() {
                return "OnError(error=" + this.f30001b + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final jn f30002b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final nd1 f30003c;
            private final List d;

            public b(jn result, nd1 expectations, List validationErrors) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(expectations, "expectations");
                Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
                this.f30002b = result;
                this.f30003c = expectations;
                this.d = validationErrors;
            }

            public final nd1 a() {
                return this.f30003c;
            }

            public final jn b() {
                return this.f30002b;
            }

            public final List c() {
                return this.d;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f30002b, bVar.f30002b) && Intrinsics.f(this.f30003c, bVar.f30003c) && Intrinsics.f(this.d, bVar.d);
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (((this.f30002b.hashCode() * 31) + this.f30003c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "OnResultReceived(result=" + this.f30002b + ", expectations=" + this.f30003c + ", validationErrors=" + this.d + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final er f30004b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final nd1 f30005c;

            public c(er validationError, nd1 expectations) {
                Intrinsics.checkNotNullParameter(validationError, "validationError");
                Intrinsics.checkNotNullParameter(expectations, "expectations");
                this.f30004b = validationError;
                this.f30005c = expectations;
            }

            public final nd1 a() {
                return this.f30005c;
            }

            public final er b() {
                return this.f30004b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.f30004b, cVar.f30004b) && Intrinsics.f(this.f30005c, cVar.f30005c);
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f30004b.hashCode() * 31) + this.f30005c.hashCode();
            }

            public String toString() {
                return "OnSkipRecurringError(validationError=" + this.f30004b + ", expectations=" + this.f30005c + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final nd1 f30006b;

            public d(nd1 expectations) {
                Intrinsics.checkNotNullParameter(expectations, "expectations");
                this.f30006b = expectations;
            }

            public final nd1 a() {
                return this.f30006b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f30006b, ((d) obj2).f30006b);
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f30006b.hashCode();
            }

            public String toString() {
                return "OnStart(expectations=" + this.f30006b + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f30007b = new e();

            private e() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof e);
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.jq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 1335141389;
            }

            public String toString() {
                return "OnTimeout";
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

    public jq(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f30000a = tracker;
    }

    private final void b() {
        hb.a.c(null, "orca_document_step_analysis_timeout", 6);
        this.f30000a.a(yg.e.f35294b);
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.d) {
            a(((a.d) event).a());
            return;
        }
        if (event instanceof a.b) {
            a.b bVar = (a.b) event;
            a(bVar.b(), bVar.a(), bVar.c());
        } else if (event instanceof a.c) {
            a.c cVar = (a.c) event;
            a(cVar.b(), cVar.a());
        } else if (event instanceof a.e) {
            b();
        } else {
            if (!(event instanceof a.C0229a)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((a.C0229a) event).a());
        }
    }

    private final Map b(nd1 nd1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("expected_issuing_country", nd1Var.d());
        linkedHashMap.put("expected_document_type", DocumentTypeKt.toFourthlineValue(nd1Var.c()));
        DocumentFileSide documentFileSideB = nd1Var.b();
        if (documentFileSideB != null) {
            linkedHashMap.put("expected_document_side", DocumentFileSideKt.toFourthlineValue(documentFileSideB));
        }
        Boolean boolA = nd1Var.a();
        if (boolA != null) {
            linkedHashMap.put("expected_is_angled", boolA);
        }
        return linkedHashMap;
    }

    private final void a(nd1 nd1Var) {
        this.f30000a.a(new yg.d(nd1Var));
    }

    private final void a(Throwable th10) {
        hb.a.b(4, "orca_document_step_analysis_error", th10, null);
        this.f30000a.a(new yg.b(th10));
    }

    private final void a(jn jnVar, nd1 nd1Var, List list) {
        Map mapA = a(jnVar);
        jr0 jr0Var = jr0.f30017a;
        aim.f builder = new aim.f();
        builder.put("isPublic", Boolean.FALSE);
        builder.putAll(mapA);
        builder.putAll(b(nd1Var));
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(vf.a((er) it8.next()));
        }
        builder.put("validation_errors", arrayList);
        Unit unit = Unit.f186387a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        jr0.a(jr0Var, "orca_document_step_analysis_result_received", null, builder.b(), 2, null);
        this.f30000a.a(new yg.a(nd1Var, zhm.r0.u(mapA), list));
    }

    private final void a(er erVar, nd1 nd1Var) {
        jr0 jr0Var = jr0.f30017a;
        aim.f builder = new aim.f();
        builder.put("isPublic", Boolean.FALSE);
        builder.put("validation_error", vf.a(erVar));
        builder.putAll(b(nd1Var));
        Unit unit = Unit.f186387a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        jr0.a(jr0Var, "orca_document_step_analysis_skip_error", null, builder.b(), 2, null);
        this.f30000a.a(new yg.c(nd1Var, erVar));
    }

    private final Map a(jn jnVar) {
        String documentSide;
        String documentModel;
        String documentType;
        String issuingCountry;
        fo value = jnVar.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (value != null && (issuingCountry = value.getIssuingCountry()) != null) {
            linkedHashMap.put("issuing_country", issuingCountry);
        }
        if (value != null && (documentType = value.getDocumentType()) != null) {
            linkedHashMap.put("document_type", documentType);
        }
        if (value != null && (documentModel = value.getDocumentModel()) != null) {
            linkedHashMap.put("document_model", documentModel);
        }
        if (value != null && (documentSide = value.getDocumentSide()) != null) {
            linkedHashMap.put("document_side", documentSide);
        }
        return linkedHashMap;
    }
}
