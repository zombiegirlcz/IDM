package hml;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.consent.qr.b f153988b;

    public /* synthetic */ c(com.revolut.sso.impl.ui.consent.qr.b bVar, int i) {
        this.f153987a = i;
        this.f153988b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f153987a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                y0 y0Var = new y0(null, new z(new TextLocalisedClause(R$string.common_error_title, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5);
                com.revolut.sso.impl.ui.consent.qr.b bVar = this.f153988b;
                yji.l.a1(bVar, bVar.X1(y0Var), null, null, new m(bVar, null, 0), 3);
                break;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                IllegalStateException illegalStateException = new IllegalStateException("Reject challenge error", it8);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                oki.h.D2(this.f153988b.v);
                break;
        }
        return Boolean.TRUE;
    }
}
