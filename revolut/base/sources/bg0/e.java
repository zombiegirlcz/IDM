package bg0;

import cg0.i0;
import cg0.l0;
import cg0.m0;
import cg0.n0;
import hj0.f;
import hj0.h;
import hj0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class e {
    public static f a(l0 dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        if (dto.getContentLink() != null) {
            return new hj0.d(dto.getId(), dto.getTitle(), dto.getKey(), new hj0.c(dto.getContentLink().getHyperlink(), dto.getContentLink().getDeeplink()));
        }
        String strE = dto.getId();
        String strJ = dto.getTitle();
        String strG = dto.getKey();
        List listA = dto.getActions();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            arrayList.add(a.d((i0) it8.next()));
        }
        String strI = dto.getSubtitle();
        i0 i0VarD = dto.getHelp();
        h hVar = null;
        hj0.b bVarD = i0VarD != null ? a.d(i0VarD) : null;
        String strF = dto.getImage();
        String strB = dto.getContent();
        m0 m0VarH = dto.getSubContents();
        if (m0VarH != null) {
            String style = m0VarH.getStyle();
            List<n0> items = m0VarH.getItems();
            ArrayList arrayList2 = new ArrayList(w.t(items, 10));
            for (n0 n0Var : items) {
                String title = n0Var.getTitle();
                String content = n0Var.getContent();
                i0 action = n0Var.getAction();
                arrayList2.add(new i(title, content, action != null ? a.d(action) : null));
            }
            hVar = new h(style, arrayList2);
        }
        return new hj0.e(strE, strJ, strG, strI, strB, strF, arrayList, hVar, bVarD);
    }
}
