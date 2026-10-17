package lr;

import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements j21.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f199355b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f199354a = i;
        this.f199355b = obj2;
    }

    @Override // j21.c
    public final void a(long j2, long j3) {
        switch (this.f199354a) {
            case 0:
                ((ProducerScope) this.f199355b).mo3647trySendJP2dKIU(new gr.p(j2, j3));
                break;
            case 1:
                ((ProducerScope) this.f199355b).mo3647trySendJP2dKIU(new gr.p(j2, j3));
                break;
            case 2:
                ((ProducerScope) this.f199355b).mo3647trySendJP2dKIU(new gr.p(j2, j3));
                break;
            case 3:
                ((ProducerScope) this.f199355b).mo3647trySendJP2dKIU(new gr.p(j2, j3));
                break;
            case 4:
                ((ProducerScope) this.f199355b).mo3647trySendJP2dKIU(new gr.p(j2, j3));
                break;
            default:
                ((ihm.f) this.f199355b).onNext(new wl2.d(j2 / j3));
                break;
        }
    }
}
