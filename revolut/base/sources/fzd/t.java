package fzd;

import com.google.android.gms.wallet.WalletConstants;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f139161w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139161w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f139161w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(this.f139161w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
            default:
                t tVar3 = new t(this.f139161w, continuation, 2);
                tVar3.v = obj2;
                return tVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((t) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u uVar = this.f139161w;
        switch (i) {
            case 0:
                lzd.c cVar = (lzd.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = uVar.u;
                uVar.H2(yVar, new n(CustomisationSelection.copy$default(((j) ((j2) yVar.f22677a).getValue()).f139144b, null, null, null, false, null, cVar.f200964a, cVar.f200965b, null, null, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, null), 3));
                break;
            case 1:
                Set set = (Set) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar2 = uVar.u;
                uVar.H2(yVar2, new n(CustomisationSelection.copy$default(((j) ((j2) yVar2.f22677a).getValue()).f139144b, null, null, null, false, null, null, null, set, null, 383, null), 4));
                break;
            default:
                Set set2 = (Set) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar3 = uVar.u;
                uVar.H2(yVar3, new n(CustomisationSelection.copy$default(((j) ((j2) yVar3.f22677a).getValue()).f139144b, null, null, null, false, null, null, null, null, set2, 255, null), 5));
                break;
        }
        return Unit.f186387a;
    }
}
