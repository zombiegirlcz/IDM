package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ke0 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f30248a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ke0$a$a, reason: collision with other inner class name */
        public static final class C0236a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f30249b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final fd f30250c;

            public C0236a(DocumentType documentType, fd selectedCountry) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f30249b = documentType;
                this.f30250c = selectedCountry;
            }

            public final DocumentType a() {
                return this.f30249b;
            }

            public final fd b() {
                return this.f30250c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0236a)) {
                    return false;
                }
                C0236a c0236a = (C0236a) obj2;
                return this.f30249b == c0236a.f30249b && Intrinsics.f(this.f30250c, c0236a.f30250c);
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f30249b.hashCode() * 31) + this.f30250c.hashCode();
            }

            public String toString() {
                return "OnBackButtonClicked(documentType=" + this.f30249b + ", selectedCountry=" + this.f30250c + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f30251b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final fd f30252c;

            public b(DocumentType documentType, fd selectedCountry) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f30251b = documentType;
                this.f30252c = selectedCountry;
            }

            public final DocumentType a() {
                return this.f30251b;
            }

            public final fd b() {
                return this.f30252c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return this.f30251b == bVar.f30251b && Intrinsics.f(this.f30252c, bVar.f30252c);
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f30251b.hashCode() * 31) + this.f30252c.hashCode();
            }

            public String toString() {
                return "OnEnterScreen(documentType=" + this.f30251b + ", selectedCountry=" + this.f30252c + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f30253b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f30254c;
            private final int d;

            public c(String source, int i, int i2) {
                Intrinsics.checkNotNullParameter(source, "source");
                this.f30253b = source;
                this.f30254c = i;
                this.d = i2;
            }

            public final int a() {
                return this.f30254c;
            }

            public final String b() {
                return this.f30253b;
            }

            public final int c() {
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
                return Intrinsics.f(this.f30253b, cVar.f30253b) && this.f30254c == cVar.f30254c && this.d == cVar.d;
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (((this.f30253b.hashCode() * 31) + Integer.hashCode(this.f30254c)) * 31) + Integer.hashCode(this.d);
            }

            public String toString() {
                return "OnInstructionViewed(source=" + this.f30253b + ", currentPage=" + this.f30254c + ", totalPages=" + this.d + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f30255b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final fd f30256c;

            public d(DocumentType documentType, fd selectedCountry) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f30255b = documentType;
                this.f30256c = selectedCountry;
            }

            public final DocumentType a() {
                return this.f30255b;
            }

            public final fd b() {
                return this.f30256c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof d)) {
                    return false;
                }
                d dVar = (d) obj2;
                return this.f30255b == dVar.f30255b && Intrinsics.f(this.f30256c, dVar.f30256c);
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f30255b.hashCode() * 31) + this.f30256c.hashCode();
            }

            public String toString() {
                return "OnInstructionsButtonClicked(documentType=" + this.f30255b + ", selectedCountry=" + this.f30256c + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f30257b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final fd f30258c;

            public e(DocumentType documentType, fd selectedCountry) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f30257b = documentType;
                this.f30258c = selectedCountry;
            }

            public final DocumentType a() {
                return this.f30257b;
            }

            public final fd b() {
                return this.f30258c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof e)) {
                    return false;
                }
                e eVar = (e) obj2;
                return this.f30257b == eVar.f30257b && Intrinsics.f(this.f30258c, eVar.f30258c);
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f30257b.hashCode() * 31) + this.f30258c.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(documentType=" + this.f30257b + ", selectedCountry=" + this.f30258c + ")";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f30259b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final fd f30260c;

            public f(DocumentType documentType, fd selectedCountry) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                this.f30259b = documentType;
                this.f30260c = selectedCountry;
            }

            public final DocumentType a() {
                return this.f30259b;
            }

            public final fd b() {
                return this.f30260c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof f)) {
                    return false;
                }
                f fVar = (f) obj2;
                return this.f30259b == fVar.f30259b && Intrinsics.f(this.f30260c, fVar.f30260c);
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.ke0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (this.f30259b.hashCode() * 31) + this.f30260c.hashCode();
            }

            public String toString() {
                return "OnSkipButtonClicked(documentType=" + this.f30259b + ", selectedCountry=" + this.f30260c + ")";
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

    public ke0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f30248a = tracker;
    }

    private final void b(DocumentType documentType, fd fdVar) {
        jr0.f30017a.c("nfc_intro", zhm.r0.k(a(documentType), fdVar.d()));
    }

    private final void c(DocumentType documentType, fd fdVar) {
        jr0.a(jr0.f30017a, "orca_nfc_intro_action_learn_more", null, zhm.r0.k(a(documentType), fdVar.d()), 2, null);
        this.f30248a.a(new ed1(null, 1, null));
        this.f30248a.a(new of("nfc_instructions"));
    }

    private final void d(DocumentType documentType, fd fdVar) {
        Map mapK = zhm.r0.k(a(documentType), fdVar.d());
        jr0.f30017a.b("nfc_intro", mapK);
        this.f30248a.a(new zc1(mapK));
    }

    private final void e(DocumentType documentType, fd fdVar) {
        Map mapK = zhm.r0.k(a(documentType), fdVar.d());
        jr0.a(jr0.f30017a, "orca_nfc_intro_action_skip", null, mapK, 2, null);
        this.f30248a.a(new id1(mapK));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0236a) {
            a.C0236a c0236a = (a.C0236a) event;
            a(c0236a.a(), c0236a.b());
            return;
        }
        if (event instanceof a.b) {
            a.b bVar = (a.b) event;
            b(bVar.a(), bVar.b());
            return;
        }
        if (event instanceof a.e) {
            a.e eVar = (a.e) event;
            d(eVar.a(), eVar.b());
            return;
        }
        if (event instanceof a.f) {
            a.f fVar = (a.f) event;
            e(fVar.a(), fVar.b());
        } else if (event instanceof a.d) {
            a.d dVar = (a.d) event;
            c(dVar.a(), dVar.b());
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a.c cVar = (a.c) event;
            a(cVar.b(), cVar.a(), cVar.c());
        }
    }

    private final void a(String str, int i, int i2) {
        jr0.a(jr0.f30017a, "orca_did_view_instruction", null, zhm.r0.k(new Pair("source", str), new Pair("index", Integer.valueOf(i)), new Pair("total", Integer.valueOf(i2))), 2, null);
        this.f30248a.a(new gd1(str, i, i2));
    }

    private final void a(DocumentType documentType, fd fdVar) {
        Map mapK = zhm.r0.k(a(documentType), fdVar.d());
        jr0.f30017a.a("nfc_intro", mapK);
        this.f30248a.a(new xc1(mapK));
    }

    private final Pair a(DocumentType documentType) {
        return new Pair("document_type", DocumentTypeKt.toFourthlineValue(documentType));
    }
}
