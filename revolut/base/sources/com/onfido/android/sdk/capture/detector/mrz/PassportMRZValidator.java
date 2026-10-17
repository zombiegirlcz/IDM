package com.onfido.android.sdk.capture.detector.mrz;

import com.onfido.android.sdk.capture.validation.DocumentCodeValidator;
import com.onfido.android.sdk.capture.validation.DocumentCodeValidatorResult;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrz/PassportMRZValidator;", "Lcom/onfido/android/sdk/capture/validation/DocumentCodeValidator;", "()V", "validate", "Lcom/onfido/android/sdk/capture/validation/DocumentCodeValidatorResult;", "text", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PassportMRZValidator implements DocumentCodeValidator {

    @Deprecated
    public static final int MIN_LINE_COUNT = 2;

    @NotNull
    private static final String REGEX_PASSPORT_LINE2 = "([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{14})([0-9<]{1})([0-9]{1})";

    @Deprecated
    @NotNull
    public static final String MESSAGE_NO_MRZ_FOUND = "MESSAGE_NO_MRZ_FOUND";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final IntRange VALID_PASSPORT_LINE_CHARACTER_RANGE = new IntRange(30, 50, 1);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrz/PassportMRZValidator$Companion;", "", "()V", "MESSAGE_NO_MRZ_FOUND", "", "MIN_LINE_COUNT", "", "REGEX_PASSPORT_LINE2", "getREGEX_PASSPORT_LINE2$annotations", "VALID_PASSPORT_LINE_CHARACTER_RANGE", "Lkotlin/ranges/IntRange;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static /* synthetic */ void getREGEX_PASSPORT_LINE2$annotations() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.onfido.android.sdk.capture.validation.DocumentCodeValidator
    @NotNull
    public DocumentCodeValidatorResult validate(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        List listN0 = d0.n0(a0.D(new Regex("[ \\t\\r]").replace(text, ""), "«", "<", false), new String[]{"\n"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listN0) {
            IntRange intRange = VALID_PASSPORT_LINE_CHARACTER_RANGE;
            int i = intRange.f186448a;
            int i2 = intRange.f186449b;
            int length = ((String) obj2).length();
            if (i <= length && length <= i2) {
                arrayList.add(obj2);
            }
        }
        boolean z = Pattern.compile("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{14})([0-9<]{1})([0-9]{1})").matcher(zhm.d0.k0(arrayList, null, null, null, 0, null, 63)).find() || arrayList.size() == 2;
        return new DocumentCodeValidatorResult(z, z ? "" : "MESSAGE_NO_MRZ_FOUND");
    }
}
