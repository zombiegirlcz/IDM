package com.revolut.core.ui_kit.storiesdelegates;

import akg.d;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import buf.u;
import bx0.f;
import com.revolut.core.ui_kit.R$layout;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/CircleProgressStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/CircleProgressStoriesModel;", "Lbx0/f;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleProgressStoriesDelegate extends BaseStoriesDelegate<CircleProgressStoriesModel, f> {
    public CircleProgressStoriesDelegate() {
        super(R$layout.internal_circle_progress_stories_card, new d(7));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f(s.r(parent, R$layout.internal_circle_progress_stories_card));
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate
    public final void s(bx0.d dVar, j jVar, List payloads) {
        f holder = (f) dVar;
        CircleProgressStoriesModel data = (CircleProgressStoriesModel) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        b.e(this, data.e, holder.N(), null, 12);
        b.e(this, data.f, holder.M(), null, 12);
        b.g(this, data.f58189r, holder.I(), new u(this, data, 6));
        TextView textViewN = holder.N();
        StoryColours storyColours = data.f58191t;
        BaseStoriesDelegate.p(textViewN, storyColours.f58277a);
        BaseStoriesDelegate.p(holder.M(), storyColours.f58278b);
        q(data.o, holder.H(), holder.K(), holder.O(), false, false, data.f58181g, data.f58182h, data.i, data.f58183j, data.k, data.f58184l, data.f58185m, data.f58186n, data);
        holder.J().setLabel(data.f58188q);
        holder.J().setProgress(data.f58187p);
        holder.J().setProgressColour(storyColours.e);
        holder.J().setTextColour(storyColours.f58282j);
        holder.J().setProgressBaseColour(storyColours.d);
    }
}
