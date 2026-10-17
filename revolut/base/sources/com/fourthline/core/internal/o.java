package com.fourthline.core.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f26372a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.fourthline.core.internal.m
    public MrzInfo a(y parsedMrz, List validationErrors, String rawMrz) {
        Intrinsics.checkNotNullParameter(parsedMrz, "parsedMrz");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        Intrinsics.checkNotNullParameter(rawMrz, "rawMrz");
        if (!(parsedMrz instanceof x)) {
            throw new IllegalArgumentException("This PARSED MRZ type is not supported.");
        }
        x xVar = (x) parsedMrz;
        String strD = xVar.d();
        String strK = xVar.k();
        String strA = xVar.e().a();
        Date dateA = a(xVar);
        List listA = a(xVar.i());
        List listA2 = a(xVar.l());
        Date dateA2 = xVar.a();
        if (dateA2 == null) {
            dateA2 = new Date();
        }
        Date date = dateA2;
        String strM = xVar.m();
        String strJ = xVar.j();
        return new MrtdMrzInfo(strD, strK, strA, dateA, listA, listA2, date, strM, Intrinsics.f(strJ, "F") ? Gender.FEMALE : Intrinsics.f(strJ, "M") ? Gender.MALE : Gender.UNKNOWN, xVar.n(), rawMrz, validationErrors);
    }

    private final Date a(x xVar) {
        if (Intrinsics.f(xVar.d() + xVar.k(), "IDESP") && Intrinsics.f(xVar.h(), "990101")) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(0L);
            calendar.set(9999, 0, 1);
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            return time;
        }
        Date dateF = xVar.f();
        return dateF == null ? new Date() : dateF;
    }

    private final List a(List list) {
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String upperCase = ((String) it8.next()).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
        }
        return arrayList;
    }
}
