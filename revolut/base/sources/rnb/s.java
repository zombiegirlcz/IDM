package rnb;

import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.i1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f255583b;

    public /* synthetic */ s(v vVar, int i) {
        this.f255582a = i;
        this.f255583b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f255582a) {
            case 0:
                SavingsAccountDetails accountDetails = (SavingsAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
                String str = accountDetails.f86460a.f;
                v vVar = this.f255583b;
                return nim.a.v(((jte.d) vVar.e).c(SavingsApi$Toggles.JointAccountsSavings.f83075c) ? rd0.e.b(nim.a.w(vVar.f255586c.Z(str, w4l.j.f294644c), new rm2.s(26))) : zi0.c.i(i1.f272794a), new en8.j(vVar, accountDetails));
            default:
                pcd.s it8 = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f255583b.d.a(it8);
        }
    }
}
