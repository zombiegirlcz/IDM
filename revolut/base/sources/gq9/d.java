package gq9;

import com.revolut.feature.payments.bills_chooser.api.model.ItemizedBillData;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import wp9.h0;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f145599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ItemizedBillData.ScanData f145600x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ArrayList arrayList, ItemizedBillData.ScanData scanData, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f145599w = arrayList;
        this.f145600x = scanData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, this.f145599w, this.f145600x, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = n1Var instanceof l1;
        f fVar = this.v;
        if (z) {
            fVar.e3();
        } else if (n1Var instanceof m1) {
            h0 h0Var = fVar.f145610t;
            if (h0Var != null) {
                h0Var.invoke(this.f145599w, this.f145600x);
            }
        } else if (!(n1Var instanceof k1) && !(n1Var instanceof j1)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
