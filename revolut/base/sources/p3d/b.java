package p3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import gim.i;
import java.util.Map;
import jid.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l3d.r;
import yhm.o;
import zhm.q0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f232736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f232737x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ FavouritesAssetTypeKey f232738y;
    public final /* synthetic */ Pair z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(z zVar, String str, FavouritesAssetTypeKey favouritesAssetTypeKey, Pair pair, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f232736w = zVar;
        this.f232737x = str;
        this.f232738y = favouritesAssetTypeKey;
        this.z = pair;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f232736w, this.f232737x, this.f232738y, this.z, continuation, 0);
            default:
                return new b(this.f232736w, this.f232737x, this.f232738y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    r rVar = (r) this.f232736w.f174462c;
                    Map mapC = q0.c(new Pair(this.f232738y, u.c(this.z)));
                    this.v = 1;
                    if (rVar.a(this.f232737x, mapC, this) == aVar) {
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
                    r rVar2 = (r) this.f232736w.f174462c;
                    this.v = 1;
                    if (rVar2.g(this.f232737x, this.f232738y, this.z, this) == aVar2) {
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
