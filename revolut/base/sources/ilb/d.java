package ilb;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.InfoSheetFlowContract$InputData;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheetParams;
import hlb.f;
import hlb.j;
import ibg.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements dli.b {
    public final InfoSheetFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f162218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f162219q;

    public d(InfoSheetFlowContract$InputData inputData, j sheetsModel, c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sheetsModel, "sheetsModel");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f162218p = sheetsModel;
        this.f162219q = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        InfoSheetParams params = this.o.f83212a;
        hlb.d dVar = (hlb.d) this.f162218p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        l.a1(this, q.Q(dVar.f153427p, new eh9.j((Continuation) null, dVar, params, 17)), null, null, new g(this, null, 14), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f162219q;
    }
}
