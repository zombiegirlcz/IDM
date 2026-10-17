package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import et0.z0;
import ip0.v7;
import java.util.List;
import koe.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.a1;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0004\u0007\b\t\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatTableDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatTableDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/l;", "Lkp0/d;", "<init>", "()V", "Model", "kp0/b1", "kp0/a1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatTableDelegate extends BaseRecyclerViewDelegate<Model, l> implements kp0.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53905c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatTableDelegate$Model;", "Loq0/b;", "Lqv0/o;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/chat/k", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements oq0.b, qv0.o, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f53907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cam.f f53908c;
        public final Object d;
        public final xo0.b e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53909g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f53910h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f53911j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53912l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f53913m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53914n;

        public Model(String listId, List columns, cam.f position, Object obj2, xo0.b accessibilitySender, boolean z, boolean z3, List selectionMenuItems, boolean z4, Parcelable parcelable, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
            Intrinsics.checkNotNullParameter(selectionMenuItems, "selectionMenuItems");
            this.f53906a = listId;
            this.f53907b = columns;
            this.f53908c = position;
            this.d = obj2;
            this.e = accessibilitySender;
            this.f = z;
            this.f53909g = z3;
            this.f53910h = selectionMenuItems;
            this.i = z4;
            this.f53911j = parcelable;
            this.k = i;
            this.f53912l = i2;
            this.f53913m = i3;
            this.f53914n = i5;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatTableDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55862c() {
            return this.d;
        }

        @Override // oq0.b
        public final boolean a2() {
            return true;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55185b() {
            return this.f53906a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53906a, model.f53906a) && Intrinsics.f(this.f53907b, model.f53907b) && Intrinsics.f(this.f53908c, model.f53908c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f53909g == model.f53909g && Intrinsics.f(this.f53910h, model.f53910h) && this.i == model.i && Intrinsics.f(this.f53911j, model.f53911j) && this.k == model.k && this.f53912l == model.f53912l && this.f53913m == model.f53913m && this.f53914n == model.f53914n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f53911j;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53937n() {
            return this.f53908c;
        }

        public final int hashCode() {
            int iE = v7.e(this.f53908c, p.a.d(this.f53906a.hashCode() * 31, 31, this.f53907b), 31);
            Object obj2 = this.d;
            int iC = j6.a.c(p.a.d(j6.a.c(j6.a.c((this.e.hashCode() + ((iE + (obj2 == null ? 0 : obj2.hashCode())) * 31)) * 31, 31, this.f), 31, this.f53909g), 31, this.f53910h), 31, this.i);
            Parcelable parcelable = this.f53911j;
            return Integer.hashCode(this.f53914n) + j6.a.b(this.f53913m, j6.a.b(this.f53912l, j6.a.b(this.k, (iC + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52556l() {
            return this.f53912l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52558n() {
            return this.f53914n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53912l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53911j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52557m() {
            return this.f53913m;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z12 = !Intrinsics.f(this.f53907b, model.f53907b);
            boolean z29 = !Intrinsics.f(this.f53908c, model.f53908c);
            if (this.f53909g != model.f53909g) {
                z = true;
                z3 = z29;
                z4 = true;
            } else {
                z = true;
                z3 = z29;
                z4 = false;
            }
            boolean zF = Intrinsics.f(this.f53910h, model.f53910h) ^ z;
            if (this.i != model.i) {
                z11 = z;
                z6 = zF;
            } else {
                z6 = zF;
                z11 = false;
            }
            return new a1(z12, z3, z4, z6, z11);
        }
    }

    public ChatTableDelegate() {
        super(R$id.chatTableDelegate_tableView, new x(16));
        this.f53905c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    @Override // kp0.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ihm.f getF53905c() {
        return this.f53905c;
    }

    @Override // kp0.d
    public final /* bridge */ /* synthetic */ efm.r c() {
        return null;
    }

    @Override // kp0.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ihm.f getE() {
        return this.e;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.h(context);
        z0 z0Var = new z0(context, null, 6, 0);
        z0Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        z0Var.setId(R$id.chatTableDelegate_tableView);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView(z0Var);
        ChatSwipeToReplyLayout chatSwipeToReplyLayout = new ChatSwipeToReplyLayout(context, null, 6, 0);
        chatSwipeToReplyLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        chatSwipeToReplyLayout.setAnchorViewId(Integer.valueOf(R$id.chatTableDelegate_tableView));
        chatSwipeToReplyLayout.addView(frameLayout);
        return new l(chatSwipeToReplyLayout, z0Var);
    }

    @Override // kp0.d
    public final /* bridge */ /* synthetic */ efm.r i() {
        return null;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        l lVar = holder instanceof l ? (l) holder : null;
        if (lVar == null) {
            return;
        }
        z0 z0Var = lVar.f;
        z0Var.setSelectionEnabled(false);
        z0Var.setOnSelectionAction(null);
        z0Var.setSelectionMenuItems(f0.f322471a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.chat.l r28, com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate.Model r29, int r30, java.util.List r31) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate.p(com.revolut.core.ui_kit.delegates.chat.l, com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate$Model, int, java.util.List):void");
    }
}
