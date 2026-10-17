package com.revolut.core.ui_kit.storiesdelegates;

import akg.d;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import buf.u;
import bx0.s;
import com.revolut.core.ui_kit.R$layout;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/SimpleStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/SimpleStoriesModel;", "Lbx0/s;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleStoriesDelegate extends BaseStoriesDelegate<SimpleStoriesModel, s> {
    public SimpleStoriesDelegate() {
        super(R$layout.internal_simple_stories_card, new d(13));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new s(kotlin.jvm.internal.s.r(parent, R$layout.internal_simple_stories_card));
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate
    public final void s(bx0.d dVar, j jVar, List payloads) {
        s holder = (s) dVar;
        SimpleStoriesModel data = (SimpleStoriesModel) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        b.e(this, data.getF58232b(), holder.M(), null, 12);
        b.e(this, data.getF58233c(), holder.K(), null, 12);
        b.g(this, data.getF58242r(), holder.I(), new u(this, data, 8));
        BaseStoriesDelegate.p(holder.M(), data.getF58243s().f58277a);
        BaseStoriesDelegate.p(holder.K(), data.getF58243s().f58278b);
        q(data.getF58240p(), holder.H(), holder.J(), holder.N(), true, data.getI(), data.getE(), data.getF(), data.getF58234g(), data.getF58235h(), data.getF58236j(), data.getK(), data.getF58237l(), data.getF58238m(), data);
    }
}
