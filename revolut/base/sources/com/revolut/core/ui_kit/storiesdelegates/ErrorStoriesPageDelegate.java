package com.revolut.core.ui_kit.storiesdelegates;

import akg.d;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bq7.j;
import bs9.i0;
import bx0.g;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.l6;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ms0.h4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/ErrorStoriesPageDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/ErrorStoriesModel;", "Lbx0/g;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ErrorStoriesPageDelegate extends BaseStoriesDelegate<ErrorStoriesModel, g> {
    public final f i;

    public ErrorStoriesPageDelegate() {
        super(R$layout.internal_error_stories_page, new d(8));
        this.i = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        g gVar = new g(s.r(parent, this.f98535a));
        gVar.H().g0().subscribe(new i0(14, new j(this, 23)));
        return gVar;
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate
    public final void s(bx0.d dVar, koi.j jVar, List payloads) {
        g holder = (g) dVar;
        ErrorStoriesModel data = (ErrorStoriesModel) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        holder.H().setTitleText(data.f58194c);
        holder.H().setMainAction(new l6(12, data.d, null, h4.ACCENT));
    }
}
