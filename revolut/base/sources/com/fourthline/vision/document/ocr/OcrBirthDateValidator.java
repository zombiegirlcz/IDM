package com.fourthline.vision.document.ocr;

import com.fourthline.core.internal.TimestampProvider;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016J)\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/fourthline/vision/document/ocr/OcrBirthDateValidator;", "Lcom/fourthline/vision/document/ocr/OcrValidator;", "Ljava/util/Date;", "timestampProvider", "Lcom/fourthline/core/internal/TimestampProvider;", "minPersonAgeFactory", "Lkotlin/Function0;", "", "<init>", "(Lcom/fourthline/core/internal/TimestampProvider;Lkotlin/jvm/functions/Function0;)V", "validate", "", "Lcom/fourthline/vision/document/ocr/OcrValidationError;", "value", "getStartOfDay", "kotlin.jvm.PlatformType", "date", "addingYears", "(Ljava/util/Date;Ljava/lang/Integer;)Ljava/util/Date;", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OcrBirthDateValidator implements OcrValidator<Date> {
    public static final int $stable = 8;

    @NotNull
    private final Function0<Integer> minPersonAgeFactory;

    @NotNull
    private final TimestampProvider timestampProvider;

    public OcrBirthDateValidator(@NotNull TimestampProvider timestampProvider, @NotNull Function0<Integer> minPersonAgeFactory) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(minPersonAgeFactory, "minPersonAgeFactory");
        this.timestampProvider = timestampProvider;
        this.minPersonAgeFactory = minPersonAgeFactory;
    }

    private final Date getStartOfDay(Date date, Integer addingYears) {
        Calendar currentCalendar = this.timestampProvider.getCurrentCalendar();
        currentCalendar.setTime(date);
        currentCalendar.set(11, 0);
        currentCalendar.set(12, 0);
        currentCalendar.set(13, 0);
        currentCalendar.set(14, 0);
        if (addingYears != null) {
            currentCalendar.add(1, addingYears.intValue());
        }
        return currentCalendar.getTime();
    }

    public static /* synthetic */ Date getStartOfDay$default(OcrBirthDateValidator ocrBirthDateValidator, Date date, Integer num, int i, Object obj2) {
        if ((i & 2) != 0) {
            num = null;
        }
        return ocrBirthDateValidator.getStartOfDay(date, num);
    }

    @Override // com.fourthline.vision.document.ocr.OcrValidator
    @NotNull
    public Set<OcrValidationError> validate(@NotNull Date value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Date startOfDay$default = getStartOfDay$default(this, value, null, 2, null);
        Date startOfDay = getStartOfDay(new Date(), Integer.valueOf(-((Number) this.minPersonAgeFactory.invoke()).intValue()));
        return (Intrinsics.f(startOfDay$default, startOfDay) || startOfDay$default.before(startOfDay)) ? h0.f322473a : y0.b(OcrValidationError.PERSON_NOT_ADULT);
    }
}
