package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.qg0;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ho implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f29346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final to f29347b;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ho$a$a, reason: collision with other inner class name */
        public static final class C0212a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0212a f29348b = new C0212a();

            private C0212a() {
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f29349b = new b();

            private b() {
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f29350b = new c();

            private c() {
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f29351c = DocumentScannerStep.$stable;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentScannerStep f29352b;

            public d(DocumentScannerStep step) {
                Intrinsics.checkNotNullParameter(step, "step");
                this.f29352b = step;
            }

            public final DocumentScannerStep a() {
                return this.f29352b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f29352b, ((d) obj2).f29352b);
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f29352b.hashCode();
            }

            public String toString() {
                return "OnConfirmClicked(step=" + this.f29352b + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f29353c = DocumentScannerStep.$stable;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentScannerStep f29354b;

            public e(DocumentScannerStep step) {
                Intrinsics.checkNotNullParameter(step, "step");
                this.f29354b = step;
            }

            public final DocumentScannerStep a() {
                return this.f29354b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && Intrinsics.f(this.f29354b, ((e) obj2).f29354b);
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f29354b.hashCode();
            }

            public String toString() {
                return "OnConfirmationEntered(step=" + this.f29354b + ")";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f29355c = DocumentScannerStep.$stable;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentScannerStep f29356b;

            public f(DocumentScannerStep step) {
                Intrinsics.checkNotNullParameter(step, "step");
                this.f29356b = step;
            }

            public final DocumentScannerStep a() {
                return this.f29356b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof f) && Intrinsics.f(this.f29356b, ((f) obj2).f29356b);
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f29356b.hashCode();
            }

            public String toString() {
                return "OnDismissClicked(step=" + this.f29356b + ")";
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f29357b = new g();

            private g() {
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class h implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final h f29358b = new h();

            private h() {
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class i implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final i f29359b = new i();

            private i() {
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class j implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final j f29360b = new j();

            private j() {
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class k implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f29361c = DocumentScannerStep.$stable;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentScannerStep f29362b;

            public k(DocumentScannerStep step) {
                Intrinsics.checkNotNullParameter(step, "step");
                this.f29362b = step;
            }

            public final DocumentScannerStep a() {
                return this.f29362b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof k) && Intrinsics.f(this.f29362b, ((k) obj2).f29362b);
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f29362b.hashCode();
            }

            public String toString() {
                return "OnRetakeClicked(step=" + this.f29362b + ")";
            }
        }

        public static final class l implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final l f29363b = new l();

            private l() {
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ho.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
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

    public ho(sg0 tracker, to documentScannerRepository) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(documentScannerRepository, "documentScannerRepository");
        this.f29346a = tracker;
        this.f29347b = documentScannerRepository;
    }

    private final void b(DocumentScannerStep documentScannerStep) {
        jr0.f30017a.c("document_scan_confirm", a(documentScannerStep, this.f29347b.k()));
    }

    private final void c(DocumentScannerStep documentScannerStep) {
        Map mapA = a(documentScannerStep, this.f29347b.k());
        jr0.f30017a.a("document_scan", mapA);
        this.f29346a.a(new xc1(mapA));
    }

    private final void d(DocumentScannerStep documentScannerStep) {
        Map mapA = a(documentScannerStep, this.f29347b.k());
        jr0.f30017a.a("document_scan_confirm", mapA);
        this.f29346a.a(new fd1(mapA));
    }

    private final void e() {
        jr0.a(jr0.f30017a, "orca_document_scan_document_ready_popup_action_confirm", null, null, 6, null);
        this.f29346a.a(new nf("document_ready", new kd1.d(null, 1, null)));
    }

    private final void f() {
        jr0.a(jr0.f30017a, "orca_document_scan_document_ready_popup_action_cancel", null, null, 6, null);
        this.f29346a.a(new nf("document_ready", new kd1.a(null, 1, null)));
    }

    private final void g() {
        jr0.c(jr0.f30017a, "document_scan", null, 2, null);
    }

    private final void h() {
        jr0.a(jr0.f30017a, "orca_document_scan_confirm_action_preview", null, a(this.f29347b.k().getType()), 2, null);
    }

    private final void i() {
        jr0.b(jr0.f30017a, "document_scan", null, 2, null);
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.d) {
            a(((a.d) event).a());
            return;
        }
        if (event instanceof a.e) {
            b(((a.e) event).a());
            return;
        }
        if (event instanceof a.f) {
            c(((a.f) event).a());
            return;
        }
        if (event instanceof a.i) {
            g();
            return;
        }
        if (event instanceof a.k) {
            d(((a.k) event).a());
            return;
        }
        if (event instanceof a.b) {
            c();
            return;
        }
        if (event instanceof a.C0212a) {
            b();
            return;
        }
        if (event instanceof a.c) {
            d();
            return;
        }
        if (event instanceof a.l) {
            i();
            return;
        }
        if (event instanceof a.g) {
            e();
        } else if (event instanceof a.h) {
            f();
        } else {
            if (!(event instanceof a.j)) {
                throw new NoWhenBranchMatchedException();
            }
            h();
        }
    }

    private final Pair g(DocumentScannerStep documentScannerStep) {
        return new Pair("is_angled", Boolean.valueOf(documentScannerStep.isAngled()));
    }

    private final Pair e(DocumentScannerStep documentScannerStep) {
        return new Pair("fileside", wz.a(documentScannerStep.getFileSide()));
    }

    private final Pair f(DocumentScannerStep documentScannerStep) {
        return new Pair("index", Integer.valueOf(documentScannerStep.getIndex()));
    }

    private final void b() {
        jr0.a(jr0.f30017a, "orca_document_scan_action_camera_permission_denied", null, null, 6, null);
    }

    private final void c() {
        jr0.a(jr0.f30017a, "orca_document_scan_action_camera_permission_granted", null, null, 6, null);
    }

    private final void d() {
        jr0.a(jr0.f30017a, "orca_document_scan_action_camera_permission_open_settings", null, null, 6, null);
    }

    private final Pair h(DocumentScannerStep documentScannerStep) {
        return new Pair("is_autodetect_available", Boolean.valueOf(documentScannerStep.isAutoDetectAvailable()));
    }

    private final void a(DocumentScannerStep documentScannerStep) {
        Map mapA = a(documentScannerStep, this.f29347b.k());
        jr0.f30017a.b("document_scan_confirm", mapA);
        this.f29346a.a(new zc1(mapA));
    }

    private final Map a(DocumentScannerStep documentScannerStep, DocumentScannerConfig documentScannerConfig) {
        return zhm.r0.k(a(documentScannerConfig), e(documentScannerStep), f(documentScannerStep), g(documentScannerStep), h(documentScannerStep));
    }

    private final Pair a(DocumentScannerConfig documentScannerConfig) {
        return new Pair("document_type", wz.a(documentScannerConfig.getType()));
    }

    private final Map a(DocumentType documentType) {
        return zhm.q0.c(new Pair("document_type", DocumentTypeKt.toFourthlineValue(documentType)));
    }
}
