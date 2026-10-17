package lqk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.actions.impl.R$string;
import do3.q;
import gim.i;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jmrtd.lds.LDSFile;
import pcd.x;
import pcd.y;
import te0.w;
import yhm.o;
import ypg.p;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f199324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f199325x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f199326y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, x xVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f199324w = dVar;
        this.f199325x = xVar;
        this.f199326y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f199325x, this.f199324w, this.f199326y, continuation);
            default:
                return new b(this.f199324w, this.f199325x, this.f199326y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                d dVar = this.f199324w;
                if (i == 0) {
                    o.b(obj2);
                    x xVar = this.f199325x;
                    Map mapC = q0.c(new Pair(xVar.f234903a, gc0.c.A(xVar.f234906g, y.WITHDRAW)));
                    pfm.a aVarQ = ((p) dVar.f199331n).q(this.f199326y, mapC);
                    this.v = 1;
                    if (nim.a.a(aVarQ, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                dVar.f199330m.getClass();
                dVar.L2(w.a("ID_SHOT_WITHDRAWAL_UPDATE_SUCCESS", new TextLocalisedClause(R$string.retail_accounts_subaccount_members_widget_permissions_updated_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, LDSFile.EF_DG12_TAG));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    String str = this.f199326y;
                    x xVar2 = this.f199325x;
                    d dVar2 = this.f199324w;
                    b bVar = new b(xVar2, dVar2, str, (Continuation) null);
                    this.v = 1;
                    if (q.u(dVar2, bVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar, d dVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f199325x = xVar;
        this.f199324w = dVar;
        this.f199326y = str;
    }
}
