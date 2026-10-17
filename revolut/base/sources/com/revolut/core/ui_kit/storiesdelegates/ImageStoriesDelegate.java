package com.revolut.core.ui_kit.storiesdelegates;

import akg.d;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bmm.t;
import bx0.h;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.b;
import or0.u;
import yy0.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/ImageStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/ImageStoriesModel;", "Lbx0/h;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageStoriesDelegate extends BaseStoriesDelegate<ImageStoriesModel, h> {
    public ImageStoriesDelegate() {
        super(R$layout.internal_image_stories_card, new d(9));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new h(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate
    public final void s(bx0.d dVar, j jVar, List payloads) {
        h holder = (h) dVar;
        ImageStoriesModel data = (ImageStoriesModel) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        b.e(this, data.d, holder.i, null, 12);
        Clause clause = data.e;
        TextView textView = holder.f19413j;
        b.e(this, clause, textView, null, 12);
        b.g(this, data.f58205q, holder.o, new t(this, data, 3));
        TextView textView2 = holder.i;
        StoryColours storyColours = data.f58206r;
        BaseStoriesDelegate.p(textView2, storyColours.f58277a);
        BaseStoriesDelegate.p(textView, storyColours.f58278b);
        q(data.o, holder.k, holder.f19414l, holder.f19415m, false, false, data.f58198g, data.f58199h, data.i, data.f58200j, data.k, data.f58201l, data.f58202m, data.f58203n, data);
        f.e(u.k(holder.f19416n).Q(), data.f58204p, holder.f19416n, null, null, 12);
    }
}
