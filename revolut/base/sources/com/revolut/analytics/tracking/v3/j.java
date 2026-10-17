package com.revolut.analytics.tracking.v3;

import com.google.firebase.messaging.u;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.NotificationContext;
import grl.f7;
import ho.t;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nfj.j2;
import skm.e0;
import skm.p0;
import uo.o0;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f7 f50332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ipa.h f50333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f50334y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, f7 f7Var, ipa.h hVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
        this.f50332w = f7Var;
        this.f50333x = hVar;
        this.f50334y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f50332w, this.f50333x, this.f50334y, this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u uVar = this.v;
        Object[] objArr = 0;
        if (i == 0) {
            o.b(obj2);
            j2 j2Var = new j2(uVar, objArr == true ? 1 : 0, 19);
            p0 p0Var = p0.f264001a;
            tkm.e eVar = zkm.o.f323119a.e;
            this.u = 1;
            obj2 = e0.J(eVar, j2Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Pair pair = (Pair) obj2;
        Object obj3 = pair.f186385a;
        o0 o0Var = (o0) pair.f186386b;
        AnalyticsProduct analyticsProductE = ((uo.o) ((uo.l) uVar.d)).e(obj3, null);
        NotificationContext.a aVarNewBuilder = NotificationContext.newBuilder();
        aVarNewBuilder.c();
        ((NotificationContext) aVarNewBuilder.f49761b).setAction(this.f50332w);
        String string = this.f50333x.toString();
        aVarNewBuilder.c();
        ((NotificationContext) aVarNewBuilder.f49761b).setCategory(string);
        String str = this.f50334y;
        if (str != null) {
            aVarNewBuilder.c();
            ((NotificationContext) aVarNewBuilder.f49761b).setGroupId(str);
        }
        String str2 = this.z;
        if (str2 != null) {
            aVarNewBuilder.c();
            ((NotificationContext) aVarNewBuilder.f49761b).setMessageId(str2);
        }
        String str3 = this.A;
        if (str3 != null) {
            aVarNewBuilder.c();
            ((NotificationContext) aVarNewBuilder.f49761b).setTemplateId(str3);
        }
        String str4 = this.B;
        if (str4 != null) {
            aVarNewBuilder.c();
            ((NotificationContext) aVarNewBuilder.f49761b).setPushId(str4);
        }
        NotificationContext notificationContext = (NotificationContext) aVarNewBuilder.a();
        String str5 = o0Var != null ? o0Var.f281496a : null;
        AnalyticsContext.INSTANCE.getClass();
        ((t) ((d4m.a) uVar.f49545a).get()).e2(new ho.g(str5, analyticsProductE, AnalyticsContext.Companion.a(notificationContext)));
        return Unit.f186387a;
    }
}
