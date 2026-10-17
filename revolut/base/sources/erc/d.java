package erc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import nii.y0;
import nii.z;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.salary_switch.impl.ui.flow.a f128636b;

    public /* synthetic */ d(com.revolut.feature.salary_switch.impl.ui.flow.a aVar, int i) {
        this.f128635a = i;
        this.f128636b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = null;
        switch (this.f128635a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                y0 y0Var = new y0(null, tj0.a.a(it8) ? new e0((Clause) new TextLocalisedClause(R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.common_offline_state_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020) : new z(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_load_data_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_load_data_error_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                com.revolut.feature.salary_switch.impl.ui.flow.a aVar = this.f128636b;
                l.a1(aVar, aVar.X1(y0Var), null, null, new ec8.c(aVar, continuation, 28), 3);
                return Boolean.TRUE;
            default:
                yja.b productArticleOutput = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(productArticleOutput, "productArticleOutput");
                int i = e.f128637a[productArticleOutput.ordinal()];
                com.revolut.feature.salary_switch.impl.ui.flow.a aVar2 = this.f128636b;
                if (i == 1) {
                    aVar2.B2();
                } else if (i == 2) {
                    aVar2.K2(null);
                } else {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected product article output for salary switch " + productArticleOutput);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    aVar2.K2(null);
                }
                return Unit.f186387a;
        }
    }
}
