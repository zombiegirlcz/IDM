package lta;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import f01.c;
import ip0.pb0;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f199844b = R$attr.uikit_dp12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f199845a;

    public b(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f199845a = uiKitResources;
    }

    public final int a(String iconName) {
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        int iA = this.f199845a.a(iconName);
        if (iA != 0) {
            return iA;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, "RaffleContentItemsMapper", p.a.p("Failed to resolve drawable resource for icon name '", iconName, "'. Defaulting to uikit_icn_24_revolut."), null, h0Var);
        return R$drawable.uikit_icn_24_revolut;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(t61.a.o("LOADING_ITEM_LIST_ID_PREFIX_", i, pb0.Companion, false, 4));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
