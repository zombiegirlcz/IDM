package ix0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ip0.ra0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class x implements g0 {

    @NotNull
    private static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra0 f169319a;

    public x(ra0 avatarBadgeProvider) {
        Intrinsics.checkNotNullParameter(avatarBadgeProvider, "avatarBadgeProvider");
        this.f169319a = avatarBadgeProvider;
    }

    @Override // ix0.g0
    public final f0 a(ViewGroup containerLayout) {
        Intrinsics.checkNotNullParameter(containerLayout, "containerLayout");
        View view = (View) this.f169319a.invoke();
        if (view != null) {
            if (view.getVisibility() != 0) {
                view = null;
            }
            if (view != null) {
                float width = view.getWidth() / 2.0f;
                float f = knm.b.f(view, containerLayout) + width;
                float fH = knm.b.h(view, containerLayout) + width;
                Context context = containerLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new f0(f, fH, kli.a.l(context, 8.0f) + width);
            }
        }
        return null;
    }
}
