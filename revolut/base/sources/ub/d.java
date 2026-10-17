package ub;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.view.compose.ManagedActivityResultLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278710a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f278711b;

    public /* synthetic */ d(f fVar) {
        this.f278711b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f278710a) {
            case 0:
                ((Boolean) obj2).getClass();
                f fVar = this.f278711b;
                j jVarA = fVar.a();
                Intrinsics.checkNotNullParameter(jVarA, "<set-?>");
                fVar.d.setValue(jVarA);
                return Unit.f186387a;
            default:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj2;
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                return new e(this.f278711b, 1);
        }
    }

    public /* synthetic */ d(f fVar, ManagedActivityResultLauncher managedActivityResultLauncher) {
        this.f278711b = fVar;
    }
}
