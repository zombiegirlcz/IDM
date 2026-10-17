package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class r5 implements d40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s30 f32632b;

    public r5(List paymentMethods, p70 introLottieSource) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(introLottieSource, "introLottieSource");
        this.f32631a = paymentMethods;
        c81.a aVar = c81.f27404a;
        this.f32632b = new s30("bav_intro", c81.a.a(aVar, R.string.step_bav_intro_header, 0, 2, null), c81.a.a(aVar, R.string.step_bav_intro_message, 0, 2, null), introLottieSource, new m80.b((paymentMethods.size() == 1 && ((t5) zhm.d0.b0(paymentMethods)).getName() == v6.f34254b) ? c81.a.a(aVar, R.string.shared_button_continue_to_browser, 0, 2, null) : c81.a.a(aVar, R.string.shared_button_continue, 0, 2, null)), new m80.a.b(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.d40
    public /* bridge */ Function1 a(boolean z) {
        return super.a(z);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s30 getInitialState() {
        return this.f32632b;
    }
}
