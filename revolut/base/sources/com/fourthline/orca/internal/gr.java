package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.qg0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class gr implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f28969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f28970b;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gr$a$a, reason: collision with other inner class name */
        public static final class C0205a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0205a f28971b = new C0205a();

            private C0205a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0205a);
            }

            @Override // com.fourthline.orca.internal.gr.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.gr.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -1458962558;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f28972b = new b();

            private b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            @Override // com.fourthline.orca.internal.gr.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.gr.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return -1739345672;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f28973b = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            @Override // com.fourthline.orca.internal.gr.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.gr.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return 1192471798;
            }

            public String toString() {
                return "OnNextButtonClicked";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Date f28974b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final fd f28975c;

            public d(Date date, fd country) {
                Intrinsics.checkNotNullParameter(country, "country");
                this.f28974b = date;
                this.f28975c = country;
            }

            public final fd a() {
                return this.f28975c;
            }

            public final Date b() {
                return this.f28974b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof d)) {
                    return false;
                }
                d dVar = (d) obj2;
                return Intrinsics.f(this.f28974b, dVar.f28974b) && Intrinsics.f(this.f28975c, dVar.f28975c);
            }

            @Override // com.fourthline.orca.internal.gr.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.gr.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                Date date = this.f28974b;
                return ((date == null ? 0 : date.hashCode()) * 31) + this.f28975c.hashCode();
            }

            public String toString() {
                return "OnVersionSelected(issueDate=" + this.f28974b + ", country=" + this.f28975c + ")";
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

    public gr(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f28969a = tracker;
        this.f28970b = yhm.j.b(new dl1(17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    private final SimpleDateFormat c() {
        return (SimpleDateFormat) this.f28970b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d() {
        jr0.a(jr0.f30017a, "document_version", null, 2, null);
        this.f28969a.a(new xc1(null, 1, 0 == true ? 1 : 0));
    }

    private final void e() {
        jr0.c(jr0.f30017a, "document_version", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f() {
        jr0.b(jr0.f30017a, "document_version", null, 2, null);
        this.f28969a.a(new zc1(null, 1, 0 == true ? 1 : 0));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0205a) {
            d();
            return;
        }
        if (event instanceof a.b) {
            e();
            return;
        }
        if (event instanceof a.c) {
            f();
        } else {
            if (!(event instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a.d dVar = (a.d) event;
            a(dVar.b(), dVar.a());
        }
    }

    private final void a(Date date, fd fdVar) {
        String str;
        if (date == null || (str = c().format(date)) == null) {
            str = "n/a";
        }
        jr0.a(jr0.f30017a, "orca_document_version_action_select_version", null, zhm.r0.k(new Pair("issue_date", str), new Pair("document_type", wz.a(DocumentType.ID_CARD)), fdVar.d()), 2, null);
        this.f28969a.a(new jd1("issue_date", str));
    }
}
