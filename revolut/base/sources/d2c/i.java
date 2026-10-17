package d2c;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.t0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.t1;
import nii.u1;
import p1c.c;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f110790w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f110790w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f110790w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        final j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            a3b.h hVar = new a3b.h(jVar, 11);
            final boolean z = this.f110790w;
            t1 t1Var = new t1() { // from class: d2c.h
                @Override // nii.p1
                public final m0 a(Object obj3) {
                    jVar.f110791p.getClass();
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.lifestyle_spare_change_deactivated, null, null, 14);
                    m70.a.c(t0.f186434a);
                    j0 j0Var = new j0((Clause) textLocalisedClause, (Clause) new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
                    if (z) {
                        return j0Var;
                    }
                    return null;
                }
            };
            cpb.j jVar2 = new cpb.j(jVar, null, 2);
            this.u = 1;
            obj2 = n14.k.Q(jVar, null, hVar, t1Var, jVar2, this, 1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        nii.e eVar = (nii.e) obj2;
        if (eVar instanceof nii.d) {
            jVar.C2(c.b.f231890a);
        } else if (!(eVar instanceof nii.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
