package zy;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.v1;
import ybh.c0;
import zhm.d0;
import zr5.k;
import zul.l0;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends x7a.d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f326355a;

    public f(c0 languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f326355a = languageProvider;
    }

    public static String i(Locale locale) {
        String displayName = locale.getDisplayName(locale);
        Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
        if (displayName.length() <= 0) {
            return displayName;
        }
        StringBuilder sb6 = new StringBuilder();
        char cCharAt = displayName.charAt(0);
        sb6.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.f(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = displayName.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb6.append(strSubstring);
        return sb6.toString();
    }

    @Override // x7a.d
    public final s7a.c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Set set = ids;
        if (Intrinsics.f(d0.a0(set), "sign_language")) {
            return c.f326354a;
        }
        Locale localeForLanguageTag = Locale.forLanguageTag((String) d0.a0(set));
        Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "forLanguageTag(...)");
        return new b(localeForLanguageTag);
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new l0(12), new zs4.d(17), new soc.f(this, 23, query, selectedModelIds));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new v1(new k(this, null, 16));
    }
}
