package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class y11 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f35129a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.y11$a$a, reason: collision with other inner class name */
        public static final class C0312a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0312a f35130b = new C0312a();

            private C0312a() {
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f35131b = new b();

            private b() {
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f35132b = new c();

            private c() {
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelfieScannerStep f35133b;

            public d(SelfieScannerStep step) {
                Intrinsics.checkNotNullParameter(step, "step");
                this.f35133b = step;
            }

            public final SelfieScannerStep a() {
                return this.f35133b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && this.f35133b == ((d) obj2).f35133b;
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f35133b.hashCode();
            }

            public String toString() {
                return "OnConfirmClicked(step=" + this.f35133b + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelfieScannerStep f35134b;

            public e(SelfieScannerStep step) {
                Intrinsics.checkNotNullParameter(step, "step");
                this.f35134b = step;
            }

            public final SelfieScannerStep a() {
                return this.f35134b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && this.f35134b == ((e) obj2).f35134b;
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f35134b.hashCode();
            }

            public String toString() {
                return "OnConfirmationEntered(step=" + this.f35134b + ")";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelfieScannerStep f35135b;

            public f(SelfieScannerStep step) {
                Intrinsics.checkNotNullParameter(step, "step");
                this.f35135b = step;
            }

            public final SelfieScannerStep a() {
                return this.f35135b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof f) && this.f35135b == ((f) obj2).f35135b;
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f35135b.hashCode();
            }

            public String toString() {
                return "OnDismissClicked(step=" + this.f35135b + ")";
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f35136b = new g();

            private g() {
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class h implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final h f35137b = new h();

            private h() {
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class i implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelfieScannerStep f35138b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final SelfieScannerError f35139c;

            public i(SelfieScannerStep step, SelfieScannerError error) {
                Intrinsics.checkNotNullParameter(step, "step");
                Intrinsics.checkNotNullParameter(error, "error");
                this.f35138b = step;
                this.f35139c = error;
            }

            public final SelfieScannerError a() {
                return this.f35139c;
            }

            public final SelfieScannerStep b() {
                return this.f35138b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof i)) {
                    return false;
                }
                i iVar = (i) obj2;
                return this.f35138b == iVar.f35138b && this.f35139c == iVar.f35139c;
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f35138b.hashCode() * 31) + this.f35139c.hashCode();
            }

            public String toString() {
                return "OnRetakeClicked(step=" + this.f35138b + ", error=" + this.f35139c + ")";
            }
        }

        public static final class j implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final j f35140b = new j();

            private j() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof j);
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.y11.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -770805705;
            }

            public String toString() {
                return "OnScannerSuccess";
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

    public y11(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f35129a = tracker;
    }

    private final void b(SelfieScannerStep selfieScannerStep) {
        jr0.f30017a.c("selfie_scan_confirm", zhm.q0.c(d(selfieScannerStep)));
    }

    private final void c(SelfieScannerStep selfieScannerStep) {
        Map mapC = zhm.q0.c(d(selfieScannerStep));
        jr0.f30017a.a("selfie_scan", mapC);
        this.f35129a.a(new xc1(mapC));
    }

    private final void d() {
        jr0.a(jr0.f30017a, "orca_selfie_scan_action_camera_permission_open_settings", null, null, 6, null);
    }

    private final void e() {
        jr0.c(jr0.f30017a, "selfie_scan", null, 2, null);
    }

    private final void f() {
        jr0.a(jr0.f30017a, "orca_document_scan_confirm_action_preview", null, null, 6, null);
        this.f35129a.a(new ed1(null, 1, null));
    }

    private final void g() {
        jr0.b(jr0.f30017a, "selfie_scan", null, 2, null);
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
        if (event instanceof a.h) {
            f();
            return;
        }
        if (event instanceof a.g) {
            e();
            return;
        }
        if (event instanceof a.j) {
            g();
            return;
        }
        if (event instanceof a.i) {
            a.i iVar = (a.i) event;
            a(iVar.b(), iVar.a());
        } else if (event instanceof a.b) {
            c();
        } else if (event instanceof a.C0312a) {
            b();
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }

    private final Pair d(SelfieScannerStep selfieScannerStep) {
        return new Pair("step", wz.a(selfieScannerStep));
    }

    private final void b() {
        jr0.a(jr0.f30017a, "orca_selfie_scan_action_camera_permission_denied", null, null, 6, null);
    }

    private final void c() {
        jr0.a(jr0.f30017a, "orca_selfie_scan_action_camera_permission_granted", null, null, 6, null);
    }

    private final void a(SelfieScannerStep selfieScannerStep) {
        Map mapC = zhm.q0.c(d(selfieScannerStep));
        jr0.f30017a.b("selfie_scan_confirm", mapC);
        this.f35129a.a(new zc1(mapC));
    }

    private final void a(SelfieScannerStep selfieScannerStep, SelfieScannerError selfieScannerError) {
        Map mapK = zhm.r0.k(d(selfieScannerStep), a(selfieScannerError));
        jr0.f30017a.a("selfie_scan_confirm", mapK);
        this.f35129a.a(new fd1(mapK));
    }

    private final Pair a(SelfieScannerError selfieScannerError) {
        return new Pair("orca_error", wz.a(selfieScannerError));
    }
}
