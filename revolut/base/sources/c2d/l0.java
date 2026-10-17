package c2d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20716c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public l0(AtomicReferenceArray atomicReferenceArray, int i, AtomicInteger atomicInteger, ukm.q qVar) {
        this.f20714a = 3;
        this.f20715b = atomicReferenceArray;
        this.d = i;
        this.e = atomicInteger;
        this.f20716c = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r37, kotlin.coroutines.Continuation r38) {
        /*
            Method dump skipped, instruction units count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2d.l0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public l0(Ref$IntRef ref$IntRef, int i, FlowCollector flowCollector, Object obj2) {
        this.f20714a = 7;
        this.e = ref$IntRef;
        this.d = i;
        this.f20715b = flowCollector;
        this.f20716c = obj2;
    }

    public /* synthetic */ l0(FlowCollector flowCollector, Object obj2, Object obj3, int i, int i2) {
        this.f20714a = i2;
        this.f20715b = flowCollector;
        this.e = obj2;
        this.f20716c = obj3;
        this.d = i;
    }

    public l0(FlowCollector flowCollector, String str, eel.c cVar, int i) {
        this.f20714a = 6;
        this.f20715b = flowCollector;
        this.f20716c = str;
        this.e = cVar;
        this.d = i;
    }

    public l0(FlowCollector flowCollector, ys5.d dVar, int i, String str) {
        this.f20714a = 9;
        this.f20715b = flowCollector;
        this.e = dVar;
        this.d = i;
        this.f20716c = str;
    }
}
