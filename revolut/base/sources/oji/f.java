package oji;

import k25.o;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import oim.q;
import vdl.c1;
import vkm.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow[] f225790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f225791c;

    public /* synthetic */ f(Flow[] flowArr, Function function, int i) {
        this.f225789a = i;
        this.f225790b = flowArr;
        this.f225791c = function;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, oim.q] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f225789a) {
            case 0:
                Flow[] flowArr = this.f225790b;
                Object objG = e0.g(continuation, new h52.c(flowArr, 23), new o((Continuation) null, (q) this.f225791c), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objG2 = e0.g(continuation, s1.f290118a, new c1((Continuation) null, this.f225791c, 14), flowCollector, this.f225790b);
                if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
