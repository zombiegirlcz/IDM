package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerError;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class re implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerError f36821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36823c;

    public re(@NotNull DocumentScannerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f36821a = error;
        this.f36822b = "document_scan_failed";
        this.f36823c = "iglu:com.fourthline.sdk/document_scan_failed/jsonschema/1-0-0";
    }

    private final DocumentScannerError component1() {
        return this.f36821a;
    }

    public static /* synthetic */ re copy$default(re reVar, DocumentScannerError documentScannerError, int i, Object obj2) {
        if ((i & 1) != 0) {
            documentScannerError = reVar.f36821a;
        }
        return reVar.copy(documentScannerError);
    }

    @NotNull
    public final re copy(@NotNull DocumentScannerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new re(error);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof re) && this.f36821a == ((re) obj2).f36821a;
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        aim.f builder = new aim.f();
        String strName = this.f36821a.name();
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
        return this.f36822b;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return this.f36823c;
    }

    public int hashCode() {
        return this.f36821a.hashCode();
    }

    @NotNull
    public String toString() {
        return "PermissionMissing(error=" + this.f36821a + ")";
    }
}
