package nn3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.qd0;
import ip0.vd0;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import njj.c1;
import nme.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements cli.n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3.f f217454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nq9.b f217455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f217456c;
    public final Lazy d;

    public l(dl3.f contactsMapper, nq9.b groupsMapper, b contactRecipientUtils, i emptyStateMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(groupsMapper, "groupsMapper");
        Intrinsics.checkNotNullParameter(contactRecipientUtils, "contactRecipientUtils");
        Intrinsics.checkNotNullParameter(emptyStateMapper, "emptyStateMapper");
        this.f217454a = contactsMapper;
        this.f217455b = groupsMapper;
        this.d = yhm.j.b(new nme.c(13));
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_16_check;
        int i2 = R$attr.uikit_colorGroupedBackground;
        companion.d(i, R$attr.uikit_colorAccent, i2, Integer.valueOf(i2), 3.0f, 3.0f, Float.valueOf(16.0f));
    }

    public static String a(cn3.g gVar) {
        String strV;
        if (gVar instanceof cn3.e) {
            strV = hx7.q.v(((cn3.e) gVar).f25347a);
        } else {
            if (!(gVar instanceof cn3.f)) {
                throw new NoWhenBranchMatchedException();
            }
            strV = ((cn3.f) gVar).f25348a.f79286b;
        }
        Character chQ0 = f0.Q0(strV);
        return String.valueOf((chQ0 == null || !Character.isLetter(chQ0.charValue())) ? '#' : Character.toUpperCase(chQ0.charValue()));
    }

    public static boolean d(cn3.g gVar, d dVar, boolean z, boolean z3) {
        if (!z3 || z) {
            boolean z4 = (gVar instanceof cn3.e) && dVar == d.CONTACTS_ENABLED;
            boolean z6 = (gVar instanceof cn3.f) && dVar == d.GROUPS_ENABLED;
            if (dVar == d.ALL_ENABLED || z4 || z6) {
                return true;
            }
        }
        return false;
    }

    public final SelectableDelegate.Model b(cn3.g gVar, boolean z, boolean z3, vd0 vd0Var) {
        RowDelegate.Model modelD;
        if (gVar instanceof cn3.e) {
            modelD = ((xl3.d) this.f217454a).m(((cn3.e) gVar).f25347a);
        } else {
            if (!(gVar instanceof cn3.f)) {
                throw new NoWhenBranchMatchedException();
            }
            modelD = ((tr9.c) this.f217455b).d(((cn3.f) gVar).f25348a);
        }
        RowDelegate.Model model = modelD;
        return new SelectableDelegate.Model(model.f53228a, model, z ? qd0.SELECTED : qd0.UNSELECTED, z3 ? SelectableDelegate.b.C0424b.f53319a : new SelectableDelegate.b.a(false), vd0Var, false, null, null, null, false, 32736);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f217438a, new c0(this, 16), new nmb.v(3), new c1(this, domainState, 5));
    }
}
