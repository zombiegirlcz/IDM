package abl;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        IntRange intRange = new IntRange(1, 4, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("ID_LOADING_", it8.nextInt())));
        }
        return new e(arrayList, new tal.a(null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left)));
    }
}
