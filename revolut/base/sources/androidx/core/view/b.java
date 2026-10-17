package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProducerScope;
import skm.e0;
import vnl.o;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7351c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, int i, Object obj3, Object obj4) {
        this.f7349a = i;
        this.f7350b = obj2;
        this.f7351c = obj3;
        this.d = obj4;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f7349a) {
            case 0:
                ((MenuHostHelper) this.f7350b).lambda$addMenuProvider$1((Lifecycle.State) this.f7351c, (MenuProvider) this.d, lifecycleOwner, event);
                break;
            case 1:
                LifecycleEffectKt.LifecycleStartEffectImpl$lambda$19$lambda$18$lambda$16((LifecycleStartStopEffectScope) this.f7350b, (Ref$ObjectRef) this.f7351c, (Function1) this.d, lifecycleOwner, event);
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f7350b;
                ProducerScope producerScope = (ProducerScope) this.f7351c;
                vv.d dVar = (vv.d) this.d;
                int i = vv.b.f292423a[event.ordinal()];
                if (i == 1) {
                    ref$ObjectRef.f186409a = vv.g.f292430a;
                    break;
                } else if (i == 2) {
                    e0.C(producerScope, null, null, new o(ref$ObjectRef, dVar, null, 9), 3);
                    break;
                }
                break;
        }
    }
}
