package qn2;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f247854a = new b();

    private b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig a(rn2.b r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = r7.getDescription()
            java.lang.String r1 = r7.getStartDate()
            java.lang.String r2 = "parse(...)"
            r3 = 0
            if (r1 == 0) goto L1c
            java.time.format.DateTimeFormatter r4 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE
            java.time.LocalDate r1 = java.time.LocalDate.parse(r1, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            goto L1d
        L1c:
            r1 = r3
        L1d:
            java.lang.String r4 = r7.getEndDate()
            if (r4 == 0) goto L2c
            java.time.format.DateTimeFormatter r3 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE
            java.time.LocalDate r3 = java.time.LocalDate.parse(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
        L2c:
            java.util.Set r7 = r7.getIneligibleDates()
            if (r7 == 0) goto L62
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = zhm.w.t(r7, r5)
            r4.<init>(r5)
            java.util.Iterator r7 = r7.iterator()
        L43:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L5c
            java.lang.Object r5 = r7.next()
            java.lang.String r5 = (java.lang.String) r5
            java.time.format.DateTimeFormatter r6 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE
            java.time.LocalDate r5 = java.time.LocalDate.parse(r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r4.add(r5)
            goto L43
        L5c:
            java.util.Set r7 = zhm.d0.i1(r4)
            if (r7 != 0) goto L64
        L62:
            zhm.h0 r7 = zhm.h0.f322473a
        L64:
            com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig r2 = new com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig
            r2.<init>(r0, r1, r3, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.b.a(rn2.b):com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig");
    }
}
