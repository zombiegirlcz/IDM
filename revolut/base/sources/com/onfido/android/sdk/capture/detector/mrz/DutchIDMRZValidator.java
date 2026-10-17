package com.onfido.android.sdk.capture.detector.mrz;

import com.onfido.android.sdk.capture.validation.DocumentCodeValidator;
import com.onfido.android.sdk.capture.validation.DocumentCodeValidatorResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.f0;
import nkm.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrz/DutchIDMRZValidator;", "Lcom/onfido/android/sdk/capture/validation/DocumentCodeValidator;", "()V", "validate", "Lcom/onfido/android/sdk/capture/validation/DocumentCodeValidatorResult;", "text", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DutchIDMRZValidator implements DocumentCodeValidator {
    private static final int CHAR_COUNT_IN_LINE = 30;
    private static final int LINE_COUNT = 3;

    @NotNull
    private static final String EXPECTED_FIRST_CHAR = "I";

    @NotNull
    private static final String LAST_CHAR_NOT_A_DIGIT = "LAST_CHAR_NOT_A_DIGIT";

    @NotNull
    private static final String MESSAGE_NO_MRZ_FOUND = "MESSAGE_NO_MRZ_FOUND";

    @NotNull
    private static final String NOT_START_WITH_I = "NOT_START_WITH_I";

    @Override // com.onfido.android.sdk.capture.validation.DocumentCodeValidator
    @NotNull
    public DocumentCodeValidatorResult validate(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String str = "";
        boolean z = false;
        List listJ = y.J(y.n(d0.Z(a0.D(text, " ", "", false)), DutchIDMRZValidator$validate$validLines$1.INSTANCE));
        if (listJ.size() != 3) {
            return new DocumentCodeValidatorResult(false, "MESSAGE_NO_MRZ_FOUND");
        }
        if (!a0.H((String) zhm.d0.b0(listJ), "I", false)) {
            str = "NOT_START_WITH_I";
        } else if (Character.isDigit(f0.S0((CharSequence) zhm.d0.b0(listJ)))) {
            z = true;
        } else {
            str = "LAST_CHAR_NOT_A_DIGIT";
        }
        return new DocumentCodeValidatorResult(z, str);
    }
}
