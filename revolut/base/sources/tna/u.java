package tna;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.recycler.ScrollOffsetData;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import com.revolut.tracking.v3.SettingsThemingContext;
import ip0.ip;
import ip0.pp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements jki.p {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.c f272362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vjg.g f272363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f272364c;

    public u(fkg.c themeSampleIconProvider, vjg.g themeCatalog, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(themeSampleIconProvider, "themeSampleIconProvider");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f272362a = themeSampleIconProvider;
        this.f272363b = themeCatalog;
        this.f272364c = dateProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        k domainState = (k) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        Boolean bool = domainState.f272345c;
        a0.x((List) iii.c.f(domainState.f272343a, new tlf.n(6), new tj9.d(16), new si5.c(this, domainState, 21)), eVarB);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            aim.e eVarB2 = zhm.u.b();
            eVarB2.add(new RowDelegate.Model("ID_PRIDE_THEME_SWITCHER", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rainbow, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.profile_appearance_switcher_pride_title, null, null, 14), null, 0, null, null, null, 0, new vf(zBooleanValue, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880));
            aim.e eVarA = zhm.u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            a0.x(eVarA, eVarB);
        }
        return new n(zhm.u.a(eVarB));
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final IconSelectorDelegate.Model b(m mVar, ScrollOffsetData scrollOffsetData, List list) {
        tw0.j hVar;
        no.j jVar;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            boolean z = true;
            if (it8.hasNext()) {
                Object next = it8.next();
                int i = t.f272359a[((ColorThemeOption) next).f94566c.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = mVar.f272348c;
                }
                if (z) {
                    arrayList.add(next);
                }
            } else {
                ArrayList items = new ArrayList(w.t(arrayList, 10));
                Iterator it9 = arrayList.iterator();
                while (true) {
                    int i2 = 0;
                    z = false;
                    boolean z3 = false;
                    if (!it9.hasNext()) {
                        if (scrollOffsetData != null) {
                            hVar = new tw0.i(scrollOffsetData.f58170b, scrollOffsetData.f58171c);
                        } else {
                            IconSelectorDelegate.INSTANCE.getClass();
                            Intrinsics.checkNotNullParameter(items, "items");
                            Iterator it10 = items.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    i2 = -1;
                                } else if (!((IconSelectorDelegate.SelectableIconModel) it10.next()).f52501c) {
                                    i2++;
                                }
                            }
                            hVar = new tw0.h(i2);
                        }
                        return new IconSelectorDelegate.Model("ID_COLOR_THEME_SWITCHER", items, ip.f164732b, new pp(hVar), null, 48);
                    }
                    ColorThemeOption colorThemeOption = (ColorThemeOption) it9.next();
                    xjg.j jVar2 = colorThemeOption.f94564a;
                    boolean z4 = jVar2 == mVar.f272346a.f94563c;
                    if ((colorThemeOption.f94566c == xjg.k.PREMIUM) != false && !mVar.f272347b) {
                        z3 = true;
                    }
                    String strD = jVar2.d();
                    Image imageA = this.f272362a.a(jVar2, z3, null);
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.appearance_theme_color_accessibility_label, null, null, 14);
                    int i3 = R$attr.uikit_colorAccent;
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    SettingsThemingContext.a aVarNewBuilder = SettingsThemingContext.newBuilder();
                    switch (t.f272361c[jVar2.ordinal()]) {
                        case 1:
                            jVar = no.j.PURPLE;
                            break;
                        case 2:
                            jVar = no.j.TEAL;
                            break;
                        case 3:
                            jVar = no.j.ORANGE;
                            break;
                        case 4:
                            jVar = no.j.PINK;
                            break;
                        case 5:
                            jVar = no.j.DEEP_BLUE;
                            break;
                        case 6:
                            jVar = no.j.DYNAMIC;
                            break;
                        case 7:
                            jVar = no.j.CYBERPUNK;
                            break;
                        case 8:
                            jVar = no.j.DEFAULT;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    String strA = jVar.a();
                    aVarNewBuilder.c();
                    ((SettingsThemingContext) aVarNewBuilder.f49761b).setAccentColor(strA);
                    w0 w0VarA = aVarNewBuilder.a();
                    companion.getClass();
                    items.add(new IconSelectorDelegate.SelectableIconModel(strD, imageA, z4, null, textLocalisedClause, false, null, i3, false, colorThemeOption, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), 872));
                }
            }
        }
    }
}
