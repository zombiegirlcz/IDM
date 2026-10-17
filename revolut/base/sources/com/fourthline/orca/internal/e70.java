package com.fourthline.orca.internal;

import com.fourthline.orca.internal.b70;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e70 implements j20, fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p70 f28009a;

    public e70(p70 locationIntroLottieSource) {
        Intrinsics.checkNotNullParameter(locationIntroLottieSource, "locationIntroLottieSource");
        this.f28009a = locationIntroLottieSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b70 a(boolean z, b70 b70Var) {
        Intrinsics.checkNotNullParameter(b70Var, "<this>");
        boolean z3 = !z;
        return b70.a(b70Var, null, null, null, null, b70Var.o().a(b70Var.o().a().a(z ? c81.a.a(c81.f27404a, R.string.shared_button_verifying, 0, 2, null) : c81.a.a(c81.f27404a, R.string.shared_button_continue, 0, 2, null), z3, z)), b70Var.p().a(z3), null, 79, null);
    }

    @Override // com.fourthline.orca.internal.fr0
    public Function1 d(boolean z) {
        return new rk1(z, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b70 getInitialState() {
        c81.a aVar = c81.f27404a;
        return new b70(c81.a.a(aVar, R.string.step_metadata_header, 0, 2, null), c81.a.a(aVar, R.string.step_metadata_title, 0, 2, null), c81.a.a(aVar, R.string.step_metadata_message, 0, 2, null), this.f28009a, new m80.b(true, false), new m80.a.b(null, 1, 0 == true ? 1 : 0), b70.a.f27025a);
    }

    public final Function1 s() {
        return new bi1(19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b70 a(b70 b70Var) {
        Intrinsics.checkNotNullParameter(b70Var, "<this>");
        return b70.a(b70Var, null, null, null, null, b70Var.o().a(b70Var.o().a().a(c81.a.a(c81.f27404a, R.string.shared_button_verifying, 0, 2, null), false, true)), b70Var.p().a(true), null, 79, null);
    }
}
