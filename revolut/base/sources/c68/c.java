package c68;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f f21697b;

    public /* synthetic */ c(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, int i) {
        this.f21696a = i;
        this.f21697b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f21696a;
        com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar = this.f21697b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                oki.h.D2(fVar.E);
                break;
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                fVar.T2();
                break;
            default:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar2 = this.f21697b;
                b68.a aVar = fVar2.f76648r;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                yji.l.a1(fVar2, fVar2.X1(new y0("GET_APPROVAL_ERROR_STATUS_DIALOG_MODEL", new z(hf8.b.a(aVar.f12545a, throwable), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, null, 7);
                break;
        }
        return Boolean.TRUE;
    }
}
