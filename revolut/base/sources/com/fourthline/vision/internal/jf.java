package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerError;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jf implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerError f36427a;

    public jf(@NotNull SelfieScannerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f36427a = error;
    }

    private final SelfieScannerError component1() {
        return this.f36427a;
    }

    public static /* synthetic */ jf copy$default(jf jfVar, SelfieScannerError selfieScannerError, int i, Object obj2) {
        if ((i & 1) != 0) {
            selfieScannerError = jfVar.f36427a;
        }
        return jfVar.copy(selfieScannerError);
    }

    @NotNull
    public final jf copy(@NotNull SelfieScannerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new jf(error);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof jf) && this.f36427a == ((jf) obj2).f36427a;
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        aim.f builder = new aim.f();
        String strName = this.f36427a.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        builder.put("error", lowerCase);
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
        return this.f36427a.hashCode();
    }

    @NotNull
    public String toString() {
        return "PermissionMissing(error=" + this.f36427a + ")";
    }
}
