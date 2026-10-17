package ax0;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yw0.o;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.f f10837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagView f10838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f10839c;
    public final UIKitTextView d;
    public final List e;
    public final ProgressPagingIndicatorView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f10840g;

    public h(yw0.f parent, TagView badgeView, UIKitTextView titleView, UIKitTextView descriptionView) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(badgeView, "badgeView");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(descriptionView, "descriptionView");
        this.f10837a = parent;
        this.f10838b = badgeView;
        this.f10839c = titleView;
        this.d = descriptionView;
        this.e = v.k(titleView, descriptionView);
        this.f = parent.getProgressView();
    }

    @Override // ax0.l
    public final List b() {
        return this.e;
    }

    @Override // ax0.l
    public final void d(Context context) {
        yw0.e eVar;
        o oVar = this.f10840g;
        if (oVar == null || (eVar = oVar.f317287h) == null) {
            return;
        }
        if (context == null) {
            context = this.f10837a.getHostView().getContext();
        }
        Intrinsics.h(context);
        this.f10838b.setContent(m.d(eVar, context));
    }

    @Override // ax0.l
    public final k getParent() {
        return this.f10837a;
    }

    @Override // ax0.l
    public final void recycle() {
        TagView tagView = this.f10838b;
        yw0.f fVar = this.f10837a;
        fVar.n0(tagView);
        fVar.n0(this.f10839c);
        fVar.n0(this.d);
    }
}
