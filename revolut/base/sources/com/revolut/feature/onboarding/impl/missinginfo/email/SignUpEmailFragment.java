package com.revolut.feature.onboarding.impl.missinginfo.email;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au0.a2;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.onboarding.impl.R$id;
import com.revolut.feature.onboarding.impl.R$layout;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import ea9.e;
import j90.c;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import o89.b;
import p.a;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/missinginfo/email/SignUpEmailFragment;", "Lcom/revolut/retail/core/mvp/BaseMvpFragment;", "Lea9/e;", "Lo89/b;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignUpEmailFragment extends BaseMvpFragment<e, b> implements b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f78303e0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final c f78304b0 = u1.x(this, R$id.email_edit);
    public final c c0 = u1.x(this, R$id.main_title);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final c f78305d0 = u1.x(this, R$id.main_subtitletitle);

    static {
        h0 h0Var = new h0(SignUpEmailFragment.class, "emailEdit", "getEmailEdit()Lcom/revolut/core/ui_kit/views/input/InputText;", 0);
        p0 p0Var = o0.f186429a;
        f78303e0 = new KProperty[]{p0Var.j(h0Var), a.y(SignUpEmailFragment.class, "mainTitle", "getMainTitle()Landroid/widget/TextView;", 0, p0Var), a.y(SignUpEmailFragment.class, "mainSubtitleTitle", "getMainSubtitleTitle()Landroid/widget/TextView;", 0, p0Var)};
    }

    public final InputText D() {
        return (InputText) this.f78304b0.getValue(this, f78303e0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_sign_up_email, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InputText inputTextD = D();
        InputText.Companion companion = InputText.INSTANCE;
        inputTextD.C0(false);
        kli.c.d(D(), 300L);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        InputText inputTextD = D();
        inputTextD.setInputType(524321);
        inputTextD.setSingleLine(true);
        inputTextD.setInputFilters(u.c(new InputFilter.LengthFilter(50)));
        inputTextD.setTextIsImportantForAutofill(1);
        inputTextD.setTextAutofillHints("emailAddress");
        inputTextD.r0(new a2(this, 2));
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        return (e) ((ca9.c) ((ca9.e) l.q(this))).z.get();
    }
}
