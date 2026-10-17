package jq0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import et0.z;
import kotlin.jvm.internal.Intrinsics;
import kp0.u;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends hoi.j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z f177390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f177391r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q() {
        super(hx7.i.p(), 6);
        hoi.c.Companion.getClass();
        setSupportsChangeAnimations(false);
    }

    @Override // hoi.c, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateAdd(RecyclerView.ViewHolder holder) {
        xo0.d dVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        z zVar = this.f177390q;
        if (zVar != null) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (zVar.o == null && (dVar = zVar.f129157m) != null && (holder instanceof u)) {
                u uVar = (u) holder;
                koi.j jVar = uVar.e;
                ChatBubbleDelegate.Model model = jVar instanceof ChatBubbleDelegate.Model ? (ChatBubbleDelegate.Model) jVar : null;
                if (model != null && (model.f53831x instanceof gw0.j) && model.f53817b == null && model.d == null && model.f53822l == null && model.f53819g == null && model.i == null && model.e != null && Intrinsics.f(model.f53816a, dVar.f307542a)) {
                    zVar.o = uVar;
                    if (zVar.f129157m != null) {
                        dispatchAddFinished(holder);
                        return false;
                    }
                }
            }
        }
        super.animateAdd(holder);
        return true;
    }

    @Override // hoi.c, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void runPendingAnimations() {
        if (!this.f177391r) {
            super.runPendingAnimations();
            return;
        }
        this.f177391r = false;
        long changeDuration = getChangeDuration();
        long addDuration = getAddDuration();
        long removeDuration = getRemoveDuration();
        long moveDuration = getMoveDuration();
        this.f154305c = true;
        setSupportsChangeAnimations(true);
        this.f154304b = true;
        setChangeDuration(250L);
        setRemoveDuration(250L);
        setAddDuration(250L);
        setMoveDuration(250L);
        super.runPendingAnimations();
        this.f154305c = false;
        setSupportsChangeAnimations(false);
        this.f154304b = false;
        setChangeDuration(changeDuration);
        setRemoveDuration(removeDuration);
        setAddDuration(addDuration);
        setMoveDuration(moveDuration);
    }
}
