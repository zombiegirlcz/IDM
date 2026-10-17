package lp0;

import com.revolut.core.ui_kit_resources.R$attr;
import fp0.j;
import fp0.m;
import fp0.p;
import gp0.f;
import gp0.h;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import qr0.d;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends koi.b {
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f198904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "tileView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        u.v(R$attr.uikit_dp16, itemView);
        m mVar = p.Companion;
        h hVar = new h(new f(gp0.c.FOREGROUND, 2), j.f137025a);
        mVar.getClass();
        this.f198904g = m.a(itemView, hVar);
    }
}
