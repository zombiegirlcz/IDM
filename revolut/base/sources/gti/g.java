package gti;

import android.database.ContentObserver;
import android.os.Handler;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f146617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f146618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, ProducerScope producerScope, Handler handler, int i) {
        super(handler);
        this.f146616a = i;
        this.f146618c = obj2;
        this.f146617b = producerScope;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.f146616a) {
            case 0:
                e eVarA = h.a((h) this.f146618c);
                if (eVarA != null) {
                    this.f146617b.mo3647trySendJP2dKIU(eVarA);
                }
                break;
            default:
                xvi.e eVarA2 = xvi.g.a((xvi.g) this.f146618c);
                if (eVarA2 != null) {
                    this.f146617b.mo3647trySendJP2dKIU(eVarA2);
                }
                break;
        }
    }
}
