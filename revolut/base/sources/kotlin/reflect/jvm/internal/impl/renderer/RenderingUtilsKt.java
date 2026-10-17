package kotlin.reflect.jvm.internal.impl.renderer;

import a0.d;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes13.dex */
public final class RenderingUtilsKt {
    @NotNull
    public static final String render(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "<this>");
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        if (!KeywordStringsGenerated.KEYWORDS.contains(strAsString)) {
            int i = 0;
            while (true) {
                if (i < strAsString.length()) {
                    char cCharAt = strAsString.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i++;
                } else if (strAsString.length() != 0 && Character.isJavaIdentifierStart(strAsString.codePointAt(0))) {
                    String strAsString2 = name.asString();
                    Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
                    return strAsString2;
                }
            }
        }
        StringBuilder sb6 = new StringBuilder();
        String strAsString3 = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString3, "asString(...)");
        sb6.append("`" + strAsString3);
        sb6.append('`');
        return sb6.toString();
    }

    public static final String renderFlexibleMutabilityOrArrayElementVarianceType(@NotNull String lowerRendered, @NotNull String upperRendered, @NotNull Function0<String> renderKotlinCollectionsPrefix, @NotNull Function0<String> renderKotlinPrefix, @NotNull Function1<? super String, String> escape) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(renderKotlinCollectionsPrefix, "renderKotlinCollectionsPrefix");
        Intrinsics.checkNotNullParameter(renderKotlinPrefix, "renderKotlinPrefix");
        Intrinsics.checkNotNullParameter(escape, "escape");
        String str = (String) renderKotlinCollectionsPrefix.invoke();
        String strReplacePrefixesInTypeRepresentations = replacePrefixesInTypeRepresentations(lowerRendered, d.r(str, "Mutable"), upperRendered, str, d.r(str, "(Mutable)"));
        if (strReplacePrefixesInTypeRepresentations != null) {
            return strReplacePrefixesInTypeRepresentations;
        }
        String strReplacePrefixesInTypeRepresentations2 = replacePrefixesInTypeRepresentations(lowerRendered, d.r(str, "MutableMap.MutableEntry"), upperRendered, d.r(str, "Map.Entry"), d.r(str, "(Mutable)Map.(Mutable)Entry"));
        if (strReplacePrefixesInTypeRepresentations2 != null) {
            return strReplacePrefixesInTypeRepresentations2;
        }
        String str2 = (String) renderKotlinPrefix.invoke();
        StringBuilder sbS = a.s(str2);
        sbS.append((String) escape.invoke("Array<"));
        String string = sbS.toString();
        StringBuilder sbS2 = a.s(str2);
        sbS2.append((String) escape.invoke("Array<out "));
        String string2 = sbS2.toString();
        StringBuilder sbS3 = a.s(str2);
        sbS3.append((String) escape.invoke("Array<(out) "));
        String strReplacePrefixesInTypeRepresentations3 = replacePrefixesInTypeRepresentations(lowerRendered, string, upperRendered, string2, sbS3.toString());
        if (strReplacePrefixesInTypeRepresentations3 != null) {
            return strReplacePrefixesInTypeRepresentations3;
        }
        return null;
    }

    public static /* synthetic */ String renderFlexibleMutabilityOrArrayElementVarianceType$default(String str, String str2, Function0 function0, Function0 function02, Function1 function1, int i, Object obj2) {
        if ((i & 16) != 0) {
            function1 = wjm.a.f298162r;
        }
        return renderFlexibleMutabilityOrArrayElementVarianceType(str, str2, function0, function02, function1);
    }

    @NotNull
    public static final String renderFqName(@NotNull List<Name> pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb6 = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb6.length() > 0) {
                sb6.append(".");
            }
            sb6.append(render(name));
        }
        return sb6.toString();
    }

    public static final String replacePrefixesInTypeRepresentations(@NotNull String lowerRendered, @NotNull String lowerPrefix, @NotNull String upperRendered, @NotNull String upperPrefix, @NotNull String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (!a0.H(lowerRendered, lowerPrefix, false) || !a0.H(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strR = d.r(foldedPrefix, strSubstring);
        if (Intrinsics.f(strSubstring, strSubstring2)) {
            return strR;
        }
        if (!typeStringsDifferOnlyInNullability(strSubstring, strSubstring2)) {
            return null;
        }
        return strR + '!';
    }

    public static final boolean typeStringsDifferOnlyInNullability(@NotNull String lower, @NotNull String upper) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        if (Intrinsics.f(lower, a0.D(upper, "?", "", false))) {
            return true;
        }
        if (a0.y(upper, "?", false)) {
            if (Intrinsics.f(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb6 = new StringBuilder("(");
        sb6.append(lower);
        sb6.append(")?");
        return Intrinsics.f(sb6.toString(), upper);
    }

    @NotNull
    public static final String render(@NotNull FqNameUnsafe fqNameUnsafe) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe, "<this>");
        return renderFqName(fqNameUnsafe.pathSegments());
    }
}
