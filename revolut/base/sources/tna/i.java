package tna;

import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.appearance.AppearanceThemeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AppearanceThemeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AppearanceThemeScreen appearanceThemeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = appearanceThemeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((IconSelectorDelegate.SelectableIconModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tna.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
