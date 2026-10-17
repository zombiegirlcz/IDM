package lo0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsMetadata;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import no.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String C;
    public final /* synthetic */ AnalyticsProduct D;
    public final /* synthetic */ a1 E;
    public int u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f197352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Activity f197353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f197354y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj2, View view, Activity activity, o oVar, String str, Object obj3, boolean z, String str2, AnalyticsProduct analyticsProduct, a1 a1Var, Continuation continuation) {
        super(2, continuation);
        this.v = obj2;
        this.f197352w = view;
        this.f197353x = activity;
        this.f197354y = oVar;
        this.z = str;
        this.A = obj3;
        this.B = z;
        this.C = str2;
        this.D = analyticsProduct;
        this.E = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, this.f197352w, this.f197353x, this.f197354y, this.z, this.A, this.B, this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        mo.e eVar;
        Context context;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.f197354y;
        if (i == 0) {
            yhm.o.b(obj2);
            eVar = null;
            Object objM = this.v;
            if (objM == null) {
                View view = this.f197352w;
                objM = (view == null || (context = view.getContext()) == null) ? null : kli.a.m(context);
                if (objM == null) {
                    objM = this.f197353x;
                }
            }
            if (objM == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "WindowEventHandler", "No activity for " + this.E, null, h0Var);
                mo.e eVar2 = eVar;
                AnalyticsContext.INSTANCE.getClass();
                oVar.i.e2(new ho.i(this.C, this.D, new AnalyticsContext(AnalyticsContext.Companion.a(this.A)), eo.a.a(AnalyticsMetadata.INSTANCE, this.B), eVar2));
                return Unit.f186387a;
            }
            mo.c cVar = oVar.d;
            Class<?> cls = objM.getClass();
            this.u = 1;
            obj2 = cVar.a(cls, this.z, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        eVar = (mo.e) obj2;
        mo.e eVar22 = eVar;
        AnalyticsContext.INSTANCE.getClass();
        oVar.i.e2(new ho.i(this.C, this.D, new AnalyticsContext(AnalyticsContext.Companion.a(this.A)), eo.a.a(AnalyticsMetadata.INSTANCE, this.B), eVar22));
        return Unit.f186387a;
    }
}
