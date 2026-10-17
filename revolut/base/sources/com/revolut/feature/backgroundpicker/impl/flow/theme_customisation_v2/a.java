package com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2;

import bn2.e0;
import cli.y;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$PostRecreationAction;
import gim.i;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uj6.v;
import um2.k0;
import vkm.j2;
import yhm.o;
import zhm.z0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f63787w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f63787w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f63787w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        b bVar = this.f63787w;
        y yVar = bVar.B;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.v;
        if (i2 == 0) {
            o.b(obj2);
            int i3 = ((um2.a) ((j2) yVar.f22677a).getValue()).f281181h != null ? 1 : 0;
            if (i3 != 0) {
                k0 k0Var = bVar.A;
                LinkedHashSet linkedHashSetF = z0.f(ThemeCustomisationContract$PostRecreationAction.ClearSandbox.f63768a, ThemeCustomisationContract$PostRecreationAction.BackToMenu.f63767a, ThemeCustomisationContract$PostRecreationAction.ShowSuccess.f63770a);
                k0Var.getClass();
                Intrinsics.checkNotNullParameter(linkedHashSetF, "<set-?>");
                k0Var.f281206c = linkedHashSetF;
            }
            e0 e0Var = bVar.u;
            this.u = i3;
            this.v = 1;
            if (e0Var.R(this) == aVar) {
                return aVar;
            }
            i = i3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.u;
            o.b(obj2);
        }
        if (i == 0) {
            bVar.I2();
            bVar.H2(yVar, new v(22));
            bVar.L2();
        }
        return Unit.f186387a;
    }
}
