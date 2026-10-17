package tqh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.i3;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f273594a;

    public k(n nVar) {
        this.f273594a = nVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i3 i3Var = (i3) obj2;
        String str = i3Var.f54273a.f52049b;
        i iVar = this.f273594a.f273597a;
        if (!Intrinsics.f(str, iVar.c3().f310974a)) {
            return Unit.f186387a;
        }
        Object obj3 = ((RowDelegate.Model) i3Var.f54274b).u;
        if (obj3 instanceof znh.a) {
            String ref2 = ((znh.a) obj3).f323829b.f105162a;
            Intrinsics.checkNotNullParameter(ref2, "ref");
            iVar.A2(new AssetDetailsDestination(ref2, null, false, null, null, null, 62));
        }
        return Unit.f186387a;
    }
}
