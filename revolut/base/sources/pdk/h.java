package pdk;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements Function1 {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f235265a;

    public h(f tilesGridItemMapper) {
        Intrinsics.checkNotNullParameter(tilesGridItemMapper, "tilesGridItemMapper");
        this.f235265a = tilesGridItemMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xk invoke(List rewards) {
        Float fValueOf = Float.valueOf(12.0f);
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        List list = rewards;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f235265a.invoke((xck.a) it8.next()));
        }
        int i = R$attr.uikit_dp12;
        int i2 = R$attr.uikit_dp4;
        return new xk("LIST_ID_TILES_GRID", arrayList, 2, fValueOf, fValueOf, i, i, i2, i2, 63584);
    }
}
