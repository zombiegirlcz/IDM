package com.revolut.feature.passcode;

import com.revolut.feature.passcode.PasscodeScreenContract$WallpaperBackground;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ PasscodeScreen u;
    public final /* synthetic */ PasscodeScreenContract$WallpaperBackground.WithBackground v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PasscodeScreen passcodeScreen, PasscodeScreenContract$WallpaperBackground.WithBackground withBackground, Continuation continuation) {
        super(2, continuation);
        this.u = passcodeScreen;
        this.v = withBackground;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (this.u.P.getValue() == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
