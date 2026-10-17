package cbf;

import ccf.q;
import cgh.l;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f22797b;

    public /* synthetic */ i(Data data, int i) {
        this.f22796a = i;
        this.f22797b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f22796a) {
            case 0:
                Data config = this.f22797b;
                Intrinsics.h(config);
                ((g) obj2).getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                return new g(config);
            case 1:
                return cbh.j.a((cbh.j) obj2, null, null, null, null, null, this.f22797b, false, null, 959);
            case 2:
                return cbh.j.a((cbh.j) obj2, null, this.f22797b, null, null, null, null, false, null, 1019);
            case 3:
                return cbh.j.a((cbh.j) obj2, null, null, this.f22797b, null, null, null, false, null, 1015);
            case 4:
                return cbh.j.a((cbh.j) obj2, null, null, null, this.f22797b, null, null, false, null, 1007);
            case 5:
                return cbh.j.a((cbh.j) obj2, this.f22797b, null, null, null, null, null, false, null, 1021);
            case 6:
                Data data = this.f22797b;
                Intrinsics.h(data);
                ((cc7.e) obj2).getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                return new cc7.e(data);
            case 7:
                Data data2 = this.f22797b;
                Intrinsics.h(data2);
                return q.a((q) obj2, data2, null, null, null, null, null, 126);
            case 8:
                Data data3 = this.f22797b;
                Intrinsics.h(data3);
                return q.a((q) obj2, null, data3, null, null, null, null, ISO781611.SMT_TAG);
            case 9:
                Data data4 = this.f22797b;
                Intrinsics.h(data4);
                return q.a((q) obj2, null, null, null, data4, null, null, LDSFile.EF_SOD_TAG);
            case 10:
                return q.a((q) obj2, null, null, null, null, null, this.f22797b, 95);
            case 11:
                Data linkedAccounts = this.f22797b;
                Intrinsics.h(linkedAccounts);
                ((cd4.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
                return new cd4.g(linkedAccounts);
            case 12:
                return cea.f.a((cea.f) obj2, this.f22797b, null, 5);
            case 13:
                return cea.f.a((cea.f) obj2, null, this.f22797b, 3);
            case 14:
                Data data5 = this.f22797b;
                Intrinsics.h(data5);
                return cf1.d.a((cf1.d) obj2, data5, false, 2);
            case 15:
                cf1.d dVar = (cf1.d) obj2;
                cd1.f fVar = (cd1.f) this.f22797b.getContent();
                return cf1.d.a(dVar, null, pd.b.j(fVar != null ? Boolean.valueOf(fVar.f23152a) : null), 1);
            case 16:
                ((cf3.b) obj2).getClass();
                Data overview = this.f22797b;
                Intrinsics.checkNotNullParameter(overview, "overview");
                return new cf3.b(overview);
            case 17:
                String billId = ((cg9.f) obj2).f23870a;
                Intrinsics.checkNotNullParameter(billId, "billId");
                Data billData = this.f22797b;
                Intrinsics.checkNotNullParameter(billData, "billData");
                return new cg9.f(billData, billId);
            case 18:
                return l.a((l) obj2, null, this.f22797b, null, 5);
            case 19:
                Data data6 = this.f22797b;
                Intrinsics.h(data6);
                return l.a((l) obj2, data6, null, null, 6);
            case 20:
                Data data7 = this.f22797b;
                Intrinsics.h(data7);
                return ch1.i.a((ch1.i) obj2, data7, null, 30);
            case 21:
                ((chd.g) obj2).getClass();
                Data watchlists = this.f22797b;
                Intrinsics.checkNotNullParameter(watchlists, "watchlists");
                return new chd.g(watchlists);
            case 22:
                return chg.e.a((chg.e) obj2, this.f22797b, null, 2);
            case 23:
                Data data8 = this.f22797b;
                Intrinsics.h(data8);
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, data8, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, null, 4194302);
            case 24:
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, null, null, null, null, this.f22797b, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, null, 4194287);
            case 25:
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, null, null, null, null, null, this.f22797b, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, null, 4194271);
            case 26:
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, null, null, null, null, null, null, null, this.f22797b, null, null, null, false, null, false, null, null, null, null, null, false, false, null, 4194175);
            case 27:
                Data data9 = this.f22797b;
                Intrinsics.h(data9);
                return cjd.d.a((cjd.d) obj2, null, data9, null, 0, false, null, false, false, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 28:
                ((cjj.e) obj2).getClass();
                Data phoneNumberSelections = this.f22797b;
                Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
                return new cjj.e(phoneNumberSelections);
            default:
                Data data10 = this.f22797b;
                Intrinsics.h(data10);
                return ck2.f.a((ck2.f) obj2, data10, null, null, 6);
        }
    }
}
