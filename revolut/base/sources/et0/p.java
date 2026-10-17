package et0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.delegates.chat.ChatAttachmentHorizontalItemDelegate;
import com.revolut.core.ui_kit.internal.delegates.chat.ChatAttachmentMediaItemDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.x3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends FrameLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f129080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4l.j f129081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f129082c;
    public Function1 d;
    public List e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jq0.t f129083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f129084h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f129085j;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(List list, Long l2, Function0 function0) {
        ArrayList arrayList;
        qv0.o model;
        if (this.i) {
            this.f129085j = new q(list, function0);
            return;
        }
        if (Intrinsics.f(this.e, list)) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (list != null) {
            List<gw0.h> list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (gw0.h hVar : list2) {
                if (hVar instanceof gw0.b) {
                    model = new ChatAttachmentHorizontalItemDelegate.Model((gw0.b) hVar);
                } else {
                    if (!(hVar instanceof gw0.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    model = new ChatAttachmentMediaItemDelegate.Model((gw0.g) hVar);
                }
                arrayList.add(model);
            }
        } else {
            arrayList = null;
        }
        this.e = list;
        boolean z = arrayList == null || arrayList.isEmpty();
        boolean z3 = this.f129084h;
        z4l.j jVar = this.f129081b;
        if (z3) {
            this.f129084h = false;
            jVar.c(zhm.f0.f322471a);
            RecyclerView recyclerView = this.f129080a;
            recyclerView.scrollToPosition(0);
            recyclerView.setAdapter(null);
            recyclerView.setAdapter(jVar);
        }
        long jLongValue = l2 != null ? l2.longValue() : this.f ? 300L : 0L;
        jq0.t tVar = this.f129083g;
        if (z) {
            this.f129084h = true;
            tVar.a(jLongValue, new a3l.b(3, function0), false);
        } else {
            jVar.c(arrayList);
            tVar.a(jLongValue, function0, true);
        }
    }

    public final void setDeferredUpdatesMode(boolean z, long j2) {
        q qVar;
        if (z == this.i) {
            return;
        }
        this.i = z;
        if (z || (qVar = this.f129085j) == null) {
            return;
        }
        this.f129085j = null;
        a(qVar.f129094a, Long.valueOf(j2), qVar.f129095b);
    }

    public final void setModel(@NotNull r model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f = model.f129099a;
        a(model.f129100b, null, model.f129101c);
        x3 listener = model.d;
        jq0.t tVar = this.f129083g;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        tVar.d = listener;
    }

    public final void setOnCloseClickListener(Function1<? super gw0.h, Unit> function1) {
        this.d = function1;
    }

    public final void setOnItemClickListener(Function1<? super gw0.h, Unit> function1) {
        this.f129082c = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ChatAttachmentHorizontalItemDelegate chatAttachmentHorizontalItemDelegate = new ChatAttachmentHorizontalItemDelegate();
        ChatAttachmentMediaItemDelegate chatAttachmentMediaItemDelegate = new ChatAttachmentMediaItemDelegate();
        z4l.j jVar = new z4l.j(7, zhm.v.k(chatAttachmentHorizontalItemDelegate, chatAttachmentMediaItemDelegate), false);
        this.f129081b = jVar;
        this.f129083g = new jq0.t(this);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        int iK = kli.a.k(context, 12.0f);
        recyclerView.setPaddingRelative(iK, recyclerView.getPaddingTop(), iK, recyclerView.getPaddingBottom());
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        pd.b.p(recyclerView, new TextLocalisedClause(R$string.chat_attachments_carousel_accessibility_label, null, null, 14));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(jVar);
        this.f129080a = recyclerView;
        addView(recyclerView, new FrameLayout.LayoutParams(-1, kli.a.k(context, 100.0f)));
        chatAttachmentHorizontalItemDelegate.f55850c = new o(this, 0);
        chatAttachmentHorizontalItemDelegate.d = new o(this, 1);
        chatAttachmentMediaItemDelegate.f55859c = new o(this, 2);
        chatAttachmentMediaItemDelegate.d = new o(this, 3);
        setVisibility(8);
    }

    public /* synthetic */ p(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
