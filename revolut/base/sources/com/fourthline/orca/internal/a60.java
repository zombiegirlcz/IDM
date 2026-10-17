package com.fourthline.orca.internal;

import android.icu.util.Calendar;
import android.os.LocaleList;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public final class a60 implements DeviceDataCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26709c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26711b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public a60(Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f26710a = destination;
        this.f26711b = z;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f26711b) {
            Locale locale = Locale.getDefault();
            TimeZone timeZone = TimeZone.getDefault();
            Currency currency = Currency.getInstance(locale);
            this.f26710a.put("localeCode", locale.getLanguage() + "-" + locale.getCountry());
            this.f26710a.put("timeZone", timeZone.getID());
            this.f26710a.put("gmtShift", Integer.valueOf((int) (((double) timeZone.getRawOffset()) / 3600000.0d)));
            this.f26710a.put("currencyCode", currency.getCurrencyCode());
            this.f26710a.put("currencySymbol", currency.getSymbol());
            Map map = this.f26710a;
            String type = Calendar.getInstance().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            map.put("calendarType", kotlin.text.a0.D(type, "-", "_", false));
            LocaleList localeList = LocaleList.getDefault();
            Intrinsics.checkNotNullExpressionValue(localeList, "getDefault(...)");
            IntRange intRangeO = kotlin.ranges.f.o(0, localeList.size());
            ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
            vim.f it8 = intRangeO.iterator();
            while (it8.f289625c) {
                arrayList.add(localeList.get(it8.nextInt()).toLanguageTag());
            }
            this.f26710a.put("preferredLanguages", arrayList);
            String[] elements = {"US", "LR", "MM"};
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f26710a.put("isMetricSystemSelected", Boolean.valueOf(!kotlin.collections.d.y0(elements).contains(locale.getCountry())));
        }
    }
}
