package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nw0 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f31489a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.nw0$a$a, reason: collision with other inner class name */
        public static final class C0252a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0252a f31490b = new C0252a();

            private C0252a() {
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f31491b;

            public b(int i) {
                this.f31491b = i;
            }

            public final int a() {
                return this.f31491b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && this.f31491b == ((b) obj2).f31491b;
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return Integer.hashCode(this.f31491b);
            }

            public String toString() {
                return "OnDidFinishEditingCode(codeLength=" + this.f31491b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f31492b;

            public c(int i) {
                this.f31492b = i;
            }

            public final int a() {
                return this.f31492b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && this.f31492b == ((c) obj2).f31492b;
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return Integer.hashCode(this.f31492b);
            }

            public String toString() {
                return "OnDidStartEditingCode(codeLength=" + this.f31492b + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f31493b = new d();

            private d() {
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f31494b = new e();

            private e() {
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f31495b = new f();

            private f() {
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f31496b = new g();

            private g() {
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.nw0.a, com.fourthline.orca.internal.qg0.a, ib.f
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

    public nw0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f31489a = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "sign", null, 2, null);
        this.f31489a.a(new xc1(null, 1, null));
    }

    private final void c() {
        jr0.c(jr0.f30017a, "sign", null, 2, null);
    }

    private final void d() {
        jr0.a(jr0.f30017a, "orca_leave_popup", null, zhm.q0.c(ks0.f30377h.b()), 2, null);
    }

    private final void e() {
        jr0.b(jr0.f30017a, "sign", null, 2, null);
        this.f31489a.a(new zc1(null, 1, null));
    }

    private final void f() {
        jr0.a(jr0.f30017a, "orca_sign_screen_action_resend", null, null, 6, null);
        this.f31489a.a(new fd1(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.d) {
            c();
            return;
        }
        if (event instanceof a.C0252a) {
            b();
            return;
        }
        if (event instanceof a.f) {
            e();
            return;
        }
        if (event instanceof a.g) {
            f();
            return;
        }
        if (event instanceof a.c) {
            b(((a.c) event).a());
        } else if (event instanceof a.b) {
            a(((a.b) event).a());
        } else {
            if (!(event instanceof a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }

    private final void b(int i) {
        jr0.a(jr0.f30017a, "orca_sign_screen_did_start_editing_code", null, null, 6, null);
    }

    private final void a(int i) {
        jr0.a(jr0.f30017a, "orca_sign_screen_did_finish_editing_code", null, zhm.q0.c(new Pair("code_length", Integer.valueOf(i))), 2, null);
    }
}
