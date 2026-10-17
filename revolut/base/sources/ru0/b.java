package ru0;

import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoryPagesView f257396b;

    public /* synthetic */ b(StoryPagesView storyPagesView, int i) {
        this.f257395a = i;
        this.f257396b = storyPagesView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f257395a) {
            case 0:
                return StoryPagesView.i0(this.f257396b);
            default:
                return Integer.valueOf(StoryPagesView.l0(this.f257396b));
        }
    }
}
