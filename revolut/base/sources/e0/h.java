package e0;

import androidx.camera.core.impl.LiveDataObservable;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121372b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f121371a = i;
        this.f121372b = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj2) {
        switch (this.f121371a) {
            case 0:
                ((LiveDataObservable) this.f121372b).lambda$enableInternalObserver$4((LiveDataObservable.Result) obj2);
                break;
            default:
                ((eu7.c) this.f121372b).invoke(obj2);
                break;
        }
    }
}
