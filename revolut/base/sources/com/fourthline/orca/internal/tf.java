package com.fourthline.orca.internal;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.orca.internal.qg0;
import com.fourthline.orca.internal.ug;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class tf implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f33758a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.tf$a$a, reason: collision with other inner class name */
        public static final class C0284a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f33759b;

            public C0284a(boolean z) {
                this.f33759b = z;
            }

            public final boolean a() {
                return this.f33759b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0284a) && this.f33759b == ((C0284a) obj2).f33759b;
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return Boolean.hashCode(this.f33759b);
            }

            public String toString() {
                return "OnEnterScreen(isAutoDetectResultAvailable=" + this.f33759b + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f33760b;

            public b(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f33760b = error;
            }

            public final Throwable a() {
                return this.f33760b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f33760b, ((b) obj2).f33760b);
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f33760b.hashCode();
            }

            public String toString() {
                return "OnError(error=" + this.f33760b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f33761b = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -1356848229;
            }

            public String toString() {
                return "OnSuccess";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f33762b = new d();

            private d() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -803589895;
            }

            public String toString() {
                return "OnTimeout";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final kn f33763b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final gg0 f33764c;
            private final MrzInfo d;
            private final List e;

            public e(kn knVar, gg0 gg0Var, MrzInfo mrzInfo, List validationErrors) {
                Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
                this.f33763b = knVar;
                this.f33764c = gg0Var;
                this.d = mrzInfo;
                this.e = validationErrors;
            }

            public final kn a() {
                return this.f33763b;
            }

            public final MrzInfo b() {
                return this.d;
            }

            public final gg0 c() {
                return this.f33764c;
            }

            public final List d() {
                return this.e;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof e)) {
                    return false;
                }
                e eVar = (e) obj2;
                return Intrinsics.f(this.f33763b, eVar.f33763b) && Intrinsics.f(this.f33764c, eVar.f33764c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.tf.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                kn knVar = this.f33763b;
                int iHashCode = (knVar == null ? 0 : knVar.hashCode()) * 31;
                gg0 gg0Var = this.f33764c;
                int iHashCode2 = (iHashCode + (gg0Var == null ? 0 : gg0Var.hashCode())) * 31;
                MrzInfo mrzInfo = this.d;
                return ((iHashCode2 + (mrzInfo != null ? mrzInfo.hashCode() : 0)) * 31) + this.e.hashCode();
            }

            public String toString() {
                return "OnValidResultReceived(documentRecognitionData=" + this.f33763b + ", ocrData=" + this.f33764c + ", mrzData=" + this.d + ", validationErrors=" + this.e + ")";
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

    public tf(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f33758a = tracker;
    }

    private final boolean a(Object obj2) {
        return obj2 != null;
    }

    private final void b() {
        jr0.b(jr0.f30017a, "document_analysis", null, 2, null);
    }

    private final void c() {
        jr0.a(jr0.f30017a, "orca_document_analysis_timeout", null, null, 6, null);
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0284a) {
            a(((a.C0284a) event).a());
            return;
        }
        if (event instanceof a.e) {
            a.e eVar = (a.e) event;
            a(eVar.a(), eVar.c(), eVar.b(), eVar.d());
        } else if (event instanceof a.d) {
            c();
        } else if (event instanceof a.b) {
            a(((a.b) event).a());
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            b();
        }
    }

    private final void a(Throwable th10) {
        hb.a.b(4, "orca_document_analysis_error", th10, null);
        this.f33758a.a(new ug.b(th10));
    }

    private final void a(boolean z) {
        jr0.f30017a.c("document_analysis", zhm.q0.c(new Pair("auto_detect_result_available", Boolean.valueOf(z))));
        this.f33758a.a(ug.c.f34084b);
    }

    private final void a(kn knVar, gg0 gg0Var, MrzInfo mrzInfo, List list) {
        String nationality;
        String issuingCountry;
        String documentType;
        String documentModel;
        Pair pair = new Pair("first_name", Boolean.valueOf(a(gg0Var != null ? gg0Var.getFirstName() : null)));
        Pair pair2 = new Pair("last_name", Boolean.valueOf(a(gg0Var != null ? gg0Var.getLastName() : null)));
        Pair pair3 = new Pair("initials", Boolean.valueOf(a(gg0Var != null ? gg0Var.getInitials() : null)));
        Pair pair4 = new Pair("gender", Boolean.valueOf(a(gg0Var != null ? gg0Var.getGender() : null)));
        String str = "n/a";
        if (gg0Var == null || (nationality = gg0Var.getNationality()) == null) {
            nationality = "n/a";
        }
        Pair pair5 = new Pair("nationality", nationality);
        if (gg0Var == null || (issuingCountry = gg0Var.getIssuingCountry()) == null) {
            issuingCountry = "n/a";
        }
        Pair pair6 = new Pair("issuing_country", issuingCountry);
        Pair pair7 = new Pair("issue_date", Boolean.valueOf(a(gg0Var != null ? gg0Var.getIssueDate() : null)));
        Pair pair8 = new Pair("expiration_date", Boolean.valueOf(a(gg0Var != null ? gg0Var.getExpirationDate() : null)));
        Pair pair9 = new Pair("birth_date", Boolean.valueOf(a(gg0Var != null ? gg0Var.getDateOfBirth() : null)));
        Pair pair10 = new Pair("birth_place", Boolean.valueOf(a(gg0Var != null ? gg0Var.getBirthPlace() : null)));
        Pair pair11 = new Pair("document_number", Boolean.valueOf(a(gg0Var != null ? gg0Var.getDocumentNumber() : null)));
        if (gg0Var == null || (documentType = gg0Var.getDocumentType()) == null) {
            documentType = "n/a";
        }
        Pair pair12 = new Pair("document_type", documentType);
        if (knVar != null && (documentModel = knVar.getDocumentModel()) != null) {
            str = documentModel;
        }
        Pair[] pairArr = {pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, new Pair("document_model", str), new Pair("tax_identification_number", Boolean.valueOf(a(gg0Var != null ? gg0Var.getTaxIdentificationNumber() : null))), new Pair("mrz", Boolean.valueOf(a(mrzInfo)))};
        jr0 jr0Var = jr0.f30017a;
        kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(2);
        s0Var.b(pairArr);
        s0Var.a(new Pair("isPublic", Boolean.FALSE));
        ArrayList arrayList = s0Var.f186433a;
        jr0.a(jr0Var, "orca_document_analysis_result_received", null, zhm.r0.k((Pair[]) arrayList.toArray(new Pair[arrayList.size()])), 2, null);
        this.f33758a.a(new ug.a(zhm.r0.w(pairArr), list));
    }
}
