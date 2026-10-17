package no;

import grl.f7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class s1 extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.u f217842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ipa.h f217843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f217844y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(com.google.firebase.messaging.u uVar, ipa.h hVar, String str, String str2, String str3, String str4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217842w = uVar;
        this.f217843x = hVar;
        this.f217844y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s1(this.f217842w, this.f217843x, this.f217844y, this.z, this.A, this.B, continuation, 0);
            default:
                return new s1(this.f217842w, this.f217843x, this.f217844y, this.z, this.A, this.B, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    f7 f7Var = f7.Opened;
                    this.v = 1;
                    com.revolut.analytics.tracking.v3.j jVar = new com.revolut.analytics.tracking.v3.j(this.f217842w, f7Var, this.f217843x, this.f217844y, this.z, this.A, this.B, null);
                    skm.p0 p0Var = skm.p0.f264001a;
                    Object objJ = skm.e0.J(elm.f.f127540b, jVar, this);
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
                return Unit.f186387a;
            default:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    f7 f7Var2 = f7.Received;
                    this.v = 1;
                    com.revolut.analytics.tracking.v3.j jVar2 = new com.revolut.analytics.tracking.v3.j(this.f217842w, f7Var2, this.f217843x, this.f217844y, this.z, this.A, this.B, null);
                    skm.p0 p0Var2 = skm.p0.f264001a;
                    Object objJ2 = skm.e0.J(elm.f.f127540b, jVar2, this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
