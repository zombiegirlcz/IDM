package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerError;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class te implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36966c;
    private final boolean d;
    private final DocumentScannerError e;
    private final Throwable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f36967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f36968h;

    public te(@NotNull String documentSide, int i, boolean z, boolean z3, @NotNull DocumentScannerError error, Throwable th10) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f36964a = documentSide;
        this.f36965b = i;
        this.f36966c = z;
        this.d = z3;
        this.e = error;
        this.f = th10;
        this.f36967g = "document_scan_failed";
        this.f36968h = "iglu:com.fourthline.sdk/document_scan_failed/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f36964a;
    }

    private final int component2() {
        return this.f36965b;
    }

    private final boolean component3() {
        return this.f36966c;
    }

    private final boolean component4() {
        return this.d;
    }

    private final DocumentScannerError component5() {
        return this.e;
    }

    private final Throwable component6() {
        return this.f;
    }

    public static /* synthetic */ te copy$default(te teVar, String str, int i, boolean z, boolean z3, DocumentScannerError documentScannerError, Throwable th10, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = teVar.f36964a;
        }
        if ((i2 & 2) != 0) {
            i = teVar.f36965b;
        }
        if ((i2 & 4) != 0) {
            z = teVar.f36966c;
        }
        if ((i2 & 8) != 0) {
            z3 = teVar.d;
        }
        if ((i2 & 16) != 0) {
            documentScannerError = teVar.e;
        }
        if ((i2 & 32) != 0) {
            th10 = teVar.f;
        }
        DocumentScannerError documentScannerError2 = documentScannerError;
        Throwable th11 = th10;
        return teVar.copy(str, i, z, z3, documentScannerError2, th11);
    }

    @NotNull
    public final te copy(@NotNull String documentSide, int i, boolean z, boolean z3, @NotNull DocumentScannerError error, Throwable th10) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        Intrinsics.checkNotNullParameter(error, "error");
        return new te(documentSide, i, z, z3, error, th10);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof te)) {
            return false;
        }
        te teVar = (te) obj2;
        return Intrinsics.f(this.f36964a, teVar.f36964a) && this.f36965b == teVar.f36965b && this.f36966c == teVar.f36966c && this.d == teVar.d && this.e == teVar.e && Intrinsics.f(this.f, teVar.f);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        String throwableDescription;
        aim.f builder = new aim.f();
        String strName = this.e.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        builder.put("error", lowerCase);
        Throwable th10 = this.f;
        if (th10 == null || (throwableDescription = oe.getThrowableDescription(th10)) == null) {
            throwableDescription = "n/a";
        }
        builder.put("reason", throwableDescription);
        builder.put("step_index", Integer.valueOf(this.f36965b));
        builder.put("document_side", this.f36964a);
        builder.put("tilted", Boolean.valueOf(this.f36966c));
        builder.put("autodetect_available", Boolean.valueOf(this.d));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return this.f36967g;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return this.f36968h;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f36964a.hashCode() * 31) + Integer.hashCode(this.f36965b)) * 31) + Boolean.hashCode(this.f36966c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode()) * 31;
        Throwable th10 = this.f;
        return iHashCode + (th10 == null ? 0 : th10.hashCode());
    }

    @NotNull
    public String toString() {
        return "ScanFailed(documentSide=" + this.f36964a + ", stepIndex=" + this.f36965b + ", tilted=" + this.f36966c + ", autoDetectAvailable=" + this.d + ", error=" + this.e + ", reason=" + this.f + ")";
    }
}
