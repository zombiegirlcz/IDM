package ru0;

import bx0.b0;
import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import jv0.o;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f257397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.c f257398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StoryPagesView f257399c;

    public /* synthetic */ c(b0 b0Var, yf.c cVar, StoryPagesView storyPagesView) {
        this.f257397a = b0Var;
        this.f257398b = cVar;
        this.f257399c = storyPagesView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return StoryPagesView.g0(this.f257397a, this.f257398b, this.f257399c, (o) obj2);
    }
}
