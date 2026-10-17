package com.revolut.core.ui_kit.internal.views.reactionskeyboard;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardCategoryFragment;
import com.revolut.core.ui_kit.models.Clause;
import ihm.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lu0.d;
import lu0.t;
import r9i.e;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f57506b;
    public t f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f57506b = v0.a.d("create(...)");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List list;
        t tVar = this.f;
        if (tVar == null || (list = tVar.f200009b) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public final Fragment getItem(int i) {
        t tVar = this.f;
        if (tVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String typeId = tVar.f200008a;
        List list = tVar.f200009b;
        Clause errorMessage = tVar.e;
        Clause errorAction = tVar.f;
        ReactionsKeyboardCategoryFragment.Companion aVar = ReactionsKeyboardCategoryFragment.INSTANCE;
        String categoryId = (String) list.get(i);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorAction, "errorAction");
        ReactionsKeyboardCategoryFragment reactionsKeyboardCategoryFragment = new ReactionsKeyboardCategoryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_TYPE_ID", typeId);
        bundle.putString("ARG_CATEGORY_ID", categoryId);
        bundle.putParcelable("ARG_ERROR_MESSAGE", errorMessage);
        bundle.putParcelable("ARG_ERROR_ACTION", errorAction);
        reactionsKeyboardCategoryFragment.setArguments(bundle);
        return reactionsKeyboardCategoryFragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj2) {
        Intrinsics.checkNotNullParameter(obj2, "obj");
        return -2;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup container, int i) {
        Intrinsics.checkNotNullParameter(container, "container");
        t tVar = this.f;
        if (tVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        e viewModel = tVar.f200010c;
        RecyclerView.OnScrollListener recyclerScrollListener = tVar.d;
        Object objInstantiateItem = super.instantiateItem(container, i);
        Intrinsics.i(objInstantiateItem, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardCategoryFragment");
        ReactionsKeyboardCategoryFragment reactionsKeyboardCategoryFragment = (ReactionsKeyboardCategoryFragment) objInstantiateItem;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        f itemClickSubject = this.f57506b;
        Intrinsics.checkNotNullParameter(itemClickSubject, "itemClickSubject");
        Intrinsics.checkNotNullParameter(recyclerScrollListener, "recyclerScrollListener");
        reactionsKeyboardCategoryFragment.f57487n0 = new d(viewModel, itemClickSubject, recyclerScrollListener);
        if (reactionsKeyboardCategoryFragment.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            reactionsKeyboardCategoryFragment.d(viewModel);
            reactionsKeyboardCategoryFragment.z().addOnScrollListener(recyclerScrollListener);
        }
        return reactionsKeyboardCategoryFragment;
    }
}
