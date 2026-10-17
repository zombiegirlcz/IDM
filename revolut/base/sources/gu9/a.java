package gu9;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import gs2.t;
import koi.b;
import koi.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends DefaultItemAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f146896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f146897b;

    public a() {
        setMoveDuration(150L);
        setSupportsChangeAnimations(false);
        this.f146896a = new t(13);
        m70.a.c(t0.f186434a);
        this.f146897b = "";
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateAdd(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        b bVar = holder instanceof b ? (b) holder : null;
        if (bVar == null) {
            return super.animateAdd(holder);
        }
        j jVar = bVar.e;
        ChatBubbleDelegate.Model model = jVar instanceof ChatBubbleDelegate.Model ? (ChatBubbleDelegate.Model) jVar : null;
        if (model == null) {
            return super.animateAdd(holder);
        }
        if (!(model.f53831x instanceof gw0.j) || model.f53817b != null || model.d != null || model.f53822l != null || model.f53819g != null || model.i != null || model.e == null || !Intrinsics.f(model.f53816a, this.f146897b)) {
            return super.animateAdd(holder);
        }
        this.f146896a.invoke(holder);
        dispatchAddFinished(holder);
        return false;
    }
}
