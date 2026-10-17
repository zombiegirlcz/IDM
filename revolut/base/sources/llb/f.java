package llb;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.InfoSheetFlowContract$InputData;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheetParams;
import hlb.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lb0.b0;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h implements dli.b {
    public final InfoSheetFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f196697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f196698q;

    public f(InfoSheetFlowContract$InputData inputData, j sheetsModel, ilb.c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sheetsModel, "sheetsModel");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f196697p = sheetsModel;
        this.f196698q = mra.d.b(this, new hlb.f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        InfoSheetParams params = this.o.f83212a;
        hlb.d dVar = (hlb.d) this.f196697p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation continuation = null;
        l.a1(this, q.Q(dVar.f153427p, new eh9.j(continuation, dVar, params, 17)), null, null, new le8.d(this, continuation, 20), 3);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        l2(new b0(this, obj2, listId, (Continuation) null, 20), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f196698q;
    }
}
