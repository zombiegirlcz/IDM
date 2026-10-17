package no;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ Integer A;
    public final /* synthetic */ d B;
    public int u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AnalyticsProduct f217730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.google.protobuf.w0 f217731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f217732y;
    public final /* synthetic */ Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, AnalyticsProduct analyticsProduct, com.google.protobuf.w0 w0Var, String str2, Integer num, Integer num2, d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f217730w = analyticsProduct;
        this.f217731x = w0Var;
        this.f217732y = str2;
        this.z = num;
        this.A = num2;
        this.B = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f217730w, this.f217731x, this.f217732y, this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                String str = this.v;
                AnalyticsProduct analyticsProduct = this.f217730w;
                com.google.protobuf.w0 w0Var = this.f217731x;
                String str2 = this.f217732y;
                Integer num = this.z;
                Integer num2 = this.A;
                d dVar = this.B;
                ho.d dVar2 = new ho.d(str, analyticsProduct, w0Var, str2, num, num2);
                this.u = 1;
                a aVar = new a(dVar, dVar2, null);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, aVar, this);
                if (objJ != obj3) {
                    objJ = Unit.f186387a;
                }
                if (objJ == obj3) {
                    return obj3;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            Unit unit = Unit.f186387a;
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        return Unit.f186387a;
    }
}
