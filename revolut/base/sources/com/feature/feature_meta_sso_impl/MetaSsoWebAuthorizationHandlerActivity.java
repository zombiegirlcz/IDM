package com.feature.feature_meta_sso_impl;

import aa.g;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import phm.a;
import rd0.c;
import rd0.d;
import ue0.e;
import zhm.h0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/feature/feature_meta_sso_impl/MetaSsoWebAuthorizationHandlerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "aa/g", "feature_meta_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MetaSsoWebAuthorizationHandlerActivity extends AppCompatActivity {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f26215a0;

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.f26215a0 = savedInstanceState.getBoolean("KEY_AUTHORIZATION_STARTED");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (getIntent().getData() != null) {
            t(getIntent().getData());
            return;
        }
        if (this.f26215a0) {
            t(null);
            return;
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_KEY_AUTH_URL");
        if (stringExtra == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, "MetaSsoWebAuthorizationHandler", "Auth url is missing", null, h0Var);
            t(null);
            return;
        }
        try {
            new CustomTabsIntent.Builder().build().launchUrl(this, Uri.parse(stringExtra));
            this.f26215a0 = true;
        } catch (ActivityNotFoundException unused) {
            t(null);
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("KEY_AUTHORIZATION_STARTED", this.f26215a0);
    }

    public final void t(Uri uri2) {
        a aVar = (a) e.j(this).a().get(ba.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", ba.a.class, " is not found"));
        }
        aa.c cVar = (aa.c) ((ba.a) aVar2.b()).f13855c.get();
        cVar.getClass();
        String queryParameter = uri2 != null ? uri2.getQueryParameter("code") : null;
        String queryParameter2 = uri2 != null ? uri2.getQueryParameter("state") : null;
        Object objF = cVar.f2717a.f("STATE_UUID_KEY");
        String str = objF instanceof String ? (String) objF : null;
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        cVar.f2718b.k((queryParameter == null || queryParameter2 == null || !queryParameter2.equals(str)) ? aa.d.f2719a : new aa.e(queryParameter, queryParameter2));
        finish();
    }
}
