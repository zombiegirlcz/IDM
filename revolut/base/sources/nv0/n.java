package nv0;

import aw0.kb;
import com.revolut.core.ui_kit.delegates.WalletWidgetDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import ip0.md;
import ip0.wk;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb f219379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f219380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimationRequest f219381c;
    public final TrackableItem d;
    public final md e;
    public final wk f;

    public n(kb content, Clause buttonTitle, AnimationRequest animationRequest, WalletWidgetDelegate.Model trackableItem, md onFooterClick, wk onStackClick) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(trackableItem, "trackableItem");
        Intrinsics.checkNotNullParameter(onFooterClick, "onFooterClick");
        Intrinsics.checkNotNullParameter(onStackClick, "onStackClick");
        this.f219379a = content;
        this.f219380b = buttonTitle;
        this.f219381c = animationRequest;
        this.d = trackableItem;
        this.e = onFooterClick;
        this.f = onStackClick;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f219379a.equals(nVar.f219379a) && this.f219380b.equals(nVar.f219380b) && Intrinsics.f(this.f219381c, nVar.f219381c) && Intrinsics.f(this.d, nVar.d) && this.e.equals(nVar.e) && this.f.equals(nVar.f);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f219379a.hashCode() * 31, 31, this.f219380b);
        AnimationRequest animationRequest = this.f219381c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iB + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31)) * 31)) * 31);
    }
}
