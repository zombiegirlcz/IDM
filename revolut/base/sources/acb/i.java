package acb;

import ahe.a1;
import ahe.y0;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.data.model.Data;
import f5j.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import tof.e1;
import zhl.k;
import zz9.s;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3124c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f3122a = i;
        this.f3123b = obj2;
        this.f3124c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f3122a) {
            case 0:
                Object objCollect = ((jhi.b) this.f3123b).collect(new h(flowCollector, (j) this.f3124c, (e) this.d, (c4i.a) this.e, (AnalyticsProduct) this.f, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Flow[] flowArr = (Flow[]) this.f3123b;
                Object objG = e0.g(continuation, new ag1.i(flowArr, 4), new y0(0, (ArrayList) this.f3124c, (List) this.d, (Data) this.e, (a1) this.f, (Continuation) null), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect2 = ((j23.b) this.f3123b).collect(new h(flowCollector, (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) this.f3124c, (wk5.a) this.d, (String) this.e, (kn5.f) this.f, 2), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect3 = ((Flow) this.f3123b).collect(new h(flowCollector, (s) this.f3124c, (List) this.d, (Map) this.e, (Map) this.f, 3), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect4 = ((vkm.d) this.f3123b).collect(new h(flowCollector, (String) this.f3124c, (String) this.d, (LinkedHashMap) this.e, (l) this.f, 4), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Flow[] flowArr2 = (Flow[]) this.f3123b;
                Object objG2 = e0.g(continuation, new ag1.i(flowArr2, 23), new y0(7, (f78.a) this.f3124c, (String) this.d, (String) this.e, (io3.d) this.f, (Continuation) null), flowCollector, flowArr2);
                if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect5 = ((Flow) this.f3123b).collect(new h(flowCollector, (String) this.f3124c, (String) this.d, (e1) this.e, (String) this.f, 8), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect6 = ((jhi.b) this.f3123b).collect(new h(flowCollector, (t28.e) this.f3124c, (String) this.d, (s0h.a) this.e, (v28.c) this.f, 10), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect7 = ((j23.b) this.f3123b).collect(new h(flowCollector, (k) this.f3124c, (eel.e) this.d, (vgl.a) this.e, (eel.c) this.f, 15), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
