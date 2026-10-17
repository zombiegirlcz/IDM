package com.revolut.feature.passcode;

import com.revolut.feature.passcode.PasscodeScreenContract$WallpaperBackground;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ PasscodeScreen v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PasscodeScreenContract$WallpaperBackground.WithBackground f78632w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PasscodeScreen passcodeScreen, PasscodeScreenContract$WallpaperBackground.WithBackground withBackground, Continuation continuation) {
        super(2, continuation);
        this.v = passcodeScreen;
        this.f78632w = withBackground;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f78632w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            if (PasscodeScreen.Z2(this.v, this.f78632w, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
