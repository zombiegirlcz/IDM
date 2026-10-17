package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p5 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f31849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq0 f31850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f31851c;

    public p5(fe1 viewNavigator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        this.f31849a = viewNavigator;
        this.f31850b = q5.f32200a;
        this.f31851c = yhm.j.b(new wp1(22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.d e() {
        c81.a aVar = c81.f27404a;
        return new zp0.d(false, c81.a.a(aVar, R.string.shared_dialog_action_continue_to_browser_title, 0, 2, null), c81.a.a(aVar, R.string.shared_dialog_action_continue_to_browser_message, 0, 2, null), new kd1.d(c81.a.a(aVar, R.string.shared_button_continue_to_browser, 0, 2, null)), new kd1.a(null, 1, null), 1, null);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f31850b;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f31849a.b(o5.f31577a.b());
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f31851c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }
}
