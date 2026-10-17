package nol;

import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import com.revolut.sso.impl.ui.email.change_flow.ChangeEmailFlowContract$State;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ull.d f218080b;

    public /* synthetic */ h(ull.d dVar, int i) {
        this.f218079a = i;
        this.f218080b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f218079a) {
            case 0:
                ChangePhoneFlowContract$State changePhoneFlowContract$State = (ChangePhoneFlowContract$State) obj2;
                List list = this.f218080b.f281052a;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new RegisteredIdentityId(((UserInfoAccount) it8.next()).f106203a));
                }
                return ChangePhoneFlowContract$State.a(changePhoneFlowContract$State, d0.i1(arrayList), null, null, 6);
            default:
                ChangeEmailFlowContract$State changeEmailFlowContract$State = (ChangeEmailFlowContract$State) obj2;
                List list2 = this.f218080b.f281052a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(new RegisteredIdentityId(((UserInfoAccount) it9.next()).f106203a));
                }
                return ChangeEmailFlowContract$State.a(changeEmailFlowContract$State, d0.i1(arrayList2), null, null, 6);
        }
    }
}
