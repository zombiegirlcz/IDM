package qva;

import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.c0;
import ip0.z;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    @NotNull
    public static final C1365a Companion = new C1365a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f249548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f249549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f249550c;

    /* JADX INFO: renamed from: qva.a$a, reason: collision with other inner class name */
    public static final class C1365a {
        private C1365a() {
        }
    }

    public a() {
        mx0.d dVar = mx0.d.SEMIACCENT;
        ActionsView.Item item = new ActionsView.Item("ACTIVATE_ACTION_ID", dVar, true, new TextLocalisedClause(R.string.common_action_activate, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, 1988);
        ActionsView.Item item2 = new ActionsView.Item("DEACTIVATE_ACTION_ID", dVar, true, new TextLocalisedClause(R.string.common_action_deactivate, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, 1988);
        ActionsView.Item item3 = new ActionsView.Item("DELETE_ACTION_ID", dVar, true, new TextLocalisedClause(R.string.common_action_delete, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, 1988);
        this.f249548a = new z("ACTIONS_ITEM_LIST_ID", v.k(item2, item3), null, null, R$attr.uikit_dp0, 0, LDSFile.EF_DG12_TAG);
        this.f249549b = new z("ACTIONS_ITEM_LIST_ID", v.k(item, item3), null, null, R$attr.uikit_dp0, 0, LDSFile.EF_DG12_TAG);
        this.f249550c = new c0("LOADING_ACTIONS_ITEM_LIST_ID", new u.a(0, 3), 0, 0, 60);
    }
}
