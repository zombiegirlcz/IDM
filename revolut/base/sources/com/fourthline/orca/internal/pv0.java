package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pv0 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f32057a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pv0$a$a, reason: collision with other inner class name */
        public static final class C0267a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0267a f32058b = new C0267a();

            private C0267a() {
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Map f32059b;

            public b(Map usageAttributes) {
                Intrinsics.checkNotNullParameter(usageAttributes, "usageAttributes");
                this.f32059b = usageAttributes;
            }

            public final Map a() {
                return this.f32059b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f32059b, ((b) obj2).f32059b);
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f32059b.hashCode();
            }

            public String toString() {
                return "OnDocumentClosed(usageAttributes=" + this.f32059b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f32060b = new c();

            private c() {
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f32061b = new d();

            private d() {
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f32062b = new e();

            private e() {
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.pv0.a, com.fourthline.orca.internal.qg0.a, ib.f
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

    public pv0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f32057a = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "document_viewer", null, 2, null);
        this.f32057a.a(new xc1(null, 1, null));
    }

    private final void c() {
        jr0.a(jr0.f30017a, "orca_document_viewer_screen_action_download", null, null, 6, null);
        this.f32057a.a(new ad1(null, 1, null));
    }

    private final void d() {
        jr0.c(jr0.f30017a, "document_viewer", null, 2, null);
    }

    private final void e() {
        jr0.a(jr0.f30017a, "orca_document_viewer_screen_action_share", null, null, 6, null);
        this.f32057a.a(new hd1(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0267a) {
            b();
            return;
        }
        if (event instanceof a.d) {
            d();
            return;
        }
        if (event instanceof a.c) {
            c();
        } else if (event instanceof a.e) {
            e();
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((a.b) event).a());
        }
    }

    private final void a(Map map) {
        jr0.a(jr0.f30017a, "orca_document_viewer_screen_ux_summary", null, map, 2, null);
    }
}
