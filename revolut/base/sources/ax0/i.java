package ax0;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yw0.q;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.f f10841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagView f10842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f10843c;
    public final UIKitTextView d;
    public final List e;
    public final ActionFooterView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressPagingIndicatorView f10844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f10845h;

    public i(yw0.f parent, TagView badgeView, UIKitTextView titleView, UIKitTextView descriptionView) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(badgeView, "badgeView");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(descriptionView, "descriptionView");
        this.f10841a = parent;
        this.f10842b = badgeView;
        this.f10843c = titleView;
        this.d = descriptionView;
        this.e = v.k(titleView, descriptionView);
        this.f = parent.getActionFooterView();
        this.f10844g = parent.getProgressView();
    }

    @Override // ax0.l
    public final List b() {
        return this.e;
    }

    @Override // ax0.l
    public final void d(Context context) {
        yw0.e eVar;
        q qVar = this.f10845h;
        if (qVar == null || (eVar = qVar.f317292h) == null) {
            return;
        }
        if (context == null) {
            context = this.f10841a.getHostView().getContext();
        }
        Intrinsics.h(context);
        this.f10842b.setContent(m.d(eVar, context));
    }

    @Override // ax0.l
    public final k getParent() {
        return this.f10841a;
    }

    @Override // ax0.l
    public final void recycle() {
        TagView tagView = this.f10842b;
        yw0.f fVar = this.f10841a;
        fVar.n0(tagView);
        fVar.n0(this.f10843c);
        fVar.n0(this.d);
    }
}
