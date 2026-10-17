package of9;

import android.text.method.DigitsKeyListener;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import ip0.kr;
import ip0.lr;
import ip0.mr;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.PatternSyntaxException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import te0.w;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f224760a = w.y0(new ob1.e(25));

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    public static final DigitsKeyListener a(InputTextDelegate.Model input, String str) throws IOException {
        String str2;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(input, "input");
        if (str == null) {
            str2 = null;
        } else {
            try {
                mr mrVar = input.u;
                if (!Intrinsics.f(mrVar, kr.f165065a)) {
                    if (!(mrVar instanceof lr)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((lr) mrVar).f165251a == 2) {
                        Regex regex = (Regex) f224760a.getValue();
                        t0 t0Var = t0.f186434a;
                        m70.a.c(t0Var);
                        String strReplace = regex.replace(str, "");
                        if (strReplace.length() <= 0) {
                            strReplace = null;
                        }
                        str2 = "1234567890";
                        if (strReplace != null) {
                            char[] charArray = "1234567890".concat(strReplace).toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                            List listJ = kotlin.collections.d.J(charArray);
                            Intrinsics.checkNotNullParameter(t0Var, "<this>");
                            String strK0 = d0.k0(listJ, "", null, null, 0, null, 62);
                            if (strK0 != null) {
                                str2 = strK0;
                            }
                        }
                    }
                }
            } catch (PatternSyntaxException e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Can't parse pattern", e, h0Var);
            }
            str2 = null;
        }
        if (str2 != null) {
            return DigitsKeyListener.getInstance(str2);
        }
        return null;
    }

    public static final String b(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb6 = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < input.length(); i++) {
            char cCharAt = input.charAt(i);
            Character[] elements = {Character.valueOf(CoreConstants.CURLY_LEFT), Character.valueOf(CoreConstants.CURLY_RIGHT)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (kotlin.collections.d.y0(elements).contains(Character.valueOf(cCharAt))) {
                Unit unit = Unit.f186387a;
            } else if (cCharAt == '[') {
                Unit unit2 = Unit.f186387a;
                z = true;
            } else if (cCharAt == ']') {
                Unit unit3 = Unit.f186387a;
                z = false;
            } else if (z) {
                Character[] elements2 = {'0', '9'};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                if (kotlin.collections.d.y0(elements2).contains(Character.valueOf(cCharAt))) {
                    sb6.append("#");
                } else {
                    Character[] elements3 = {'A', 'a'};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    if (kotlin.collections.d.y0(elements3).contains(Character.valueOf(cCharAt))) {
                        sb6.append("X");
                    } else {
                        Character[] elements4 = {Character.valueOf(CoreConstants.DASH_CHAR), '_'};
                        Intrinsics.checkNotNullParameter(elements4, "elements");
                        if (kotlin.collections.d.y0(elements4).contains(Character.valueOf(cCharAt))) {
                            sb6.append("∗");
                        } else if (cCharAt == 8230) {
                            m70.a.t(t0.f186434a);
                            sb6.append(" ");
                            sb6.append(cCharAt);
                        } else {
                            sb6.append((char) 8727);
                        }
                    }
                }
            } else {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
