package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.a;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleContainer;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import et0.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0004\b\u0003\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "M", "Lcom/revolut/core/ui_kit/delegates/chat/a;", "VH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lkp0/d;", "Companion", "BaseModel", "kp0/c", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseChatBubbleDelegate<M extends BaseModel, VH extends a> extends BaseRecyclerViewDelegate<M, VH> implements kp0.d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f53760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f53761h;
    public static final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f53762j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53763c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "Loq0/b;", "Lqv0/o;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface BaseModel extends oq0.b, qv0.o, TrackableItem {
        boolean T(BaseModel baseModel);

        /* JADX INFO: renamed from: getTimestamp */
        Clause getE();

        /* JADX INFO: renamed from: h */
        ChatBubbleDelegate.c getF53902c();

        default boolean isEnabled() {
            return true;
        }

        /* JADX INFO: renamed from: isLongClickable */
        boolean getI();

        default xo0.b k0() {
            return null;
        }

        /* JADX INFO: renamed from: o1 */
        boolean getF52081g();

        /* JADX INFO: renamed from: q1 */
        gw0.q getF52082h();

        @Override // oq0.b
        /* JADX INFO: renamed from: v */
        Image getV();

        @Override // koi.j
        default Object z(Object oldItem) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            boolean z12;
            boolean z29;
            boolean z31;
            boolean z41;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof BaseModel)) {
                return null;
            }
            BaseModel baseModel = (BaseModel) oldItem;
            boolean z49 = !T(baseModel);
            boolean z54 = !Intrinsics.f(getF53901b(), baseModel.getF53901b());
            boolean z74 = !Intrinsics.f(getV(), baseModel.getV());
            boolean z83 = !Intrinsics.f(getE(), baseModel.getE());
            boolean z89 = !Intrinsics.f(getF53902c(), baseModel.getF53902c());
            if (getF52081g() != baseModel.getF52081g()) {
                z = true;
                z3 = z54;
                z4 = z74;
                z6 = z83;
                z11 = z89;
                z12 = true;
            } else {
                z = true;
                z3 = z54;
                z4 = z74;
                z6 = z83;
                z11 = z89;
                z12 = false;
            }
            boolean zF = Intrinsics.f(getF52082h(), baseModel.getF52082h()) ^ z;
            if (isEnabled() != baseModel.isEnabled()) {
                z29 = z;
                z31 = zF;
                z41 = z29;
            } else {
                z29 = z;
                z31 = zF;
                z41 = false;
            }
            return new kp0.c(z49, z3, z4, z6, z11, z12, z31, z41, getF53830w() != baseModel.getF53830w() ? z29 : false);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        int i2 = R$attr.uikit_dp8;
        f53760g = i2;
        f53761h = i2;
        int i3 = R$attr.uikit_dp16;
        i = i3;
        f53762j = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatBubbleDelegate(int i2, Function2 predicate) {
        super(i2, predicate);
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f53763c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    @Override // kp0.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ihm.f getE() {
        return this.d;
    }

    @Override // kp0.d
    public final efm.r c() {
        return this.f;
    }

    @Override // kp0.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ihm.f getF53807g() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.h(context);
        int i2 = 6;
        int i3 = 0;
        ChatBubbleContainer chatBubbleContainer = new ChatBubbleContainer(context, 0 == true ? 1 : 0, i2, i3);
        chatBubbleContainer.setId(R$id.chatBubbleBase_container);
        chatBubbleContainer.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ChatParentLayout chatParentLayout = new ChatParentLayout(context, 0 == true ? 1 : 0, i2, i3);
        chatParentLayout.setId(R$id.chatBubbleBase_chatParentLayout);
        chatParentLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        chatParentLayout.addView(chatBubbleContainer);
        ChatSwipeToReplyLayout chatSwipeToReplyLayout = new ChatSwipeToReplyLayout(context, 0 == true ? 1 : 0, i2, i3);
        chatSwipeToReplyLayout.setId(R$id.chatBubbleBase_replyLayout);
        chatSwipeToReplyLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        chatSwipeToReplyLayout.addView(chatParentLayout);
        a aVarX = x(chatSwipeToReplyLayout);
        View view = aVarX.I();
        view.setId(R$id.chatBubbleBase_contentView);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(layoutParams != null ? layoutParams.width : -2, layoutParams != null ? layoutParams.height : -2);
        params.topToTop = 0;
        params.startToStart = 0;
        params.endToEnd = 0;
        params.bottomToBottom = 0;
        if (marginLayoutParams != null) {
            ((ViewGroup.MarginLayoutParams) params).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) params).bottomMargin = marginLayoutParams.bottomMargin;
            params.setMarginStart(marginLayoutParams.getMarginStart());
            params.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(params, "params");
        aVarX.i.addView(view, 0, params);
        return aVarX;
    }

    @Override // kp0.d
    public final efm.r i() {
        return this.f53763c;
    }

    public lq0.m p(a holder, BaseModel data, BaseModel baseModel, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        return null;
    }

    public boolean q() {
        return !(this instanceof ChatContextualChartDelegate);
    }

    public abstract m0 r(BaseModel baseModel);

    public void s(a holder, BaseModel data) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        holder.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        oq0.f.a(holder.f53953h, data);
    }

    public abstract void t(a aVar, BaseModel baseModel, BaseModel baseModel2, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
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
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.chat.a r29, final com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel r30, int r31, java.util.List r32) {
        /*
            Method dump skipped, instruction units count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.p(com.revolut.core.ui_kit.delegates.chat.a, com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate$BaseModel, int, java.util.List):void");
    }

    public void v(a holder, BaseModel model, ArrayList actions) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actions, "actions");
    }

    public void w(a holder, BaseModel model, ArrayList descriptions) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
    }

    public abstract a x(ChatSwipeToReplyLayout chatSwipeToReplyLayout);
}
