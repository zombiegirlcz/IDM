package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.revolut.utils.ui.glide.CustomGlideModule;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomGlideModule f26064a = new CustomGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
        }
    }

    @Override // s8.a
    public final void F() {
        this.f26064a.getClass();
    }

    @Override // s8.a
    public final void G() {
        this.f26064a.getClass();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final HashSet H() {
        HashSet hashSet = new HashSet();
        hashSet.add(OkHttpGlideModule.class);
        hashSet.add(b8.a.class);
        return hashSet;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final qf.b I() {
        return new qf.b(2);
    }

    @Override // com.bumptech.glide.c
    public final void y(Context context, b bVar, Registry registry) {
        this.f26064a.y(context, bVar, registry);
    }
}
