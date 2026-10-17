package bec;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f14763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f14764c;

    public /* synthetic */ b0(e0 e0Var, i iVar, int i) {
        this.f14762a = i;
        this.f14763b = e0Var;
        this.f14764c = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f14762a) {
            case 0:
                h paymentMethodContent = (h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(paymentMethodContent, "paymentMethodContent");
                i iVar = this.f14764c;
                return this.f14763b.a(paymentMethodContent, iVar.f14786c.f84365a, iVar.e, iVar.f14785b, iVar.k);
            default:
                h paymentMethodContent2 = (h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(paymentMethodContent2, "paymentMethodContent");
                i iVar2 = this.f14764c;
                return this.f14763b.a(paymentMethodContent2, iVar2.f14786c.f84365a, iVar2.e, iVar2.f14785b, iVar2.k);
        }
    }
}
