package com.revolut.feature.insurance_pet.impl.ui.pet.dob;

import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final tz7.a Companion = new tz7.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f76351a;

    public a(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f76351a = dateProvider;
    }

    public final DOBInputData a(DOBInputData dobData) {
        Intrinsics.checkNotNullParameter(dobData, "dobData");
        if (Intrinsics.f(dobData, DOBInputData.Empty.d) || (dobData instanceof DOBInputData.PartiallyFilled)) {
            return dobData;
        }
        if (!(dobData instanceof DOBInputData.Filled)) {
            throw new NoWhenBranchMatchedException();
        }
        DOBInputData.Filled filled = (DOBInputData.Filled) dobData;
        Date date = filled.d;
        if (date == null) {
            return DOBInputData.Filled.d(filled, tz7.b.INVALID_FORMAT);
        }
        LocalDate localDate = ((f) this.f76351a).g().toLocalDate();
        LocalDate localDate2 = new LocalDate(date.getTime());
        return localDate2.isAfter(localDate) ? DOBInputData.Filled.d(filled, tz7.b.FUTURE_DATE) : localDate2.isBefore(new LocalDate(1990, 1, 1)) ? DOBInputData.Filled.d(filled, tz7.b.MAX_PAST_DATE) : filled;
    }
}
