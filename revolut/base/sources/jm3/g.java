package jm3;

import aw0.t2;
import aw0.u2;
import aw0.v2;
import aw0.w2;
import cli.k;
import cli.y;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts.impl.ui.profile_card.ContactProfileCardScreenContract$ContactProfileCardInputData;
import com.revolut.retail.common.ui.R$string;
import ji1.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements e {

    @NotNull
    public static final f Companion = new f();
    public final ContactProfileCardScreenContract$ContactProfileCardInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bm3.c f175936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tqi.g f175937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c70.a f175938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zl3.a f175939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f175940t;

    public g(ContactProfileCardScreenContract$ContactProfileCardInputData inputData, bm3.c contactPaidPlanRouter, tqi.g shareNaviCommandFactory, c70.a clipboard, zl3.a shareContactLinkFactory, i mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactPaidPlanRouter, "contactPaidPlanRouter");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shareContactLinkFactory, "shareContactLinkFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f175936p = contactPaidPlanRouter;
        this.f175937q = shareNaviCommandFactory;
        this.f175938r = clipboard;
        this.f175939s = shareContactLinkFactory;
        this.f175940t = mra.d.b(this, k.f25028a, mapper, null, false, 12);
    }

    @Override // fpa.e
    public final void N() {
        n2(new m(this, null, 4), new whi.b(6));
    }

    @Override // fpa.e
    public final void P0(CircleActionButtonsBarDelegate.CircleActionButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        String username = this.o.f66015a.N0();
        this.f175939s.getClass();
        Intrinsics.checkNotNullParameter(username, "username");
        tqi.c cVar = new tqi.c(null, j6.a.q("https://revolut.me/", username), null, null, 91);
        m70.a.c(t0.f186434a);
        C1(u0.b(this.f175937q.g(cVar, "")));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f175940t;
    }

    @Override // fpa.e
    public final void t0(w2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        super.t0(click);
        if (click.equals(t2.f10539a)) {
            return;
        }
        if (!click.equals(u2.f10554a)) {
            if (!click.equals(v2.f10570a)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        this.f175938r.a(null, this.o.f66015a.N0(), false);
        if (c70.a.g()) {
            return;
        }
        X1(new mii.f("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, null, 124));
    }
}
