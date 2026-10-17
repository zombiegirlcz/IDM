package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ol0 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f31683a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ol0$a$a, reason: collision with other inner class name */
        public static final class C0257a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0257a f31684b = new C0257a();

            private C0257a() {
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f31685b = new b();

            private b() {
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f31686b = new c();

            private c() {
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f31687b = new d();

            private d() {
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f31688b = new e();

            private e() {
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f31689b = new f();

            private f() {
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f31690b = new g();

            private g() {
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ol0.a, com.fourthline.orca.internal.qg0.a, ib.f
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

    public ol0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f31683a = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "personal_details", null, 2, null);
        this.f31683a.a(new xc1(null, 1, null));
    }

    private final void c() {
        jr0.a(jr0.f30017a, "orca_personal_details_action_edit_date_of_birth", null, null, 6, null);
    }

    private final void d() {
        jr0.c(jr0.f30017a, "personal_details", null, 2, null);
    }

    private final void e() {
        jr0.a(jr0.f30017a, "orca_personal_details_action_edit_first_name", null, null, 6, null);
    }

    private final void f() {
        jr0.a(jr0.f30017a, "orca_personal_details_action_edit_gender", null, null, 6, null);
    }

    private final void g() {
        jr0.a(jr0.f30017a, "orca_personal_details_action_edit_last_name", null, null, 6, null);
    }

    private final void h() {
        jr0.b(jr0.f30017a, "personal_details", null, 2, null);
        this.f31683a.a(new zc1(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0257a) {
            b();
            return;
        }
        if (event instanceof a.c) {
            d();
            return;
        }
        if (event instanceof a.d) {
            e();
            return;
        }
        if (event instanceof a.e) {
            f();
            return;
        }
        if (event instanceof a.f) {
            g();
        } else if (event instanceof a.b) {
            c();
        } else {
            if (!(event instanceof a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            h();
        }
    }
}
