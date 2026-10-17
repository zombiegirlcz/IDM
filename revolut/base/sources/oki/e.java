package oki;

import com.revolut.kompot.navigable.vc.ViewController;
import dki.u;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mki.j;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements zji.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f226126b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f226125a = i;
        this.f226126b = obj2;
    }

    @Override // zji.e
    public final void a(Object obj2) {
        switch (this.f226125a) {
            case 0:
                ViewController viewController = (ViewController) this.f226126b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                j.a("ViewController#postBack");
                viewController.C2().F2();
                break;
            default:
                i iVar = (i) this.f226126b;
                u it8 = (u) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                iVar.f314634g.a(it8);
                break;
        }
    }
}
