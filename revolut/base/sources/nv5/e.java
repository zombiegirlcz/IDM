package nv5;

import akg.n;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219485a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f219486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f219487c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public e(n nVar, ArrayList arrayList, boolean z, vmh.g gVar, rmh.m mVar) {
        this.f219487c = nVar;
        this.d = arrayList;
        this.f219486b = z;
        this.e = gVar;
        this.f = mVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f219485a) {
            case 0:
                Object objCollect = ((oji.f) this.f219487c).collect(new d(flowCollector, (h) this.d, (Data) this.e, (dj0.d) this.f, this.f219486b), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = ((n) this.f219487c).collect(new d(flowCollector, (ArrayList) this.d, this.f219486b, (vmh.g) this.e, (rmh.m) this.f), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public e(oji.f fVar, h hVar, Data data, dj0.d dVar, boolean z) {
        this.f219487c = fVar;
        this.d = hVar;
        this.e = data;
        this.f = dVar;
        this.f219486b = z;
    }
}
