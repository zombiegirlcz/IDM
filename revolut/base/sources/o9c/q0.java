package o9c;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import com.revolut.feature.revolutpay.impl.domain.models.oauth.OAuthSetupException;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$OutputData;
import com.revolut.kompot.common.ExternalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.k1;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class q0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.impl.ui.summary_screen.f f223221w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i, com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f223221w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q0 q0Var = new q0(0, this.f223221w, continuation);
                q0Var.v = obj2;
                return q0Var;
            case 1:
                q0 q0Var2 = new q0(1, this.f223221w, continuation);
                q0Var2.v = obj2;
                return q0Var2;
            case 2:
                q0 q0Var3 = new q0(2, this.f223221w, continuation);
                q0Var3.v = obj2;
                return q0Var3;
            case 3:
                q0 q0Var4 = new q0(3, this.f223221w, continuation);
                q0Var4.v = obj2;
                return q0Var4;
            case 4:
                q0 q0Var5 = new q0(4, this.f223221w, continuation);
                q0Var5.v = obj2;
                return q0Var5;
            case 5:
                q0 q0Var6 = new q0(5, this.f223221w, continuation);
                q0Var6.v = obj2;
                return q0Var6;
            case 6:
                q0 q0Var7 = new q0(6, this.f223221w, continuation);
                q0Var7.v = obj2;
                return q0Var7;
            case 7:
                q0 q0Var8 = new q0(7, this.f223221w, continuation);
                q0Var8.v = obj2;
                return q0Var8;
            case 8:
                q0 q0Var9 = new q0(8, this.f223221w, continuation);
                q0Var9.v = obj2;
                return q0Var9;
            default:
                q0 q0Var10 = new q0(9, this.f223221w, continuation);
                q0Var10.v = obj2;
                return q0Var10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((q0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q6c.j jVar;
        int i = this.u;
        int i2 = 4;
        int i3 = 6;
        int i5 = 7;
        String str = 0;
        str = 0;
        com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = this.f223221w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof k1) {
                    q6c.h hVar = (q6c.h) ((s) ((j2) fVar.M.f22677a).getValue()).f223227c.getContent();
                    if (hVar != null && (jVar = (q6c.j) zhm.d0.d0(hVar.f242547q)) != null) {
                        str = jVar.f242548a;
                    }
                    fVar.S2(str);
                }
                break;
            case 1:
                q9c.f fVar2 = (q9c.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar3 = this.f223221w;
                q7c.q qVar = fVar3.f84571p;
                int i6 = 0;
                vkm.q0 q0Var = new vkm.q0(rd0.e.b(qVar.f242831b.k(false)), new q0(i5, fVar3, str), 1);
                String orderToken = fVar2.a();
                k7c.k kVar = fVar3.f84572q;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(orderToken, "orderToken");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                akg.n nVarV = nim.a.v(new vkm.q0(xam.a.h(new t0(fVar3, null), rd0.e.b(kVar.d.e(orderToken, loadingStrategy))), new q0(i2, fVar3, str), 1), new o95.b(19));
                uec.e eVar = (uec.e) fVar3.f84578y;
                v0b.b bVarG = ta6.a.g(q0Var, nVarV, vkm.q.Q(eVar.f279339n, new uec.d((Continuation) str, eVar, i6)), new vkm.q0(rd0.e.b(hng.g.b(((ang.b) qVar.f242832c).f7765a)), new q0(i3, fVar3, str), 1), new r0(fVar3, str, i6));
                int i21 = 4;
                int i22 = 2;
                break;
            case 2:
                q6c.h hVar2 = (q6c.h) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (hVar2.f242544m.e) {
                    q9c.i iVar = (q9c.i) fVar.G;
                    t9c.a aVar4 = iVar.f243867n;
                    RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData = iVar.f243865l;
                    RevolutPayOrderSummaryContract$InputData.Standard standard = revolutPayOrderSummaryContract$InputData instanceof RevolutPayOrderSummaryContract$InputData.Standard ? (RevolutPayOrderSummaryContract$InputData.Standard) revolutPayOrderSummaryContract$InputData : null;
                    if (standard != null && !((RevolutPayOrderSummaryContract$InputData.Standard) revolutPayOrderSummaryContract$InputData).f84309l && standard.f84311n != p6c.b.RetailOnly) {
                        String originalUrl = standard.o;
                        aVar4.getClass();
                        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(originalUrl).buildUpon().scheme("https").authority("merchant.revolut.com").path("page-revolut-pay-business.html").build());
                        cj9.c.g(ui0.b.Companion);
                        od0.a aVar5 = od0.a.f224253a;
                        String str2 = od0.a.e() ? "com.revolut.business.test" : "com.revolut.business";
                        Intrinsics.checkNotNullParameter(intent, "<this>");
                        intent.setPackage(str2);
                        ExternalDestination.ByIntent destination = new ExternalDestination.ByIntent(intent, null);
                        Intrinsics.checkNotNullParameter(destination, "destination");
                        List<ResolveInfo> listQueryIntentActivities = aVar4.f268974a.getContext().getPackageManager().queryIntentActivities(intent, 65536);
                        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
                        if (listQueryIntentActivities.size() != 1) {
                        }
                    }
                }
                break;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.M, new o9a.y(data, 4));
                Throwable error = data.getError();
                if ((error instanceof OAuthSetupException) && !data.getLoading()) {
                    fVar.C2(new RevolutPaySummaryScreenContract$OutputData.OAuthSetupFailed(((OAuthSetupException) error).f84444a));
                }
                break;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.M, new o9a.y(data2, 5));
                break;
            case 5:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q6c.h orderDetails = (q6c.h) rVar.f314201a;
                dj0.d initialAmount = (dj0.d) rVar.f314202b;
                dj0.d totalWithDiscount = (dj0.d) rVar.f314203c;
                tdc.r rVar2 = (tdc.r) fVar.z;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
                Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
                Intrinsics.checkNotNullParameter(totalWithDiscount, "totalWithDiscount");
                break;
            case 6:
                Data data3 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.M, new o9a.y(data3, 6));
                break;
            case 7:
                Data data4 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.M, new o9a.y(data4, 7));
                break;
            case 8:
                Data data5 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.M, new o9a.y(data5, 8));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.M, new o9a.y(data6, 9));
                break;
        }
        return Unit.f186387a;
    }
}
