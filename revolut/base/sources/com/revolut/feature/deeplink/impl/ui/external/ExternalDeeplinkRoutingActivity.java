package com.revolut.feature.deeplink.impl.ui.external;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bumptech.glide.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import org.jetbrains.annotations.NotNull;
import pri.e;
import u2l.a;
import v06.f;
import w06.b;
import xoi.d;
import yhm.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/deeplink/impl/ui/external/ExternalDeeplinkRoutingActivity;", "Lu2l/a;", "Lv06/e;", "Lv06/f;", "Lno/d1;", "Lwri/a;", "<init>", "()V", "Companion", "a", "feature_retail_deeplink_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalDeeplinkRoutingActivity extends a implements f, d1, wri.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f71631t0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f71630s0 = "EXTERNAL_DEEPLINK_ROUTING_FLOW";
    public final Lazy u0 = j.b(new ur2.a(this, 11));

    /* JADX INFO: renamed from: com.revolut.feature.deeplink.impl.ui.external.ExternalDeeplinkRoutingActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    @Override // nri.b
    public final e F0() {
        b bVar = this.f71631t0;
        if (bVar != null) {
            return (v06.e) bVar.f293649n.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF81394t0() {
        return this.f71630s0;
    }

    @Override // u2l.a
    public final w2l.a Z0() {
        b bVar = this.f71631t0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // u2l.a
    public final int c1() {
        return 0;
    }

    @Override // u2l.a, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Uri data;
        w06.a aVar = ((w06.a) c.l(this).b(null, this.f71630s0)).o;
        d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R.id.content));
        Intent intent = getIntent();
        String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        Intent intent2 = getIntent();
        String action = intent2 != null ? intent2.getAction() : null;
        Intent intent3 = getIntent();
        String string2 = (intent3 == null || (extras = intent3.getExtras()) == null) ? null : extras.getString("EXTRA_NOTIFICATION_TAG");
        Intent intent4 = getIntent();
        this.f71631t0 = new b(aVar, dVarG, new v06.d(intent4 != null ? Integer.valueOf(intent4.getFlags()) : null, string, action, string2));
        super.onCreate(bundle);
    }
}
