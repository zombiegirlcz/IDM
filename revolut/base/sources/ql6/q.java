package ql6;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a f247216a;

    public q(com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a aVar) {
        this.f247216a = aVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a aVar = this.f247216a;
        aVar.H2(aVar.f72788p, new q65.l((Data) obj2, 25));
        return Unit.f186387a;
    }
}
