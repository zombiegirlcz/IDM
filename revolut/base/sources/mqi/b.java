package mqi;

import c01.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rpi.g;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c01.a f208006b;

    public /* synthetic */ b(c01.a aVar, int i) {
        this.f208005a = i;
        this.f208006b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean zF;
        boolean zF2;
        c01.b clickedButton = (c01.b) obj2;
        switch (this.f208005a) {
            case 0:
                Intrinsics.checkNotNullParameter(clickedButton, "clickedButton");
                int i = c.f208007a[this.f208006b.ordinal()];
                if (i == 1) {
                    zF = Intrinsics.f(clickedButton, b.d.f20096a);
                } else if (i == 2) {
                    zF = Intrinsics.f(clickedButton, b.C0131b.f20094a);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zF = Intrinsics.f(clickedButton, b.c.f20095a);
                }
                return Boolean.valueOf(zF);
            default:
                Intrinsics.checkNotNullParameter(clickedButton, "clickedButton");
                int i2 = g.f256391a[this.f208006b.ordinal()];
                if (i2 == 1) {
                    zF2 = Intrinsics.f(clickedButton, b.d.f20096a);
                } else if (i2 == 2) {
                    zF2 = Intrinsics.f(clickedButton, b.C0131b.f20094a);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zF2 = Intrinsics.f(clickedButton, b.c.f20095a);
                }
                return Boolean.valueOf(zF2);
        }
    }
}
