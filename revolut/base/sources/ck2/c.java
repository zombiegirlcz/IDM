package ck2;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import cul.v;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pcd.s;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f24748b;

    public /* synthetic */ c(Data data, int i) {
        this.f24747a = i;
        this.f24748b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        String name;
        switch (this.f24747a) {
            case 0:
                Data data3 = this.f24748b;
                Intrinsics.h(data3);
                return f.a((f) obj2, null, null, data3, 3);
            case 1:
                Data data4 = this.f24748b;
                Intrinsics.h(data4);
                return f.a((f) obj2, null, data4, null, 5);
            case 2:
                ((ck3.h) obj2).getClass();
                Data disclaimerData = this.f24748b;
                Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
                return new ck3.h(disclaimerData);
            case 3:
                ck7.e eVar = (ck7.e) obj2;
                Data reasonNotListedInfoData = this.f24748b;
                Intrinsics.h(reasonNotListedInfoData);
                List reasonGroups = eVar.f24787a;
                CFACReimbursementType reimbursementType = eVar.f24788b;
                boolean z = eVar.d;
                Intrinsics.checkNotNullParameter(reasonGroups, "reasonGroups");
                Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
                Intrinsics.checkNotNullParameter(reasonNotListedInfoData, "reasonNotListedInfoData");
                return new ck7.e(reasonGroups, reimbursementType, reasonNotListedInfoData, z);
            case 4:
                ((cm9.g) obj2).getClass();
                Data settings = this.f24748b;
                Intrinsics.checkNotNullParameter(settings, "settings");
                return new cm9.g(settings);
            case 5:
                return cnc.d.a((cnc.d) obj2, this.f24748b, null, null, null, null, null, 62);
            case 6:
                return cnc.d.a((cnc.d) obj2, null, this.f24748b, null, null, null, null, 61);
            case 7:
                return cnc.d.a((cnc.d) obj2, null, null, this.f24748b, null, null, null, 59);
            case 8:
                return cnc.d.a((cnc.d) obj2, null, null, null, null, this.f24748b, null, 47);
            case 9:
                return cnc.d.a((cnc.d) obj2, null, null, null, this.f24748b, null, null, 55);
            case 10:
                return cnc.d.a((cnc.d) obj2, null, null, null, null, null, this.f24748b, 31);
            case 11:
                cni.g update = (cni.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return cni.g.a(update, this.f24748b, null, 2);
            case 12:
                return coa.a.a((coa.a) obj2, null, null, this.f24748b, null, 27);
            case 13:
                Data data5 = this.f24748b;
                coa.a aVar = (coa.a) obj2;
                try {
                    Object content = data5.getContent();
                    data = new Data(content != null ? (List) ((Pair) content).f186385a : null, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data5.getLoading());
                }
                try {
                    Object content2 = data5.getContent();
                    data2 = new Data(content2 != null ? (i) ((Pair) content2).f186386b : null, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data5.getLoading());
                }
                return coa.a.a(aVar, data, null, null, data2, 22);
            case 14:
                cpb.e eVar2 = (cpb.e) obj2;
                Data savingsAccount = this.f24748b;
                s sVar = (s) savingsAccount.getContent();
                if (sVar == null || (name = sVar.f234885h.f234859a) == null) {
                    name = "";
                }
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
                return new cpb.e(savingsAccount, name);
            case 15:
                return cqh.g.a((cqh.g) obj2, null, null, null, this.f24748b, 7);
            case 16:
                ((crd.a) obj2).getClass();
                Data spendingCycle = this.f24748b;
                Intrinsics.checkNotNullParameter(spendingCycle, "spendingCycle");
                return new crd.a(spendingCycle);
            case 17:
                return cuj.i.a((cuj.i) obj2, this.f24748b, null, 2);
            case 18:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, this.f24748b, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -33554433, 8191);
            case 19:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f24748b, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -32769, 8191);
            case 20:
                return v.a((v) obj2, null, null, null, null, null, this.f24748b, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -65, 8191);
            case 21:
                v vVar = (v) obj2;
                return v.a(vVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, t1.c0(this.f24748b, vVar.f109187s), false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -262145, 8191);
            case 22:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, this.f24748b, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, 8191);
            case 23:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, this.f24748b, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 8191);
            case 24:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, this.f24748b, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -513, 8191);
            case 25:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, this.f24748b, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 8191);
            case 26:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f24748b, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 8191);
            case 27:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, this.f24748b, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 8191);
            case 28:
                return v.a((v) obj2, null, null, null, null, this.f24748b, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -33, 8191);
            default:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, this.f24748b, null, null, null, null, null, null, null, null, null, null, -1, 8187);
        }
    }
}
