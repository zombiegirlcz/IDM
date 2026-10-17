package androidx.view.compose;

import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.view.compose.internal.BackHandlerCompat;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BackHandlerCompat f6770c;

    public /* synthetic */ b(BackHandlerCompat backHandlerCompat, boolean z, int i) {
        this.f6768a = i;
        this.f6770c = backHandlerCompat;
        this.f6769b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f6768a) {
            case 0:
                return BackHandlerKt.BackHandler$lambda$3$0((ComposeBackHandler) this.f6770c, this.f6769b, (LifecycleStartStopEffectScope) obj2);
            default:
                return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$3$0((ComposePredictiveBackHandler) this.f6770c, this.f6769b, (LifecycleStartStopEffectScope) obj2);
        }
    }
}
