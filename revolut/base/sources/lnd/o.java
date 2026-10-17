package lnd;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f197190a;

    public o(thf.c transactionCategoryResourcesMapper, t0 proCategoryGroupMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(proCategoryGroupMapper, "proCategoryGroupMapper");
        this.f197190a = transactionCategoryResourcesMapper;
    }

    public final Color.Solid a(he3.j group, List allCategories) {
        Object next;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        he3.l type = group.d;
        if (type.a()) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Color.Solid(tia.b.b(t0.c(type)));
        }
        if (type != he3.l.CATEGORY) {
            return new Color.Solid(R$attr.uikit_colorAccentNeutral);
        }
        Iterator it8 = allCategories.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (kotlin.text.a0.z(((i3) next).getId(), group.f151563a, true)) {
                break;
            }
        }
        i3 i3Var = (i3) next;
        return i3Var != null ? new Color.Solid(((wjf.e) this.f197190a).c(i3Var)) : new Color.Solid(R$attr.uikit_colorAccentNeutral);
    }
}
