package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pb1 implements qg0 {

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pb1$a$a, reason: collision with other inner class name */
        public static final class C0262a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f31918b;

            public C0262a(boolean z) {
                this.f31918b = z;
            }

            public final boolean a() {
                return this.f31918b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0262a) && this.f31918b == ((C0262a) obj2).f31918b;
            }

            @Override // com.fourthline.orca.internal.pb1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.pb1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return Boolean.hashCode(this.f31918b);
            }

            public String toString() {
                return "OnAttachHandler(defaultHandlerPresent=" + this.f31918b + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f31919b = new b();

            private b() {
            }

            @Override // com.fourthline.orca.internal.pb1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.pb1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f31920b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Thread f31921c;

            public c(Throwable throwable, Thread thread) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(thread, "thread");
                this.f31920b = throwable;
                this.f31921c = thread;
            }

            public final Thread a() {
                return this.f31921c;
            }

            public final Throwable b() {
                return this.f31920b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.f31920b, cVar.f31920b) && Intrinsics.f(this.f31921c, cVar.f31921c);
            }

            @Override // com.fourthline.orca.internal.pb1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.pb1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f31920b.hashCode() * 31) + this.f31921c.hashCode();
            }

            public String toString() {
                return "OnUncaughtFourthlineException(throwable=" + this.f31920b + ", thread=" + this.f31921c + ")";
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

    private final void b() {
        jr0.a(jr0.f30017a, "orca_error_handler_remove", null, zhm.q0.c(new Pair("isPublic", Boolean.FALSE)), 2, null);
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0262a) {
            a(((a.C0262a) event).a());
            return;
        }
        if (event instanceof a.b) {
            b();
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a.c cVar = (a.c) event;
            a(cVar.b(), cVar.a());
        }
    }

    private final void a(boolean z) {
        jr0.a(jr0.f30017a, "orca_error_handler_add", null, zhm.r0.k(new Pair("has_default_handler", Boolean.valueOf(z)), new Pair("isPublic", Boolean.FALSE)), 2, null);
    }

    private final void a(Throwable th10, Thread thread) {
        jr0.f30017a.a("orca_uncaught_exception", th10, zhm.q0.c(new Pair("isPublic", Boolean.FALSE)));
        ib.c cVar = new ib.c(th10, thread);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(cVar);
        }
    }
}
