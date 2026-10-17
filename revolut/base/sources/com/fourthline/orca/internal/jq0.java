package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jq0 implements qg0 {

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.jq0$a$a, reason: collision with other inner class name */
        public static final class C0230a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final er f30008b;

            public C0230a(er error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f30008b = error;
            }

            public final er a() {
                return this.f30008b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0230a) && Intrinsics.f(this.f30008b, ((C0230a) obj2).f30008b);
            }

            @Override // com.fourthline.orca.internal.jq0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.jq0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f30008b.hashCode();
            }

            public String toString() {
                return "OnPrimaryButtonClicked(error=" + this.f30008b + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final er f30009b;

            public b(er error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f30009b = error;
            }

            public final er a() {
                return this.f30009b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f30009b, ((b) obj2).f30009b);
            }

            @Override // com.fourthline.orca.internal.jq0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.jq0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return this.f30009b.hashCode();
            }

            public String toString() {
                return "OnSecondaryButtonClicked(error=" + this.f30009b + ")";
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

    private final void b(er erVar) {
        jr0.a(jr0.f30017a, "orca_leave_identity_check", null, zhm.r0.k(c(erVar), f10.f28311c.b()), 2, null);
    }

    private final Pair c(er erVar) {
        return new Pair("orca_error", vf.a(erVar));
    }

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0230a) {
            a(((a.C0230a) event).a());
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            b(((a.b) event).a());
        }
    }

    private final void a(er erVar) {
        String str;
        if (!Intrinsics.f(erVar, er.g.f28242a) && !Intrinsics.f(erVar, er.f.f28240a) && !Intrinsics.f(erVar, er.i.f28246a)) {
            if (!Intrinsics.f(erVar, er.a.f28230a) && !Intrinsics.f(erVar, er.e.f28238a) && !Intrinsics.f(erVar, er.d.f28236a)) {
                str = "N/A";
            } else {
                str = "open_document_type";
            }
        } else {
            str = "open_issuing_country";
        }
        jr0.a(jr0.f30017a, Intrinsics.f(erVar, er.j.f28248a) ? "orca_leave_identity_check" : "orca_ocr_validation_error_popup_action", null, zhm.r0.k(c(erVar), new Pair("action", str)), 2, null);
    }
}
