package hu1;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.blik.api.R$string;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 implements jki.p {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my0.e f155527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.j f155528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a12.e f155529c;
    public final a12.o d;
    public final ty9.b e;
    public final z80.b f;

    public j0(my0.e mainProductWidgetFactory, a12.j apmAreaMapper, a12.e apmContactsMapper, a12.o apmTransactionsMapper, ty9.b sendFromClipboardItemProvider, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(mainProductWidgetFactory, "mainProductWidgetFactory");
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        Intrinsics.checkNotNullParameter(apmContactsMapper, "apmContactsMapper");
        Intrinsics.checkNotNullParameter(apmTransactionsMapper, "apmTransactionsMapper");
        Intrinsics.checkNotNullParameter(sendFromClipboardItemProvider, "sendFromClipboardItemProvider");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f155527a = mainProductWidgetFactory;
        this.f155528b = apmAreaMapper;
        this.f155529c = apmContactsMapper;
        this.d = apmTransactionsMapper;
        this.e = sendFromClipboardItemProvider;
        this.f = phoneToolsProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        o domainState = (o) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        boolean z = domainState.f155535g;
        a12.j jVar = this.f155528b;
        if (z) {
            eVarB.add(a12.j.a(jVar, zhm.v.k(a.Send, a.AddContact)));
            RowDelegate.Model modelA = ty9.b.a(this.e);
            if (modelA != null) {
                eVarB.add(modelA);
            }
        }
        eVarB.addAll((List) iii.c.f(domainState.f155532a, new hs4.l(this, 18), new ht1.l(this), new hb4.n(domainState, this, 16)));
        if (z) {
            ActionWidgetDelegate.Model model = null;
            if (domainState.f155536h == null) {
                ActionWidgetDelegate.Model model2 = new ActionWidgetDelegate.Model("REGISTRATION_PROMPT_ACTION_WIDGET_ID", new TextLocalisedClause(R$string.blik_register_phone_prompt_title, null, null, 14), new TextLocalisedClause(R$string.blik_register_phone_prompt_description_with_placeholder, zhm.u.c(z80.b.b(this.f, domainState.i, null, null, 6)), null, 12), new com.revolut.core.ui_kit.delegates.m(new GlyphImage(R$drawable.uikit_icn_24_smartphone, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), null, new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(R$string.blik_register_phone_prompt_button_title, null, null, 14), null, 14), com.revolut.core.ui_kit.delegates.q.REGULAR, null, null, false, 8080);
                yp0.b.l(model2, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                model = model2;
            }
            if (model != null) {
                eVarB.add(model);
            }
            final int i = 0;
            eVarB.addAll((List) iii.c.f(domainState.f155533b, new hqk.a(28), new ht1.l(1), new Function3(this) { // from class: hu1.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j0 f155525b;

                {
                    this.f155525b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i) {
                        case 0:
                            a12.c content = (a12.c) obj2;
                            ((Boolean) obj3).booleanValue();
                            Intrinsics.checkNotNullParameter(content, "content");
                            return ((s12.a) this.f155525b.f155529c).a(content);
                        default:
                            a12.m content2 = (a12.m) obj2;
                            ((Boolean) obj3).booleanValue();
                            Intrinsics.checkNotNullParameter(content2, "content");
                            return ((s12.i) this.f155525b.d).a(content2);
                    }
                }
            }));
        }
        final int i2 = 1;
        eVarB.addAll((List) iii.c.f(domainState.f155534c, new hqk.a(29), new ht1.l(3), new Function3(this) { // from class: hu1.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f155525b;

            {
                this.f155525b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                switch (i2) {
                    case 0:
                        a12.c content = (a12.c) obj2;
                        ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(content, "content");
                        return ((s12.a) this.f155525b.f155529c).a(content);
                    default:
                        a12.m content2 = (a12.m) obj2;
                        ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(content2, "content");
                        return ((s12.i) this.f155525b.d).a(content2);
                }
            }
        }));
        if (z) {
            eVarB.addAll(((s12.f) jVar).b(zhm.v.k(a.Settings, a.Help)));
        }
        return new r(zhm.u.a(eVarB));
    }
}
