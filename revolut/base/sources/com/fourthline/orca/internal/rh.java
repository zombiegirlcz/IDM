package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rh implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c80 f32725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sg0 f32726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fd f32727c;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.rh$a$a, reason: collision with other inner class name */
        public static final class C0276a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0276a f32728b = new C0276a();

            private C0276a() {
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final fd f32729b;

            public b(fd selectedCountry) {
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f32729b = selectedCountry;
            }

            public final fd a() {
                return this.f32729b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f32729b, ((b) obj2).f32729b);
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f32729b.hashCode();
            }

            public String toString() {
                return "OnCountrySelected(selectedCountry=" + this.f32729b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f32730b = new c();

            private c() {
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final fd f32731b;

            public d(fd selectedCountry) {
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f32731b = selectedCountry;
            }

            public final fd a() {
                return this.f32731b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f32731b, ((d) obj2).f32731b);
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f32731b.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(selectedCountry=" + this.f32731b + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final fd f32732b;

            public e(fd selectedCountry) {
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f32732b = selectedCountry;
            }

            public final fd a() {
                return this.f32732b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && Intrinsics.f(this.f32732b, ((e) obj2).f32732b);
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.rh.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f32732b.hashCode();
            }

            public String toString() {
                return "OnUnsupportedCountrySelected(selectedCountry=" + this.f32732b + ")";
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

    public rh(c80 analyticsContext, sg0 tracker) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f32725a = analyticsContext;
        this.f32726b = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "document_country", null, 2, null);
        this.f32726b.a(new xc1(null, 1, null));
    }

    private final void c() {
        jr0.c(jr0.f30017a, "document_country", null, 2, null);
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0276a) {
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
        jr0.a(jr0.f30017a, "orca_document_country_error_popup_unsupported_country", null, zhm.q0.c(fdVar.d()), 2, null);
        Unit unit = Unit.f186387a;
        this.f32727c = fdVar;
    }

    private final void b(fd fdVar) {
        Map mapC = zhm.q0.c(fdVar.d());
        jr0.f30017a.b("document_country", mapC);
        Unit unit = Unit.f186387a;
        this.f32725a.set("document_country", fdVar.c());
        this.f32726b.a(new zc1(mapC));
    }

    private final void a(fd fdVar) {
        jr0.a(jr0.f30017a, "orca_document_country_action_select_country", null, zhm.q0.c(fdVar.d()), 2, null);
        Unit unit = Unit.f186387a;
        this.f32727c = fdVar;
        this.f32726b.a(new jd1("document_country", fdVar.c()));
    }
}
