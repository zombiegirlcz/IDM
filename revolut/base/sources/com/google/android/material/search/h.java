package com.google.android.material.search;

import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class h implements OnApplyWindowInsetsListener, CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49122c;

    public /* synthetic */ h(Object obj2, int i, int i2) {
        this.f49122c = obj2;
        this.f49120a = i;
        this.f49121b = i2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((DefaultSurfaceProcessor) this.f49122c).lambda$snapshot$8(this.f49120a, this.f49121b, completer);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return SearchView.lambda$setUpDividerInsetListener$6((ViewGroup.MarginLayoutParams) this.f49122c, this.f49120a, this.f49121b, view, windowInsetsCompat);
    }
}
