package qzb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nii.y;
import nii.y0;
import nii.z;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.opt_in.screen.a f250505b;

    public /* synthetic */ m(com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar, int i) {
        this.f250504a = i;
        this.f250505b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f250504a;
        com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar = this.f250505b;
        switch (i) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "RevPointsOptInFullScreen", null, throwable, h0Var);
                aVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.rev_points_opt_in_generic_error, null, null, 14), null, null, null, null, null, false, null, null, null, null, new y(2, com.google.android.gms.internal.mlkit_vision_face.a.o(o0.f186429a.b(throwable.getClass()).m(), ": ", throwable.getMessage()), null), null, 24574), false, 5));
                return Boolean.TRUE;
            default:
                iub.a it8 = (iub.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aVar.l2(new u(1, aVar, null), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
