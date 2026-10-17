package au;

import com.revolut.nfc_reader_documents.NfcDocument$PassportRaw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a f9111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9113c;
    public final boolean d;
    public final NfcDocument$PassportRaw e;

    public f(yt.a documentType, boolean z, boolean z3, boolean z4, NfcDocument$PassportRaw documentRawData) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentRawData, "documentRawData");
        this.f9111a = documentType;
        this.f9112b = z;
        this.f9113c = z3;
        this.d = z4;
        this.e = documentRawData;
    }

    @Override // au.h
    public final boolean J() {
        return this.d;
    }

    @Override // au.h
    public final boolean T() {
        return this.f9113c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f9111a == fVar.f9111a && this.f9112b == fVar.f9112b && this.f9113c == fVar.f9113c && this.d == fVar.d && Intrinsics.f(this.e, fVar.e);
    }

    @Override // au.h
    public final yt.a getDocumentType() {
        return this.f9111a;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(j6.a.c(this.f9111a.hashCode() * 31, 31, this.f9112b), 31, this.f9113c), 31, this.d);
    }

    @Override // au.h
    public final boolean k0() {
        return this.f9112b;
    }
}
