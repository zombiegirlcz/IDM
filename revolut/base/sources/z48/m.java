package z48;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$string;
import ip0.yt;
import j38.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k58.a f319348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bci.d f319349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dci.b f319350c;

    public m(bci.d purposeMapper, dci.b purposeNameProvider, k58.a relationshipTextProvider) {
        Intrinsics.checkNotNullParameter(relationshipTextProvider, "relationshipTextProvider");
        Intrinsics.checkNotNullParameter(purposeMapper, "purposeMapper");
        Intrinsics.checkNotNullParameter(purposeNameProvider, "purposeNameProvider");
        this.f319348a = relationshipTextProvider;
        this.f319349b = purposeMapper;
        this.f319350c = purposeNameProvider;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        Object objA;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<String> list = domainState.f319342b;
        j38.a aVar = domainState.f319341a;
        ArrayList arrayList = new ArrayList();
        for (String purpose : list) {
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            cci.g gVar = (cci.g) u1.v(purpose, this.f319349b.f14448a);
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            this.f319348a.getClass();
            objA = k58.a.a(aVar);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
        }
        if (objA instanceof n) {
            objA = null;
        }
        Clause clause = (Clause) objA;
        ListCellDelegate.Model model = (clause == null || aVar.equals(a.d.f170988a)) ? null : new ListCellDelegate.Model("RELATIONSHIP_STATUS_LIST_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextLocalisedClause(R$string.joint_confirm_details_relationship_status, null, null, 14), clause, false, null, null, 0, 0, 0, 0, 4064);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_confirm_details_reasons_for_opening, null, null, 14);
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new TextClause(this.f319350c.c((cci.g) it8.next(), null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        qv0.i[] elements = {model, domainState.f319342b.isEmpty() ? null : new ListCellDelegate.Model("REASONS_FOR_OPENING_LIST_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_view_list, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), textLocalisedClause, yoj.b.m(new TextLocalisedClause(R$string.joint_common_comma, null, null, 14), arrayList2), false, null, null, 0, 0, 0, 0, 4064)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new i(listL);
    }
}
