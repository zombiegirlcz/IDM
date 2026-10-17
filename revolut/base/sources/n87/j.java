package n87;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreen;
import java.util.ArrayList;
import java.util.List;
import tw0.b0;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GlobalMarketsCollectionScreen f213253a;

    public j(GlobalMarketsCollectionScreen globalMarketsCollectionScreen) {
        this.f213253a = globalMarketsCollectionScreen;
    }

    @Override // tw0.b0
    public final void I1() {
        q qVarR2 = this.f213253a.R2();
        qVarR2.H2(qVarR2.f213267s, new n5k.c(20));
        qVarR2.n2(new o(qVarR2, null, 1), new whi.b(6));
    }

    @Override // tw0.b0
    public final void m1(int i, int i2) {
        List list;
        GlobalMarketsCollectionScreen globalMarketsCollectionScreen = this.f213253a;
        q qVarR2 = globalMarketsCollectionScreen.R2();
        int i3 = globalMarketsCollectionScreen.R;
        int i5 = i - i3;
        int i6 = i2 - i3;
        y yVar = qVarR2.f213267s;
        Data data = ((k) ((j2) yVar.f22677a).getValue()).f213255b;
        if (data == null || (list = (List) data.getContent()) == null) {
            return;
        }
        ArrayList arrayListF1 = d0.f1(list);
        if (i5 < 0 || i5 >= arrayListF1.size() || i6 < 0 || i6 >= arrayListF1.size()) {
            return;
        }
        arrayListF1.add(i6, (vel.f) arrayListF1.remove(i5));
        qVarR2.H2(yVar, new jeg.i(17, arrayListF1));
    }
}
