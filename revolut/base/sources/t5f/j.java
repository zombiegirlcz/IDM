package t5f;

import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntro;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroItem;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroPieChartItem;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroScreen;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroScreenContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t5f.n;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public static TemplateIntro a(e dto) {
        xdh.a aVar;
        String str;
        String str2;
        TemplateIntroScreenContent animatedComponent;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String str3 = dto.f268079a;
        String str4 = dto.f268080b;
        String str5 = dto.f268081c;
        String str6 = dto.d;
        List<h> list = dto.e;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (h hVar : list) {
            arrayList.add(new TemplateIntroItem(hVar.f268084a, hVar.f268085b, hVar.f268086c));
        }
        List<r> list2 = dto.f;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (r rVar : list2) {
            String str7 = rVar.f268100a;
            String str8 = rVar.f268101b;
            n nVar = rVar.f268102c;
            if (nVar instanceof n.c) {
                List<m> list3 = ((n.c) nVar).f268097b;
                ArrayList arrayList3 = new ArrayList(w.t(list3, i));
                for (m mVar : list3) {
                    arrayList3.add(new TemplateIntroPieChartItem(mVar.f268090a, mVar.f268091b, mVar.f268092c));
                    str3 = str3;
                    str4 = str4;
                }
                str = str3;
                str2 = str4;
                animatedComponent = new TemplateIntroScreenContent.PieChart(arrayList3);
            } else {
                str = str3;
                str2 = str4;
                if (!(nVar instanceof n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                animatedComponent = new TemplateIntroScreenContent.AnimatedComponent(((n.a) nVar).f268094b);
            }
            arrayList2.add(new TemplateIntroScreen(str7, str8, animatedComponent));
            str3 = str;
            str4 = str2;
            i = 10;
        }
        String str9 = str3;
        String str10 = str4;
        b bVar = dto.f268082g;
        if (bVar != null) {
            int i2 = i.f268087a[bVar.ordinal()];
            if (i2 == 1) {
                aVar = xdh.a.CONSERVATIVE;
            } else if (i2 == 2) {
                aVar = xdh.a.CAUTIOUS;
            } else if (i2 == 3) {
                aVar = xdh.a.BALANCED;
            } else if (i2 == 4) {
                aVar = xdh.a.BOLD;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = xdh.a.AGGRESSIVE;
            }
        } else {
            aVar = null;
        }
        return new TemplateIntro(str9, str10, str5, str6, arrayList, arrayList2, aVar);
    }
}
