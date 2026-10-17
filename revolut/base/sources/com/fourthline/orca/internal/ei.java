package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ei implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f28142a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ei$a$a, reason: collision with other inner class name */
        public static final class C0192a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f28143b;

            public C0192a(DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.f28143b = documentType;
            }

            public final DocumentType a() {
                return this.f28143b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0192a) && this.f28143b == ((C0192a) obj2).f28143b;
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f28143b.hashCode();
            }

            public String toString() {
                return "OnBackButtonClicked(documentType=" + this.f28143b + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f28144b;

            public b(DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.f28144b = documentType;
            }

            public final DocumentType a() {
                return this.f28144b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && this.f28144b == ((b) obj2).f28144b;
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f28144b.hashCode();
            }

            public String toString() {
                return "OnDateOfBirthClicked(documentType=" + this.f28144b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f28145b;

            public c(DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.f28145b = documentType;
            }

            public final DocumentType a() {
                return this.f28145b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && this.f28145b == ((c) obj2).f28145b;
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f28145b.hashCode();
            }

            public String toString() {
                return "OnDocumentNumberClicked(documentType=" + this.f28145b + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f28146b;

            public d(DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.f28146b = documentType;
            }

            public final DocumentType a() {
                return this.f28146b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && this.f28146b == ((d) obj2).f28146b;
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f28146b.hashCode();
            }

            public String toString() {
                return "OnEnterScreen(documentType=" + this.f28146b + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f28147b;

            public e(DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.f28147b = documentType;
            }

            public final DocumentType a() {
                return this.f28147b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && this.f28147b == ((e) obj2).f28147b;
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f28147b.hashCode();
            }

            public String toString() {
                return "OnExpirationDateClicked(documentType=" + this.f28147b + ")";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f28148b;

            public f(DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.f28148b = documentType;
            }

            public final DocumentType a() {
                return this.f28148b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof f) && this.f28148b == ((f) obj2).f28148b;
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ei.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f28148b.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(documentType=" + this.f28148b + ")";
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

    public ei(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f28142a = tracker;
    }

    private final void b(DocumentType documentType) {
        jr0.a(jr0.f30017a, "orca_document_details_action_edit_date_of_birth", null, g(documentType), 2, null);
    }

    private final void c(DocumentType documentType) {
        jr0.a(jr0.f30017a, "orca_document_details_action_edit_document_number", null, g(documentType), 2, null);
    }

    private final void d(DocumentType documentType) {
        jr0.f30017a.c("document_details", g(documentType));
    }

    private final void e(DocumentType documentType) {
        jr0.a(jr0.f30017a, "orca_document_details_action_edit_expiration_date", null, g(documentType), 2, null);
    }

    private final void f(DocumentType documentType) {
        jr0.f30017a.b("document_details", g(documentType));
        this.f28142a.a(new zc1(null, 1, null));
    }

    private final Map g(DocumentType documentType) {
        return zhm.q0.c(new Pair("document_type", wz.a(documentType)));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0192a) {
            a(((a.C0192a) event).a());
            return;
        }
        if (event instanceof a.b) {
            b(((a.b) event).a());
            return;
        }
        if (event instanceof a.c) {
            c(((a.c) event).a());
            return;
        }
        if (event instanceof a.d) {
            d(((a.d) event).a());
        } else if (event instanceof a.e) {
            e(((a.e) event).a());
        } else {
            if (!(event instanceof a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            f(((a.f) event).a());
        }
    }

    private final void a(DocumentType documentType) {
        jr0.f30017a.a("document_details", g(documentType));
        this.f28142a.a(new xc1(null, 1, null));
    }
}
