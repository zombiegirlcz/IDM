package a91;

import android.os.Parcelable;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.accessibility_settings.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import yy0.l;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.add(new ListSubheaderDelegate.Model("INTERFACE_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.accessibility_screen_interface_section, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.accessibility_screen_system_settings_color_contrast_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.accessibility_screen_system_settings_color_contrast_description, null, null, 14);
        int i = R$drawable.uikit_icn_16_palette;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
        gz0.b bVar = gz0.b.FitCenter;
        List listK = v.k(new RowDelegate.Model("COLOR_CONTRAST_SWITCH_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, numValueOf, (List) null, new ImageTransformations(null, null, null, bVar, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 182), false, false, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new vf(domainState.f2290b, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), new RowDelegate.Model("UNDERLINE_LINKS_SWITCH_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_16_editor_underline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, new ImageTransformations(null, null, null, bVar, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 182), false, false, 6), new TextLocalisedClause(R$string.accessibility_screen_system_settings_action_visibility_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.accessibility_screen_system_settings_action_visibility_android_description, null, null, 14), null, null, 0, new vf(domainState.f2289a, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        eVarB.add(new ListSubheaderDelegate.Model("SYSTEM_SETTINGS_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.accessibility_screen_system_settings_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.accessibility_screen_system_settings_action_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.accessibility_screen_system_settings_action_description, null, null, 14);
        yy0.i iVar = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        RowDelegate.Model model = new RowDelegate.Model("SYSTEM_SETTINGS_LIST_ID", null, textLocalisedClause3, null, 0, textLocalisedClause4, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        List listK2 = v.k(new RowDelegate.Model("SCREEN_READER_ROW_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_sound, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.accessibility_screen_system_settings_screen_reader_talk_back_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.accessibility_screen_system_settings_screen_reader_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("TEXT_SIZE_ROW_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_roboto_regular, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.accessibility_screen_system_settings_text_size_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.accessibility_screen_system_settings_text_size_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("REDUCE_MOTION_ROW_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_gift, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.accessibility_screen_system_settings_reduce_motion_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.accessibility_screen_system_settings_reduce_motion_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        eVarB.addAll(listK2);
        return new f(u.a(eVarB));
    }
}
