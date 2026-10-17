package fxb;

import akg.n;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f138784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f138785c;
    public final /* synthetic */ Flow d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Flow flow, Object obj2, Object obj3, boolean z, int i) {
        this.f138783a = i;
        this.d = flow;
        this.e = obj2;
        this.f138784b = obj3;
        this.f138785c = z;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f138783a) {
            case 0:
                Object objCollect = ((jhi.b) this.d).collect(new e(flowCollector, (h) this.e, (String) this.f138784b, this.f138785c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((n) this.d).collect(new e(flowCollector, (k18.c) this.e, (String) this.f138784b, this.f138785c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = ((v0b.b) this.d).collect(new mv5.d(flowCollector, (mv5.f) this.e, (Data) this.f138784b, this.f138785c), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
