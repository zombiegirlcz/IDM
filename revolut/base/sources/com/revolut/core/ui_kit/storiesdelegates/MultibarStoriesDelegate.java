package com.revolut.core.ui_kit.storiesdelegates;

import akg.d;
import android.content.Context;
import android.view.ViewGroup;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import buf.u;
import bx0.d0;
import bx0.p;
import com.revolut.core.ui_kit.R$layout;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.b;
import zhm.w;
import zt0.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/MultibarStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/MultibarStoriesModel;", "Lbx0/p;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultibarStoriesDelegate extends BaseStoriesDelegate<MultibarStoriesModel, p> {
    public MultibarStoriesDelegate() {
        super(R$layout.internal_multibar_stories_card, new d(12));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new p(s.r(parent, R$layout.internal_multibar_stories_card));
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate
    public final void s(bx0.d dVar, j jVar, List payloads) {
        zt0.d dVar2;
        p pVar;
        int alphaComponent;
        p holder = (p) dVar;
        MultibarStoriesModel data = (MultibarStoriesModel) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        b.e(this, data.getE(), holder.N(), null, 12);
        b.e(this, data.getF(), holder.M(), null, 12);
        b.g(this, data.getF58228r(), holder.I(), new u(this, data, 7));
        BaseStoriesDelegate.p(holder.N(), data.getF58243s().f58277a);
        BaseStoriesDelegate.p(holder.M(), data.getF58243s().f58278b);
        p pVar2 = holder;
        q(data.getO(), holder.H(), holder.K(), holder.O(), false, false, data.getF58220g(), data.getF58221h(), data.getI(), data.getF58222j(), data.getK(), data.getF58223l(), data.getF58224m(), data.getF58225n(), data);
        List<bx0.a> listE = data.e();
        ArrayList arrayList = new ArrayList(w.t(listE, 10));
        for (bx0.a aVar : listE) {
            if (aVar.c()) {
                pVar = pVar2;
                Context context = pVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                alphaComponent = kli.a.s(data.getF58243s().f58281h, context);
            } else {
                pVar = pVar2;
                Context context2 = pVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                alphaComponent = ColorUtils.setAlphaComponent(kli.a.s(data.getF58243s().f58281h, context2), 128);
            }
            String strA = aVar.a();
            List listC = zhm.u.c(new zt0.a(aVar.b(), alphaComponent));
            Context context3 = pVar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            arrayList.add(new c(strA, listC, kli.a.s(data.getF58243s().f58282j, context3)));
            pVar2 = pVar;
        }
        p pVar3 = pVar2;
        d0 f58227q = data.getF58227q();
        if (f58227q != null) {
            float fC = f58227q.c();
            String strA2 = f58227q.a();
            Context context4 = pVar3.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int iS = kli.a.s(data.getF58243s().f58281h, context4);
            int iB = f58227q.b();
            Context context5 = pVar3.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            dVar2 = new zt0.d(strA2, iS, fC, iB, kli.a.s(data.getF58243s().f58281h, context5));
        } else {
            dVar2 = null;
        }
        pVar3.J().setItems(arrayList);
        pVar3.J().setTooltip(dVar2);
    }
}
