package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.q3;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends c {
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    @Override // u90.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.backend_flow.domain.models.BackendItem a(q90.v r10, java.util.List r11) throws java.lang.Throwable {
        /*
            r9 = this;
            q90.u0 r10 = (q90.u0) r10
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "previousElements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r2 = r10.getId()
            java.lang.String r3 = r10.getHint()
            java.lang.String r4 = r10.getSearchHint()
            java.util.List r11 = r10.getCountries()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r11, r0)
            r5.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L2d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r11.next()
            q90.t0 r0 = (q90.t0) r0
            com.revolut.feature.backend_flow.domain.models.CountrySelectionOption r1 = new com.revolut.feature.backend_flow.domain.models.CountrySelectionOption
            wi0.a r6 = wi0.b.Companion
            java.lang.String r7 = r0.getCode()
            r6.getClass()
            wi0.b r6 = wi0.a.a(r7)
            java.lang.String r0 = r0.getDescription()
            r1.<init>(r6, r0)
            r5.add(r1)
            goto L2d
        L53:
            q90.q3 r11 = r10.getValue()
            r1 = 0
            if (r11 == 0) goto L69
            wi0.a r0 = wi0.b.Companion
            java.lang.String r11 = r11.getValue()
            r0.getClass()
            wi0.b r11 = wi0.a.a(r11)
            r6 = r11
            goto L6a
        L69:
            r6 = r1
        L6a:
            boolean r7 = r10.getRequired()
            java.lang.String r11 = r10.getStyle()
            if (r11 == 0) goto La9
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L7b
            xl2.n r11 = xl2.n.valueOf(r11)     // Catch: java.lang.Throwable -> L7b
            goto L83
        L7b:
            r0 = move-exception
            r11 = r0
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r11 = yhm.o.a(r11)
        L83:
            java.lang.Throwable r0 = yhm.m.a(r11)
            if (r0 == 0) goto L9d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.getStyle()
            java.lang.String r8 = "Unable to parse CountrySelectionItem style = "
            java.lang.String r10 = j6.a.q(r8, r10)
            r0.<init>(r10)
            hx7.e.n(r0)
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L9d:
            boolean r10 = r11 instanceof yhm.n
            if (r10 == 0) goto La2
            goto La3
        La2:
            r1 = r11
        La3:
            xl2.n r1 = (xl2.n) r1
            if (r1 == 0) goto La9
        La7:
            r8 = r1
            goto Lac
        La9:
            xl2.n r1 = xl2.n.DROPDOWN
            goto La7
        Lac:
            com.revolut.feature.backend_flow.domain.models.CountrySelectionItem r1 = new com.revolut.feature.backend_flow.domain.models.CountrySelectionItem
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.n.a(q90.v, java.util.List):com.revolut.feature.backend_flow.domain.models.BackendItem");
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        CountrySelectionItem item = (CountrySelectionItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63368a;
        boolean z = item.f;
        String str2 = item.f63369b;
        String str3 = item.f63370c;
        List<CountrySelectionOption> list = item.d;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (CountrySelectionOption countrySelectionOption : list) {
            arrayList.add(new q90.t0(countrySelectionOption.f63372a.f297794a, countrySelectionOption.f63373b));
        }
        wi0.b bVar = item.e;
        return new q90.u0(str, z, str2, str3, arrayList, bVar != null ? new q3(bVar.f297794a) : null, item.f63371g.name());
    }
}
