package pze;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.k1;
import nii.l1;
import nii.n1;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cpf.b f240985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1f.e f240986b;

    public a(cpf.b transferResultDialogFactory, c1f.e topupDialogs) {
        Intrinsics.checkNotNullParameter(transferResultDialogFactory, "transferResultDialogFactory");
        Intrinsics.checkNotNullParameter(topupDialogs, "topupDialogs");
        this.f240985a = transferResultDialogFactory;
        this.f240986b = topupDialogs;
    }

    public static void b(n1 result, Function0 onFinish) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if ((result instanceof k1) || (result instanceof l1)) {
            onFinish.invoke();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(com.revolut.data.database.models.openbanking.d.s("Dialog Result has unexpected type: ", result));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public static void c(n1 result, Function0 onFinish) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if ((result instanceof k1) || (result instanceof l1)) {
            onFinish.invoke();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(com.revolut.data.database.models.openbanking.d.s("Dialog Result has unexpected type: ", result));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final g0 a() {
        ((c1f.g) this.f240986b).getClass();
        g0 configuration = new g0(new TextLocalisedClause(R$string.top_up_pending_title, null, null, 14), null, null, null, null, null, null, null, false, null, false, null, 16372);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return configuration;
    }
}
