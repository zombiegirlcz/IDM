package tna;

import com.revolut.core.ui_kit.recycler.ScrollOffsetData;
import com.revolut.feature.profile.impl.ui.profile.screens.appearance.AppearanceThemeScreen;
import ip0.ik0;
import ip0.sk0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AppearanceThemeScreen f272342w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AppearanceThemeScreen appearanceThemeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f272342w = appearanceThemeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f272342w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f272342w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f272342w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((ik0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((sk0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((ScrollOffsetData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xjg.m mVar;
        xjg.m mVar2;
        int i = this.u;
        AppearanceThemeScreen appearanceThemeScreen = this.f272342w;
        switch (i) {
            case 0:
                ik0 themeMode = (ik0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) appearanceThemeScreen.T2();
                rVar.getClass();
                Intrinsics.checkNotNullParameter(themeMode, "themeMode");
                int i2 = o.f272350a[themeMode.ordinal()];
                if (i2 == 1) {
                    mVar = xjg.m.DAY;
                } else if (i2 == 2) {
                    mVar = xjg.m.NIGHT;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar = xjg.m.SYSTEM;
                }
                rVar.l2(new tgk.f(rVar, mVar, null, 21), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                sk0 themeMode2 = (sk0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar2 = (r) appearanceThemeScreen.T2();
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(themeMode2, "themeMode");
                int i3 = o.f272351b[themeMode2.ordinal()];
                if (i3 == 1) {
                    mVar2 = xjg.m.DAY;
                } else if (i3 == 2) {
                    mVar2 = xjg.m.NIGHT;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar2 = xjg.m.SYSTEM;
                }
                rVar2.l2(new tgk.f(rVar2, mVar2, null, 21), new yi5.b(26));
                return Unit.f186387a;
            default:
                ScrollOffsetData data = (ScrollOffsetData) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarH3 = appearanceThemeScreen.T2();
                Intrinsics.h(data);
                r rVar3 = (r) lVarH3;
                rVar3.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                rVar3.v.f272337a = data;
                return Unit.f186387a;
        }
    }
}
