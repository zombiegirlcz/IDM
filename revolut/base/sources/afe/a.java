package afe;

import android.app.Activity;
import com.google.protobuf.w0;
import com.revolut.RevolutApplication;
import com.revolut.analytics.tracking.v3.l;
import com.revolut.core.network.exceptions.NetworkException;
import efm.w;
import eg.i1;
import eg.p0;
import gim.i;
import ig.o;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l1b.g;
import pe0.f;
import pe0.q;
import skm.e0;
import v30.e1;
import wl3.s;
import yv1.k;
import z10.e;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f4027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4028x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.u = 13;
        this.f4027w = lVar;
        this.f4028x = str;
        this.v = i;
    }

    public static final void b(Ref$ObjectRef ref$ObjectRef, ProducerScope producerScope, e eVar) {
        Job job2 = (Job) ref$ObjectRef.f186409a;
        Continuation continuation = null;
        if (job2 != null) {
            job2.f(null);
        }
        e1 e1Var = eVar.e;
        if (e1Var != null) {
            ref$ObjectRef.f186409a = e0.C(producerScope, null, null, new k(e1Var, producerScope, continuation, 15), 3);
        }
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a((b) this.f4028x, continuation, 0);
                aVar.f4027w = obj2;
                return aVar;
            case 1:
                a aVar2 = new a((yee.a) this.f4028x, continuation, 1);
                aVar2.f4027w = obj2;
                return aVar2;
            case 2:
                a aVar3 = new a((b) this.f4028x, continuation, 2);
                aVar3.f4027w = obj2;
                return aVar3;
            case 3:
                a aVar4 = new a((w) this.f4028x, continuation, 3);
                aVar4.f4027w = obj2;
                return aVar4;
            case 4:
                return new a((p0) this.f4027w, (String) this.f4028x, continuation, 4);
            case 5:
                return new a((i1) this.f4027w, (ArrayList) this.f4028x, continuation, 5);
            case 6:
                a aVar5 = new a((wkm.l) this.f4028x, continuation, 6);
                aVar5.f4027w = obj2;
                return aVar5;
            case 7:
                return new a((o) this.f4028x, continuation, 7);
            case 8:
                return new a((g) this.f4027w, (String) this.f4028x, continuation, 8);
            case 9:
                return new a((RevolutApplication) this.f4028x, continuation, 9);
            case 10:
                a aVar6 = new a((Function2) this.f4028x, continuation, 10);
                aVar6.f4027w = obj2;
                return aVar6;
            case 11:
                a aVar7 = new a((n30.p0) this.f4028x, continuation, 11);
                aVar7.f4027w = obj2;
                return aVar7;
            case 12:
                return new a((l) this.f4027w, (w0) this.f4028x, continuation, 12);
            case 13:
                return new a((l) this.f4027w, (String) this.f4028x, this.v, continuation);
            case 14:
                a aVar8 = new a((q) this.f4028x, continuation, 14);
                aVar8.f4027w = obj2;
                return aVar8;
            case 15:
                return new a((sj0.b) this.f4027w, (NetworkException) this.f4028x, continuation, 15);
            case 16:
                return new a((s) this.f4027w, (sl3.k) this.f4028x, continuation, 16);
            case 17:
                return new a((t9i.a) this.f4027w, (Activity) this.f4028x, continuation, 17);
            case 18:
                a aVar9 = new a((wkm.d) this.f4028x, continuation, 18);
                aVar9.f4027w = obj2;
                return aVar9;
            case 19:
                return new a((Flow) this.f4027w, (wkm.w) this.f4028x, continuation, 19);
            default:
                a aVar10 = new a((e) this.f4028x, continuation, 20);
                aVar10.f4027w = obj2;
                return aVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((a) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((a) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((a) create((f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((a) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0298  */
    /* JADX WARN: Type inference failed for: r4v5, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Collection, java.util.HashSet] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: afe.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f4027w = obj2;
        this.f4028x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f4028x = obj2;
    }
}
