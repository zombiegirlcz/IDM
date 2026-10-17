package mr7;

import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f208069a = r0.k(new Pair("BARCHART", nr7.b.BAR_CHART), new Pair("CALENDAR", nr7.b.CALENDAR), new Pair("CALENDARRECURRING", nr7.b.CALENDAR_RECURRING), new Pair("CAMERA", nr7.b.CAMERA), new Pair("CANDLE", nr7.b.CANDLE), new Pair("COINS", nr7.b.COINS), new Pair("CREDITOVERDRAFT", nr7.b.CREDIT_OVERDRAFT), new Pair("DELIVERYCAR", nr7.b.DELIVERY_CAR), new Pair("DOCUMENT", nr7.b.DOCUMENT), new Pair("DOCUMENTSPAIR", nr7.b.DOCUMENTS_PAIR), new Pair("DRIVINGLICENCE", nr7.b.DRIVING_LICENCE), new Pair("FLAG", nr7.b.FLAG), new Pair("INSURANCE", nr7.b.INSURANCE), new Pair("LIGHTBULB", nr7.b.LIGHT_BULB), new Pair("LIMIT", nr7.b.LIMIT), new Pair("LOCATIONPIN", nr7.b.LOCATION_PIN), new Pair("MEDICALCROSS", nr7.b.MEDICAL_CROSS), new Pair("PENCIL", nr7.b.PENCIL), new Pair("PEOPLE", nr7.b.PEOPLE), new Pair("PRESENT", nr7.b.PRESENT), new Pair("PROFILE", nr7.b.PROFILE), new Pair("QUESTION", nr7.b.QUESTION), new Pair("SCANCARD", nr7.b.SCAN_CARD), new Pair("SHIELD", nr7.b.SHIELD), new Pair("SOCIALLIKE", nr7.b.SOCIAL_LIKE), new Pair("SUITCASE", nr7.b.SUITCASE), new Pair("TIME", nr7.b.TIME), new Pair("TRAVEL", nr7.b.TRAVEL), new Pair("WEALTH", nr7.b.WEALTH), new Pair("UNKNOWN", nr7.b.UNKNOWN));

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public static final nr7.b a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return (nr7.b) u1.t(upperCase, nr7.b.UNKNOWN, f208069a);
    }
}
