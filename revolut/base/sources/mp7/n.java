package mp7;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kl7.b0;
import kl7.v;
import kl7.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mlk.a0;
import mp7.i;
import skm.e0;
import skm.p0;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a aVar = this.v;
        y yVar = aVar.f75622q;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Object content = ((h) ((j2) yVar.f22677a).getValue()).f207772a.getContent();
            if (content == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Map map = ((h) ((j2) yVar.f22677a).getValue()).f207773b;
            Map map2 = ((h) ((j2) yVar.f22677a).getValue()).d;
            List list = (List) content;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (true) {
                String str = null;
                if (!it8.hasNext()) {
                    break;
                }
                b0 b0Var = (b0) it8.next();
                String str2 = b0Var.f185294a;
                String strW = ue8.c.w(b0Var, map);
                z zVar = b0Var.e;
                String str3 = zVar == z.DRIVER_NUMBER ? strW : null;
                if (zVar != z.DRIVING_LICENCE_NUMBER) {
                    strW = null;
                }
                wi0.b bVarY = ue8.c.y(b0Var, map2);
                if (bVarY != null) {
                    str = bVarY.f297794a;
                }
                arrayList.add(new kl7.k(str2, str3, strW, str));
            }
            aVar.X1(vl7.a.c(new TextLocalisedClause(R$string.car_insurance_imid_data_upload_loading_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_imid_data_upload_loading_description, null, null, 14)));
            aVar.H2(yVar, new a0(20));
            ll7.k kVar = aVar.o;
            String str4 = aVar.f75621p.f75619a;
            this.u = 1;
            kVar.getClass();
            lb0.b0 b0Var2 = new lb0.b0(17, kVar, arrayList, str4, (Continuation) null);
            p0 p0Var = p0.f264001a;
            objJ = e0.J(elm.f.f127540b, b0Var2, this);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objJ = obj2;
        }
        v vVar = (v) objJ;
        int i2 = m.f207779a[vVar.f185394a.ordinal()];
        if (i2 == 1) {
            aVar.s1();
            aVar.C2(i.a.f207775a);
            return Unit.f186387a;
        }
        if (i2 != 2 && i2 != 3 && i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.H2(yVar, new ml3.y(vVar, 20));
        return aVar.X1(com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a.I2());
    }
}
