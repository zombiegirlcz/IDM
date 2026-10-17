package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.orca.internal.qg0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mq implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c80 f31244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sg0 f31245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fd f31246c;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mq$a$a, reason: collision with other inner class name */
        public static final class C0251a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0251a f31247b = new C0251a();

            private C0251a() {
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f31248b;

            public b(List unsupportedDocumentTypes) {
                Intrinsics.checkNotNullParameter(unsupportedDocumentTypes, "unsupportedDocumentTypes");
                this.f31248b = unsupportedDocumentTypes;
            }

            public final List a() {
                return this.f31248b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f31248b, ((b) obj2).f31248b);
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f31248b.hashCode();
            }

            public String toString() {
                return "OnDocumentNotSupportedClicked(unsupportedDocumentTypes=" + this.f31248b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f31249b;

            public c(DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.f31249b = documentType;
            }

            public final DocumentType a() {
                return this.f31249b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && this.f31249b == ((c) obj2).f31249b;
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f31249b.hashCode();
            }

            public String toString() {
                return "OnDocumentOptionClicked(documentType=" + this.f31249b + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final fd f31250b;

            public d(fd fdVar) {
                this.f31250b = fdVar;
            }

            public final fd a() {
                return this.f31250b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f31250b, ((d) obj2).f31250b);
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                fd fdVar = this.f31250b;
                if (fdVar == null) {
                    return 0;
                }
                return fdVar.hashCode();
            }

            public String toString() {
                return "OnEnterScreen(selectedCountry=" + this.f31250b + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f31251b;

            public e(DocumentType documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.f31251b = documentType;
            }

            public final DocumentType a() {
                return this.f31251b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof e) && this.f31251b == ((e) obj2).f31251b;
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.mq.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f31251b.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(documentType=" + this.f31251b + ")";
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

    public mq(c80 analyticsContext, sg0 tracker) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f31244a = analyticsContext;
        this.f31245b = tracker;
    }

    private final void b() {
        jr0.a(jr0.f30017a, "document_type", null, 2, null);
        this.f31245b.a(new xc1(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0251a) {
            b();
            return;
        }
        if (event instanceof a.d) {
            a(((a.d) event).a());
            return;
        }
        if (event instanceof a.e) {
            b(((a.e) event).a());
        } else if (event instanceof a.c) {
            a(((a.c) event).a());
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((a.b) event).a());
        }
    }

    private final void b(DocumentType documentType) {
        jr0.f30017a.b("document_type", zhm.q0.c(new Pair("document_type", wz.a(documentType))));
        this.f31245b.a(new zc1(zhm.q0.c(new Pair("document_type", DocumentTypeKt.toFourthlineValue(documentType)))));
        Unit unit = Unit.f186387a;
        this.f31244a.set("document_type", DocumentTypeKt.toFourthlineValue(documentType));
    }

    private final void a(DocumentType documentType) {
        jr0.a(jr0.f30017a, "orca_document_type_action_select_type", null, zhm.q0.c(new Pair("document_type", wz.a(documentType))), 2, null);
        this.f31245b.a(new jd1("document_type", DocumentTypeKt.toFourthlineValue(documentType)));
    }

    private final void a(fd fdVar) {
        jr0.f30017a.c("document_type", a(zhm.r0.g(), fdVar));
        Unit unit = Unit.f186387a;
        this.f31246c = fdVar;
    }

    private final void a(List list) {
        Pair pairB = f10.d.b();
        Pair pair = new Pair("orca_error", "document_type_not_supported");
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(wz.a((DocumentType) it8.next()));
        }
        Map mapA = a(zhm.r0.k(pairB, pair, new Pair("unsupported_document_types", a((Collection) arrayList))), this.f31246c);
        jr0.a(jr0.f30017a, "orca_leave_identity_check", null, mapA, 2, null);
        this.f31245b.a(new bd1(mapA));
    }

    private final Map a(Map map, fd fdVar) {
        Pair pairD;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (fdVar != null && (pairD = fdVar.d()) != null) {
            linkedHashMap.put(pairD.f186385a, pairD.f186386b);
        }
        return linkedHashMap;
    }

    private final String a(Collection collection) {
        String string = collection.toString();
        String strSubstring = string.substring(1, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
