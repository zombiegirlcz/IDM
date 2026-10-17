package ma9;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.contact_permission.ContactsPermissionScreen;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ ContactsPermissionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ContactsPermissionScreen contactsPermissionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = contactsPermissionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) ((g) this.u.M.getValue());
        kVar.getClass();
        PermissionsFlowContract$Explanation.None none = PermissionsFlowContract$Explanation.None.f98339a;
        yji.l.i2(kVar, new PermissionsFlow(r0.k(new Pair("android.permission.READ_CONTACTS", none), new Pair("android.permission.WRITE_CONTACTS", none))), null, new m98.k(kVar, 6), 1);
        return Unit.f186387a;
    }
}
