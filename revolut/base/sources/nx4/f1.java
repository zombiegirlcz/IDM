package nx4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nx4.e1;

/* JADX INFO: loaded from: classes22.dex */
public final class f1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static fx4.h a(e1 dto) {
        ?? arrayList;
        fx4.f fVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String title = dto.getTitle();
        e1.b secondDescription = dto.getSecondDescription();
        fx4.g gVar = secondDescription != null ? new fx4.g(secondDescription.getText()) : null;
        k0 avatar = dto.getAvatar();
        dx4.d1 d1VarD = avatar != null ? o0.d(avatar) : null;
        List<e1.a> actions = dto.getActions();
        if (actions != null) {
            arrayList = new ArrayList();
            for (e1.a aVar : actions) {
                dx4.l lVarA = p.a(aVar.getAction());
                if (lVarA == null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "HeaderDtoMapper", j6.a.q("Can't support for HeaderDto with action: ", aVar.getAction().j()), null, h0Var);
                    fVar = null;
                } else {
                    String label = aVar.getLabel();
                    k0 image = aVar.getImage();
                    fVar = new fx4.f(label, image != null ? o0.d(image) : null, lVarA);
                }
                if (fVar != null) {
                    arrayList.add(fVar);
                }
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        return new fx4.h(title, gVar, d1VarD, arrayList);
    }
}
