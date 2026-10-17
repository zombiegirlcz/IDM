package a10;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.d0;
import nkm.y;
import zhm.a0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f448a = v.k(new Regex("([0-9]{4})年([0-9]{1,2})月([0-9]{1,2})日まで有効"), new Regex("有効期限[:：]?([0-9]{4})年([0-9]{1,2})月([0-9]{1,2})日"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f449b = new Regex("[0-9]{4}");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f450c = v.k(new Regex("生年月日[:：]?((?:明治|大正|昭和|平成|令和))(元|[0-9]{1,2})年([0-9]{1,2})月([0-9]{1,2})日"), new Regex("((?:明治|大正|昭和|平成|令和))(元|[0-9]{1,2})年([0-9]{1,2})月([0-9]{1,2})日生"));
    public static final List d = v.k(new Regex("生年月日[:：]?([0-9]{4})年([0-9]{1,2})月([0-9]{1,2})日"), new Regex("([0-9]{4})年([0-9]{1,2})月([0-9]{1,2})日生"));
    public static final Object e;

    static {
        LocalDate localDateOf = LocalDate.of(1868, 1, 25);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
        LocalDate localDateOf2 = LocalDate.of(1912, 7, 29);
        Intrinsics.checkNotNullExpressionValue(localDateOf2, "of(...)");
        Pair pair = new Pair("明治", new d(localDateOf, localDateOf2));
        LocalDate localDateOf3 = LocalDate.of(1912, 7, 30);
        Intrinsics.checkNotNullExpressionValue(localDateOf3, "of(...)");
        LocalDate localDateOf4 = LocalDate.of(1926, 12, 24);
        Intrinsics.checkNotNullExpressionValue(localDateOf4, "of(...)");
        Pair pair2 = new Pair("大正", new d(localDateOf3, localDateOf4));
        LocalDate localDateOf5 = LocalDate.of(1926, 12, 25);
        Intrinsics.checkNotNullExpressionValue(localDateOf5, "of(...)");
        LocalDate localDateOf6 = LocalDate.of(1989, 1, 7);
        Intrinsics.checkNotNullExpressionValue(localDateOf6, "of(...)");
        Pair pair3 = new Pair("昭和", new d(localDateOf5, localDateOf6));
        LocalDate localDateOf7 = LocalDate.of(1989, 1, 8);
        Intrinsics.checkNotNullExpressionValue(localDateOf7, "of(...)");
        LocalDate localDateOf8 = LocalDate.of(2019, 4, 30);
        Intrinsics.checkNotNullExpressionValue(localDateOf8, "of(...)");
        Pair pair4 = new Pair("平成", new d(localDateOf7, localDateOf8));
        LocalDate localDateOf9 = LocalDate.of(2019, 5, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf9, "of(...)");
        LocalDate MAX = LocalDate.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        e = r0.k(pair, pair2, pair3, pair4, new Pair("令和", new d(localDateOf9, MAX)));
    }

    private e() {
    }

    public static LocalDate a(Integer num, Integer num2, Integer num3) {
        if (num == null || num2 == null || num3 == null) {
            return null;
        }
        try {
            return LocalDate.of(num.intValue(), num2.intValue(), num3.intValue());
        } catch (DateTimeException unused) {
            return null;
        }
    }

    public static ArrayList b(List list) {
        ArrayList<String> arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(y.J(d0.Z((String) it8.next())), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (String str : arrayList) {
            StringBuilder sb6 = new StringBuilder(str.length());
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (CharsKt.e(cCharAt)) {
                    Unit unit = Unit.f186387a;
                } else if (65296 > cCharAt || cCharAt >= 65306) {
                    sb6.append(cCharAt);
                } else {
                    sb6.append((char) (cCharAt - 65248));
                }
            }
            arrayList2.add(sb6.toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((String) obj2).length() > 0) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }
}
