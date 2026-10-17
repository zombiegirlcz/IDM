package no;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f217762a = new Regex("[A-Z]?[a-z]+|[A-Z]+(?=$|\\d|[A-Z])|\\d+");

    private e1() {
    }

    public static String a(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        List listJ = nkm.y.J(Regex.c(f217762a, className));
        if (!listJ.isEmpty()) {
            return zhm.d0.k0(listJ, ".", null, null, 0, new jli.f(18), 30);
        }
        String lowerCase = className.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
