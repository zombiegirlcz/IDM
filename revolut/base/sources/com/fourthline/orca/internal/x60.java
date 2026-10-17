package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class x60 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f34898a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.x60$a$a, reason: collision with other inner class name */
        public static final class C0308a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0308a f34899b = new C0308a();

            private C0308a() {
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f34900b = new b();

            private b() {
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f34901b = new c();

            private c() {
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f34902b = new d();

            private d() {
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f34903b = new e();

            private e() {
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f34904b = new f();

            private f() {
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.x60.a, com.fourthline.orca.internal.qg0.a, ib.f
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

    public x60(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f34898a = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "location_scan", null, 2, null);
        this.f34898a.a(new xc1(null, 1, null));
    }

    private final void c() {
        jr0.c(jr0.f30017a, "location_scan", null, 2, null);
    }

    private final void d() {
        jr0.a(jr0.f30017a, "orca_location_scan_action_location_permission_cancel", null, null, 6, null);
    }

    private final void e() {
        jr0.a(jr0.f30017a, "orca_location_scan_action_location_permission_denied", null, null, 6, null);
    }

    private final void f() {
        jr0.a(jr0.f30017a, "orca_location_scan_action_location_permission_granted", null, null, 6, null);
    }

    private final void g() {
        jr0.b(jr0.f30017a, "location_scan", null, 2, null);
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.b) {
            c();
            return;
        }
        if (event instanceof a.C0308a) {
            b();
            return;
        }
        if (event instanceof a.f) {
            g();
            return;
        }
        if (event instanceof a.c) {
            d();
        } else if (event instanceof a.d) {
            e();
        } else {
            if (!(event instanceof a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            f();
        }
    }
}
