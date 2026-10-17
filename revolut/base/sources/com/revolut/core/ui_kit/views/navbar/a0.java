package com.revolut.core.ui_kit.views.navbar;

import android.view.View;
import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import tx0.a4;
import tx0.z3;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseRecyclerViewDelegate f59512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59513c;

    public /* synthetic */ a0(BaseRecyclerViewDelegate baseRecyclerViewDelegate, Object obj2, int i) {
        this.f59511a = i;
        this.f59512b = baseRecyclerViewDelegate;
        this.f59513c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f59511a) {
            case 0:
                StoryNavBarContentView.RegularStoryPageDelegate regularStoryPageDelegate = (StoryNavBarContentView.RegularStoryPageDelegate) this.f59512b;
                regularStoryPageDelegate.f59487c.onNext((z) this.f59513c);
                break;
            case 1:
                StoryNavBarContentView.RegularStoryPageDelegate regularStoryPageDelegate2 = (StoryNavBarContentView.RegularStoryPageDelegate) this.f59512b;
                regularStoryPageDelegate2.d.onNext((z) this.f59513c);
                break;
            default:
                ((ObjectCarouselNavBarContentView.ImageDelegate) this.f59512b).f59432c.onNext(new z3(((a4) this.f59513c).getBindingAdapterPosition()));
                break;
        }
    }
}
