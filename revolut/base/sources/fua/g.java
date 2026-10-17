package fua;

import aii.r;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.feature.rating.shared.impl.screen.AppRatingController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AppRatingController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AppRatingController appRatingController, Continuation continuation) {
        super(2, continuation);
        this.v = appRatingController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((IconSelectorDelegate.SelectableIconModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar;
        IconSelectorDelegate.SelectableIconModel icon = (IconSelectorDelegate.SelectableIconModel) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.S.getValue();
        Intrinsics.h(icon);
        i iVar = (i) eVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(icon, "icon");
        String str = icon.f52499a;
        if (Intrinsics.f(str, "app_rating_screen_negative")) {
            rVar = b.f138159a;
        } else {
            if (!Intrinsics.f(str, "app_rating_screen_positive")) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unsupported app rating action id: ", str));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                return Unit.f186387a;
            }
            rVar = c.f138160a;
        }
        if (!iVar.f138163p) {
            iVar.f138163p = true;
            iVar.C2(rVar);
        }
        return Unit.f186387a;
    }
}
