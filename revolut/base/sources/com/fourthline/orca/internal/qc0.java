package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class qc0 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f32385a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qc0$a$a, reason: collision with other inner class name */
        public static final class C0272a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0272a f32386b = new C0272a();

            private C0272a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0272a);
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 1371270090;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f32387b = new b();

            private b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -542771902;
            }

            public String toString() {
                return "OnEditCan";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f32388b = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 1994289984;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f32389b = new d();

            private d() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 1633359767;
            }

            public String toString() {
                return "OnLinkButtonClicked";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f32390b = new e();

            private e() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof e);
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.qc0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -272262850;
            }

            public String toString() {
                return "OnNextButtonClicked";
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

    public qc0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f32385a = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "document_can", null, 2, null);
        this.f32385a.a(new xc1(null, 1, null));
    }

    private final void c() {
        jr0.a(jr0.f30017a, "document_can_action_edit_can_number", null, null, 6, null);
    }

    private final void d() {
        jr0.c(jr0.f30017a, "document_can", null, 2, null);
    }

    private final void e() {
        jr0.a(jr0.f30017a, "document_can_action_take_photos", null, null, 6, null);
        this.f32385a.a(new id1(null, 1, null));
    }

    private final void f() {
        jr0.b(jr0.f30017a, "document_can", null, 2, null);
        this.f32385a.a(new zc1(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0272a) {
            b();
            return;
        }
        if (event instanceof a.c) {
            d();
            return;
        }
        if (event instanceof a.d) {
            e();
        } else if (event instanceof a.e) {
            f();
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c();
        }
    }
}
