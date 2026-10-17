package e1k;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qta.d;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rzj.b f121998b;

    public /* synthetic */ a(rzj.b bVar, int i) {
        this.f121997a = i;
        this.f121998b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d it8 = (d) obj2;
        switch (this.f121997a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return new f1k.b(this.f121998b, it8);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return new d1k.b(this.f121998b, it8);
        }
    }
}
