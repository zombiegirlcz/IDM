package b33;

import android.os.Parcelable;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.EmojiDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import ip0.xk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11989a = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_1), Integer.valueOf(R$drawable.uikit_icn_100_emoji_2), Integer.valueOf(R$drawable.uikit_icn_100_emoji_3), Integer.valueOf(R$drawable.uikit_icn_100_emoji_4), Integer.valueOf(R$drawable.uikit_icn_100_emoji_5), Integer.valueOf(R$drawable.uikit_icn_100_emoji_6), Integer.valueOf(R$drawable.uikit_icn_100_emoji_8), Integer.valueOf(R$drawable.uikit_icn_100_emoji_9), Integer.valueOf(R$drawable.uikit_icn_100_emoji_10), Integer.valueOf(R$drawable.uikit_icn_100_emoji_11), Integer.valueOf(R$drawable.uikit_icn_100_emoji_12), Integer.valueOf(R$drawable.uikit_icn_100_emoji_13), Integer.valueOf(R$drawable.uikit_icn_100_emoji_14), Integer.valueOf(R$drawable.uikit_icn_100_emoji_15));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11990b = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_16), Integer.valueOf(R$drawable.uikit_icn_100_emoji_17), Integer.valueOf(R$drawable.uikit_icn_100_emoji_18), Integer.valueOf(R$drawable.uikit_icn_100_emoji_19), Integer.valueOf(R$drawable.uikit_icn_100_emoji_20), Integer.valueOf(R$drawable.uikit_icn_100_emoji_21), Integer.valueOf(R$drawable.uikit_icn_100_emoji_22), Integer.valueOf(R$drawable.uikit_icn_100_emoji_23), Integer.valueOf(R$drawable.uikit_icn_100_emoji_24), Integer.valueOf(R$drawable.uikit_icn_100_emoji_25), Integer.valueOf(R$drawable.uikit_icn_100_emoji_26), Integer.valueOf(R$drawable.uikit_icn_100_emoji_27), Integer.valueOf(R$drawable.uikit_icn_100_emoji_28), Integer.valueOf(R$drawable.uikit_icn_100_emoji_29), Integer.valueOf(R$drawable.uikit_icn_100_emoji_30), Integer.valueOf(R$drawable.uikit_icn_100_emoji_31), Integer.valueOf(R$drawable.uikit_icn_100_emoji_32), Integer.valueOf(R$drawable.uikit_icn_100_emoji_33), Integer.valueOf(R$drawable.uikit_icn_100_emoji_34), Integer.valueOf(R$drawable.uikit_icn_100_emoji_35), Integer.valueOf(R$drawable.uikit_icn_100_emoji_36), Integer.valueOf(R$drawable.uikit_icn_100_emoji_37), Integer.valueOf(R$drawable.uikit_icn_100_emoji_38), Integer.valueOf(R$drawable.uikit_icn_100_emoji_39));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11991c = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_40), Integer.valueOf(R$drawable.uikit_icn_100_emoji_41), Integer.valueOf(R$drawable.uikit_icn_100_emoji_42), Integer.valueOf(R$drawable.uikit_icn_100_emoji_43), Integer.valueOf(R$drawable.uikit_icn_100_emoji_44), Integer.valueOf(R$drawable.uikit_icn_100_emoji_45), Integer.valueOf(R$drawable.uikit_icn_100_emoji_46), Integer.valueOf(R$drawable.uikit_icn_100_emoji_47), Integer.valueOf(R$drawable.uikit_icn_100_emoji_48), Integer.valueOf(R$drawable.uikit_icn_100_emoji_49), Integer.valueOf(R$drawable.uikit_icn_100_emoji_50), Integer.valueOf(R$drawable.uikit_icn_100_emoji_51), Integer.valueOf(R$drawable.uikit_icn_100_emoji_52), Integer.valueOf(R$drawable.uikit_icn_100_emoji_53), Integer.valueOf(R$drawable.uikit_icn_100_emoji_54));
    public final List d = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_55), Integer.valueOf(R$drawable.uikit_icn_100_emoji_56), Integer.valueOf(R$drawable.uikit_icn_100_emoji_57), Integer.valueOf(R$drawable.uikit_icn_100_emoji_58), Integer.valueOf(R$drawable.uikit_icn_100_emoji_59), Integer.valueOf(R$drawable.uikit_icn_100_emoji_60), Integer.valueOf(R$drawable.uikit_icn_100_emoji_61), Integer.valueOf(R$drawable.uikit_icn_100_emoji_62), Integer.valueOf(R$drawable.uikit_icn_100_emoji_63), Integer.valueOf(R$drawable.uikit_icn_100_emoji_64), Integer.valueOf(R$drawable.uikit_icn_100_emoji_65), Integer.valueOf(R$drawable.uikit_icn_100_emoji_66), Integer.valueOf(R$drawable.uikit_icn_100_emoji_67), Integer.valueOf(R$drawable.uikit_icn_100_emoji_68), Integer.valueOf(R$drawable.uikit_icn_100_emoji_69), Integer.valueOf(R$drawable.uikit_icn_100_emoji_70), Integer.valueOf(R$drawable.uikit_icn_100_emoji_71), Integer.valueOf(R$drawable.uikit_icn_100_emoji_72), Integer.valueOf(R$drawable.uikit_icn_100_emoji_73), Integer.valueOf(R$drawable.uikit_icn_100_emoji_74), Integer.valueOf(R$drawable.uikit_icn_100_emoji_75));
    public final List e = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_76), Integer.valueOf(R$drawable.uikit_icn_100_emoji_77), Integer.valueOf(R$drawable.uikit_icn_100_emoji_78), Integer.valueOf(R$drawable.uikit_icn_100_emoji_79), Integer.valueOf(R$drawable.uikit_icn_100_emoji_80), Integer.valueOf(R$drawable.uikit_icn_100_emoji_81), Integer.valueOf(R$drawable.uikit_icn_100_emoji_82), Integer.valueOf(R$drawable.uikit_icn_100_emoji_83), Integer.valueOf(R$drawable.uikit_icn_100_emoji_84), Integer.valueOf(R$drawable.uikit_icn_100_emoji_85), Integer.valueOf(R$drawable.uikit_icn_100_emoji_86), Integer.valueOf(R$drawable.uikit_icn_100_emoji_87), Integer.valueOf(R$drawable.uikit_icn_100_emoji_88), Integer.valueOf(R$drawable.uikit_icn_100_emoji_89), Integer.valueOf(R$drawable.uikit_icn_100_emoji_90), Integer.valueOf(R$drawable.uikit_icn_100_emoji_91), Integer.valueOf(R$drawable.uikit_icn_100_emoji_92), Integer.valueOf(R$drawable.uikit_icn_100_emoji_93), Integer.valueOf(R$drawable.uikit_icn_100_emoji_94), Integer.valueOf(R$drawable.uikit_icn_100_emoji_95), Integer.valueOf(R$drawable.uikit_icn_100_emoji_96), Integer.valueOf(R$drawable.uikit_icn_100_emoji_97), Integer.valueOf(R$drawable.uikit_icn_100_emoji_98), Integer.valueOf(R$drawable.uikit_icn_100_emoji_99), Integer.valueOf(R$drawable.uikit_icn_100_emoji_100), Integer.valueOf(R$drawable.uikit_icn_100_emoji_101), Integer.valueOf(R$drawable.uikit_icn_100_emoji_102), Integer.valueOf(R$drawable.uikit_icn_100_emoji_103), Integer.valueOf(R$drawable.uikit_icn_100_emoji_104), Integer.valueOf(R$drawable.uikit_icn_100_emoji_105), Integer.valueOf(R$drawable.uikit_icn_100_emoji_106), Integer.valueOf(R$drawable.uikit_icn_100_emoji_107), Integer.valueOf(R$drawable.uikit_icn_100_emoji_108), Integer.valueOf(R$drawable.uikit_icn_100_emoji_109));
    public final List f = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_110), Integer.valueOf(R$drawable.uikit_icn_100_emoji_111), Integer.valueOf(R$drawable.uikit_icn_100_emoji_112), Integer.valueOf(R$drawable.uikit_icn_100_emoji_113), Integer.valueOf(R$drawable.uikit_icn_100_emoji_114), Integer.valueOf(R$drawable.uikit_icn_100_emoji_115), Integer.valueOf(R$drawable.uikit_icn_100_emoji_116), Integer.valueOf(R$drawable.uikit_icn_100_emoji_117), Integer.valueOf(R$drawable.uikit_icn_100_emoji_118), Integer.valueOf(R$drawable.uikit_icn_100_emoji_119), Integer.valueOf(R$drawable.uikit_icn_100_emoji_120), Integer.valueOf(R$drawable.uikit_icn_100_emoji_121));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f11992g = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_122), Integer.valueOf(R$drawable.uikit_icn_100_emoji_123), Integer.valueOf(R$drawable.uikit_icn_100_emoji_124), Integer.valueOf(R$drawable.uikit_icn_100_emoji_125), Integer.valueOf(R$drawable.uikit_icn_100_emoji_126), Integer.valueOf(R$drawable.uikit_icn_100_emoji_127), Integer.valueOf(R$drawable.uikit_icn_100_emoji_128), Integer.valueOf(R$drawable.uikit_icn_100_emoji_129), Integer.valueOf(R$drawable.uikit_icn_100_emoji_130), Integer.valueOf(R$drawable.uikit_icn_100_emoji_131), Integer.valueOf(R$drawable.uikit_icn_100_emoji_132), Integer.valueOf(R$drawable.uikit_icn_100_emoji_133), Integer.valueOf(R$drawable.uikit_icn_100_emoji_134), Integer.valueOf(R$drawable.uikit_icn_100_emoji_135), Integer.valueOf(R$drawable.uikit_icn_100_emoji_136), Integer.valueOf(R$drawable.uikit_icn_100_emoji_137), Integer.valueOf(R$drawable.uikit_icn_100_emoji_138), Integer.valueOf(R$drawable.uikit_icn_100_emoji_139));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f11993h = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_140), Integer.valueOf(R$drawable.uikit_icn_100_emoji_141), Integer.valueOf(R$drawable.uikit_icn_100_emoji_142), Integer.valueOf(R$drawable.uikit_icn_100_emoji_143), Integer.valueOf(R$drawable.uikit_icn_100_emoji_144), Integer.valueOf(R$drawable.uikit_icn_100_emoji_145), Integer.valueOf(R$drawable.uikit_icn_100_emoji_146), Integer.valueOf(R$drawable.uikit_icn_100_emoji_147), Integer.valueOf(R$drawable.uikit_icn_100_emoji_148), Integer.valueOf(R$drawable.uikit_icn_100_emoji_149), Integer.valueOf(R$drawable.uikit_icn_100_emoji_150), Integer.valueOf(R$drawable.uikit_icn_100_emoji_151), Integer.valueOf(R$drawable.uikit_icn_100_emoji_152), Integer.valueOf(R$drawable.uikit_icn_100_emoji_153), Integer.valueOf(R$drawable.uikit_icn_100_emoji_154), Integer.valueOf(R$drawable.uikit_icn_100_emoji_155), Integer.valueOf(R$drawable.uikit_icn_100_emoji_156), Integer.valueOf(R$drawable.uikit_icn_100_emoji_157), Integer.valueOf(R$drawable.uikit_icn_100_emoji_158), Integer.valueOf(R$drawable.uikit_icn_100_emoji_159), Integer.valueOf(R$drawable.uikit_icn_100_emoji_160), Integer.valueOf(R$drawable.uikit_icn_100_emoji_161), Integer.valueOf(R$drawable.uikit_icn_100_emoji_162), Integer.valueOf(R$drawable.uikit_icn_100_emoji_163), Integer.valueOf(R$drawable.uikit_icn_100_emoji_164), Integer.valueOf(R$drawable.uikit_icn_100_emoji_165), Integer.valueOf(R$drawable.uikit_icn_100_emoji_166), Integer.valueOf(R$drawable.uikit_icn_100_emoji_167), Integer.valueOf(R$drawable.uikit_icn_100_emoji_168), Integer.valueOf(R$drawable.uikit_icn_100_emoji_169), Integer.valueOf(R$drawable.uikit_icn_100_emoji_170), Integer.valueOf(R$drawable.uikit_icn_100_emoji_171), Integer.valueOf(R$drawable.uikit_icn_100_emoji_172), Integer.valueOf(R$drawable.uikit_icn_100_emoji_173), Integer.valueOf(R$drawable.uikit_icn_100_emoji_174), Integer.valueOf(R$drawable.uikit_icn_100_emoji_175), Integer.valueOf(R$drawable.uikit_icn_100_emoji_176), Integer.valueOf(R$drawable.uikit_icn_100_emoji_177), Integer.valueOf(R$drawable.uikit_icn_100_emoji_178), Integer.valueOf(R$drawable.uikit_icn_100_emoji_179));
    public final List i = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_180), Integer.valueOf(R$drawable.uikit_icn_100_emoji_181), Integer.valueOf(R$drawable.uikit_icn_100_emoji_182), Integer.valueOf(R$drawable.uikit_icn_100_emoji_183), Integer.valueOf(R$drawable.uikit_icn_100_emoji_184), Integer.valueOf(R$drawable.uikit_icn_100_emoji_185), Integer.valueOf(R$drawable.uikit_icn_100_emoji_186), Integer.valueOf(R$drawable.uikit_icn_100_emoji_187), Integer.valueOf(R$drawable.uikit_icn_100_emoji_188), Integer.valueOf(R$drawable.uikit_icn_100_emoji_189), Integer.valueOf(R$drawable.uikit_icn_100_emoji_190), Integer.valueOf(R$drawable.uikit_icn_100_emoji_191), Integer.valueOf(R$drawable.uikit_icn_100_emoji_192));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f11994j = v.k(Integer.valueOf(R$drawable.uikit_icn_100_emoji_193), Integer.valueOf(R$drawable.uikit_icn_100_emoji_194), Integer.valueOf(R$drawable.uikit_icn_100_emoji_195), Integer.valueOf(R$drawable.uikit_icn_100_emoji_196), Integer.valueOf(R$drawable.uikit_icn_100_emoji_197), Integer.valueOf(R$drawable.uikit_icn_100_emoji_198), Integer.valueOf(R$drawable.uikit_icn_100_emoji_199), Integer.valueOf(R$drawable.uikit_icn_100_emoji_200), Integer.valueOf(R$drawable.uikit_icn_100_emoji_7));
    public final List k = v.k(Integer.valueOf(R$drawable.uikit_icn_200_sticker_mario_gotze), Integer.valueOf(R$drawable.uikit_icn_200_sticker_1), Integer.valueOf(R$drawable.uikit_icn_200_sticker_2), Integer.valueOf(R$drawable.uikit_icn_200_sticker_3), Integer.valueOf(R$drawable.uikit_icn_200_sticker_4), Integer.valueOf(R$drawable.uikit_icn_200_sticker_5), Integer.valueOf(R$drawable.uikit_icn_200_sticker_6), Integer.valueOf(R$drawable.uikit_icn_200_sticker_7), Integer.valueOf(R$drawable.uikit_icn_200_sticker_8), Integer.valueOf(R$drawable.uikit_icn_200_sticker_9), Integer.valueOf(R$drawable.uikit_icn_200_sticker_10), Integer.valueOf(R$drawable.uikit_icn_200_sticker_11), Integer.valueOf(R$drawable.uikit_icn_200_sticker_12), Integer.valueOf(R$drawable.uikit_icn_200_sticker_13), Integer.valueOf(R$drawable.uikit_icn_200_sticker_14), Integer.valueOf(R$drawable.uikit_icn_200_sticker_15), Integer.valueOf(R$drawable.uikit_icn_200_sticker_16), Integer.valueOf(R$drawable.uikit_icn_200_sticker_17), Integer.valueOf(R$drawable.uikit_icn_200_sticker_18), Integer.valueOf(R$drawable.uikit_icn_200_sticker_19), Integer.valueOf(R$drawable.uikit_icn_200_sticker_20), Integer.valueOf(R$drawable.uikit_icn_200_sticker_21), Integer.valueOf(R$drawable.uikit_icn_200_sticker_22), Integer.valueOf(R$drawable.uikit_icn_200_sticker_23), Integer.valueOf(R$drawable.uikit_icn_200_sticker_24), Integer.valueOf(R$drawable.uikit_icn_200_sticker_25), Integer.valueOf(R$drawable.uikit_icn_200_sticker_26), Integer.valueOf(R$drawable.uikit_icn_200_sticker_27), Integer.valueOf(R$drawable.uikit_icn_200_sticker_28), Integer.valueOf(R$drawable.uikit_icn_200_sticker_29), Integer.valueOf(R$drawable.uikit_icn_200_sticker_30));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f11995l = v.k(Integer.valueOf(R$drawable.uikit_icn_200_sticker_mexico_1), Integer.valueOf(R$drawable.uikit_icn_200_sticker_mexico_2), Integer.valueOf(R$drawable.uikit_icn_200_sticker_mexico_3));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f11996m = v.k(Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_1), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_2), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_3), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_4), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_5), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_6), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_7), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_8), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_9), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_10), Integer.valueOf(R$drawable.uikit_icn_200_sticker_uk_11));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11997n;

    public static final class a {
        private a() {
        }
    }

    public final List a(TextLocalisedClause textLocalisedClause, String str, List list) {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(str, (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            String strValueOf = String.valueOf(iIntValue);
            Integer numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_personalisation_emoji_picker_item_accessibility_label, u.c(Integer.valueOf(this.f11997n + 1)), null, 12);
            this.f11997n++;
            Unit unit = Unit.f186387a;
            arrayList.add(new EmojiDelegate.Model(iIntValue, textLocalisedClause2, numValueOf, strValueOf));
        }
        return i2b.a.r(model, new xk(str, arrayList, null, null, null, 60));
    }

    @Override // cli.n
    public final o c(j jVar) {
        Collection collectionC;
        ArrayList arrayList;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_title, null, null, 14), null, null, null, false, 30);
        wi0.b bVar = domainState.f11987a;
        this.f11997n = 0;
        aim.e eVarB = u.b();
        aim.e eVarB2 = u.b();
        wi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, wi0.b.V)) {
            String strValueOf = String.valueOf(R$drawable.uikit_icn_200_sticker_czech);
            int i = R$drawable.uikit_icn_200_sticker_czech;
            Integer numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_personalisation_emoji_picker_item_accessibility_label, u.c(Integer.valueOf(this.f11997n + 1)), null, 12);
            this.f11997n++;
            Unit unit = Unit.f186387a;
            collectionC = u.c(new EmojiDelegate.Model(i, textLocalisedClause, numValueOf, strValueOf));
        } else {
            if (Intrinsics.f(bVar, wi0.b.Y1)) {
                List list = this.f11995l;
                arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    int iIntValue = ((Number) it8.next()).intValue();
                    String strValueOf2 = String.valueOf(iIntValue);
                    Integer numValueOf2 = Integer.valueOf(R$attr.uikit_colorForeground);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_personalisation_emoji_picker_item_accessibility_label, u.c(Integer.valueOf(this.f11997n + 1)), null, 12);
                    this.f11997n++;
                    Unit unit2 = Unit.f186387a;
                    arrayList.add(new EmojiDelegate.Model(iIntValue, textLocalisedClause2, numValueOf2, strValueOf2));
                }
            } else if (Intrinsics.f(bVar, wi0.b.p0)) {
                List list2 = this.f11996m;
                arrayList = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    int iIntValue2 = ((Number) it9.next()).intValue();
                    String strValueOf3 = String.valueOf(iIntValue2);
                    Integer numValueOf3 = Integer.valueOf(R$attr.uikit_colorForeground);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.card_personalisation_emoji_picker_item_accessibility_label, u.c(Integer.valueOf(this.f11997n + 1)), null, 12);
                    this.f11997n++;
                    Unit unit3 = Unit.f186387a;
                    arrayList.add(new EmojiDelegate.Model(iIntValue2, textLocalisedClause3, numValueOf3, strValueOf3));
                }
            } else {
                collectionC = f0.f322471a;
            }
            collectionC = arrayList;
        }
        eVarB2.addAll(collectionC);
        List list3 = this.k;
        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            int iIntValue3 = ((Number) it10.next()).intValue();
            String strValueOf4 = String.valueOf(iIntValue3);
            Integer numValueOf4 = Integer.valueOf(R$attr.uikit_colorForeground);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.card_personalisation_emoji_picker_item_accessibility_label, u.c(Integer.valueOf(this.f11997n + 1)), null, 12);
            this.f11997n++;
            Unit unit4 = Unit.f186387a;
            arrayList2.add(new EmojiDelegate.Model(iIntValue3, textLocalisedClause4, numValueOf4, strValueOf4));
        }
        eVarB2.addAll(arrayList2);
        eVarB.addAll(u.c(new xk("STICKERS_GRID_BOX_LIST_ID", u.a(eVarB2), 3, null, null, 56)));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_classics, null, null, 14), "EMOJIS_CLASSICS_LIST_ID", this.f11993h));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_activity, null, null, 14), "EMOJIS_ACTIVITIES_LIST_ID", this.f11992g));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_animals, null, null, 14), "EMOJIS_ANIMALS_LIST_ID", this.f11991c));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_food, null, null, 14), "EMOJIS_FOOD_LIST_ID", this.f11990b));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_music, null, null, 14), "EMOJIS_MUSIC_LIST_ID", this.f11994j));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_nature, null, null, 14), "EMOJIS_NATURE_LIST_ID", this.d));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_objects, null, null, 14), "EMOJIS_OBJECTS_LIST_ID", this.e));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_symbols, null, null, 14), "EMOJIS_SYMBOLS_LIST_ID", this.f11989a));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_transportation, null, null, 14), "EMOJIS_TRANSPORTATION_LIST_ID", this.i));
        eVarB.addAll(a(new TextLocalisedClause(R$string.card_personalisation_emoji_picker_category_others, null, null, 14), "EMOJIS_OTHERS_LIST_ID", this.f));
        return new cii.b(null, u.a(eVarB), aVar);
    }
}
