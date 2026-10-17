package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.nfc.NfcScannerError;
import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class af0 implements qg0 {

    public interface a extends qg0.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.af0$a$a, reason: collision with other inner class name */
        public static final class C0163a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final DocumentType f26779b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final fd f26780c;
            private final NfcScannerError d;

            public C0163a(DocumentType documentType, fd selectedCountry, NfcScannerError error) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                Intrinsics.checkNotNullParameter(error, "error");
                this.f26779b = documentType;
                this.f26780c = selectedCountry;
                this.d = error;
            }

            public final DocumentType a() {
                return this.f26779b;
            }

            public final NfcScannerError b() {
                return this.d;
            }

            public final fd c() {
                return this.f26780c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0163a)) {
                    return false;
                }
                C0163a c0163a = (C0163a) obj2;
                return this.f26779b == c0163a.f26779b && Intrinsics.f(this.f26780c, c0163a.f26780c) && this.d == c0163a.d;
            }

            @Override // com.fourthline.orca.internal.af0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ Map getAttributes() {
                return super.getAttributes();
            }

            @Override // com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getEventName() {
                return super.getEventName();
            }

            @Override // com.fourthline.orca.internal.af0.a, com.fourthline.orca.internal.qg0.a, ib.f
            public /* bridge */ String getSchema() {
                return super.getSchema();
            }

            public int hashCode() {
                return (((this.f26779b.hashCode() * 31) + this.f26780c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "OnFail(documentType=" + this.f26779b + ", selectedCountry=" + this.f26780c + ", error=" + this.d + ")";
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

    @Override // com.fourthline.orca.internal.qg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof a.C0163a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.C0163a c0163a = (a.C0163a) event;
        a(c0163a.a(), c0163a.c(), c0163a.b());
    }

    private final void a(DocumentType documentType, fd fdVar, NfcScannerError nfcScannerError) {
        jr0.a(jr0.f30017a, "orca_nfc_results_error", null, zhm.r0.k(a(documentType), fdVar.d(), new Pair("orca_error", wz.a((Enum) nfcScannerError))), 2, null);
    }

    private final Pair a(DocumentType documentType) {
        return new Pair("document_type", DocumentTypeKt.toFourthlineValue(documentType));
    }
}
