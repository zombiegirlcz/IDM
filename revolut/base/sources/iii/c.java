package iii;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.R$string;
import igh.k;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vim.f;
import zhm.a0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static final List a(String listId, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model(listId, new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, z ? new TextLocalisedClause(R$string.common_error_state_action, null, null, 14) : null, false, null, obj2, false, 0, 0, 31172);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public static /* synthetic */ List b(Object obj2, String str, int i, boolean z) {
        if ((i & 2) != 0) {
            str = "ERROR_STATE_ID";
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        return a(str, z, obj2);
    }

    public static final ArrayList c(int i) {
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList2.add(new pb0(a0.d.n("LOADING_STATE_ID_", it8.nextInt())));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        a0.x(arrayList2, arrayList);
        return arrayList;
    }

    public static final List d(String listId, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model(listId, new TextLocalisedClause(R$string.common_offline_state_title, null, null, 14), new TextLocalisedClause(R$string.common_offline_state_description, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_communication, null, null, 6)), zj.REGULAR, z ? new TextLocalisedClause(R$string.common_offline_state_action, null, null, 14) : null, false, null, obj2, false, 0, 0, 31168);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public static /* synthetic */ List e(int i, String str, boolean z) {
        if ((i & 2) != 0) {
            str = "ERROR_STATE_ID";
        }
        return d(str, z, null);
    }

    public static final Object f(Data data, Function1 mapLoading, Function2 mapError, Function3 mapContent) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        Intrinsics.checkNotNullParameter(mapLoading, "mapLoading");
        Intrinsics.checkNotNullParameter(mapError, "mapError");
        Intrinsics.checkNotNullParameter(mapContent, "mapContent");
        Object content = data.getContent();
        return content != null ? mapContent.invoke(content, Boolean.valueOf(data.getLoading()), data.getError()) : data.getLoading() ? mapLoading.invoke(a.f161618a) : tj0.a.a(data.getError()) ? mapError.invoke(data.getError(), new k(17)) : mapError.invoke(data.getError(), new k(18));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(lk0.g r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function2 r8, kotlin.jvm.functions.Function3 r9) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iii.c.g(lk0.g, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3):java.lang.Object");
    }
}
