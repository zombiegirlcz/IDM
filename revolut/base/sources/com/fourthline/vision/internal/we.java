package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerStepError;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class we implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37067c;
    private final boolean d;
    private final DocumentScannerStepError e;
    private final Throwable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f37068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f37069h;

    public we(@NotNull String documentSide, int i, boolean z, boolean z3, @NotNull DocumentScannerStepError error, Throwable th10) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f37065a = documentSide;
        this.f37066b = i;
        this.f37067c = z;
        this.d = z3;
        this.e = error;
        this.f = th10;
        this.f37068g = "document_scan_step_failed";
        this.f37069h = "iglu:com.fourthline.sdk/document_scan_step_failed/jsonschema/1-0-0";
    }

    private final String component1() {
        return this.f37065a;
    }

    private final int component2() {
        return this.f37066b;
    }

    private final boolean component3() {
        return this.f37067c;
    }

    private final boolean component4() {
        return this.d;
    }

    private final DocumentScannerStepError component5() {
        return this.e;
    }

    private final Throwable component6() {
        return this.f;
    }

    public static /* synthetic */ we copy$default(we weVar, String str, int i, boolean z, boolean z3, DocumentScannerStepError documentScannerStepError, Throwable th10, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = weVar.f37065a;
        }
        if ((i2 & 2) != 0) {
            i = weVar.f37066b;
        }
        if ((i2 & 4) != 0) {
            z = weVar.f37067c;
        }
        if ((i2 & 8) != 0) {
            z3 = weVar.d;
        }
        if ((i2 & 16) != 0) {
            documentScannerStepError = weVar.e;
        }
        if ((i2 & 32) != 0) {
            th10 = weVar.f;
        }
        DocumentScannerStepError documentScannerStepError2 = documentScannerStepError;
        Throwable th11 = th10;
        return weVar.copy(str, i, z, z3, documentScannerStepError2, th11);
    }

    @NotNull
    public final we copy(@NotNull String documentSide, int i, boolean z, boolean z3, @NotNull DocumentScannerStepError error, Throwable th10) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        Intrinsics.checkNotNullParameter(error, "error");
        return new we(documentSide, i, z, z3, error, th10);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof we)) {
            return false;
        }
        we weVar = (we) obj2;
        return Intrinsics.f(this.f37065a, weVar.f37065a) && this.f37066b == weVar.f37066b && this.f37067c == weVar.f37067c && this.d == weVar.d && this.e == weVar.e && Intrinsics.f(this.f, weVar.f);
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
        builder.put("step_index", Integer.valueOf(this.f37066b));
        builder.put("document_side", this.f37065a);
        builder.put("tilted", Boolean.valueOf(this.f37067c));
        builder.put("autodetect_available", Boolean.valueOf(this.d));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return this.f37068g;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return this.f37069h;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f37065a.hashCode() * 31) + Integer.hashCode(this.f37066b)) * 31) + Boolean.hashCode(this.f37067c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode()) * 31;
        Throwable th10 = this.f;
        return iHashCode + (th10 == null ? 0 : th10.hashCode());
    }

    @NotNull
    public String toString() {
        return "ScanStepFailed(documentSide=" + this.f37065a + ", stepIndex=" + this.f37066b + ", tilted=" + this.f37067c + ", autoDetectAvailable=" + this.d + ", error=" + this.e + ", reason=" + this.f + ")";
    }
}
