package g99;

import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import po0.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f141513b;

    public /* synthetic */ d(h hVar, int i) {
        this.f141512a = i;
        this.f141513b = hVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f141512a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                StatefulAnimatedBackground statefulAnimatedBackground = this.f141513b.d;
                if (zBooleanValue) {
                    statefulAnimatedBackground.b(l.INTRO.a(), b0.ONCE);
                    statefulAnimatedBackground.b(l.LOOP.a(), b0.INFINITE);
                } else {
                    statefulAnimatedBackground.a();
                }
                break;
            default:
                this.f141513b.e.setAlpha(1.0f);
                break;
        }
        return Unit.f186387a;
    }
}
