package com.revolut.appwidget_core;

import android.content.Context;
import androidx.glance.GlanceId;
import fq.j;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f50370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ GlanceId f50371x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Context context, GlanceId glanceId, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f50370w = context;
        this.f50371x = glanceId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f50370w, this.f50371x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            if (this.v.f50367a == null) {
                a aVar2 = this.v;
                Context applicationContext = this.f50370w.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                Intrinsics.checkNotNullParameter(applicationContext, "<set-?>");
                aVar2.f50367a = applicationContext;
            }
            a.Companion.getClass();
            j2 j2Var = a.f50366g;
            j jVar = new j(this.v, this.f50370w, this.f50371x, null, 1);
            this.u = 1;
            if (q.o(j2Var, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
