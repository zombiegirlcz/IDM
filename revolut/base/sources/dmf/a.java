package dmf;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.flow.FlowCollector;
import ukm.q;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116115a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f116116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f116117c;
    public final /* synthetic */ Object d;

    public a(AtomicReferenceArray atomicReferenceArray, int i, q qVar) {
        this.f116117c = atomicReferenceArray;
        this.f116116b = i;
        this.d = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dmf.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public a(FlowCollector flowCollector, WealthAccount wealthAccount, int i) {
        this.f116117c = flowCollector;
        this.d = wealthAccount;
        this.f116116b = i;
    }

    public a(FlowCollector flowCollector, r2d.c cVar, String str, int i) {
        this.f116117c = flowCollector;
        this.d = str;
        this.f116116b = i;
    }
}
