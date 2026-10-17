package androidx.media3.exoplayer;

import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.SuitableOutputChecker;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements BackgroundThreadStateHandler.StateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuitableOutputChecker.Callback f7490b;

    public /* synthetic */ b(SuitableOutputChecker.Callback callback, int i) {
        this.f7489a = i;
        this.f7490b = callback;
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public final void onStateChanged(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        switch (this.f7489a) {
            case 0:
                DefaultSuitableOutputChecker.ImplApi23.lambda$enable$0(this.f7490b, bool, bool2);
                break;
            default:
                DefaultSuitableOutputChecker.ImplApi35.lambda$enable$0(this.f7490b, bool, bool2);
                break;
        }
    }
}
