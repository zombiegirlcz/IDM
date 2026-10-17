package com.revolut.data.network.models.recurringpayment.mapper;

import com.revolut.data.network.models.recurringpayment.RecurringPayDateOptionsDto;
import fva.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/RecurringPayDateOptionsDto;", "Lfva/b;", "toDomain", "(Lcom/revolut/data/network/models/recurringpayment/RecurringPayDateOptionsDto;)Lfva/b;", "", "", "WEEKDAYS", "[Ljava/lang/String;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentDateOptionDtoMapperKt {

    @NotNull
    private static final String[] WEEKDAYS = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    @NotNull
    public static final b toDomain(@NotNull RecurringPayDateOptionsDto recurringPayDateOptionsDto) {
        Intrinsics.checkNotNullParameter(recurringPayDateOptionsDto, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : WEEKDAYS) {
            DateTime domain$parse = toDomain$parse(recurringPayDateOptionsDto.getWeek().get(str));
            if (domain$parse != null) {
                arrayList.add(domain$parse);
            }
        }
        for (int i = 1; i < 32; i++) {
            DateTime domain$parse2 = toDomain$parse(recurringPayDateOptionsDto.getMonth().get(Integer.valueOf(i)));
            if (domain$parse2 != null) {
                arrayList2.add(domain$parse2);
            }
        }
        return new b(d0.d1(arrayList), d0.d1(arrayList2));
    }

    private static final DateTime toDomain$parse(String str) {
        try {
            return DateTime.parse(str, DateTimeFormat.forPattern("yyyy-MM-dd"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
