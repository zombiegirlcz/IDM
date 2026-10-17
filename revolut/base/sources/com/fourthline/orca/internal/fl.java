package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerStep;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bg f28549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f28551c;

    public fl(bg documentAnalysisBundle) {
        Intrinsics.checkNotNullParameter(documentAnalysisBundle, "documentAnalysisBundle");
        this.f28549a = documentAnalysisBundle;
        this.f28551c = new LinkedHashMap();
    }

    public final String a(DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        String str = this.f28550b;
        if (str != null) {
            if (step.getIndex() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f28550b = string;
        this.f28549a.a(string);
        return string;
    }

    public final String b(DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f28551c.put(step, string);
        return string;
    }
}
