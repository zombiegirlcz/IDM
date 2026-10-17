package lx0;

import androidx.media3.exoplayer.ExoPlayer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.l;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public Iterator u;
    public int v;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Iterator it8;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            it8 = jv0.d.f178736a.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it8 = this.u;
            o.b(obj2);
        }
        while (it8.hasNext()) {
            ExoPlayer exoPlayer = (ExoPlayer) ((WeakReference) it8.next()).get();
            if (exoPlayer != null) {
                this.u = it8;
                this.v = 1;
                l lVar = new l(1, fim.h.b(this));
                lVar.u();
                if (exoPlayer.getPlaybackState() == 1 || exoPlayer.getPlaybackState() == 4) {
                    m.Companion companion = m.INSTANCE;
                    lVar.resumeWith(Unit.f186387a);
                } else {
                    b bVar = new b(exoPlayer, lVar);
                    lVar.r(new a(exoPlayer, bVar));
                    exoPlayer.addListener(bVar);
                    exoPlayer.stop();
                }
                Object objT = lVar.t();
                if (objT == fim.a.COROUTINE_SUSPENDED) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                if (objT == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f186387a;
    }
}
