package oki;

import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewController f226124b;

    public /* synthetic */ d(ViewController viewController, int i) {
        this.f226123a = i;
        this.f226124b = viewController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f226123a) {
            case 0:
                return this.f226124b.R1().g();
            default:
                return Boolean.valueOf(ViewController.O2(this.f226124b));
        }
    }
}
