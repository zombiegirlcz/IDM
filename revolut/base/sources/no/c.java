package no;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.WidgetDescription;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ Integer A;
    public final /* synthetic */ WidgetDescription B;
    public final /* synthetic */ d C;
    public int u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AnalyticsProduct f217739w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.google.protobuf.w0 f217740x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f217741y;
    public final /* synthetic */ Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, AnalyticsProduct analyticsProduct, com.google.protobuf.w0 w0Var, String str2, Integer num, Integer num2, WidgetDescription widgetDescription, d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f217739w = analyticsProduct;
        this.f217740x = w0Var;
        this.f217741y = str2;
        this.z = num;
        this.A = num2;
        this.B = widgetDescription;
        this.C = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f217739w, this.f217740x, this.f217741y, this.z, this.A, this.B, this.C, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                String str = this.v;
                AnalyticsProduct analyticsProduct = this.f217739w;
                com.google.protobuf.w0 w0Var = this.f217740x;
                String str2 = this.f217741y;
                Integer num = this.z;
                Integer num2 = this.A;
                WidgetDescription widgetDescription = this.B;
                d dVar = this.C;
                ho.m mVar = new ho.m(str, analyticsProduct, w0Var, str2, num, num2, widgetDescription);
                this.u = 1;
                a aVar = new a(dVar, mVar, null);
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
