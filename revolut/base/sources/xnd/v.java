package xnd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wyd.f f307461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f307462c;

    public /* synthetic */ v(wyd.f fVar, z zVar, int i) {
        this.f307460a = i;
        this.f307461b = fVar;
        this.f307462c = zVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f307460a) {
            case 0:
                Object objCollect = this.f307461b.collect(new u(flowCollector, this.f307462c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f307461b.collect(new u(flowCollector, this.f307462c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f307461b.collect(new u(flowCollector, this.f307462c, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect4 = this.f307461b.collect(new u(flowCollector, this.f307462c, 3), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
