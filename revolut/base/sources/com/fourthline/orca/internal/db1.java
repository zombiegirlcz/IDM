package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.orca.internal.qg0;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class db1 implements qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f27693a;

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.db1$a$a, reason: collision with other inner class name */
        public static final class C0184a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0184a f27694b = new C0184a();

            private C0184a() {
            }

            @Override // com.fourthline.orca.internal.db1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.db1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f27695b;

            public b(Object type) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.f27695b = type;
            }

            public final Object a() {
                return this.f27695b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f27695b, ((b) obj2).f27695b);
            }

            @Override // com.fourthline.orca.internal.db1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.db1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f27695b.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(type=" + this.f27695b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f27696b;

            public c(Object type) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.f27696b = type;
            }

            public final Object a() {
                return this.f27696b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f27696b, ((c) obj2).f27696b);
            }

            @Override // com.fourthline.orca.internal.db1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.db1.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f27696b.hashCode();
            }

            public String toString() {
                return "OnTypeClicked(type=" + this.f27696b + ")";
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

    public db1(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f27693a = tracker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        jr0.a(jr0.f30017a, "document_type", null, 2, null);
        this.f27693a.a(new xc1(null, 1, 0 == true ? 1 : 0));
    }

    private final void c(Object obj2) {
        this.f27693a.a(new jd1("document_type", a(obj2)));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.c) {
            c(((a.c) event).a());
        } else if (event instanceof a.C0184a) {
            b();
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            b(((a.b) event).a());
        }
    }

    private final void b(Object obj2) {
        this.f27693a.a(new zc1(zhm.q0.c(new Pair("type", a(obj2)))));
    }

    private final String a(Object obj2) {
        if (obj2 instanceof DocumentType) {
            return DocumentTypeKt.toFourthlineValue((DocumentType) obj2);
        }
        String lowerCase = obj2.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
