package xec;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.shipping.shared.R$string;
import java.util.List;
import k3k.q0;
import k7c.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f304590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f304590w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.v, this.f304590w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar = this.v;
        cli.y yVar = bVar.f84758s;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        String str = this.f304590w;
        boolean z = true;
        if (i == 0) {
            yhm.o.b(obj2);
            q7c.s sVar = bVar.o;
            this.u = 1;
            y0 y0Var = sVar.f242835a;
            y0Var.getClass();
            q0 q0Var = new q0(y0Var, str, continuation, 27);
            p0 p0Var = p0.f264001a;
            Object objJ = skm.e0.J(elm.f.f127540b, q0Var, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        bVar.f84755p.getClass();
        bVar.X1(te0.w.a("ADDRESS_DELETED_DIALOG_ID", new TextLocalisedClause(R$string.revolut_pay_delete_address_toast_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246), f1.ABOVE_ANCHOR_VIEW, null, 76));
        String str2 = ((e) ((j2) yVar.f22677a).getValue()).f304582c;
        String str3 = ((e) ((j2) yVar.f22677a).getValue()).f304581b;
        if (str2 != null && !str2.equals(str)) {
            z = false;
        }
        boolean zF = Intrinsics.f(str3, str);
        if (zF && z) {
            com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b.I2(bVar);
        } else if (zF) {
            bVar.H2(yVar, new x(bVar, 2));
        } else if (z) {
            com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b.I2(bVar);
        }
        return Unit.f186387a;
    }
}
