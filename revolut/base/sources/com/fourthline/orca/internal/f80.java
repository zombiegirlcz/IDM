package com.fourthline.orca.internal;

import java.util.Objects;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes23.dex */
public final class f80 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f28379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28380b;

    public f80(j20 initialStateProvider) {
        Intrinsics.checkNotNullParameter(initialStateProvider, "initialStateProvider");
        this.f28379a = yhm.j.b(new ul1(initialStateProvider, 1));
        this.f28380b = "f80";
    }

    @Override // com.fourthline.orca.internal.mq0
    public MutableStateFlow a() {
        return (MutableStateFlow) this.f28379a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableStateFlow a(j20 j20Var) {
        return vkm.q.c(j20Var.getInitialState());
    }

    @Override // com.fourthline.orca.internal.mq0
    public ie1 b() {
        return (ie1) a().getValue();
    }

    @Override // com.fourthline.orca.internal.mq0
    public void a(Function1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        ie1 ie1Var = (ie1) a().getValue();
        ie1 ie1Var2 = (ie1) stateProvider.invoke(ie1Var);
        Objects.toString(ie1Var);
        Objects.toString(ie1Var2);
        if (Intrinsics.f(ie1Var, ie1Var2)) {
            return;
        }
        a().setValue(ie1Var2);
    }
}
