package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerError;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class lf implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerError f36508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f36509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36510c;

    public lf(@NotNull SelfieScannerError error, Throwable th10, @NotNull String stepType) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(stepType, "stepType");
        this.f36508a = error;
        this.f36509b = th10;
        this.f36510c = stepType;
    }

    private final SelfieScannerError component1() {
        return this.f36508a;
    }

    private final Throwable component2() {
        return this.f36509b;
    }

    private final String component3() {
        return this.f36510c;
    }

    public static /* synthetic */ lf copy$default(lf lfVar, SelfieScannerError selfieScannerError, Throwable th10, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            selfieScannerError = lfVar.f36508a;
        }
        if ((i & 2) != 0) {
            th10 = lfVar.f36509b;
        }
        if ((i & 4) != 0) {
            str = lfVar.f36510c;
        }
        return lfVar.copy(selfieScannerError, th10, str);
    }

    @NotNull
    public final lf copy(@NotNull SelfieScannerError error, Throwable th10, @NotNull String stepType) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(stepType, "stepType");
        return new lf(error, th10, stepType);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj2;
        return this.f36508a == lfVar.f36508a && Intrinsics.f(this.f36509b, lfVar.f36509b) && Intrinsics.f(this.f36510c, lfVar.f36510c);
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        String throwableDescription;
        aim.f builder = new aim.f();
        String strName = this.f36508a.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        builder.put("error", lowerCase);
        Throwable th10 = this.f36509b;
        if (th10 == null || (throwableDescription = oe.getThrowableDescription(th10)) == null) {
            throwableDescription = "n/a";
        }
        builder.put("reason", throwableDescription);
        builder.put("step_type", this.f36510c);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return "selfie_scan_failed";
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return "iglu:com.fourthline.sdk/selfie_scan_failed/jsonschema/1-0-0";
    }

    public int hashCode() {
        int iHashCode = this.f36508a.hashCode() * 31;
        Throwable th10 = this.f36509b;
        return ((iHashCode + (th10 == null ? 0 : th10.hashCode())) * 31) + this.f36510c.hashCode();
    }

    @NotNull
    public String toString() {
        return "ScanFailed(error=" + this.f36508a + ", reason=" + this.f36509b + ", stepType=" + this.f36510c + ")";
    }
}
