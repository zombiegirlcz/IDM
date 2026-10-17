package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class or0 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f31743a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.or0$a$a, reason: collision with other inner class name */
        public static final class C0258a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0258a f31744b = new C0258a();

            private C0258a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0258a);
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -1336549477;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f31745b;

            public b(boolean z) {
                this.f31745b = z;
            }

            public final boolean a() {
                return this.f31745b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && this.f31745b == ((b) obj2).f31745b;
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return Boolean.hashCode(this.f31745b);
            }

            public String toString() {
                return "OnClaimsCheckBoxClicked(isChecked=" + this.f31745b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f31746b = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -39069743;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f31747b;

            public d(int i) {
                this.f31747b = i;
            }

            public final int a() {
                return this.f31747b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && this.f31747b == ((d) obj2).f31747b;
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return Integer.hashCode(this.f31747b);
            }

            public String toString() {
                return "OnLegalDocumentClicked(index=" + this.f31747b + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f31748b = new e();

            private e() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof e);
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 1314884879;
            }

            public String toString() {
                return "OnNextButtonClicked";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f31749b = new f();

            private f() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof f);
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 1456135422;
            }

            public String toString() {
                return "OnShowLessClicked";
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f31750b = new g();

            private g() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof g);
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 871962562;
            }

            public String toString() {
                return "OnShowMoreClicked";
            }
        }

        public static final class h implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f31751b;

            public h(int i) {
                this.f31751b = i;
            }

            public final int a() {
                return this.f31751b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof h) && this.f31751b == ((h) obj2).f31751b;
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return Integer.hashCode(this.f31751b);
            }

            public String toString() {
                return "OnSignDocumentClicked(index=" + this.f31751b + ")";
            }
        }

        public static final class i implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f31752b;

            public i(boolean z) {
                this.f31752b = z;
            }

            public final boolean a() {
                return this.f31752b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof i) && this.f31752b == ((i) obj2).f31752b;
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.or0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return Boolean.hashCode(this.f31752b);
            }

            public String toString() {
                return "OnTermsCheckBoxClicked(isChecked=" + this.f31752b + ")";
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

    public or0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f31743a = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "agreements", null, 2, null);
        this.f31743a.a(new xc1(null, 1, null));
    }

    private final void c() {
        jr0.c(jr0.f30017a, "agreements", null, 2, null);
    }

    private final void d() {
        jr0.b(jr0.f30017a, "agreements", null, 2, null);
        this.f31743a.a(new zc1(null, 1, null));
    }

    private final void e() {
        jr0.a(jr0.f30017a, "orca_agreements_screen_action_see_less", null, null, 6, null);
        this.f31743a.a(new yc1(null, 1, null));
    }

    private final void f() {
        jr0.a(jr0.f30017a, "orca_agreements_screen_action_see_more", null, null, 6, null);
        this.f31743a.a(new cd1(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.c) {
            c();
            return;
        }
        if (event instanceof a.C0258a) {
            b();
            return;
        }
        if (event instanceof a.e) {
            d();
            return;
        }
        if (event instanceof a.d) {
            a(((a.d) event).a());
            return;
        }
        if (event instanceof a.h) {
            b(((a.h) event).a());
            return;
        }
        if (event instanceof a.g) {
            f();
            return;
        }
        if (event instanceof a.f) {
            e();
        } else if (event instanceof a.i) {
            b(((a.i) event).a());
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((a.b) event).a());
        }
    }

    private final void b(boolean z) {
        jr0.a(jr0.f30017a, "orca_agreements_screen_action_terms_checkbox", null, zhm.q0.c(new Pair("value", Boolean.valueOf(z))), 2, null);
        this.f31743a.a(new jd1("legal_checkbox", Boolean.valueOf(z)));
    }

    private final void a(boolean z) {
        jr0.a(jr0.f30017a, "orca_agreements_screen_action_claims_checkbox", null, zhm.q0.c(new Pair("value", Boolean.valueOf(z))), 2, null);
        this.f31743a.a(new jd1("sign_document", Boolean.valueOf(z)));
    }

    private final void b(int i) {
        Map mapK = zhm.r0.k(new Pair("name", "sign_document"), new Pair("index", Integer.valueOf(i)));
        jr0.a(jr0.f30017a, "orca_agreements_screen_select_agreement", null, mapK, 2, null);
        this.f31743a.a(new ed1(mapK));
    }

    private final void a(int i) {
        Map mapK = zhm.r0.k(new Pair("name", "legal_document"), new Pair("index", Integer.valueOf(i)));
        jr0.a(jr0.f30017a, "orca_agreements_screen_select_legal_document", null, mapK, 2, null);
        this.f31743a.a(new ed1(mapK));
    }
}
