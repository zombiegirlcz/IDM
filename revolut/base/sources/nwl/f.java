package nwl;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nuc.n;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f220017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f220018b;

    public /* synthetic */ f(l lVar, boolean z) {
        this.f220017a = lVar;
        this.f220018b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ufm.b bVarA;
        zm3.a contact = (zm3.a) obj2;
        Intrinsics.checkNotNullParameter(contact, "contact");
        l lVar = this.f220017a;
        lwl.f fVar = lVar.f220029p;
        if (this.f220018b) {
            Object obj3 = fVar.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            bVarA = q8k.g.b((q8k.g) obj3, contact, m1l.a.SCHEDULE_ENABLED, TransferFlowType.Default.f92257b, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        } else {
            Object obj4 = fVar.get();
            Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
            bVarA = q8k.g.a((q8k.g) obj4, contact, null, null, 14);
        }
        efm.k kVarW = new ufm.i(new ufm.f(bVarA, new noi.l(22, new b(lVar, 1)), 3), new noi.l(23, new n(24)), 1).w();
        Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
        return kVarW;
    }
}
