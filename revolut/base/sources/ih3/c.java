package ih3;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import hh3.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;
import zg3.g;
import zg3.j;
import zg3.k;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb8.a f161290a;

    public c(hh3.b commonMapper, kb8.a drawableResourceProvider) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(drawableResourceProvider, "drawableResourceProvider");
        this.f161290a = drawableResourceProvider;
    }

    @Override // hh3.e
    public final List a(hh3.a aVar) throws Throwable {
        int i;
        Object objA;
        float f;
        a uiBlock = (a) aVar;
        Intrinsics.checkNotNullParameter(uiBlock, "uiBlock");
        k kVar = uiBlock.f161289a;
        List<g> list = kVar.f322064b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (g gVar : list) {
            String strQ = j6.a.q("PROGRESS_ITEM_LIST_ID_PREFIX_", gVar.f322056a);
            TextClause textClause = new TextClause(gVar.f322056a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(gVar.f322057b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String iconName = gVar.d;
            Intrinsics.checkNotNullParameter(iconName, "iconName");
            int iA = this.f161290a.f182529a.a(iconName);
            if (iA == 0) {
                iA = R$drawable.uikit_icn_24_revolut;
            }
            GlyphImage glyphImage = new GlyphImage(iA, null, null, 6);
            ProgressStyle.Companion companion = ProgressStyle.INSTANCE;
            j jVar = gVar.f322058c;
            try {
                try {
                    m.Companion companion2 = m.INSTANCE;
                    float f4 = Float.parseFloat(jVar.f322061b);
                    float f5 = Float.parseFloat(jVar.f322060a);
                    if (f5 > f4) {
                        IllegalStateException illegalStateException = new IllegalStateException("Current is higher than total");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        f = f5;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        f = f5;
                    }
                    int iRound = Math.round((f / f4) * 100.0f);
                    i = 0;
                    try {
                        objA = Integer.valueOf(f.g(iRound, 0, 100));
                    } catch (Throwable th10) {
                        th = th10;
                        m.Companion companion3 = m.INSTANCE;
                        objA = o.a(th);
                    }
                } catch (Throwable th11) {
                    th = th11;
                    i = 0;
                }
                Throwable thA = m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                if (objA instanceof n) {
                    objA = null;
                }
                Integer num = (Integer) objA;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(glyphImage, null, companion.a(num != null ? num.intValue() : i), false, null, false, 56);
                String str = gVar.e;
                arrayList.add(new RowDelegate.Model(strQ, image40, textClause, null, 0, textClause2, null, null, 0, str != null ? new RowDelegate.Model.c.b(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
            } catch (CancellationException e) {
                throw e;
            }
        }
        return yp0.b.g(arrayList, hh3.b.a(new TextClause(kVar.f322063a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j6.a.q("PROGRESS_TITLE_LIST_ID_PREFIX_", kVar.f322063a)), null, 0, 0, 126);
    }
}
