package bpd;

import bnj.n;
import bt9.t;
import c1g.o;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TemperatureCache;
import com.google.android.material.color.utilities.TonalPalette;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import d27.d0;
import dee.x;
import grl.b7;
import hul.v;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.crypto.Cipher;
import kotlinx.coroutines.flow.Flow;
import or4.h;
import psl.a0;
import rd6.k;
import rp0.y;
import vb2.r;
import vrl.f0;
import wvg.r1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17597b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f17596a = i;
        this.f17597b = obj2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f17596a) {
            case 0:
                return (Flow) ((n) this.f17597b).invoke(obj2);
            case 1:
                return (List) ((t) this.f17597b).invoke(obj2);
            case 2:
                return DynamicColor.lambda$fromArgb$0((TonalPalette) this.f17597b, (DynamicScheme) obj2);
            case 3:
                return DynamicColor.lambda$fromArgb$1((Hct) this.f17597b, (DynamicScheme) obj2);
            case 4:
                return ((TemperatureCache) this.f17597b).lambda$getHctsByTemp$0((Hct) obj2);
            case 5:
                return (y) ((o) this.f17597b).invoke(obj2);
            case 6:
                return (List) ((d0) this.f17597b).invoke(obj2);
            case 7:
                return (k) ((x) this.f17597b).invoke(obj2);
            case 8:
                return (List) ((hbh.k) this.f17597b).invoke(obj2);
            case 9:
                return (y) ((v) this.f17597b).invoke(obj2);
            case 10:
                return (String) ((mt9.c) this.f17597b).invoke(obj2);
            case 11:
                return Boolean.valueOf(Objects.equals(obj2, ((mhm.d) this.f17597b).f205590b));
            case 12:
                return (qrb.f) ((njf.e) this.f17597b).invoke(obj2);
            case 13:
                return (kel.n) ((h) this.f17597b).invoke(obj2);
            case 14:
                return (String) ((os9.t) this.f17597b).invoke(obj2);
            case 15:
                return (efm.b) ((pj3.b) this.f17597b).invoke(obj2);
            case 16:
                return (List) ((a0) this.f17597b).invoke(obj2);
            case 17:
                return (Cipher) ((qz9.o) this.f17597b).invoke(obj2);
            case 18:
                return (b7) ((tjf.e) this.f17597b).invoke(obj2);
            case 19:
                return (xdf.h) ((v77.a) this.f17597b).invoke(obj2);
            case 20:
                return (xdf.h) ((f0) this.f17597b).invoke(obj2);
            case 21:
                return (xdf.h) ((f0) this.f17597b).invoke(obj2);
            case 22:
                return (SourcePocket) ((r) this.f17597b).invoke(obj2);
            case 23:
                return (xdf.h) ((v77.a) this.f17597b).invoke(obj2);
            case 24:
                return (TotalValueChart) ((wuk.c) this.f17597b).invoke(obj2);
            case 25:
                return (SimpleTotalValueChart) ((wuk.c) this.f17597b).invoke(obj2);
            case 26:
                return (TotalValueChart) ((wuk.c) this.f17597b).invoke(obj2);
            case 27:
                return (SimpleTotalValueChart) ((wuk.c) this.f17597b).invoke(obj2);
            case 28:
                return (SimpleTotalValueChart) ((r1) this.f17597b).invoke(obj2);
            default:
                return (TotalValueChart) ((r1) this.f17597b).invoke(obj2);
        }
    }
}
