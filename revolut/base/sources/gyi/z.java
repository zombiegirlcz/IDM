package gyi;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListScreen;
import java.util.List;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147911a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f147913c;

    public z(ViewPager2 viewPager2, AirportLoungesPassListScreen airportLoungesPassListScreen, int i) {
        this.f147913c = airportLoungesPassListScreen;
        this.f147912b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        svi.r rVar;
        String str;
        switch (this.f147911a) {
            case 0:
                AirportLoungesPassListScreen airportLoungesPassListScreen = (AirportLoungesPassListScreen) this.f147913c;
                airportLoungesPassListScreen.R = null;
                Integer numF3 = airportLoungesPassListScreen.f3();
                if (numF3 != null) {
                    int iIntValue = numF3.intValue();
                    int i = this.f147912b;
                    if (iIntValue == i) {
                        d0 d0Var = (d0) airportLoungesPassListScreen.k3();
                        cli.y yVar = d0Var.f147882y;
                        j2 j2Var = (j2) yVar.f22677a;
                        j2 j2Var2 = (j2) yVar.f22677a;
                        List list = (List) ((a) j2Var.getValue()).f147862a.getContent();
                        if (list != null && (rVar = (svi.r) zhm.d0.e0(i, list)) != null && (str = rVar.f265969a) != null && str.equals(((a) j2Var2.getValue()).f147864c) && ((a) j2Var2.getValue()).f == null) {
                            d0Var.H2(yVar, new gvi.p(21));
                        }
                    }
                    break;
                }
                break;
            default:
                try {
                    Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
                    break;
                } catch (InterruptedException unused) {
                }
                ((sg.c) this.f147913c).F(this.f147912b);
                break;
        }
    }

    public z(sg.c cVar, int i) {
        this.f147913c = cVar;
        this.f147912b = i;
    }
}
