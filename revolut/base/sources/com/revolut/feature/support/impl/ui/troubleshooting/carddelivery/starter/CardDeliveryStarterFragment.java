package com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.starter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.support.impl.R$layout;
import com.revolut.retail.core.ui.activity.BaseDelegatesFragment;
import ewl.c;
import grl.k9;
import java.io.Serializable;
import jb3.l;
import jpc.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uee.a;
import uee.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/support/impl/ui/troubleshooting/carddelivery/starter/CardDeliveryStarterFragment;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesFragment;", "Luee/a;", "Luee/b;", "<init>", "()V", "Companion", "a", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDeliveryStarterFragment extends BaseDelegatesFragment<a, b> implements b {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f89445b0;
    public e c0;

    public CardDeliveryStarterFragment() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137496c;
        this.f89445b0 = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.f89445b0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        u41.a aVar = (u41.a) ((c) l.q(this));
        u41.b bVar = aVar.f276965c;
        u41.a aVar2 = aVar.d;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_CARD_ID") : null;
        Bundle arguments2 = getArguments();
        Serializable serializable = arguments2 != null ? arguments2.getSerializable("EXTRA_NEVER_RECEIVED_MODE") : null;
        uce.c cVar = serializable instanceof uce.c ? (uce.c) serializable : null;
        if (cVar == null) {
            cVar = uce.c.ALL_OPTIONS;
        }
        cVar.getClass();
        this.c0 = new e(bVar, aVar2, string, cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.fragment_card_delivery_starter, viewGroup, false);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        e eVar = this.c0;
        if (eVar != null) {
            return (a) ((e4m.e) eVar.d).get();
        }
        Intrinsics.r("fragmentComponent");
        throw null;
    }
}
