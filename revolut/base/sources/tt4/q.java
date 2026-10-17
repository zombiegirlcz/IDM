package tt4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f274227b;

    public /* synthetic */ q(s sVar, int i) {
        this.f274226a = i;
        this.f274227b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f274226a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                s sVar = this.f274227b;
                String str = sVar.o.f69542a;
                if (!zBooleanValue) {
                    od0.i.Companion.getClass();
                }
                break;
            default:
                yw4.h creditCardType = (yw4.h) obj2;
                Intrinsics.checkNotNullParameter(creditCardType, "creditCardType");
                s sVar2 = this.f274227b;
                String str2 = sVar2.o.f69542a;
                if (creditCardType != yw4.h.SECURED) {
                    od0.i.Companion.getClass();
                }
                break;
        }
        return zi0.c.i(od0.i.f224256b);
    }
}
