package com.revolut.feature.profile.impl.ui.details.emailverification.email;

import ana.b;
import ana.c;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.profile.impl.ui.details.emailverification.EmailVerificationActivity;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import frl.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import prk.o;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/emailverification/email/EmailScreenFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lana/b;", "Lana/c;", "<init>", "()V", "Companion", "a", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailScreenFragment extends BaseLayoutBuilderFragment<b, c> implements c {
    public final AnalyticsProduct.Retail f0;
    public final InputTextDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final j f81398h0;

    public EmailScreenFragment() {
        AnalyticsProduct.Companion aVar = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137507t;
        this.f0 = com.google.android.gms.internal.mlkit_vision_face.a.g(aVar, k9Var, k9Var);
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.g0 = inputTextDelegate;
        this.f81398h0 = new j(7, v.k(new HeaderDelegate(), inputTextDelegate), false);
    }

    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a(this.f81398h0, (DefaultItemAnimator) null, o.u(), 80.0f, 2);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.f0;
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        FragmentActivity activity = getActivity();
        EmailVerificationActivity emailVerificationActivity = activity instanceof EmailVerificationActivity ? (EmailVerificationActivity) activity : null;
        if (emailVerificationActivity == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(emailVerificationActivity, "<this>");
        return (b) ((zma.a) ((zma.c) ((fri.a) emailVerificationActivity.L0()))).B.get();
    }
}
