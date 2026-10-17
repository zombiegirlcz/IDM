package a97;

import com.revolut.kompot.navigable.flow.BaseFlow;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i extends q implements Function2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0319  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r47, java.lang.Object r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a97.i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BaseFlow baseFlow, int i) {
        super(2, 0, BaseFlow.class, baseFlow, "onChildControllerAttached", "onChildControllerAttached$kompot_release(Lcom/revolut/kompot/navigable/Controller;Lcom/revolut/kompot/navigable/ControllerManager;)V");
        this.f = i;
        switch (i) {
            case 14:
                super(2, 0, BaseFlow.class, baseFlow, "onChildControllerDetached", "onChildControllerDetached$kompot_release(Lcom/revolut/kompot/navigable/Controller;Lcom/revolut/kompot/navigable/ControllerManager;)V");
                break;
            default:
                break;
        }
    }
}
