package ky4;

import aii.b0;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Ref$BooleanRef;
import yji.n;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements oki.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f190628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f190629c;

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f190627a = i;
        this.f190628b = obj2;
        this.f190629c = obj3;
    }

    @Override // oki.g
    public final void pop() {
        switch (this.f190627a) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f190628b;
                if (!ref$BooleanRef.f186407a) {
                    ref$BooleanRef.f186407a = true;
                    ((oki.g) this.f190629c).pop();
                }
                break;
            case 1:
                ViewController viewController = (ViewController) this.f190628b;
                if (!viewController.q2().d()) {
                    viewController.F2();
                } else {
                    ((n) this.f190629c).r2().M0(new b0());
                }
                break;
            default:
                ((yki.g) this.f190628b).s().m((ViewController) this.f190629c);
                break;
        }
    }
}
