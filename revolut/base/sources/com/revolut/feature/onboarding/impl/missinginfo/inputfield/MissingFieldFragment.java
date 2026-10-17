package com.revolut.feature.onboarding.impl.missinginfo.inputfield;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au0.a2;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.onboarding.impl.R$id;
import com.revolut.feature.onboarding.impl.R$layout;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import j90.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import org.jetbrains.annotations.NotNull;
import p89.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/onboarding/impl/missinginfo/inputfield/MissingFieldFragment;", "Lcom/revolut/retail/core/mvp/BaseMvpFragment;", "", "Lp89/b;", "<init>", "()V", "Companion", "a", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MissingFieldFragment extends BaseMvpFragment<Object, b> implements b {

    @NotNull
    private static final a Companion;
    public static final /* synthetic */ KProperty[] g0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final c f78306b0 = u1.x(this, R$id.fragment_missing_code_input);
    public final c c0 = u1.x(this, R$id.fragment_missing_code_title);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final c f78307d0 = u1.x(this, R$id.fragment_missing_code_subtitle);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final c f78308e0 = u1.x(this, R$id.fragment_missing_code_link);
    public final ihm.b f0 = j6.a.h("create(...)");

    public static final class a {
        private a() {
        }
    }

    static {
        h0 h0Var = new h0(MissingFieldFragment.class, "missingCodeInput", "getMissingCodeInput()Lcom/revolut/core/ui_kit/views/input/InputText;", 0);
        p0 p0Var = o0.f186429a;
        g0 = new KProperty[]{p0Var.j(h0Var), p.a.y(MissingFieldFragment.class, "missingCodeTitle", "getMissingCodeTitle()Lcom/revolut/core_ui_custom_font/TypefaceTextView;", 0, p0Var), p.a.y(MissingFieldFragment.class, "missingCodeSubtitle", "getMissingCodeSubtitle()Lcom/revolut/core_ui_custom_font/TypefaceTextView;", 0, p0Var), p.a.y(MissingFieldFragment.class, "missingCodeLink", "getMissingCodeLink()Lcom/revolut/core_ui_custom_font/TypefaceTextView;", 0, p0Var)};
        Companion = new a();
    }

    public MissingFieldFragment() {
        new a2(this, 3);
    }

    public final InputText D() {
        return (InputText) this.f78306b0.getValue(this, g0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.fragment_missing_field, viewGroup, false);
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
        D().setSingleLine(true);
    }
}
