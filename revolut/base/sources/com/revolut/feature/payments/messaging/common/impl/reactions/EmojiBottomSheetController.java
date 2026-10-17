package com.revolut.feature.payments.messaging.common.impl.reactions;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.EmojiImageDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.EmojiImage;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import foh.i;
import fu9.d;
import grl.k9;
import java.util.ArrayList;
import java.util.Set;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import vc.s;
import wu9.b;
import z4l.j;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/messaging/common/impl/reactions/EmojiBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lfu9/d;", "Lno/m;", "<init>", "()V", "feature_payments_messaging_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmojiBottomSheetController extends SimpleViewController<d> implements m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(EmojiBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final Set N;
    public final h O;
    public final EmojiImageDelegate P;
    public final j Q;
    public final AnalyticsProduct.Retail R;
    public final int S;
    public final b T;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return f.a(p0);
        }
    }

    public EmojiBottomSheetController() {
        String[] elements = {"😀", "😃", "😄", "😁", "😆", "😅", "🤣", "😂", "🙂", "🙃", "🫠", "😉", "😊", "😇", "🥰", "😍", "🤩", "😘", "😗", "☺️", "😚", "😙", "🥲", "😋", "😛", "😜", "🤪", "😝", "🤑", "🤗", "🤭", "🫢", "🫣", "🤫", "🤔", "🫡", "🤐", "🤨", "😐", "😑", "😶", "🫥", "😶\u200d🌫️", "😏", "😒", "🙄", "😬", "😮\u200d💨", "🤥", "😌", "😔", "😪", "🤤", "😴", "😷", "🤒", "🤕", "🤢", "🤮", "🤧", "🥵", "🥶", "🥴", "😵", "😵\u200d💫", "🤯", "🤠", "🥳", "🥸", "😎", "🤓", "🧐", "😕", "🫤", "😟", "🙁", "☹️", "😮", "😯", "😲", "😳", "🥺", "🥹", "😦", "😧", "😨", "😰", "😥", "😢", "😭", "😱", "😖", "😣", "😞", "😓", "😩", "😫", "🥱", "😤", "😡", "😠", "🤬", "😈", "👿", "💀", "☠️", "💩", "🤡", "👹", "👺", "👻", "👽", "👾", "🤖", "😺", "😸", "😹", "😻", "😼", "😽", "🙀", "😿", "😾", "🙈", "🙉", "🙊", "💔", "❤️", "💕", "❤️\u200d🩹", "💋", "💯", "🔥", "💧", "✨", "🎉", "💰", "💸", "👀", "👍", "👎", "🙌", "🫶", "🙏", "👏", "👌", "💪"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.N = kotlin.collections.d.y0(elements);
        this.O = s.t(this, a.f);
        b bVar = new b();
        EmojiImageDelegate emojiImageDelegate = new EmojiImageDelegate();
        this.P = emojiImageDelegate;
        this.Q = new j(7, u.c(emojiImageDelegate), false);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.R = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.S = R$layout.screen_bottom_sheet_list;
        this.T = bVar;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.T;
    }

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
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.emoji_bottom_sheet_title, null, null, 14), null, null, null, false, 30));
        d3().f174519b.H();
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f174518a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = controllerContainerCoordinatorLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int iJ = i.j(440);
        int i = m2().getResources().getDisplayMetrics().heightPixels / 2;
        if (iJ >= i) {
            iJ = i;
        }
        layoutParams.height = iJ;
        controllerContainerCoordinatorLayout.setLayoutParams(layoutParams);
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174520c;
        screenContentRecyclerView.setPadding(com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 8.0f), 0, com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 8.0f), 0);
        screenContentRecyclerView.setLayoutManager(new ScreenGridLayoutManager(m2(), m2().getResources().getDisplayMetrics().widthPixels / i.j(48), 12));
        j jVar = this.Q;
        screenContentRecyclerView.setAdapter(jVar);
        d3().f174520c.setAdapter(jVar);
        ScreenContentRecyclerView screenContentRecyclerView2 = d3().f174520c;
        Set<String> set = this.N;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (String str : set) {
            arrayList.add(new EmojiImageDelegate.Model(str, new EmojiImage(str, 32, 32), false, 12));
        }
        jVar.c(arrayList);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e.b(this.P.f52221c), new wka.e(this, null, 29), 3);
    }

    public final f d3() {
        ViewBinding value = this.O.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.S;
    }
}
