package com.revolut.feature.payments.messaging.common.impl.reactions;

import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.EmojiImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.feature.payments.messaging.common.api.reactions.ReactionsAuthorsViewer$InputData;
import com.revolut.feature.payments.messaging.common.api.reactions.ReactionsAuthorsViewer$ReactionAuthor;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fu9.f;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pki.b;
import vc.s;
import wsg.e;
import wu9.d;
import z4l.j;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/messaging/common/impl/reactions/ReactionsAuthorsBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lfu9/f;", "Lno/m;", "feature_payments_messaging_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactionsAuthorsBottomSheetController extends SimpleViewController<f> implements m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ReactionsAuthorsBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final ReactionsAuthorsViewer$InputData N;
    public final h O;
    public final RowDelegate P;
    public final j Q;
    public final AnalyticsProduct.Retail R;
    public final int S;
    public final wu9.f T;

    public ReactionsAuthorsBottomSheetController(ReactionsAuthorsViewer$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = s.t(this, d.f);
        wu9.f fVar = new wu9.f();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new j(7, u.c(rowDelegate), false);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.R = a.h(k9Var, "value", k9Var);
        this.S = R$layout.screen_bottom_sheet_list;
        this.T = fVar;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return this.T;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.payments_chat_reactions_sheet_title, null, null, 14), null, null, null, false, 30));
        d3().f174519b.H();
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174520c;
        j jVar = this.Q;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        d3().f174520c.addItemDecoration(new o31.b());
        List<ReactionsAuthorsViewer$ReactionAuthor> listP0 = d0.P0(this.N.f79508a, new afa.a(new e(29), 14));
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (ReactionsAuthorsViewer$ReactionAuthor reactionsAuthorsViewer$ReactionAuthor : listP0) {
            String str = reactionsAuthorsViewer$ReactionAuthor.f79509a;
            String str2 = reactionsAuthorsViewer$ReactionAuthor.f79510b;
            ContactImage contactImage = new ContactImage((String) null, (String) null, str, (String) null, (String) null, str2, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059);
            boolean z = reactionsAuthorsViewer$ReactionAuthor.d;
            Clause textLocalisedClause3 = z ? new TextLocalisedClause(R$string.payments_chat_reactions_sheet_you, null, null, 14) : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (z) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.payments_chat_reactions_sheet_tap_to_remove, null, null, 14);
            } else if (reactionsAuthorsViewer$ReactionAuthor.e) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.payments_chat_reactions_sheet_left_group, null, null, 14);
            } else {
                textLocalisedClause = null;
                arrayList.add(new RowDelegate.Model(str, contactImage, null, null, textLocalisedClause3, textLocalisedClause, null, null, 0, new tf(6, new EmojiImage(reactionsAuthorsViewer$ReactionAuthor.f79511c, 24, 28), false), reactionsAuthorsViewer$ReactionAuthor.d, false, null, null, null, null, null, reactionsAuthorsViewer$ReactionAuthor, null, 0, 0, 0, 0, 1056958316));
            }
            textLocalisedClause = textLocalisedClause2;
            arrayList.add(new RowDelegate.Model(str, contactImage, null, null, textLocalisedClause3, textLocalisedClause, null, null, 0, new tf(6, new EmojiImage(reactionsAuthorsViewer$ReactionAuthor.f79511c, 24, 28), false), reactionsAuthorsViewer$ReactionAuthor.d, false, null, null, null, null, null, reactionsAuthorsViewer$ReactionAuthor, null, 0, 0, 0, 0, 1056958316));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        jVar.c(arrayList);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new wu9.e(this, null), 3);
    }

    public final jii.f d3() {
        ViewBinding value = this.O.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.S;
    }
}
