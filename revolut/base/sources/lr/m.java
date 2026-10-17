package lr;

import kotlinx.coroutines.channels.ProducerScope;
import ukm.j0;
import ukm.q;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class m implements j21.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f199353b;

    public /* synthetic */ m(j0 j0Var, int i) {
        this.f199352a = i;
        this.f199353b = j0Var;
    }

    @Override // j21.c
    public final void a(long j2, long j3) {
        switch (this.f199352a) {
            case 0:
                ((ProducerScope) this.f199353b).mo3647trySendJP2dKIU(new gr.p(j2, j3));
                break;
            case 1:
                ((ProducerScope) this.f199353b).mo3647trySendJP2dKIU(new gr.p(j2, j3));
                break;
            default:
                q qVar = (q) this.f199353b;
                if (j3 > 0) {
                    qVar.mo3647trySendJP2dKIU(Integer.valueOf((int) ((j2 * ((long) 100)) / j3)));
                }
                break;
        }
    }
}
