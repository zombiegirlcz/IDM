package pt9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name.GroupSettingsNameScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pig.y;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupSettingsNameScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GroupSettingsNameScreen groupSettingsNameScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupSettingsNameScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.c0.getValue();
        String name = textData.f52598b.toString();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        iVar.x2(new y(name, 9));
        return Unit.f186387a;
    }
}
