package f01;

import android.content.Context;
import android.util.LruCache;
import com.revolut.core.ui_kit.models.Clause;
import java.util.Locale;
import jh.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f130990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LruCache f130991b;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f130990a = context;
        this.f130991b = new LruCache(256);
    }

    @Override // f01.a
    public final int a(String resKey) {
        Intrinsics.checkNotNullParameter(resKey, "resKey");
        String strE0 = d0.e0(resKey, "icn_");
        Locale locale = Locale.ROOT;
        String lowerCase = strE0.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        LruCache lruCache = this.f130991b;
        int iC = c("uikit_icn_", lowerCase, lruCache, "drawable");
        Integer numValueOf = Integer.valueOf(iC);
        if (iC == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String lowerCase2 = resKey.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return c("uikit_icn_", lowerCase2, lruCache, "drawable");
    }

    @Override // f01.a
    public final CharSequence b(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        return ty0.c.a(d.f(this.f130990a).b0(), clause, this.f130990a, null, null, null, null, 188);
    }

    public final int c(String str, String str2, LruCache lruCache, String str3) {
        String strR = a0.d.r(str, str2);
        b bVar = (b) lruCache.get(strR);
        if (bVar != null) {
            return bVar.b();
        }
        Context context = this.f130990a;
        int identifier = context.getResources().getIdentifier(strR, str3, context.getPackageName());
        lruCache.put(strR, b.a(identifier));
        return identifier;
    }

    public final int d(String attrKey) {
        Intrinsics.checkNotNullParameter(attrKey, "attrKey");
        return c("uikit_color", attrKey, this.f130991b, "attr");
    }
}
