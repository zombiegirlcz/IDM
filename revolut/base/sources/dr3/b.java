package dr3;

import dx4.a1;
import dx4.y0;
import ht3.p;
import ht3.q;
import ht3.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import st3.e;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    public static r a(st3.e dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String title = dto.getTitle();
        List<e.a> images = dto.getImages();
        ArrayList arrayList = new ArrayList(w.t(images, 10));
        for (e.a aVar : images) {
            String imageUrl = aVar.getImageUrl();
            e.a.C1488a hint = aVar.getHint();
            p pVar = null;
            a1 a1VarA = null;
            if (hint != null) {
                String text = hint.getText();
                String icon = hint.getIcon();
                if (icon != null) {
                    a1.Companion.getClass();
                    a1VarA = y0.a(icon);
                }
                pVar = new p(a1VarA, text);
            }
            arrayList.add(new q(imageUrl, pVar));
        }
        return new r(title, arrayList);
    }
}
