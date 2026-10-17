package wjd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.SignInMethodsScreen;
import com.revolut.feature.web_sign_in.navigation.WebSignInDestination;
import com.revolut.feature.web_sign_in.navigation.WebSignInDestinationInput;
import com.revolut.sso.api.navigation.RevolutSsoPasskeysManagementFlowDestination;
import com.revolut.sso.api.passcode.change.RevolutSsoChangePasscodeFlowDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SignInMethodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SignInMethodsScreen signInMethodsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = signInMethodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.Q.getValue();
        String listId = model.f53228a;
        com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a aVar2 = (com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a) jVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -1196989297) {
            if (iHashCode != 1121378669) {
                if (iHashCode == 1217278485 && listId.equals("PASSKEYS_ID")) {
                    aVar2.C1(RevolutSsoPasskeysManagementFlowDestination.f106011b);
                }
            } else if (listId.equals("CHANGE_PASSCODE_ID")) {
                aVar2.C1(new RevolutSsoChangePasscodeFlowDestination(0));
            }
        } else if (listId.equals("QR_CODE_ID")) {
            aVar2.C1(new WebSignInDestination(new WebSignInDestinationInput(WebSignInDestinationInput.LaunchMode.ScanAndConfirm.f96329a)));
        }
        return Unit.f186387a;
    }
}
