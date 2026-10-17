package com.revolut.core.ui_kit.delegates;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ThemeSwitcherRoundedDelegate;
import com.revolut.core.ui_kit.delegates.ThemeSwitcherRoundedDelegate.ItemDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class di extends koi.b {
    public final ThemeSwitcherRoundedDelegate.ItemDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z4l.j f54055g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(ThemeSwitcherRoundedDelegate themeSwitcherRoundedDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        RecyclerView recyclerView = (RecyclerView) itemView.findViewById(R$id.themeSwitcherRounded_recyclerView);
        ThemeSwitcherRoundedDelegate.ItemDelegate itemDelegate = themeSwitcherRoundedDelegate.new ItemDelegate();
        this.f = itemDelegate;
        z4l.j jVar = new z4l.j(7, zhm.u.c(itemDelegate), false);
        this.f54055g = jVar;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new GridLayoutManager(itemView.getContext(), 3, 1, false));
        recyclerView.addItemDecoration(new tw0.b(0, com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 18.0f), (Integer) 3));
    }
}
