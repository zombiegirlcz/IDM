package com.revolut.feature.full_screen_prompt;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.full_screen_prompt.c;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ FullScreenPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FullScreenPromptScreen fullScreenPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = fullScreenPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        FullScreenPromptScreen fullScreenPromptScreen = this.u;
        if (fullScreenPromptScreen.K.getF74493p()) {
            d dVarR2 = fullScreenPromptScreen.R2();
            b source = b.BUTTON;
            e eVar = (e) dVarR2;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            eVar.C2(new c.a(source));
        } else {
            fullScreenPromptScreen.m2().onBackPressed();
        }
        return Unit.f186387a;
    }
}
