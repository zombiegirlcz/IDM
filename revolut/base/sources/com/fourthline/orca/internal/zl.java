package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class zl implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f35628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fd f35629b;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.zl$a$a, reason: collision with other inner class name */
        public static final class C0321a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0321a f35630b = new C0321a();

            private C0321a() {
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final fd f35631b;

            public b(fd selectedCountry) {
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f35631b = selectedCountry;
            }

            public final fd a() {
                return this.f35631b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f35631b, ((b) obj2).f35631b);
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f35631b.hashCode();
            }

            public String toString() {
                return "OnCountrySelected(selectedCountry=" + this.f35631b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f35632b = new c();

            private c() {
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final fd f35633b;

            public d(fd selectedCountry) {
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f35633b = selectedCountry;
            }

            public final fd a() {
                return this.f35633b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f35633b, ((d) obj2).f35633b);
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f35633b.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(selectedCountry=" + this.f35633b + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final fd f35634b;

            public e(fd selectedCountry) {
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f35634b = selectedCountry;
            }

            public final fd a() {
                return this.f35634b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && Intrinsics.f(this.f35634b, ((e) obj2).f35634b);
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.zl.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f35634b.hashCode();
            }

            public String toString() {
                return "OnUnsupportedCountry(selectedCountry=" + this.f35634b + ")";
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

    public zl(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f35628a = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "nationality", null, 2, null);
        this.f35628a.a(new xc1(null, 1, null));
    }

    private final void c() {
        jr0.c(jr0.f30017a, "nationality", null, 2, null);
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0321a) {
            b();
            return;
        }
        if (event instanceof a.c) {
            c();
            return;
        }
        if (event instanceof a.d) {
            b(((a.d) event).a());
        } else if (event instanceof a.b) {
            a(((a.b) event).a());
        } else {
            if (!(event instanceof a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            c(((a.e) event).a());
        }
    }

    private final void c(fd fdVar) {
        jr0.a(jr0.f30017a, "orca_nationality_unsupported_country", null, zhm.q0.c(fdVar.d()), 2, null);
        Unit unit = Unit.f186387a;
        this.f35629b = fdVar;
        this.f35628a.a(new jd1("nationality", fdVar.c()));
    }

    private final void b(fd fdVar) {
        Map mapC = zhm.q0.c(fdVar.d());
        jr0.f30017a.b("nationality", mapC);
        this.f35628a.a(new zc1(mapC));
    }

    private final void a(fd fdVar) {
        jr0.a(jr0.f30017a, "orca_nationality_action_select_country", null, zhm.q0.c(fdVar.d()), 2, null);
        Unit unit = Unit.f186387a;
        this.f35629b = fdVar;
        this.f35628a.a(new jd1("nationality", fdVar.c()));
    }
}
