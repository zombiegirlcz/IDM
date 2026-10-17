package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes16.dex */
final class zbw implements LoaderManager.LoaderCallbacks {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f37534zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.f37534zba = signInHubActivity;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.f37534zba, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj2) {
        SignInHubActivity signInHubActivity = this.f37534zba;
        signInHubActivity.setResult(signInHubActivity.f37514zbe, signInHubActivity.f37515zbf);
        this.f37534zba.finish();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(Loader loader) {
    }
}
