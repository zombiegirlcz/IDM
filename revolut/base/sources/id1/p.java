package id1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md1.a f160407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f160408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f160409c;
    public final j2 d;
    public final j2 e;

    public p(md1.a shoppingCartItemsFactory) {
        Intrinsics.checkNotNullParameter(shoppingCartItemsFactory, "shoppingCartItemsFactory");
        this.f160407a = shoppingCartItemsFactory;
        this.f160408b = q.c(null);
        this.f160409c = new ArrayList();
        this.d = q.c(null);
        this.e = q.c(null);
    }

    public final void a() {
        this.f160408b.setValue(d0.d1(this.f160409c));
    }
}
