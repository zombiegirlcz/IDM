package w2a;

import cli.y;
import cli.z;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends oki.h implements z {

    @NotNull
    public static final p Companion = new p();
    public final q9i.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y2a.a f294005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f294006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f294007r;

    public s(q9i.d reactionsKeyboardTypeInteractor, y2a.a gifUrlTransformer, tyc.l stateMapper) {
        Intrinsics.checkNotNullParameter(reactionsKeyboardTypeInteractor, "reactionsKeyboardTypeInteractor");
        Intrinsics.checkNotNullParameter(gifUrlTransformer, "gifUrlTransformer");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = reactionsKeyboardTypeInteractor;
        this.f294005p = gifUrlTransformer;
        z1 z1VarA = ta6.a.a(1);
        z1VarA.k(Unit.f186387a);
        this.f294006q = z1VarA;
        List list = q9i.d.f243909c;
        i9i.e eVar = (i9i.e) d0.b0(list);
        this.f294007r = mra.d.b(this, new j(list, new Data(null, null, true, 3, null), new g(eVar.f159882a), eVar), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f294006q, new q(continuation, this, 0)), null, null, new vrl.d(this, continuation, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f294007r;
    }
}
