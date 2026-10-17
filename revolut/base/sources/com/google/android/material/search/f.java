package com.google.android.material.search;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f49117b;

    public /* synthetic */ f(SearchView searchView, int i) {
        this.f49116a = i;
        this.f49117b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f49116a) {
            case 0:
                this.f49117b.lambda$setUpBackButton$1(view);
                break;
            case 1:
                this.f49117b.lambda$setUpClearButton$2(view);
                break;
            default:
                this.f49117b.lambda$setupWithSearchBar$7(view);
                break;
        }
    }
}
