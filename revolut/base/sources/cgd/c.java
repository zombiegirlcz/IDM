package cgd;

import ba4.x;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import efm.r;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import le.u1;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends jki.g implements n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SharedFavouritesCounterpartChooserScreenContract$InputData f23928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ifd.e f23929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n60.a f23930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f23931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f23932t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SharedFavouritesCounterpartChooserScreenContract$InputData inputData, ifd.e counterpartAssetsProvider, n60.a keyboardControllerExtension, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(counterpartAssetsProvider, "counterpartAssetsProvider");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f23928p = inputData;
        this.f23929q = counterpartAssetsProvider;
        this.f23930r = keyboardControllerExtension;
        this.f23931s = new k(null, null, "", false);
        this.f23932t = new a();
    }

    public static final int y2(c cVar, FavouritesCounterpartAsset favouritesCounterpartAsset) {
        xi0.a aVar = xi0.b.Companion;
        String str = favouritesCounterpartAsset.f86867a;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        if (cp5.d.A(bVarA)) {
            return 0;
        }
        if (cp5.d.z(bVarA)) {
            return 1;
        }
        return cp5.d.y(bVarA) ? 2 : 3;
    }

    @Override // yji.l
    public final void I1() {
        Flow flowQ = vkm.q.q(new x(q2(), this, 20));
        m3d.f fVar = (m3d.f) this.f23929q;
        fVar.getClass();
        y1d.b.Companion.getClass();
        FavouritesAssetTypeKey[] elements = {y1d.a.f310358b, y1d.a.f310359c, y1d.a.d};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        r rVarSwitchMap = rd0.e.c(vkm.q.q(fVar.d.a(setY0)), kotlin.coroutines.g.f186406a).switchMap(new m30.b(17, new lul.d(fVar, setY0, 20)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r rVarSwitchMap2 = u1.d(rVarSwitchMap, osg.b.e(fVar.e, false, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, qsg.a.RECENT_FIRST, null, 68)).switchMap(new m30.b(15, new m11.h(fVar, 10)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        Continuation continuation = null;
        yji.l.a1(this, new t38.e(flowQ, 24, rd0.e.b(rVarSwitchMap2), new bwb.n(this, continuation, 8)), null, null, new cbh.g(this, continuation, 9), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f23931s;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.f23932t;
    }
}
