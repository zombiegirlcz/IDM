package i8e;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import eed.n;
import hwi.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import pcd.s;
import vkm.j2;
import yhm.o;
import yji.l;
import ypg.p;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f159522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f159522w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f159522w, continuation, 0);
            default:
                return new j(this.f159522w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        switch (this.u) {
            case 0:
                k kVar = this.f159522w;
                ppg.b bVar = kVar.f159523p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    ufm.i iVarC = ((p) bVar).c(kVar.o.f89085c);
                    this.v = 1;
                    objB = nim.a.b(iVarC, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                s sVar = (s) objB;
                String id10 = sVar.f234881a;
                String name = ((c) ((j2) kVar.f159524q.f22677a).getValue()).f159516a;
                long j2 = sVar.f234884g;
                Long l2 = sVar.f234887l;
                p pVar = (p) bVar;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(name, "name");
                pfm.a aVarD = ((n) pVar.f).d(id10, name, j2, l2);
                this.v = 2;
                if (nim.a.a(aVarD, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                k kVar2 = this.f159522w;
                if (i2 == 0) {
                    o.b(obj2);
                    j jVar = new j(kVar2, continuation, 0);
                    this.v = 1;
                    if (kVar2.p2(this, jVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (kVar2.o.d) {
                    kVar2.C2(new a(((c) ((j2) kVar2.f159524q.f22677a).getValue()).f159516a));
                } else {
                    l.b1(kVar2, kVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.bill_accounts_details_edit_name_result_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, new l0(kVar2, continuation, 25), 3);
                }
                return Unit.f186387a;
        }
    }
}
