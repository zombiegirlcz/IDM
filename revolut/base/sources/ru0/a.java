package ru0;

import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoryPagesView f257394b;

    public /* synthetic */ a(StoryPagesView storyPagesView, int i) {
        this.f257393a = i;
        this.f257394b = storyPagesView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f257393a) {
            case 0:
                return StoryPagesView.j0(this.f257394b, ((Integer) obj2).intValue());
            default:
                return StoryPagesView.h0(this.f257394b);
        }
    }
}
