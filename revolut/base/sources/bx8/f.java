package bx8;

import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$FormField;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KYCDocumentIdInputScreenContract$InputData f19516a;

    public f(KYCDocumentIdInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f19516a = inputData;
    }

    public static p a(b bVar, KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField) {
        String str = kYCDocumentIdInputScreenContract$FormField.f77861b;
        String str2 = bVar != null ? bVar.f19513a : null;
        if (str2 == null) {
            str2 = "";
        }
        boolean z = str2.length() == 0 || ch.qos.logback.core.util.a.x(str2, str);
        return new p(z ? null : bVar != null ? bVar.f19514b : null, z);
    }
}
