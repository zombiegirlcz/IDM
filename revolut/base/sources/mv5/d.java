package mv5;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import dfj.q;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209139a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f209140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f209141c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public d(FlowCollector flowCollector, f fVar, Data data, boolean z) {
        this.f209141c = flowCollector;
        this.d = fVar;
        this.e = data;
        this.f209140b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mv5.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public d(boolean z, com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a aVar, EsimProfile esimProfile, q qVar) {
        this.f209140b = z;
        this.f209141c = aVar;
        this.d = esimProfile;
        this.e = qVar;
    }
}
