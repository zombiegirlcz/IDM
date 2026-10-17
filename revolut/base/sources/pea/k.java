package pea;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pockets.impl.R$string;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p40.v;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f235354w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235354w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f235354w, continuation, 0);
            default:
                return new k(this.f235354w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l lVar = this.f235354w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    String str = ((g) lVar.t2()).f235350b;
                    this.v = 1;
                    obj2 = l.y2(lVar, str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                lVar.x2(new af1.f((i80.a) obj2, 1));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                Continuation continuation = null;
                if (i5 == 0) {
                    o.b(obj2);
                    v vVar = new v(lVar, continuation, i2);
                    this.v = 1;
                    obj2 = lVar.p2(this, vVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                File file = (File) obj2;
                if (file != null) {
                    return lVar.C1(u0.b(lVar.f235357r.e(lVar.f235358s.b(new TextLocalisedClause(R$string.revolut_accounts_account_details_qr_code_share_message, null, null, 14)).toString(), file)));
                }
                IllegalStateException illegalStateException = new IllegalStateException("We couldn't generate QR code image");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return Unit.f186387a;
        }
    }
}
