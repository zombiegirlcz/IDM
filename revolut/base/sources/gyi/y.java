package gyi;

import androidx.core.view.OneShotPreDrawListener;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListScreen;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AirportLoungesPassListScreen f147910a;

    public y(AirportLoungesPassListScreen airportLoungesPassListScreen) {
        this.f147910a = airportLoungesPassListScreen;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        svi.r rVar;
        String str;
        AirportLoungesPassListScreen airportLoungesPassListScreen = this.f147910a;
        if (i != 0) {
            KProperty[] kPropertyArr = AirportLoungesPassListScreen.X;
            OneShotPreDrawListener oneShotPreDrawListener = airportLoungesPassListScreen.R;
            if (oneShotPreDrawListener != null) {
                oneShotPreDrawListener.removeListener();
            }
            airportLoungesPassListScreen.R = null;
            return;
        }
        h hVarK3 = airportLoungesPassListScreen.k3();
        int currentItem = airportLoungesPassListScreen.d3().f.getCurrentItem();
        d0 d0Var = (d0) hVarK3;
        cli.y yVar = d0Var.f147882y;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        List list = (List) ((a) j2Var.getValue()).f147862a.getContent();
        if (list != null && (rVar = (svi.r) zhm.d0.e0(currentItem, list)) != null && (str = rVar.f265969a) != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    } else if (Intrinsics.f(((svi.r) it8.next()).f265969a, ((a) j2Var2.getValue()).f147864c)) {
                        if (!str.equals(((a) j2Var2.getValue()).f147864c)) {
                            d0Var.H2(yVar, new gqh.a(str, 13));
                        }
                    }
                }
            }
        }
        airportLoungesPassListScreen.g3();
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        KProperty[] kPropertyArr = AirportLoungesPassListScreen.X;
        this.f147910a.d3().d.K(f, i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        KProperty[] kPropertyArr = AirportLoungesPassListScreen.X;
        this.f147910a.d3().d.setCurrentPosition(i);
    }
}
