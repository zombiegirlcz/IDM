package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.InfoListItem;
import com.revolut.feature.backend_flow.domain.models.InfoListItemSubitem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import q90.w1;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f278295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f278296b;

    public b0(c0 infoListItemSubitemMapper) {
        Intrinsics.checkNotNullParameter(infoListItemSubitemMapper, "infoListItemSubitemMapper");
        this.f278295a = infoListItemSubitemMapper;
        this.f278296b = zhm.r0.k(new Pair("LINK", InfoListItem.LinkStyle.Link.f63498a), new Pair("BUTTON", InfoListItem.LinkStyle.Button.f63497a), new Pair("NAVIGATION", InfoListItem.LinkStyle.Navigation.f63499a));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    @Override // u90.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.backend_flow.domain.models.BackendItem a(q90.v r12, java.util.List r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.b0.a(q90.v, java.util.List):com.revolut.feature.backend_flow.domain.models.BackendItem");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        String strJ;
        InfoListItem item = (InfoListItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63494a;
        String str2 = item.f63495b;
        String strName = item.f63496c.name();
        InfoListItem.LinkStyle linkStyle = item.d;
        if (linkStyle != null) {
            strJ = ce9.m.j(this.f278296b, linkStyle);
            if (strJ == null) {
                strJ = ((InfoListItem.LinkStyle.Unknown) linkStyle).f63500a;
            }
        } else {
            strJ = null;
        }
        String str3 = strJ;
        ArrayList arrayList = item.e;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(this.f278295a.b((InfoListItemSubitem) it8.next()));
        }
        return new w1(str, str2, strName, str3, arrayList2);
    }
}
