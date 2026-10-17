package d8l;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(java.util.List r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L10:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r11.next()
            e8l.j r2 = (e8l.j) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r3 = r2 instanceof e8l.h
            r4 = 0
            if (r3 == 0) goto L43
            com.revolut.shared.feature.market_data.models.domain.models.Limit$UpperRestrictionLimit r3 = new com.revolut.shared.feature.market_data.models.domain.models.Limit$UpperRestrictionLimit
            e8l.h r2 = (e8l.h) r2
            java.lang.String r5 = r2.getKey()
            e8l.a r6 = r2.getOriginal()
            com.revolut.shared.feature.market_data.models.domain.models.Amount r6 = mif.a.F(r6)
            e8l.a r2 = r2.getConverted()
            if (r2 == 0) goto L3e
            com.revolut.shared.feature.market_data.models.domain.models.Amount r4 = mif.a.F(r2)
        L3e:
            r3.<init>(r5, r6, r4)
        L41:
            r4 = r3
            goto L9d
        L43:
            boolean r3 = r2 instanceof e8l.f
            if (r3 == 0) goto L65
            com.revolut.shared.feature.market_data.models.domain.models.Limit$LowerRestrictionLimit r3 = new com.revolut.shared.feature.market_data.models.domain.models.Limit$LowerRestrictionLimit
            e8l.f r2 = (e8l.f) r2
            java.lang.String r5 = r2.getKey()
            e8l.a r6 = r2.getOriginal()
            com.revolut.shared.feature.market_data.models.domain.models.Amount r6 = mif.a.F(r6)
            e8l.a r2 = r2.getConverted()
            if (r2 == 0) goto L61
            com.revolut.shared.feature.market_data.models.domain.models.Amount r4 = mif.a.F(r2)
        L61:
            r3.<init>(r5, r6, r4)
            goto L41
        L65:
            boolean r3 = r2 instanceof e8l.i
            if (r3 == 0) goto L99
            e8l.i r2 = (e8l.i) r2
            java.lang.String r6 = r2.getKey()
            e8l.a r3 = r2.getLimit()
            com.revolut.shared.feature.market_data.models.domain.models.Amount r7 = mif.a.F(r3)
            e8l.a r3 = r2.getCurrent()
            com.revolut.shared.feature.market_data.models.domain.models.Amount r8 = mif.a.F(r3)
            e8l.a r3 = r2.getNext()
            com.revolut.shared.feature.market_data.models.domain.models.Amount r9 = mif.a.F(r3)
            java.lang.String r2 = r2.getRenewsAtDateString()
            if (r2 == 0) goto L91
            org.joda.time.DateTime r4 = org.joda.time.DateTime.parse(r2)
        L91:
            r10 = r4
            com.revolut.shared.feature.market_data.models.domain.models.Limit$UsageLimit r5 = new com.revolut.shared.feature.market_data.models.domain.models.Limit$UsageLimit
            r5.<init>(r6, r7, r8, r9, r10)
            r4 = r5
            goto L9d
        L99:
            boolean r2 = r2 instanceof e8l.g
            if (r2 == 0) goto La4
        L9d:
            if (r4 == 0) goto L10
            r1.add(r4)
            goto L10
        La4:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d8l.e.a(java.util.List):java.util.ArrayList");
    }
}
