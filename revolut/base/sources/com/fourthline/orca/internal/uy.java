package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class uy implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f34214a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.uy$a$a, reason: collision with other inner class name */
        public static final class C0296a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0296a f34215b = new C0296a();

            private C0296a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0296a);
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 1571641093;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f34216b = new b();

            private b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -1569177781;
            }

            public String toString() {
                return "OnDataConsentViewed";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f34217b = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -2111592773;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f34218b = new d();

            private d() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -71891847;
            }

            public String toString() {
                return "OnNextButtonClicked";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final yk f34219b;

            public e(yk flowType) {
                Intrinsics.checkNotNullParameter(flowType, "flowType");
                this.f34219b = flowType;
            }

            public final yk a() {
                return this.f34219b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && this.f34219b == ((e) obj2).f34219b;
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f34219b.hashCode();
            }

            public String toString() {
                return "OnOptionSelected(flowType=" + this.f34219b + ")";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f34220b = new f();

            private f() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof f);
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.uy.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -217746135;
            }

            public String toString() {
                return "OnUnableToContinueClicked";
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

    public uy(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f34214a = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "document_flow_selection", null, 2, null);
        this.f34214a.a(new xc1(null, 1, null));
    }

    private final void c() {
    }

    private final void d() {
        jr0.c(jr0.f30017a, "document_flow_selection", null, 2, null);
    }

    private final void e() {
        jr0.b(jr0.f30017a, "document_flow_selection", null, 2, null);
        this.f34214a.a(new zc1(null, 1, null));
    }

    private final void f() {
        jr0.b(jr0.f30017a, "document_flow_selection", null, 2, null);
        this.f34214a.a(new bd1(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0296a) {
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
        if (event instanceof a.f) {
            f();
        } else if (event instanceof a.e) {
            a(((a.e) event).a());
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c();
        }
    }

    private final void a(yk ykVar) {
        jr0.a(jr0.f30017a, "document_flow_selection_action_select_option", null, zhm.q0.c(new Pair("flow_type", wz.a(ykVar))), 2, null);
    }
}
