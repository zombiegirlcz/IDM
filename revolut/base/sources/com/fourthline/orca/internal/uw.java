package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.ui0;
import com.fourthline.orca.internal.uw0;
import com.fourthline.orca.internal.wr0;
import com.fourthline.orca.qes.internal.error.QesError;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class uw implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f34199a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.uw$a$a, reason: collision with other inner class name */
        public static final class C0295a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f34200b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f34201c;
            private final String d;
            private final String e;
            private final Map f;

            public C0295a(Throwable error, String source) {
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(source, "source");
                this.f34200b = error;
                this.f34201c = source;
                this.d = "iglu:com.fourthline.sdk/dialog_started/jsonschema/1-0-0";
                this.e = "dialog_started";
                this.f = zhm.q0.c(new Pair("name", vw.a(error)));
            }

            public final Throwable a() {
                return this.f34200b;
            }

            public final String b() {
                return this.f34201c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0295a)) {
                    return false;
                }
                C0295a c0295a = (C0295a) obj2;
                return Intrinsics.f(this.f34200b, c0295a.f34200b) && Intrinsics.f(this.f34201c, c0295a.f34201c);
            }

            @Override // com.fourthline.orca.internal.uw.a, com.fourthline.orca.internal.qg0.a, ib.f
            public Map getAttributes() {
                return this.f;
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public String getEventName() {
                return this.e;
            }

            @Override // com.fourthline.orca.internal.uw.a, com.fourthline.orca.internal.qg0.a, ib.f
            public String getSchema() {
                return this.d;
            }

            public int hashCode() {
                return (this.f34200b.hashCode() * 31) + this.f34201c.hashCode();
            }

            public String toString() {
                return "OnPopupShown(error=" + this.f34200b + ", source=" + this.f34201c + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final kd1 f34202b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Throwable f34203c;
            private final String d;
            private final String e;
            private final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Map f34204g;

            public b(kd1 intent, Throwable error, String source) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(source, "source");
                this.f34202b = intent;
                this.f34203c = error;
                this.d = source;
                this.e = "iglu:com.fourthline.sdk/dialog_action/jsonschema/1-0-0";
                this.f = "dialog_action";
                this.f34204g = zhm.r0.k(new Pair("name", vw.a(error)), new Pair("intent", ld1.a(intent)));
            }

            public final Throwable a() {
                return this.f34203c;
            }

            public final kd1 b() {
                return this.f34202b;
            }

            public final String c() {
                return this.d;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f34202b, bVar.f34202b) && Intrinsics.f(this.f34203c, bVar.f34203c) && Intrinsics.f(this.d, bVar.d);
            }

            @Override // com.fourthline.orca.internal.uw.a, com.fourthline.orca.internal.qg0.a, ib.f
            public Map getAttributes() {
                return this.f34204g;
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public String getEventName() {
                return this.f;
            }

            @Override // com.fourthline.orca.internal.uw.a, com.fourthline.orca.internal.qg0.a, ib.f
            public String getSchema() {
                return this.e;
            }

            public int hashCode() {
                return (((this.f34202b.hashCode() * 31) + this.f34203c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "OnPrimaryClicked(intent=" + this.f34202b + ", error=" + this.f34203c + ", source=" + this.d + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final kd1 f34205b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Throwable f34206c;
            private final String d;
            private final String e;
            private final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Map f34207g;

            public c(kd1 intent, Throwable error, String source) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(source, "source");
                this.f34205b = intent;
                this.f34206c = error;
                this.d = source;
                this.e = "iglu:com.fourthline.sdk/dialog_action/jsonschema/1-0-0";
                this.f = "dialog_action";
                this.f34207g = zhm.r0.k(new Pair("name", vw.a(error)), new Pair("intent", ld1.a(intent)));
            }

            public final Throwable a() {
                return this.f34206c;
            }

            public final kd1 b() {
                return this.f34205b;
            }

            public final String c() {
                return this.d;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.f34205b, cVar.f34205b) && Intrinsics.f(this.f34206c, cVar.f34206c) && Intrinsics.f(this.d, cVar.d);
            }

            @Override // com.fourthline.orca.internal.uw.a, com.fourthline.orca.internal.qg0.a, ib.f
            public Map getAttributes() {
                return this.f34207g;
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public String getEventName() {
                return this.f;
            }

            @Override // com.fourthline.orca.internal.uw.a, com.fourthline.orca.internal.qg0.a, ib.f
            public String getSchema() {
                return this.e;
            }

            public int hashCode() {
                return (((this.f34205b.hashCode() * 31) + this.f34206c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "OnSecondaryClicked(intent=" + this.f34205b + ", error=" + this.f34206c + ", source=" + this.d + ")";
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

    public uw(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f34199a = tracker;
    }

    private final void b(kd1 kd1Var, Throwable th10, String str) {
        if (th10 instanceof QesError.Canceled) {
            jr0.a(jr0.f30017a, "orca_leave_product", null, zhm.q0.c(new Pair("source", str)), 2, null);
            return;
        }
        jr0.f30017a.b("orca_" + str + "_screen_error_popup_secondary_action", th10, zhm.r0.k(new Pair("orca_error", a(th10)), new Pair("recoverable", Boolean.valueOf(b(th10)))));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0295a) {
            a.C0295a c0295a = (a.C0295a) event;
            a(c0295a.a(), c0295a.b());
        } else if (event instanceof a.b) {
            a.b bVar = (a.b) event;
            a(bVar.b(), bVar.a(), bVar.c());
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a.c cVar = (a.c) event;
            b(cVar.b(), cVar.a(), cVar.c());
        }
        Unit unit = Unit.f186387a;
        this.f34199a.a(event);
    }

    private final void a(Throwable th10, String str) {
        if (th10 instanceof QesError.Canceled) {
            jr0.a(jr0.f30017a, "orca_leave_popup", null, zhm.q0.c(new Pair("source", str)), 2, null);
            return;
        }
        jr0.f30017a.b("orca_" + str + "_screen_error_popup", th10, zhm.r0.k(new Pair("orca_error", a(th10)), new Pair("recoverable", Boolean.valueOf(b(th10)))));
    }

    private final boolean b(Throwable th10) {
        return (th10 instanceof wr0.a) || (th10 instanceof uw0.a) || (th10 instanceof ui0.b) || (th10 instanceof re1.a) || (th10 instanceof re1.c) || (th10 instanceof QesError.Canceled);
    }

    private final void a(kd1 kd1Var, Throwable th10, String str) {
        if (th10 instanceof QesError.Canceled) {
            jr0.a(jr0.f30017a, "orca_leave_popup_action_stay", null, zhm.q0.c(new Pair("source", str)), 2, null);
            return;
        }
        jr0.f30017a.b("orca_" + str + "_screen_error_popup_primary_action", th10, zhm.r0.k(new Pair("orca_error", a(th10)), new Pair("recoverable", Boolean.valueOf(b(th10)))));
    }

    private final String a(Throwable th10) {
        return th10 instanceof kh0 ? ((kh0) th10).getAlias() : th10 instanceof uw0 ? ((uw0) th10).a() : th10.getClass().getSimpleName();
    }
}
