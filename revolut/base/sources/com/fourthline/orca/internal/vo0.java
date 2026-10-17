package com.fourthline.orca.internal;

import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class vo0 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f34410a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vo0$a$a, reason: collision with other inner class name */
        public static final class C0300a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0300a f34411b = new C0300a();

            private C0300a() {
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f34412b = new b();

            private b() {
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f34413b = new c();

            private c() {
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f34414b = new d();

            private d() {
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f34415b = new e();

            private e() {
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f34416b = new f();

            private f() {
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.vo0.a, com.fourthline.orca.internal.qg0.a, ib.f
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

    public vo0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f34410a = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "orca_poa_document_type_did_select_document", null, null, 6, null);
    }

    private final void c() {
        jr0.a(jr0.f30017a, "orca_leave_identity_check", null, zhm.q0.c(f10.d.b()), 2, null);
    }

    private final void d() {
        jr0.a(jr0.f30017a, "orca_poa_document_type_did_select_image", null, null, 6, null);
        this.f34410a.a(new nf("action_sheet", new kd1.q(null, 1, null)));
    }

    private final void e() {
        jr0.a(jr0.f30017a, "orca_poa_document_type_action_take_photo", null, null, 6, null);
        this.f34410a.a(new nf("action_sheet", new kd1.o(null, 1, null)));
    }

    private final void f() {
        jr0.a(jr0.f30017a, "orca_poa_document_type_action_select_image", null, null, 6, null);
        this.f34410a.a(new zc1(null, 1, null));
        this.f34410a.a(new of("action_sheet"));
    }

    private final void g() {
        jr0.a(jr0.f30017a, "orca_poa_document_type_action_upload_document", null, null, 6, null);
        this.f34410a.a(new nf("action_sheet", new kd1.q(null, 1, null)));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.b) {
            c();
            return;
        }
        if (event instanceof a.d) {
            e();
            return;
        }
        if (event instanceof a.f) {
            g();
            return;
        }
        if (event instanceof a.C0300a) {
            b();
        } else if (event instanceof a.e) {
            f();
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }
}
