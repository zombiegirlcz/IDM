package androidx.window.layout;

import androidx.core.util.Consumer;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f7707b;

    public /* synthetic */ a(ProducerScope producerScope, int i) {
        this.f7706a = i;
        this.f7707b = producerScope;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f7706a) {
            case 0:
                this.f7707b.mo3647trySendJP2dKIU((WindowLayoutInfo) obj2);
                break;
            default:
                this.f7707b.mo3647trySendJP2dKIU((WindowLayoutInfo) obj2);
                break;
        }
    }
}
