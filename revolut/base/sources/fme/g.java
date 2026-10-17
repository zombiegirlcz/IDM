package fme;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tx0.l;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f136381b;

    public /* synthetic */ g(i iVar, int i) {
        this.f136380a = i;
        this.f136381b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        switch (this.f136380a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f136381b.getClass();
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f136381b.getClass();
                break;
        }
        return new l(null, 5);
    }
}
