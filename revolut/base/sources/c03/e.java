package c03;

import com.revolut.feature.card_management.impl.ui.expectations.ExpectationManagementContract$Configuration;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20123b;

    public /* synthetic */ e(l lVar, int i) {
        this.f20122a = i;
        this.f20123b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20122a) {
            case 0:
                opi.d.c(this.f20123b.f20131j);
                return Unit.f186387a;
            case 1:
                l lVar = this.f20123b;
                m mVar = lVar.k;
                NaviCommand naviCommand = lVar.f20134n.f64854c;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                return mVar.f20135a.a(naviCommand);
            case 2:
                l lVar2 = this.f20123b;
                m mVar2 = lVar2.k;
                NaviCommand naviCommand2 = lVar2.f20134n.f64854c;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(naviCommand2, "naviCommand");
                return mVar2.f20135a.a(naviCommand2);
            case 3:
                boolean zF = Intrinsics.f((String) obj2, "TERMINATE_AND_REORDER_CONFIRM_ID");
                pfm.m mVar3 = pfm.m.f235744a;
                if (!zF) {
                    Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                    return mVar3;
                }
                l lVar3 = this.f20123b;
                ExpectationManagementContract$Configuration expectationManagementContract$Configuration = lVar3.f20134n;
                w wVar = lVar3.o;
                int i = f.f20124a[expectationManagementContract$Configuration.f64852a.ordinal()];
                if (i == 1) {
                    return wVar.d.a(null);
                }
                if (i == 2) {
                    return wVar.e.a(null);
                }
                Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                return mVar3;
            case 4:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                l lVar4 = this.f20123b;
                ExpectationManagementContract$Configuration expectationManagementContract$Configuration2 = lVar4.f20134n;
                int i2 = f.f20124a[expectationManagementContract$Configuration2.f64852a.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    pfm.h hVar = new pfm.h(new a08.d(lVar4, 4), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar;
                }
                if (i2 == 3) {
                    return lVar4.o.f.a(null);
                }
                m mVar4 = lVar4.k;
                NaviCommand naviCommand3 = expectationManagementContract$Configuration2.f64854c;
                mVar4.getClass();
                Intrinsics.checkNotNullParameter(naviCommand3, "naviCommand");
                return mVar4.f20135a.a(naviCommand3);
            default:
                l lVar5 = this.f20123b;
                m mVar5 = lVar5.k;
                NaviCommand naviCommand4 = lVar5.f20134n.f64854c;
                mVar5.getClass();
                Intrinsics.checkNotNullParameter(naviCommand4, "naviCommand");
                return mVar5.f20135a.a(naviCommand4);
        }
    }
}
