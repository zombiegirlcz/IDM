package p3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import gim.i;
import java.util.List;
import jid.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l3d.h0;
import yhm.o;
import zhm.q0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f232733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FavouritesAssetTypeKey f232734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Pair f232735y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(z zVar, FavouritesAssetTypeKey favouritesAssetTypeKey, Pair pair, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f232733w = zVar;
        this.f232734x = favouritesAssetTypeKey;
        this.f232735y = pair;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f232733w, this.f232734x, this.f232735y, continuation, 0);
            default:
                return new a(this.f232733w, this.f232734x, this.f232735y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    h0 h0Var = (h0) this.f232733w.f174461b;
                    List listC = u.c(this.f232735y);
                    this.v = 1;
                    Object objC = h0Var.f191909a.c(q0.c(new Pair(this.f232734x, listC)), this);
                    if (objC != aVar) {
                        objC = Unit.f186387a;
                    }
                    if (objC != aVar) {
                        objC = Unit.f186387a;
                    }
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    h0 h0Var2 = (h0) this.f232733w.f174461b;
                    this.v = 1;
                    if (h0Var2.h(this.f232734x, this.f232735y, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
