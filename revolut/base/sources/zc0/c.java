package zc0;

import android.os.Parcelable;
import android.text.InputFilter;
import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.backend_flow.R$string;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.delegates.ka;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backend_flow.domain.models.BackendIconType;
import com.revolut.feature.backend_flow.domain.models.ChipsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionOption;
import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.DateOption;
import com.revolut.feature.backend_flow.domain.models.DayPickerItem;
import com.revolut.feature.backend_flow.domain.models.DocumentItem;
import com.revolut.feature.backend_flow.domain.models.Filter;
import com.revolut.feature.backend_flow.domain.models.FilterValue;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlItem;
import com.revolut.feature.backend_flow.domain.models.InfoMessageItem;
import com.revolut.feature.backend_flow.domain.models.MailItem;
import com.revolut.feature.backend_flow.domain.models.MonthPickerItem;
import com.revolut.feature.backend_flow.domain.models.MultiSelectionItem;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import com.revolut.feature.backend_flow.domain.models.SignatureInputItem;
import com.revolut.feature.backend_flow.domain.models.SingleSelectionItem;
import com.revolut.feature.backend_flow.domain.models.StarRatingInputItem;
import com.revolut.feature.backend_flow.domain.models.SummarySectionItem;
import com.revolut.feature.backend_flow.domain.models.TextInputItem;
import com.revolut.feature.backend_flow.domain.models.TextItem;
import com.revolut.feature.backend_flow.domain.models.TextItemStyle;
import com.revolut.feature.backend_flow.domain.models.TimeInputItem;
import com.revolut.feature.backend_flow.domain.models.TitleValueItem;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import com.revolut.feature.backend_flow.domain.models.YearPickerItem;
import com.revolut.feature.backend_flow.domain.models.YesNoInputItem;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ck0;
import ip0.iq;
import ip0.kr;
import ip0.lr;
import ip0.mx;
import ip0.pr;
import ip0.qr;
import ip0.rr;
import ip0.sr;
import ip0.up0;
import ip0.y80;
import ip0.yj0;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements yc0.y, bd0.a, yc0.v, yc0.c0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final DateTimeFormatter f321015s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Filter.Gt f321016t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yc0.y f321017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bd0.a f321018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc0.v f321019c;
    public final /* synthetic */ yc0.c0 d;
    public final w80.b e;
    public final t70.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aa0.y f321020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ad0.n f321021h;
    public final yc0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yc0.o f321022j;
    public final ad0.p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ad0.c f321023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ad0.t f321024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ad0.s f321025n;
    public final ad0.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ad0.v f321026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yc0.q f321027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yc0.p f321028r;

    static {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("HH:mm");
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterOfPattern, "ofPattern(...)");
        f321015s = dateTimeFormatterOfPattern;
        f321016t = new Filter.Gt(new FilterValue.DateValue(new DateOption.Specific(new LocalDate(1900, 1, 1))), false);
    }

    public c(w80.b amountFormatter, t70.g localization, p80.a fileFormatter, aa0.y cardNumberValidator, ad0.n entitiesMapper, yc0.j bottomPromptScreenMapper, yc0.o htmlPromptScreenMapper, ad0.p informationItemsMapper, ad0.c backendCardMapper, ad0.t singleSelectionOptionItemMapper, ad0.s multiSelectionOptionItemMapper, ad0.g editableListItemMapper, ad0.v tutorialScreenMapper, ad0.o filtersInputMapper, yc0.q imageItemMapper, yc0.p htmlStringItemMapper, yc0.y navBarItemsMapper, bd0.a itemsSearchFilter, yc0.v infoMessageDialogMapper, yc0.c0 secondaryDescriptionDialogMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(fileFormatter, "fileFormatter");
        Intrinsics.checkNotNullParameter(cardNumberValidator, "cardNumberValidator");
        Intrinsics.checkNotNullParameter(entitiesMapper, "entitiesMapper");
        Intrinsics.checkNotNullParameter(bottomPromptScreenMapper, "bottomPromptScreenMapper");
        Intrinsics.checkNotNullParameter(htmlPromptScreenMapper, "htmlPromptScreenMapper");
        Intrinsics.checkNotNullParameter(informationItemsMapper, "informationItemsMapper");
        Intrinsics.checkNotNullParameter(backendCardMapper, "backendCardMapper");
        Intrinsics.checkNotNullParameter(singleSelectionOptionItemMapper, "singleSelectionOptionItemMapper");
        Intrinsics.checkNotNullParameter(multiSelectionOptionItemMapper, "multiSelectionOptionItemMapper");
        Intrinsics.checkNotNullParameter(editableListItemMapper, "editableListItemMapper");
        Intrinsics.checkNotNullParameter(tutorialScreenMapper, "tutorialScreenMapper");
        Intrinsics.checkNotNullParameter(filtersInputMapper, "filtersInputMapper");
        Intrinsics.checkNotNullParameter(imageItemMapper, "imageItemMapper");
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        Intrinsics.checkNotNullParameter(navBarItemsMapper, "navBarItemsMapper");
        Intrinsics.checkNotNullParameter(itemsSearchFilter, "itemsSearchFilter");
        Intrinsics.checkNotNullParameter(infoMessageDialogMapper, "infoMessageDialogMapper");
        Intrinsics.checkNotNullParameter(secondaryDescriptionDialogMapper, "secondaryDescriptionDialogMapper");
        this.f321017a = navBarItemsMapper;
        this.f321018b = itemsSearchFilter;
        this.f321019c = infoMessageDialogMapper;
        this.d = secondaryDescriptionDialogMapper;
        this.e = amountFormatter;
        this.f = localization;
        this.f321020g = cardNumberValidator;
        this.f321021h = entitiesMapper;
        this.i = bottomPromptScreenMapper;
        this.f321022j = htmlPromptScreenMapper;
        this.k = informationItemsMapper;
        this.f321023l = backendCardMapper;
        this.f321024m = singleSelectionOptionItemMapper;
        this.f321025n = multiSelectionOptionItemMapper;
        this.o = editableListItemMapper;
        this.f321026p = tutorialScreenMapper;
        this.f321027q = imageItemMapper;
        this.f321028r = htmlStringItemMapper;
    }

    public static koi.j A(TextItem textItem, int i) {
        TextItemStyle textItemStyle = textItem.f63690b;
        if (Intrinsics.f(textItemStyle, TextItemStyle.GroupHeader.f63691a)) {
            return new TextDelegate.Model(a0.d.n("TEXT_ITEM_", i), new HtmlClause(0, 30, (Integer) null, (Object) null, textItem.f63689a), false, new ck0(yj0.START), null, null, 0, 0, 0, 0, 2036);
        }
        if ((textItemStyle instanceof TextItemStyle.PrimaryText) || (textItemStyle instanceof TextItemStyle.Undefined)) {
            return new PlainTextDelegate.Model(a0.d.n("TEXT_ITEM_", i), (Clause) null, (Clause) new HtmlClause(0, 30, (Integer) null, (Object) null, textItem.f63689a), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static koi.j B(YearPickerItem yearPickerItem) {
        up0 up0Var = new up0(yearPickerItem.f63723a, yearPickerItem.f63725c, yearPickerItem.d, yearPickerItem.e, yearPickerItem.f);
        yp0.b.l(up0Var, 0, 0, 0, 0, null, false, 63);
        return up0Var;
    }

    public static ArrayList D(SignatureInputItem signatureInputItem) {
        RowDelegate.Model model;
        aim.e eVarB = zhm.u.b();
        String str = signatureInputItem.e;
        String str2 = signatureInputItem.f63627a;
        if (str != null) {
            boolean zF = Intrinsics.f(signatureInputItem.i, Boolean.TRUE);
            model = new RowDelegate.Model(j6.a.q("OUTER_", str2), null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), of.SMALL, 0, null, null, null, 0, zF ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null, zF, null, false, null, null, null, null, null, null, zF ? new t3(str2, str) : null, null, 0, 0, 0, 0, 532673520);
        } else {
            model = null;
        }
        eVarB.add(model);
        Pair pairE = e(signatureInputItem);
        boolean zBooleanValue = ((Boolean) pairE.f186385a).booleanValue();
        Clause clause = (Clause) pairE.f186386b;
        String str3 = signatureInputItem.f63627a;
        String str4 = signatureInputItem.f;
        TextClause textClause = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str5 = signatureInputItem.f63628b;
        eVarB.add(new InputTextDelegate.Model(str3, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, textClause, new TextClause(signatureInputItem.f63630g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, false, clause, null, null, null, null, null, false, null, null, zBooleanValue, false, false, false, null, 0, null, pr.f165860a, false, signatureInputItem.f63631h, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -620888208, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        return zhm.d0.Z(zhm.u.a(eVarB));
    }

    public static List G(CountrySelectionItem countrySelectionItem) {
        String strI;
        int i = b.f[countrySelectionItem.f63371g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            r6.b.D("CountrySelectionItem (style = LIST) is supposed to be handled as a standalone picker screen");
            return zhm.f0.f322471a;
        }
        String str = countrySelectionItem.f63368a;
        wi0.b bVar = countrySelectionItem.e;
        InputTextDelegate.Model modelA = yp0.r.a(new InputTextDelegate.Model(str, (bVar == null || (strI = tz4.d.i(countrySelectionItem, bVar)) == null) ? null : new TextClause(strI, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), h(Integer.valueOf(R$string.form_builder_chooser_input_placeholder), countrySelectionItem.f63369b), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(modelA);
    }

    public static RowDelegate.Model H(RowDelegate.Model model) {
        return RowDelegate.Model.x(model, null, null, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, null, 0, 0, 0, 0, null, -1025, 15);
    }

    public static List I(List list, SelectionItem.Group group) {
        String str = group.f63613b;
        if (str != null) {
            return yp0.b.g(list, new ListSubheaderDelegate.Model(group.f63612a, (Image) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), yp0.e0.OUTSIDE_BOX, 0, 0, 124);
        }
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }

    public static ArrayList J(List list, SingleSelectionItem.SeparationStyle separationStyle) {
        List<qv0.i> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (qv0.i iVar : list2) {
            if (Intrinsics.f(separationStyle, SingleSelectionItem.SeparationStyle.Spaced.f63649a)) {
                yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
            } else if (!Intrinsics.f(separationStyle, SingleSelectionItem.SeparationStyle.Joint.f63648a) && !(separationStyle instanceof SingleSelectionItem.SeparationStyle.Unknown) && separationStyle != null) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(iVar);
        }
        return arrayList;
    }

    public static Pair e(xl2.h0 h0Var) {
        ValidationResult i = h0Var.getI();
        String f63596g = h0Var.getF63596g();
        return (f63596g == null || kotlin.text.d0.W(f63596g) || !(i instanceof ValidationResult.Error)) ? new Pair(Boolean.FALSE, null) : new Pair(Boolean.TRUE, ((ValidationResult.Error) i).f63718a);
    }

    public static LayeredImage g(BackendIconType backendIconType) throws Throwable {
        int i;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        Intrinsics.checkNotNullParameter(backendIconType, "<this>");
        if (backendIconType instanceof BackendIconType.CandlestickChart) {
            i = R$drawable.uikit_icn_24_candlestick_chart;
        } else if (backendIconType instanceof BackendIconType.Cash) {
            i = R$drawable.uikit_icn_24_cash;
        } else if (backendIconType instanceof BackendIconType.Coins) {
            i = R$drawable.uikit_icn_24_coins;
        } else if (backendIconType instanceof BackendIconType.Document) {
            i = R$drawable.uikit_icn_24_documents_pair;
        } else if (backendIconType instanceof BackendIconType.Flag) {
            i = R$drawable.uikit_icn_24_flag;
        } else if (backendIconType instanceof BackendIconType.Laptop) {
            i = R$drawable.uikit_icn_24_laptop;
        } else if (backendIconType instanceof BackendIconType.Lightning) {
            i = R$drawable.uikit_icn_24_lightning;
        } else if (backendIconType instanceof BackendIconType.NationalId) {
            i = R$drawable.uikit_icn_24_national_id;
        } else if (backendIconType instanceof BackendIconType.People) {
            i = R$drawable.uikit_icn_24_people;
        } else if (backendIconType instanceof BackendIconType.Percent) {
            i = R$drawable.uikit_icn_24_percent;
        } else if (backendIconType instanceof BackendIconType.Pin) {
            i = R$drawable.uikit_icn_24_location_pin;
        } else if (backendIconType instanceof BackendIconType.Profile) {
            i = R$drawable.uikit_icn_24_profile;
        } else if (backendIconType instanceof BackendIconType.RepairTool) {
            i = R$drawable.uikit_icn_24_repair_tool;
        } else if (backendIconType instanceof BackendIconType.SavingsVault) {
            i = R$drawable.uikit_icn_24_savings_vault;
        } else if (backendIconType instanceof BackendIconType.Security) {
            i = R$drawable.uikit_icn_24_shield;
        } else if (backendIconType instanceof BackendIconType.Services) {
            i = R$drawable.uikit_icn_24_services;
        } else if (backendIconType instanceof BackendIconType.Umbrella) {
            i = R$drawable.uikit_icn_24_umbrella;
        } else if (backendIconType instanceof BackendIconType.Vault) {
            i = R$drawable.uikit_icn_24_vault;
        } else if (backendIconType instanceof BackendIconType.Warning) {
            i = R$drawable.uikit_icn_24_exclamation_triangle;
        } else if (backendIconType instanceof BackendIconType.Wealth) {
            i = R$drawable.uikit_icn_24_wealth;
        } else if (backendIconType instanceof BackendIconType.SandWatch) {
            hx7.e.n(new IllegalArgumentException("There is no 24dp icon for " + backendIconType + " icon type"));
            i = R$drawable.uikit_icn_24_dot;
        } else {
            if (!(backendIconType instanceof BackendIconType.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_dot;
        }
        return LayeredImage.Companion.b(companion, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 9.0f, Float.valueOf(22.0f), null, 32);
    }

    public static Clause h(Integer num, String str) {
        if (str == null || kotlin.text.d0.W(str)) {
            return num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static CellDetailsDelegate.Model i(TitleValueItem titleValueItem, int i) {
        return new CellDetailsDelegate.Model(a0.d.n("TEXT_VALUE_", i), new TextClause(titleValueItem.f63699a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(titleValueItem.f63700b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static InputChecklistDelegate.Model j(SelectionItem.CustomOption customOption, SelectionItem selectionItem) {
        iq iqVar;
        SelectionItem.CustomAnswer f = selectionItem.getF();
        boolean zJ = pd.b.j(f != null ? Boolean.valueOf(f.f63608b) : null);
        if (selectionItem instanceof MultiSelectionItem) {
            iqVar = iq.CHECK_BUTTON;
        } else {
            if (!(selectionItem instanceof SingleSelectionItem)) {
                throw new NoWhenBranchMatchedException();
            }
            iqVar = iq.RADIO_BUTTON;
        }
        iq iqVar2 = iqVar;
        String id10 = selectionItem.getId();
        SelectionItem.CustomAnswer f4 = selectionItem.getF();
        String str = f4 != null ? f4.f63607a : null;
        if (str == null) {
            str = "";
        }
        return new InputChecklistDelegate.Model(id10, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), selectionItem.getF63640g().contains(customOption.f63609a), false, new InputChecklistDelegate.a.C0408a(4, 0, new TextClause(customOption.f63610b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zJ), iqVar2, null, null, new s3(selectionItem, customOption.f63609a, false), null, 0, 0, 0, 523976);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.InputTextDelegate.Model k(com.revolut.feature.backend_flow.domain.models.DropDownItem r49) {
        /*
            r0 = r49
            java.lang.String r1 = r0.f63397a
            java.lang.String r2 = r0.f
            r3 = 0
            if (r2 == 0) goto L49
            java.util.List r4 = r0.e
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L29
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.revolut.feature.backend_flow.domain.models.SelectionItem$Option r6 = (com.revolut.feature.backend_flow.domain.models.SelectionItem.Option) r6
            java.lang.String r6 = r6.getF63622a()
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 == 0) goto L11
            goto L2a
        L29:
            r5 = r3
        L2a:
            boolean r2 = r5 instanceof com.revolut.feature.backend_flow.domain.models.SelectionItem.Option.WithTitle
            if (r2 == 0) goto L31
            com.revolut.feature.backend_flow.domain.models.SelectionItem$Option$WithTitle r5 = (com.revolut.feature.backend_flow.domain.models.SelectionItem.Option.WithTitle) r5
            goto L32
        L31:
            r5 = r3
        L32:
            if (r5 == 0) goto L38
            java.lang.String r2 = r5.f63624c
            r5 = r2
            goto L39
        L38:
            r5 = r3
        L39:
            if (r5 == 0) goto L49
            com.revolut.core.ui_kit.models.TextClause r4 = new com.revolut.core.ui_kit.models.TextClause
            r10 = 0
            r11 = 126(0x7e, float:1.77E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2 = r4
            goto L4a
        L49:
            r2 = r3
        L4a:
            com.revolut.core.ui_kit.models.TextClause r3 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r4 = r0.f63399c
            r9 = 0
            r10 = 126(0x7e, float:1.77E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.revolut.core.ui_kit.delegates.InputTextDelegate$Model r0 = new com.revolut.core.ui_kit.delegates.InputTextDelegate$Model
            r4 = 0
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = -8
            r48 = 65535(0xffff, float:9.1834E-41)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            com.revolut.core.ui_kit.delegates.InputTextDelegate$Model r0 = yp0.r.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zc0.c.k(com.revolut.feature.backend_flow.domain.models.DropDownItem):com.revolut.core.ui_kit.delegates.InputTextDelegate$Model");
    }

    public static InputTextDelegate.Model l(TimeInputItem timeInputItem) {
        String str;
        String str2 = timeInputItem.f63694a;
        LocalTime localTime = timeInputItem.d;
        if (localTime == null || (str = localTime.format(f321015s)) == null) {
            str = timeInputItem.e;
        }
        String str3 = str;
        TextClause textClause = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str4 = timeInputItem.f63696c;
        String str5 = (str4 == null || kotlin.text.d0.W(str4)) ? null : str4;
        return new InputTextDelegate.Model(str2, textClause, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.form_builder_time_input_placeholder, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, kr.f165065a, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, new w3(timeInputItem.f63694a), null, null, 0, 0, 0, 0, -2097160, 65023);
    }

    public static ka m(PhoneInputItem phoneInputItem) {
        String str = phoneInputItem.f63569a;
        String str2 = phoneInputItem.f63572g;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        Pair pair = new Pair(new fj0.b(phoneInputItem.f), phoneInputItem.f63573h);
        String str4 = phoneInputItem.f63571c;
        String str5 = (str4 == null || kotlin.text.d0.W(str4)) ? null : str4;
        ka kaVar = new ka(str, str3, pair, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(com.revolut.uicomponent.R$string.phone_input_phone_number_label, null, null, 14), null, null, false, false, 8176);
        int i = R$attr.uikit_dp0;
        yp0.b.r(kaVar, 0, 0, i, i, 3);
        return kaVar;
    }

    public static RowDelegate.Model n(SummarySectionItem summarySectionItem) {
        return H(new RowDelegate.Model(j6.a.q("SUMMARY_SECTION_LIST_ID_PREFIX_", summarySectionItem.f63670a), g(summarySectionItem.f63672c), null, null, new TextClause(summarySectionItem.f63670a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(summarySectionItem.f63671b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, false, null, null, null, null, null, summarySectionItem, null, 0, 0, 0, 0, 1056964460));
    }

    public static kj o(HtmlItem htmlItem, int i) {
        return new kj(a0.d.n("WEB_VIEW_", i), new lj(htmlItem.f63477a, "utf-8"), null, Constants.TAG_FC_SPEED_MODE);
    }

    public static ip0.z p(ChipsSelectionItem chipsSelectionItem) {
        String listId = chipsSelectionItem.f63357a;
        List<ChipsSelectionItem.Chip> list = chipsSelectionItem.d;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (ChipsSelectionItem.Chip chip : list) {
            arrayList.add(zhm.u.c(new ActionsView.Item(chip.f63360a, chipsSelectionItem.e.contains(chip.f63360a) ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, new TextClause(chip.f63361b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, new a3(chipsSelectionItem.f63357a, chip), null, 24476)));
        }
        ip0.x actionGroups = new ip0.x(arrayList);
        mx0.l layoutType = mx0.l.FLEXBOX;
        aw0.j0 backgroundType = aw0.j0.DEFAULT;
        int i = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(actionGroups, "actionGroups");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        return new ip0.z(listId, arrayList, backgroundType, layoutType, false, false, i, i, 0, null, 26496);
    }

    public static ArrayList q(CurrencySelectionItem currencySelectionItem) {
        List list = currencySelectionItem.f63376c;
        String str = currencySelectionItem.f63374a;
        List<CurrencySelectionOption> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (CurrencySelectionOption currencySelectionOption : list2) {
            xi0.b bVar = currencySelectionOption.f63377a;
            String strR = a0.d.r(str, bVar.f306286a);
            String str2 = currencySelectionOption.f63378b;
            if (str2 == null) {
                str2 = "";
            }
            xi0.b bVar2 = null;
            CountryImage countryImage = new CountryImage(str2, (Integer) null, (ez0.e) null, 14);
            String str3 = currencySelectionOption.f63379c;
            Clause textClause = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CurrencyClause(currencySelectionOption.f63377a, null, null, 6);
            TextClause textClause2 = new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            b3 b3Var = new b3(str, currencySelectionOption);
            CurrencySelectionOption currencySelectionOption2 = currencySelectionItem.d;
            if (currencySelectionOption2 != null) {
                bVar2 = currencySelectionOption2.f63377a;
            }
            arrayList.add(new RowDelegate.Model(strR, countryImage, null, null, textClause, textClause2, null, null, 0, null, false, bVar.equals(bVar2), null, null, null, null, null, b3Var, null, 0, 0, 0, 0, 1056956268));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public static List r(YesNoInputItem yesNoInputItem, boolean z) {
        if (!z) {
            String str = yesNoInputItem.f63726a;
            return zhm.v.k(new InputDisclosureDelegate.Model(str, new TextClause(yesNoInputItem.f63728c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new y3(str, true), null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new InputDisclosureDelegate.Model(yesNoInputItem.f63726a, new TextClause(yesNoInputItem.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new y3(str, false), null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        }
        String str2 = yesNoInputItem.f63726a;
        Boolean bool = yesNoInputItem.e;
        String strR = a0.d.r(str2, yesNoInputItem.f63728c);
        TextClause textClause = new TextClause(yesNoInputItem.f63728c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean zF = Intrinsics.f(bool, Boolean.TRUE);
        y3 y3Var = new y3(str2, true);
        iq iqVar = iq.RADIO_BUTTON;
        return zhm.v.k(new InputChecklistDelegate.Model(strR, textClause, zF, false, new InputChecklistDelegate.a.b(null), iqVar, null, null, y3Var, null, 0, 0, 0, 523976), new InputChecklistDelegate.Model(a0.d.r(str2, yesNoInputItem.d), new TextClause(yesNoInputItem.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(bool, Boolean.FALSE), false, new InputChecklistDelegate.a.b(null), iqVar, null, null, new y3(str2, false), null, 0, 0, 0, 523976));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static koi.j s(com.revolut.feature.backend_flow.domain.models.ChooserItem r49) {
        /*
            r0 = r49
            java.lang.String r1 = r0.f63362a
            java.lang.String r2 = r0.f
            r3 = 0
            if (r2 == 0) goto L41
            java.util.List r4 = r0.e
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L27
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.revolut.feature.backend_flow.domain.models.ChooserOption r6 = (com.revolut.feature.backend_flow.domain.models.ChooserOption) r6
            java.lang.String r6 = r6.f63366a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 == 0) goto L11
            goto L28
        L27:
            r5 = r3
        L28:
            com.revolut.feature.backend_flow.domain.models.ChooserOption r5 = (com.revolut.feature.backend_flow.domain.models.ChooserOption) r5
            if (r5 == 0) goto L30
            java.lang.String r2 = r5.f63367b
            r5 = r2
            goto L31
        L30:
            r5 = r3
        L31:
            if (r5 == 0) goto L41
            com.revolut.core.ui_kit.models.TextClause r4 = new com.revolut.core.ui_kit.models.TextClause
            r10 = 0
            r11 = 126(0x7e, float:1.77E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2 = r4
            goto L42
        L41:
            r2 = r3
        L42:
            java.lang.String r0 = r0.f63363b
            int r3 = com.revolut.core.backend_flow.R$string.form_builder_chooser_input_placeholder
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.revolut.core.ui_kit.models.Clause r3 = h(r3, r0)
            com.revolut.core.ui_kit.delegates.InputTextDelegate$Model r0 = new com.revolut.core.ui_kit.delegates.InputTextDelegate$Model
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = -8
            r48 = 65535(0xffff, float:9.1834E-41)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            com.revolut.core.ui_kit.delegates.InputTextDelegate$Model r1 = yp0.r.a(r0)
            r8 = 63
            r2 = 0
            r3 = 0
            r4 = 0
            yp0.b.l(r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zc0.c.s(com.revolut.feature.backend_flow.domain.models.ChooserItem):koi.j");
    }

    public static koi.j t(DateInputItem dateInputItem) {
        String str = dateInputItem.f63380a;
        java.time.LocalDate localDate = dateInputItem.d;
        Filter filter = dateInputItem.e;
        if (filter == null) {
            filter = f321016t;
        }
        d3 d3Var = new d3(str, localDate, filter);
        Clause clauseH = h(Integer.valueOf(R$string.form_builder_date), dateInputItem.f63382c);
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, localDate != null ? new TimeClause(ebm.a.P(localDate), TimeClause.Format.DateEditable.f57960b, null, null, 12) : null, clauseH, null, false, null, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, null, false, false, 2, 0, null, false, dateInputItem.f, null, true, null, false, false, false, d3Var, null, 0, -606085128, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static koi.j u(DayPickerItem dayPickerItem) {
        g5 g5Var = new g5(dayPickerItem.f63387a, dayPickerItem.f63389c, dayPickerItem.d, false, null, dayPickerItem.e, dayPickerItem.f, null, null, null, 0, 0, 1048376);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        return g5Var;
    }

    public static koi.j v(DocumentItem documentItem) {
        String str = documentItem.f63393a;
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
        TextClause textClause = new TextClause(documentItem.f63394b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = documentItem.f63395c;
        String str3 = !kotlin.text.d0.W(str2) ? str2 : null;
        RowDelegate.Model model = new RowDelegate.Model(str, layeredImageB, null, null, textClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, documentItem.d ? new tf(6, new ResourceImage(com.revolut.core.backend_flow.R$drawable.icon_12_check_white_in_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false) : new pf(new TextLocalisedClause(R$string.form_builder_document_open, null, null, 14), null, null, false, null, null, 510), false, false, null, null, null, null, null, documentItem, null, 0, 0, 0, 0, 1056962412);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static koi.j w(MailItem mailItem, int i) {
        String strN = a0.d.n("MAIL_ITEM_", i);
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_envelope, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
        TextClause textClause = new TextClause(mailItem.f63516a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = mailItem.f63517b;
        RowDelegate.Model model = new RowDelegate.Model(strN, layeredImageB, null, null, textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, false, null, null, null, null, null, mailItem, null, 0, 0, 0, 0, 1056962412);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static koi.j x(MonthPickerItem monthPickerItem) {
        String str = monthPickerItem.f63538a;
        int i = monthPickerItem.f63540c;
        java.time.LocalDate localDate = monthPickerItem.d;
        YearMonth yearMonthFrom = localDate != null ? YearMonth.from(localDate) : null;
        java.time.LocalDate localDate2 = monthPickerItem.e;
        YearMonth yearMonthFrom2 = localDate2 != null ? YearMonth.from(localDate2) : null;
        java.time.LocalDate localDate3 = monthPickerItem.f;
        mx mxVar = new mx(str, i, yearMonthFrom, yearMonthFrom2, localDate3 != null ? YearMonth.from(localDate3) : null);
        yp0.b.l(mxVar, 0, 0, 0, 0, null, false, 63);
        return mxVar;
    }

    public static koi.j y(StarRatingInputItem starRatingInputItem) {
        String str = starRatingInputItem.f63655a;
        Long l2 = starRatingInputItem.e;
        Integer numValueOf = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
        String str2 = starRatingInputItem.f63657c;
        Clause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.form_builder_rate_nps_not_at_all_likely, null, null, 14);
        String str3 = starRatingInputItem.d;
        y80 y80Var = new y80(str, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.form_builder_rate_nps_extremely_likely, null, null, 14), textClause, numValueOf);
        yp0.b.l(y80Var, 0, 0, 0, 0, null, false, 63);
        return y80Var;
    }

    public static koi.j z(TextInputItem textInputItem) {
        List listC;
        sr srVar;
        lr lrVar;
        boolean z = textInputItem.o;
        Integer num = textInputItem.i;
        String str = textInputItem.f63679b;
        Pair pair = !z ? new Pair(Boolean.FALSE, null) : e(textInputItem);
        boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
        Clause textClause = (Clause) pair.f186386b;
        Clause clauseH = h(null, str);
        String str2 = textInputItem.f63684l;
        Clause textClause2 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : kotlin.text.d0.W(str) ? new TextLocalisedClause(R$string.form_builder_text_input_placeholder, null, null, 14) : null;
        int i = b.d[textInputItem.f63685m.ordinal()];
        if (i == 1) {
            listC = zhm.f0.f322471a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listC = zhm.u.c(new InputFilter.AllCaps());
        }
        List list = listC;
        String str3 = textInputItem.f63678a;
        if (textClause == null) {
            String str4 = textInputItem.f63680c;
            textClause = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        }
        Clause clause = textClause;
        Clause clauseH2 = h(null, textInputItem.d);
        if (textInputItem.f63683j && num == null) {
            srVar = pr.f165860a;
        } else {
            srVar = (num != null ? num.intValue() : 0) > 1 ? qr.f166041a : rr.f166227a;
        }
        sr srVar2 = srVar;
        xl2.e0 e0Var = textInputItem.f63688q;
        int i2 = e0Var == null ? -1 : b.e[e0Var.ordinal()];
        if (i2 == -1 || i2 == 1) {
            lrVar = new lr(16385);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lrVar = new lr(2);
        }
        lr lrVar2 = lrVar;
        boolean z3 = textInputItem.f63681g;
        Integer num2 = textInputItem.f63682h;
        InputTextDelegate.Model model = new InputTextDelegate.Model(str3, clauseH2, clauseH, textClause2, textInputItem.f63687p, null, false, clause, null, null, null, null, null, num2 != null, num2, null, zBooleanValue, false, false, false, lrVar2, 0, null, srVar2, false, z3, null, null, true, list, false, false, null, false, false, 0, false, false, null, new v3(textInputItem.f63678a, textInputItem.k), null, null, 0, 0, 0, 0, -1696776352, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Iterable, java.util.ArrayList] */
    public final ArrayList C(MultiSelectionItem multiSelectionItem) {
        InputChecklistDelegate.Model model;
        InputChecklistDelegate.Model model2;
        MultiSelectionItem multiSelectionItem2 = multiSelectionItem;
        z8g.q qVar = new z8g.q(this, multiSelectionItem2, 22);
        SelectionItem.CustomOption customOption = multiSelectionItem2.e;
        List list = multiSelectionItem2.f63543c;
        Set set = multiSelectionItem2.f63544g;
        MultiSelectionItem.NoneApplyOption noneApplyOption = multiSelectionItem2.i;
        String str = null;
        InputChecklistDelegate.Model modelJ = customOption != null ? j(customOption, multiSelectionItem2) : null;
        if (noneApplyOption != null) {
            String str2 = noneApplyOption.f63550a;
            TextClause textClause = new TextClause(noneApplyOption.f63551b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            InputChecklistDelegate.a.b bVar = new InputChecklistDelegate.a.b(null);
            String str3 = noneApplyOption.f63550a;
            model = new InputChecklistDelegate.Model(str2, textClause, set.contains(str3), false, bVar, iq.CHECK_BUTTON, null, null, new s3(multiSelectionItem2, str3, false), null, 0, 0, 0, 523976);
        } else {
            model = null;
        }
        MultiSelectionItem.AllApplyOption allApplyOption = multiSelectionItem2.f63546j;
        if (allApplyOption != null) {
            String str4 = allApplyOption.f63548a;
            TextClause textClause2 = new TextClause(allApplyOption.f63549b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            InputChecklistDelegate.a.b bVar2 = new InputChecklistDelegate.a.b(null);
            String str5 = allApplyOption.f63548a;
            model2 = new InputChecklistDelegate.Model(str4, textClause2, set.contains(str5), false, bVar2, iq.CHECK_BUTTON, null, null, new s3(multiSelectionItem2, str5, false), null, 0, 0, 0, 523976);
        } else {
            model2 = null;
        }
        List<SelectionItem.Group> list2 = multiSelectionItem2.f63545h;
        ArrayList arrayList = new ArrayList();
        for (SelectionItem.Group group : list2) {
            Set set2 = group.f63614c;
            Set set3 = set2;
            SelectionItem.CustomOption customOption2 = multiSelectionItem2.e;
            boolean zT = zhm.d0.T(set3, customOption2 != null ? customOption2.f63609a : str);
            boolean zT2 = zhm.d0.T(set3, noneApplyOption != null ? noneApplyOption.f63550a : null);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (set2.contains(((SelectionItem.Option) obj2).getF63622a())) {
                    arrayList2.add(obj2);
                }
            }
            List arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(qVar.invoke(it8.next()));
            }
            if (zT && (arrayList3 = zhm.d0.d1(zhm.d0.j1(arrayList3, zhm.v.l(modelJ)))) == 0) {
                arrayList3 = zhm.f0.f322471a;
            }
            if (zT2) {
                if (arrayList3 == 0 || (arrayList3 = zhm.d0.d1(zhm.d0.j1(arrayList3, zhm.v.l(model)))) == 0) {
                    arrayList3 = zhm.f0.f322471a;
                }
            } else if (arrayList3 == 0) {
                arrayList3 = zhm.f0.f322471a;
            }
            zhm.a0.x(I(arrayList3, group), arrayList);
            multiSelectionItem2 = multiSelectionItem;
            str = null;
        }
        if (arrayList.isEmpty()) {
            List list3 = list;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList4.add(qVar.invoke(it9.next()));
            }
            ArrayList arrayListZ = zhm.d0.Z(zhm.d0.F0(model, zhm.d0.F0(modelJ, arrayList4)));
            yp0.b.k(arrayListZ, 0, 0, 0, 0, 31);
            arrayList = arrayListZ;
        }
        List listL = zhm.v.l(model2);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return zhm.d0.E0(listL, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [zhm.f0] */
    public final ArrayList E(SingleSelectionItem singleSelectionItem) {
        Collection collectionI;
        InputChecklistDelegate.Model model;
        Object next;
        z8g.q qVar = new z8g.q(this, singleSelectionItem, 23);
        SelectionItem.CustomOption customOption = singleSelectionItem.e;
        List list = singleSelectionItem.f63639c;
        SingleSelectionItem.SeparationStyle separationStyle = singleSelectionItem.f63643l;
        InputChecklistDelegate.Model modelJ = customOption != null ? j(customOption, singleSelectionItem) : null;
        List list2 = singleSelectionItem.f63641h;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list2.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            SingleSelectionItem.SeparationStyle.Spaced spaced = SingleSelectionItem.SeparationStyle.Spaced.f63649a;
            if (!zHasNext) {
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(qVar.invoke(it9.next()));
                }
                ArrayList arrayListJ = J(zhm.d0.Z(zhm.d0.F0(modelJ, arrayList2)), separationStyle);
                if (!Intrinsics.f(separationStyle, spaced)) {
                    yp0.b.k(arrayListJ, 0, 0, 0, 0, 31);
                }
                return arrayListJ;
            }
            SelectionItem.Group group = (SelectionItem.Group) it8.next();
            Set set = group.f63614c;
            SelectionItem.CustomOption customOption2 = singleSelectionItem.e;
            boolean zT = zhm.d0.T(set, customOption2 != null ? customOption2.f63609a : null);
            Set<String> set2 = group.f63614c;
            ArrayList arrayList3 = new ArrayList();
            for (String str : set2) {
                Iterator it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it10.next();
                    if (Intrinsics.f(((SelectionItem.Option) next).getF63622a(), str)) {
                        break;
                    }
                }
                SelectionItem.Option option = (SelectionItem.Option) next;
                if (option != null) {
                    arrayList3.add(option);
                }
            }
            if (Intrinsics.f(separationStyle, spaced)) {
                collectionI = new ArrayList();
                int i = 0;
                for (Object obj2 : arrayList3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    qv0.i iVar = (qv0.i) qVar.invoke((SelectionItem.Option) obj2);
                    zhm.a0.x(i == 0 ? I(zhm.u.c(iVar), group) : J(zhm.u.c(iVar), spaced), collectionI);
                    i = i2;
                }
                if (modelJ != null) {
                    yp0.b.l(modelJ, 0, 0, 0, 0, null, false, 63);
                    model = modelJ;
                } else {
                    model = null;
                }
                if (zT && (collectionI = zhm.d0.d1(zhm.d0.j1(collectionI, zhm.v.l(model)))) == null) {
                    collectionI = zhm.f0.f322471a;
                }
            } else {
                if (!Intrinsics.f(separationStyle, SingleSelectionItem.SeparationStyle.Joint.f63648a) && !(separationStyle instanceof SingleSelectionItem.SeparationStyle.Unknown) && separationStyle != null) {
                    throw new NoWhenBranchMatchedException();
                }
                ?? arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it11 = arrayList3.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(qVar.invoke(it11.next()));
                }
                if (zT && (arrayList4 = zhm.d0.d1(zhm.d0.j1(arrayList4, zhm.v.l(modelJ)))) == 0) {
                    arrayList4 = zhm.f0.f322471a;
                }
                collectionI = I(arrayList4, group);
            }
            zhm.a0.x(collectionI, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList F(java.util.List r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc0.c.F(java.util.List, boolean):java.util.ArrayList");
    }

    @Override // yc0.c0
    public final rp0.y a(SecondaryDescription description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return this.d.a(description);
    }

    @Override // yc0.y
    public final int b(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return this.f321017a.b(listId);
    }

    @Override // yc0.y
    public final List c(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f321017a.c(screen);
    }

    @Override // bd0.a
    public final List d(String searchQuery, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return this.f321018b.d(searchQuery, items);
    }

    @Override // yc0.v
    public final rp0.y f(InfoMessageItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f321019c.f(item);
    }
}
