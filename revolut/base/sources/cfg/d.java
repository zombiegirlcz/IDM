package cfg;

import aw0.d0;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ah0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f23690b = v.k(new d0(167, 148), new d0(167, 202), new d0(167, 202), new d0(167, 148));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f23691a;

    public d(a suggestedExperienceTileItemMapper) {
        Intrinsics.checkNotNullParameter(suggestedExperienceTileItemMapper, "suggestedExperienceTileItemMapper");
        this.f23691a = suggestedExperienceTileItemMapper;
    }

    @Override // cfg.e
    public final List a(List experiences, boolean z) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        List list = experiences;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            cfi.a aVar = (cfi.a) obj2;
            String strQ = j6.a.q("SUGGESTED_EXPERIENCES_GRID_ITEM_ID_", aVar.f23692a);
            List list2 = f23690b;
            VoucherSmallTileDelegate.Model modelA = ((b) this.f23691a).a(aVar, z, (d0) list2.get(i % list2.size()));
            int i3 = R$attr.uikit_dp0;
            yp0.b.l(modelA, i3, i3, i3, i3, null, false, 48);
            arrayList.add(new ah0(strQ, modelA, false));
            i = i2;
        }
        return arrayList;
    }
}
