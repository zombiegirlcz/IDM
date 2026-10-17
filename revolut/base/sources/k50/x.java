package k50;

import androidx.core.text.HtmlCompat;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nl0.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    @NotNull
    private static final v Companion = new v(0);
    public static final Set e;
    public static final f.b f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f181277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl0.f f181278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f181279c;
    public Boolean d;

    static {
        nl0.h[] elements = {nl0.h.UNORDERED_LIST, nl0.h.ORDERED_LIST, nl0.h.STRIKE, nl0.h.NEW_LINE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = kotlin.collections.d.y0(elements);
        f = new f.b(12, zhm.y0.b(nl0.i.HEADER_WITH_BOLD));
    }

    public x(j30.c featureToggles, p10.b config, nl0.f markDownUtils, p linkInterceptor) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(markDownUtils, "markDownUtils");
        Intrinsics.checkNotNullParameter(linkInterceptor, "linkInterceptor");
        this.f181277a = featureToggles;
        this.f181278b = markDownUtils;
        this.f181279c = linkInterceptor;
    }

    public final String a(v20.o2 o2Var) {
        return h.b(HtmlCompat.fromHtml(kotlin.text.a0.D(kotlin.text.a0.D(d(o2Var.getMessage(), false, nl0.h.ALL), "&amp;", "&", false), "&nbsp;", " ", false), 0).toString());
    }

    public final boolean b() {
        Boolean bool = this.d;
        if (bool == null) {
            this.f181277a.getClass();
            bool = Boolean.TRUE;
            this.d = bool;
        }
        return bool.booleanValue();
    }

    public final String c(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return d(message, b(), nl0.h.ALL);
    }

    public final String d(CharSequence charSequence, boolean z, Set set) {
        nl0.j jVar = z ? nl0.j.STANDARD_V2 : nl0.j.LEGACY;
        f.b bVarA = f;
        if (z) {
            bVarA = f.b.a(bVarA, nl0.b.ENFORCED, this.f181279c, 3);
        }
        return this.f181278b.b(h.a(charSequence.toString()), set, jVar, bVarA);
    }

    public final String e(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strA = h.a(message.toString());
        nl0.h[] elements = {nl0.h.NEW_LINE, nl0.h.UNORDERED_LIST, nl0.h.ORDERED_LIST};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return HtmlCompat.fromHtml(this.f181278b.a(strA, kotlin.collections.d.y0(elements), nl0.j.STANDARD_V2, f.b.a(f, nl0.b.ENFORCED, null, 11)), 0, null, w.f181266a).toString();
    }
}
