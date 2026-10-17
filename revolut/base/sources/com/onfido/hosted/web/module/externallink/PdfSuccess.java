package com.onfido.hosted.web.module.externallink;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/hosted/web/module/externallink/PdfSuccess;", "Lcom/onfido/hosted/web/module/externallink/HostedWebModuleExternalLinkResult;", "jsCode", "", "(Ljava/lang/String;)V", "getJsCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PdfSuccess implements HostedWebModuleExternalLinkResult {

    @NotNull
    private final String jsCode;

    public PdfSuccess(@NotNull String jsCode) {
        Intrinsics.checkNotNullParameter(jsCode, "jsCode");
        this.jsCode = jsCode;
    }

    public static /* synthetic */ PdfSuccess copy$default(PdfSuccess pdfSuccess, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = pdfSuccess.jsCode;
        }
        return pdfSuccess.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJsCode() {
        return this.jsCode;
    }

    @NotNull
    public final PdfSuccess copy(@NotNull String jsCode) {
        Intrinsics.checkNotNullParameter(jsCode, "jsCode");
        return new PdfSuccess(jsCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PdfSuccess) && Intrinsics.f(this.jsCode, ((PdfSuccess) other).jsCode);
    }

    @NotNull
    public final String getJsCode() {
        return this.jsCode;
    }

    public int hashCode() {
        return this.jsCode.hashCode();
    }

    @NotNull
    public String toString() {
        return j6.a.u(new StringBuilder("PdfSuccess(jsCode="), this.jsCode, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
