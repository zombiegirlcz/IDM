package f5l;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f132367b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f132366a = i;
        this.f132367b = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj2) {
        g5l.c cVar;
        int i = this.f132366a;
        Object obj3 = this.f132367b;
        switch (i) {
            case 0:
                ProducerScope producerScope = (ProducerScope) obj3;
                Integer num = (Integer) obj2;
                g5l.b bVar = g5l.c.Companion;
                Intrinsics.h(num);
                int iIntValue = num.intValue();
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                if (iIntValue == 0) {
                    cVar = g5l.c.STOPPED;
                } else if (iIntValue != 1) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    cVar = null;
                    rd0.d.a(rd0.c.ERROR, "ScreenRecordingDetector35", a0.d.n("unknown screen recording value:", iIntValue), null, h0Var);
                } else {
                    cVar = g5l.c.STARTED;
                }
                if (cVar != null) {
                    producerScope.mo3647trySendJP2dKIU(cVar);
                }
                break;
            case 1:
                ((StringBuilder) obj3).append((String) obj2);
                break;
            default:
                ((wpj.b) obj3).invoke(obj2);
                break;
        }
    }
}
