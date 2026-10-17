package xkl;

import akl.r;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ro7.n;
import sgm.e3;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f306869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f306870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f306871y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i iVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f306869w = iVar;
        this.f306870x = str;
        this.f306871y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f306869w, this.f306870x, this.f306871y, continuation, 0);
            case 1:
                return new d(this.f306869w, this.f306870x, this.f306871y, continuation, 1);
            case 2:
                return new d(this.f306869w, this.f306870x, this.f306871y, continuation, 2);
            default:
                return new d(this.f306869w, this.f306870x, this.f306871y, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f306871y;
        String str2 = this.f306870x;
        i iVar = this.f306869w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (iVar.d3(str2, str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (iVar.d3(str2, str, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                skm.l lVar = new skm.l(1, fim.h.b(this));
                lVar.u();
                i iVar2 = this.f306869w;
                l lVar2 = iVar2.f306885m;
                Activity context = iVar2.f306884l;
                c biometricCallback = new c(lVar);
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                String identityId = this.f306870x;
                Intrinsics.checkNotNullParameter(identityId, "identityId");
                Intrinsics.checkNotNullParameter(biometricCallback, "callback");
                zl0.b bVar = zl0.c.Companion;
                k promptInfoFactory = new k(lVar2.f306892a);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(identityId, "identityId");
                Intrinsics.checkNotNullParameter(promptInfoFactory, "promptInfoFactory");
                Intrinsics.checkNotNullParameter(biometricCallback, "biometricCallback");
                wl0.e eVar = new wl0.e(new xl0.b(biometricCallback, zl0.b.a(context).a(), xl0.d.f306899a), promptInfoFactory.a(), new e3((dn0.b) zl0.b.a(context).H.get(), new hn0.e(identityId)), zl0.b.a(context).g());
                iVar2.f306890s = eVar;
                Intrinsics.i(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                rm0.j jVarC = eVar.c((FragmentActivity) context);
                boolean zEquals = jVarC.equals(rm0.c.f255146a);
                int i6 = 27;
                Continuation continuation = null;
                String str3 = this.f306871y;
                if (zEquals) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "BioSignatureControllerModelExtensionImpl", "Bio signature is absent", null, null, 16);
                    iVar2.T2(new d(iVar2, str3, identityId, continuation, 0), new yi5.b(i6));
                    t1.H(lVar, null);
                } else if (jVarC instanceof rm0.f) {
                    Throwable th10 = ((rm0.f) jVarC).f255156a;
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.WARNING, "BioSignatureControllerModelExtensionImpl", "Unable to get bio signature", th10, h0Var);
                    t1.H(lVar, null);
                } else if (jVarC.equals(rm0.g.f255157a)) {
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "BioSignatureControllerModelExtensionImpl", "Bio signature has been invalidated", null, null, 16);
                    iVar2.T2(new d(iVar2, str3, identityId, continuation, 1), new yi5.b(i6));
                    t1.H(lVar, null);
                } else {
                    if (!jVarC.equals(rm0.d.f255149a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.DEBUG, "BioSignatureControllerModelExtensionImpl", "Certificate is exist to perform bio signature. Waiting for user authentication...", null, null, 16);
                }
                lVar.r(new n(iVar2, 26));
                Object objT = lVar.t();
                if (objT == aVar3) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                return objT == aVar3 ? aVar3 : objT;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                try {
                    if (i21 == 0) {
                        o.b(obj2);
                        akl.l lVar3 = iVar.f306887p;
                        gkl.n nVar = gkl.n.BIO_PUBLIC_KEY;
                        this.v = 1;
                        if (((r) lVar3).d(str2, nVar, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i21 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    iVar.f306889r.b(new jn0.a(str));
                    break;
                } catch (Exception e) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "BioSignatureControllerModelExtensionImpl", "Failed to invalidate claim", e, h0Var2);
                }
                return Unit.f186387a;
        }
    }
}
