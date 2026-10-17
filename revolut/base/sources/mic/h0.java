package mic;

import aw0.u4;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.gu;
import ip0.pb0;
import ip0.sy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oic.h f205666a;

    public h0(oic.h perkDetailsContentMapper) {
        Intrinsics.checkNotNullParameter(perkDetailsContentMapper, "perkDetailsContentMapper");
        this.f205666a = perkDetailsContentMapper;
    }

    public final y a() {
        u4 headerData = new u4(Integer.valueOf(R$drawable.uikit_icn_24_back), null, null, null, null, null, null);
        s0 s0Var = new s0(4);
        s0Var.a(new gu("LOADING_LIST_ITEM_1", 0, 0, 30));
        sy syVar = new sy("LOADING_LIST_ITEM_2", null, 62);
        yp0.b.l(syVar, 0, 0, 0, 0, null, false, 63);
        s0Var.a(syVar);
        s0Var.a(new gu("LOADING_LIST_ITEM_3", 0, 0, 30));
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new pb0("LOADING_LIST_ITEM_4"));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        s0Var.b(arrayList.toArray(new pb0[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        List listItems = zhm.v.k(arrayList2.toArray(new koi.j[arrayList2.size()]));
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        oic.b buttonConfig = oic.b.f225596a;
        Intrinsics.checkNotNullParameter(buttonConfig, "buttonConfig");
        return new y(listItems, headerData, buttonConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r46) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mic.h0.c(cli.j):cli.o");
    }
}
