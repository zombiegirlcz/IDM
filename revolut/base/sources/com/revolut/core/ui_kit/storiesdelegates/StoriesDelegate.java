package com.revolut.core.ui_kit.storiesdelegates;

import akg.d;
import an0.e;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bx0.x;
import bx0.y;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ihm.f;
import java.util.List;
import koi.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import v60.i;
import zhm.c0;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel;", "Lbx0/x;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoriesDelegate extends BaseRecyclerViewDelegate<StoriesDelegateModel, x> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f58259c;
    public Function1 d;
    public final f e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f58260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f58261h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f58262j;
    public final f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f58263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f58264m;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.storiesdelegates.StoriesDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public StoriesDelegate() {
        super(R$layout.internal_meta_stories_card, new d(15));
        this.f58259c = f0.f322471a;
        this.d = new e(7);
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f58260g = v0.a.d("create(...)");
        this.f58261h = v0.a.d("create(...)");
        this.i = new i();
        this.f58262j = new i();
        this.k = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new x(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final void n(RecyclerView.ViewHolder viewHolder) {
        x holder = (x) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.F(this.f58263l, this.f58264m);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void n(b bVar) {
        x holder = (x) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.F(this.f58263l, this.f58264m);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(x holder, StoriesDelegateModel data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            StoryPagesView storyPagesView = holder.f;
            storyPagesView.setStoryDelegates(this.f58259c);
            if (data instanceof StoriesDelegateModel.Content) {
                StoriesDelegateModel.Content content = (StoriesDelegateModel.Content) data;
                StoryPagesView.setStoryPages$default(holder.f, content.d, content.f58266b, null, content.e, content.f, 4, null);
                storyPagesView.setState(ru0.f.CONTENT);
            } else if (data instanceof StoriesDelegateModel.Loading) {
                StoriesDelegateModel.Loading loading = (StoriesDelegateModel.Loading) data;
                StoryPagesView.setStoryPages$default(holder.f, loading.getE(), loading.getF58266b(), null, 0, false, 4, null);
                storyPagesView.setState(ru0.f.LOADING);
            } else {
                if (!(data instanceof StoriesDelegateModel.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                StoriesDelegateModel.Error error = (StoriesDelegateModel.Error) data;
                StoryPagesView.setStoryPages$default(holder.f, error.getE(), error.getF58266b(), null, 0, false, 4, null);
                storyPagesView.setState(ru0.f.ERROR);
            }
            storyPagesView.setCloseIconVisible(data.getF58275c());
            storyPagesView.setPageNavigationListener(this.d);
            final int i2 = 0;
            storyPagesView.setButtonClickListener(new Function1(this) { // from class: bx0.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StoriesDelegate f19470b;

                {
                    this.f19470b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    BaseStoriesModel model = (BaseStoriesModel) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f.onNext(model);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58260g.onNext(model);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58261h.onNext(model);
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.k.onNext(model);
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.i.onNext(model);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58262j.onNext(model);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            final int i3 = 1;
            storyPagesView.setSecondaryButtonClickListener(new Function1(this) { // from class: bx0.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StoriesDelegate f19470b;

                {
                    this.f19470b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    BaseStoriesModel model = (BaseStoriesModel) obj2;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f.onNext(model);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58260g.onNext(model);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58261h.onNext(model);
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.k.onNext(model);
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.i.onNext(model);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58262j.onNext(model);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            final int i5 = 2;
            storyPagesView.setLinkClickListener(new Function1(this) { // from class: bx0.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StoriesDelegate f19470b;

                {
                    this.f19470b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    BaseStoriesModel model = (BaseStoriesModel) obj2;
                    switch (i5) {
                        case 0:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f.onNext(model);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58260g.onNext(model);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58261h.onNext(model);
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.k.onNext(model);
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.i.onNext(model);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58262j.onNext(model);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            final int i6 = 3;
            storyPagesView.setBottomSwipeListener(new Function1(this) { // from class: bx0.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StoriesDelegate f19470b;

                {
                    this.f19470b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    BaseStoriesModel model = (BaseStoriesModel) obj2;
                    switch (i6) {
                        case 0:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f.onNext(model);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58260g.onNext(model);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58261h.onNext(model);
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.k.onNext(model);
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.i.onNext(model);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58262j.onNext(model);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            storyPagesView.setCloseClickListener(new androidx.lifecycle.b(this, 8));
            final int i21 = 4;
            storyPagesView.setPageShownListener(new Function1(this) { // from class: bx0.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StoriesDelegate f19470b;

                {
                    this.f19470b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    BaseStoriesModel model = (BaseStoriesModel) obj2;
                    switch (i21) {
                        case 0:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f.onNext(model);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58260g.onNext(model);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58261h.onNext(model);
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.k.onNext(model);
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.i.onNext(model);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58262j.onNext(model);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            final int i22 = 5;
            storyPagesView.setPageCompletedListener(new Function1(this) { // from class: bx0.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StoriesDelegate f19470b;

                {
                    this.f19470b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    BaseStoriesModel model = (BaseStoriesModel) obj2;
                    switch (i22) {
                        case 0:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f.onNext(model);
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58260g.onNext(model);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58261h.onNext(model);
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.k.onNext(model);
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.i.onNext(model);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(model, "model");
                            this.f19470b.f58262j.onNext(model);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            storyPagesView.setStoryPos(i);
            INSTANCE.getClass();
            storyPagesView.setTag("PAGE_TAG" + i);
        } else {
            for (y yVar : c0.N(payloads, y.class)) {
                if (yVar.a()) {
                    holder.f.setCloseIconVisible(data.getF58275c());
                }
                if (yVar.c()) {
                    holder.f.setTitle(data.getF58266b());
                }
                if (yVar.b()) {
                    holder.f.setStories(data.getE());
                }
            }
        }
        holder.F(this.f58263l, this.f58264m);
    }
}
