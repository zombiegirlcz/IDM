package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.qg0;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.ui0;
import com.fourthline.orca.internal.uw0;
import com.fourthline.orca.internal.wr0;
import com.fourthline.orca.qes.internal.error.QesError;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class tp0 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f33822a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.tp0$a$a, reason: collision with other inner class name */
        public static final class C0286a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final hq0 f33823b;

            public C0286a(hq0 type) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.f33823b = type;
            }

            public hq0 a() {
                return this.f33823b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0286a) && Intrinsics.f(this.f33823b, ((C0286a) obj2).f33823b);
            }

            @Override // com.fourthline.orca.internal.tp0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.tp0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f33823b.hashCode();
            }

            public String toString() {
                return "OnPopupShown(type=" + this.f33823b + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final hq0 f33824b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final kd1 f33825c;

            public b(hq0 type, kd1 intent) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.f33824b = type;
                this.f33825c = intent;
            }

            public final kd1 a() {
                return this.f33825c;
            }

            public hq0 b() {
                return this.f33824b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f33824b, bVar.f33824b) && Intrinsics.f(this.f33825c, bVar.f33825c);
            }

            @Override // com.fourthline.orca.internal.tp0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.tp0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f33824b.hashCode() * 31) + this.f33825c.hashCode();
            }

            public String toString() {
                return "OnPrimaryClicked(type=" + this.f33824b + ", intent=" + this.f33825c + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final hq0 f33826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final kd1 f33827c;

            public c(hq0 type, kd1 intent) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.f33826b = type;
                this.f33827c = intent;
            }

            public final kd1 a() {
                return this.f33827c;
            }

            public hq0 b() {
                return this.f33826b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.f33826b, cVar.f33826b) && Intrinsics.f(this.f33827c, cVar.f33827c);
            }

            @Override // com.fourthline.orca.internal.tp0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.tp0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f33826b.hashCode() * 31) + this.f33827c.hashCode();
            }

            public String toString() {
                return "OnSecondaryClicked(type=" + this.f33826b + ", intent=" + this.f33827c + ")";
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

    public tp0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f33822a = tracker;
    }

    private final void b(hq0 hq0Var) {
        jr0.f30017a.b("orca_" + hq0Var.a() + "_screen_error_popup", hq0Var instanceof hq0.c ? ((hq0.c) hq0Var).c() : null, a(hq0Var));
        this.f33822a.a(new of(up0.b(hq0Var)));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0286a) {
            b(((a.C0286a) event).a());
            return;
        }
        if (event instanceof a.b) {
            a.b bVar = (a.b) event;
            a(bVar.b(), bVar.a());
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a.c cVar = (a.c) event;
            b(cVar.b(), cVar.a());
        }
    }

    private final void a(hq0 hq0Var, kd1 kd1Var) {
        jr0.f30017a.b("orca_" + hq0Var.a() + "_screen_error_popup_primary_action", hq0Var instanceof hq0.c ? ((hq0.c) hq0Var).c() : null, a(hq0Var));
        this.f33822a.a(new nf(up0.b(hq0Var), kd1Var));
    }

    private final void b(hq0 hq0Var, kd1 kd1Var) {
        jr0.f30017a.b("orca_" + hq0Var.a() + "_screen_error_popup_secondary_action", hq0Var instanceof hq0.c ? ((hq0.c) hq0Var).c() : null, a(hq0Var));
        this.f33822a.a(new nf(up0.b(hq0Var), kd1Var));
    }

    private final Map a(hq0 hq0Var) {
        if (hq0Var instanceof hq0.c) {
            hq0.c cVar = (hq0.c) hq0Var;
            return zhm.r0.k(new Pair("orca_error", cVar.c().getAlias()), new Pair("recoverable", Boolean.valueOf(a(cVar.c()))));
        }
        return zhm.r0.g();
    }

    private final boolean a(Throwable th10) {
        return (th10 instanceof wr0.a) || (th10 instanceof uw0.a) || (th10 instanceof ui0.b) || (th10 instanceof re1.a) || (th10 instanceof re1.c) || (th10 instanceof QesError.Canceled);
    }
}
