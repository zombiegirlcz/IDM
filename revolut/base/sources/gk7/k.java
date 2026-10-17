package gk7;

import bnf.r;
import fvk.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import tof.a3;
import whf.o;
import whf.p;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f144340b;

    public /* synthetic */ k(m mVar, int i) {
        this.f144339a = i;
        this.f144340b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144339a) {
            case 0:
                p transactionsContent = (p) obj2;
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                return whf.n.a(this.f144340b.f144344r, transactionsContent, o.SELECTABLE, new whf.i(false), null, 8);
            case 1:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : transactions) {
                    m mVar = this.f144340b;
                    if (d0.J(((r) mVar.f144345s).g((a3) obj3), ((f) mVar.t2()).f144332c, true)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.a output = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                m mVar2 = this.f144340b;
                List listF = output.f(((f) mVar2.t2()).f144331b, null);
                mVar2.f144346t.c(listF);
                mVar2.x2(new q(listF, 11));
                return Unit.f186387a;
        }
    }
}
