package gv5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.gift.asset.api.CryptoGiftAssetApi$Toggles$CryptoGiftAsset;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f147057b;

    public /* synthetic */ a(d dVar, int i) {
        this.f147056a = i;
        this.f147057b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f147056a) {
            case 0:
                xi0.b it8 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                d dVar = this.f147057b;
                return gt5.a.b(dVar.f147060a, nim.a.w(osg.b.e(dVar.f147062c, false, null, null, io3.i.INTERNAL, null, null, null, LDSFile.EF_DG4_TAG), new a(dVar, 1)), it8, null, 4);
            case 1:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                aim.e eVarB = u.b();
                eVarB.add(io3.l.CURRENT);
                eVarB.add(io3.l.BLOCKING);
                eVarB.add(io3.l.STAKING);
                eVarB.add(io3.l.STAKING_PROXY);
                if (((jte.d) this.f147057b.e).c(CryptoGiftAssetApi$Toggles$CryptoGiftAsset.f70860c)) {
                    eVarB.add(io3.l.LOCKED_GIFT);
                }
                return y.J(y.n(y.n(y.n(d0.Q(pockets), new gul.f(23)), new fvk.q(u.a(eVarB), 14)), new gul.f(24)));
            case 2:
                xi0.b it9 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return gt5.a.a(this.f147057b.f147060a, it9, false, 6);
            default:
                xi0.b selectedCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
                d dVar2 = this.f147057b;
                return ue0.e.E(pd.b.r(gt5.a.a(dVar2.f147060a, null, false, 7), new gqd.s(dVar2, selectedCurrency, 23)), new Data(f0.f322471a, null, false, 6, null));
        }
    }
}
