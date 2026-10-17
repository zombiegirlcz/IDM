package t9b;

import b9d.k;
import com.revolut.data.model.Data;
import java.util.List;
import java.util.Set;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import s7a.y;
import s7a.z;
import t5e.j;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends x7a.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f268970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f268971b;

    public c(n8b.a countryInteractor, h productCatalogueInteractor, u9b.a availableCountriesMapper) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(availableCountriesMapper, "availableCountriesMapper");
        this.f268970a = countryInteractor;
        this.f268971b = productCatalogueInteractor;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String str = (String) d0.c0(ids);
        if (str != null ? a0.H(str, "item_country_list_id_", false) : false) {
            return new y(kotlin.text.d0.e0(str, "item_country_list_id_"));
        }
        return str != null ? str.equals("item_country_not_found_list_id") : false ? z.f260661a : new w9b.c(str);
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new a(0), new j(14), new k(12, query, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Type inference failed for: r5v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    @Override // x7a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow e(java.lang.String r4, boolean r5, java.lang.Object r6) {
        /*
            r3 = this;
            java.lang.String r5 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            jla.h r4 = r3.f268971b
            java.lang.String r5 = "ACCOUNT"
            jla.c r4 = bla.b.c(r4, r5)
            if (r4 == 0) goto L58
            java.lang.String r5 = "code"
            java.lang.String r6 = "global_account_countries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            jla.k r4 = r4.f175657b
            if (r4 == 0) goto L25
            java.util.Map r4 = r4.f
            if (r4 == 0) goto L25
            java.lang.Object r4 = r4.get(r6)
            java.util.List r4 = (java.util.List) r4
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 == 0) goto L58
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = zhm.w.t(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r4.next()
            wi0.b r6 = (wi0.b) r6
            v9b.a r0 = new v9b.a
            java.lang.String r1 = r6.f297794a
            n8b.a r2 = r3.f268970a
            o8b.c r2 = (o8b.c) r2
            java.lang.String r1 = r2.b(r1)
            r0.<init>(r6, r1)
            r5.add(r0)
            goto L39
        L58:
            zhm.f0 r5 = zhm.f0.f322471a
        L5a:
            go.g r4 = zi0.c.i(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t9b.c.e(java.lang.String, boolean, java.lang.Object):kotlinx.coroutines.flow.Flow");
    }
}
