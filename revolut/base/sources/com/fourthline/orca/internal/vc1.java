package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f34301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f34302b;

    public vc1(Function0 useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f34301a = useCase;
    }

    public boolean a(boolean z) {
        Boolean bool = this.f34302b;
        if (!z && bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = (Boolean) this.f34301a.invoke();
        bool2.getClass();
        this.f34302b = bool2;
        return bool2.booleanValue();
    }
}
