package q83;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.api.navigation.descriptors.NamelessCardDialogDescriptor$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import q2e.i0;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h implements c {
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f242969p;

    public e(NamelessCardDialogDescriptor$InputData inputData, ang.f userInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = userInteractor;
        this.f242969p = mra.d.b(this, new b(inputData.f65369a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.j(w4l.h.f294642c), null, null, new i0(this, (Continuation) null, 17), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f242969p;
    }
}
