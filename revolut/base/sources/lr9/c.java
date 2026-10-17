package lr9;

import androidx.room.util.DBUtil;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import cr9.v;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f199439b;

    public /* synthetic */ c(e eVar, int i) {
        this.f199438a = i;
        this.f199439b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f199438a) {
            case 0:
                List groupMembers = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
                return this.f199439b.f199443g.j0(zi0.c.S(groupMembers));
            default:
                v paymentGroupDto = (v) obj2;
                Intrinsics.checkNotNullParameter(paymentGroupDto, "paymentGroupDto");
                PaymentGroup paymentGroupE = yoj.b.E(paymentGroupDto);
                e eVar = this.f199439b;
                yq9.h hVar = eVar.f199441b;
                DBUtil.performBlocking(hVar.f316005a, false, true, new yj2.b(hVar, z92.f.J(paymentGroupE), 18));
                eVar.f199442c.b(z92.f.L(paymentGroupE));
                return eVar.f199443g.r0(paymentGroupE);
        }
    }
}
