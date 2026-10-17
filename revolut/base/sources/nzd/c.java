package nzd;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lk7.p;
import nya.i0;
import nyb.m;
import nz7.g;
import s7a.c0;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f221023a;

    public c(d localesProvider, boolean z) {
        Intrinsics.checkNotNullParameter(localesProvider, "localesProvider");
        this.f221023a = z;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Locale localeForLanguageTag = Locale.forLanguageTag((String) d0.a0(ids));
        Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "forLanguageTag(...)");
        return new a(localeForLanguageTag);
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new m(24), new g(2), new p(this, 9, query, selectedModelIds));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new v1(new i0(this, (Continuation) null, 1));
    }
}
