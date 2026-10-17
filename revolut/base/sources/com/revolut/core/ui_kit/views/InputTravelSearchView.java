package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.f6;
import aw0.g6;
import aw0.h6;
import aw0.i6;
import aw0.j6;
import aw0.k6;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.u7;
import mx0.v7;
import mx0.x7;
import mx0.z7;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/revolut/core/ui_kit/views/InputTravelSearchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/i6;", "configuration", "", "setConfiguration", "(Law0/i6;)V", "setSearchConfiguration", "setDatesGuestsConfiguration", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputTravelSearchView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ny0.k f58672b;
    public final InputTravelSearchItemView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InputTravelAirportSearchItemView f58673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InputTravelDatesGuestsItemView f58674h;
    public final InputText i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InputText f58675j;
    public i6 k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelSearchView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Image f0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return null;
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return ((i6.b) i6Var).a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause g0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return null;
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return ((i6.b) i6Var).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause h0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return ((i6.a) i6Var).a();
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause i0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return ((i6.a) i6Var).b();
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause j0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return ((i6.a) i6Var).c();
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static g6 l0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return ((i6.a) i6Var).d();
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause m0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return ((i6.a) i6Var).e();
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static Clause n0(i6 i6Var) {
        if (i6Var instanceof f6) {
            return ((f6) i6Var).f;
        }
        if ((i6Var instanceof h6) || (i6Var instanceof j6) || (i6Var instanceof k6)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Image o0(i6 i6Var) {
        if ((i6Var instanceof i6.a) || (i6Var instanceof j6)) {
            return null;
        }
        if (i6Var instanceof k6) {
            return ((k6) i6Var).f10396g;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause p0(i6 i6Var) {
        if ((i6Var instanceof i6.a) || (i6Var instanceof j6)) {
            return null;
        }
        if (i6Var instanceof k6) {
            return ((k6) i6Var).f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static List q0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return null;
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return ((i6.b) i6Var).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause r0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return null;
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return ((i6.b) i6Var).d();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Image s0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return null;
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return ((i6.b) i6Var).e();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void setDatesGuestsConfiguration(i6 configuration) {
        boolean z;
        boolean z3;
        x7 x7Var = null;
        boolean z4 = true;
        if (configuration instanceof h6) {
            z = true;
            z3 = false;
            z4 = false;
        } else if (configuration instanceof f6) {
            z = true;
            z3 = true;
            z4 = false;
        } else {
            if (configuration instanceof j6) {
                x7Var = x7.SINGLE;
            } else {
                if (!(configuration instanceof k6)) {
                    throw new NoWhenBranchMatchedException();
                }
                x7Var = x7.DUAL;
            }
            z = false;
            z3 = false;
        }
        InputTravelDatesGuestsItemView datesGuests = this.f58674h;
        Intrinsics.checkNotNullExpressionValue(datesGuests, "datesGuests");
        datesGuests.setVisibility(z4 ? 0 : 8);
        if (x7Var != null) {
            Intrinsics.checkNotNullExpressionValue(datesGuests, "datesGuests");
            datesGuests.setConfiguration(x7Var);
        }
        InputText flightDates = this.i;
        Intrinsics.checkNotNullExpressionValue(flightDates, "flightDates");
        flightDates.setVisibility(z ? 0 : 8);
        InputText flightTravelers = this.f58675j;
        Intrinsics.checkNotNullExpressionValue(flightTravelers, "flightTravelers");
        flightTravelers.setVisibility(z3 ? 0 : 8);
    }

    private final void setSearchConfiguration(i6 configuration) {
        boolean z;
        boolean z3 = true;
        if ((configuration instanceof j6) || (configuration instanceof k6)) {
            z = false;
        } else {
            if (!(configuration instanceof f6) && !(configuration instanceof h6)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
            z3 = false;
        }
        InputTravelSearchItemView search = this.f;
        Intrinsics.checkNotNullExpressionValue(search, "search");
        search.setVisibility(z3 ? 0 : 8);
        InputTravelAirportSearchItemView airportSearch = this.f58673g;
        Intrinsics.checkNotNullExpressionValue(airportSearch, "airportSearch");
        airportSearch.setVisibility(z ? 0 : 8);
    }

    public static Clause t0(i6 i6Var) {
        if (i6Var instanceof i6.a) {
            return null;
        }
        if ((i6Var instanceof j6) || (i6Var instanceof k6)) {
            return ((i6.b) i6Var).f();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause u0(Clause clause) {
        return clause == null ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : clause;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f58672b.b(i);
        super.onMeasure(i, i2);
    }

    public final void setConfiguration(@NotNull i6 configuration) {
        u7 u7Var;
        Image imageO0;
        Image imageF0;
        Image imageS0;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Class<?> cls = configuration.getClass();
        i6 i6Var = this.k;
        boolean zEquals = cls.equals(i6Var != null ? i6Var.getClass() : null);
        Clause clauseM0 = m0(configuration);
        i6 i6Var2 = this.k;
        boolean zF = Intrinsics.f(clauseM0, i6Var2 != null ? m0(i6Var2) : null);
        Clause clauseJ0 = j0(configuration);
        i6 i6Var3 = this.k;
        boolean zF2 = Intrinsics.f(clauseJ0, i6Var3 != null ? j0(i6Var3) : null);
        g6 g6VarL0 = l0(configuration);
        i6 i6Var4 = this.k;
        boolean z = g6VarL0 != (i6Var4 != null ? l0(i6Var4) : null);
        Clause clauseH0 = h0(configuration);
        i6 i6Var5 = this.k;
        boolean zF3 = Intrinsics.f(clauseH0, i6Var5 != null ? h0(i6Var5) : null);
        Clause clauseI0 = i0(configuration);
        i6 i6Var6 = this.k;
        boolean zF4 = Intrinsics.f(clauseI0, i6Var6 != null ? i0(i6Var6) : null);
        Clause clauseN0 = n0(configuration);
        i6 i6Var7 = this.k;
        boolean zF5 = Intrinsics.f(clauseN0, i6Var7 != null ? n0(i6Var7) : null);
        Clause clauseR0 = r0(configuration);
        i6 i6Var8 = this.k;
        boolean zF6 = Intrinsics.f(clauseR0, i6Var8 != null ? r0(i6Var8) : null);
        List listQ0 = q0(configuration);
        i6 i6Var9 = this.k;
        boolean zF7 = Intrinsics.f(listQ0, i6Var9 != null ? q0(i6Var9) : null);
        Clause clauseT0 = t0(configuration);
        i6 i6Var10 = this.k;
        boolean zF8 = Intrinsics.f(clauseT0, i6Var10 != null ? t0(i6Var10) : null);
        Image imageS02 = s0(configuration);
        i6 i6Var11 = this.k;
        boolean zF9 = Intrinsics.f(imageS02, i6Var11 != null ? s0(i6Var11) : null);
        Clause clauseG0 = g0(configuration);
        i6 i6Var12 = this.k;
        boolean zF10 = Intrinsics.f(clauseG0, i6Var12 != null ? g0(i6Var12) : null);
        Image imageF02 = f0(configuration);
        i6 i6Var13 = this.k;
        boolean zF11 = Intrinsics.f(imageF02, i6Var13 != null ? f0(i6Var13) : null);
        Clause clauseP0 = p0(configuration);
        i6 i6Var14 = this.k;
        boolean zF12 = Intrinsics.f(clauseP0, i6Var14 != null ? p0(i6Var14) : null);
        Image imageO02 = o0(configuration);
        i6 i6Var15 = this.k;
        boolean zF13 = Intrinsics.f(imageO02, i6Var15 != null ? o0(i6Var15) : null);
        if (!zEquals) {
            setSearchConfiguration(configuration);
            setDatesGuestsConfiguration(configuration);
        }
        if (!zF || !zF2 || z) {
            g6 g6VarL02 = l0(configuration);
            int i = g6VarL02 == null ? -1 : z7.f210141a[g6VarL02.ordinal()];
            if (i == -1) {
                u7Var = null;
            } else if (i == 1) {
                u7Var = u7.LEFT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                u7Var = u7.RIGHT;
            }
            if (u7Var != null) {
                this.f58673g.setModel(new v7(m0(configuration), j0(configuration), u7Var));
            }
        }
        InputText flightDates = this.i;
        if (!zF3) {
            Intrinsics.checkNotNullExpressionValue(flightDates, "flightDates");
            InputText.setText$default(flightDates, h0(configuration), false, 2, null);
        }
        if (!zF4) {
            flightDates.setSuffixText(i0(configuration));
        }
        if (!zF5) {
            InputText flightTravelers = this.f58675j;
            Intrinsics.checkNotNullExpressionValue(flightTravelers, "flightTravelers");
            InputText.setText$default(flightTravelers, n0(configuration), false, 2, null);
        }
        InputTravelSearchItemView inputTravelSearchItemView = this.f;
        if (!zF6) {
            inputTravelSearchItemView.setPrimarySearchText(u0(r0(configuration)));
        }
        if (!zF7) {
            List<? extends Clause> listQ02 = q0(configuration);
            if (listQ02 == null) {
                listQ02 = f0.f322471a;
            }
            inputTravelSearchItemView.setSearchHints(listQ02);
        }
        if (!zF8) {
            inputTravelSearchItemView.setSecondarySearchText(u0(t0(configuration)));
        }
        if (!zF9 && (imageS0 = s0(configuration)) != null) {
            inputTravelSearchItemView.setSearchIconImage(imageS0);
        }
        InputTravelDatesGuestsItemView inputTravelDatesGuestsItemView = this.f58674h;
        if (!zF10) {
            inputTravelDatesGuestsItemView.setPrimaryInputText(u0(g0(configuration)));
        }
        if (!zF11 && (imageF0 = f0(configuration)) != null) {
            inputTravelDatesGuestsItemView.setPrimaryInputIconImage(imageF0);
        }
        if (!zF12) {
            inputTravelDatesGuestsItemView.setSecondaryInputText(u0(p0(configuration)));
        }
        if (!zF13 && (imageO0 = o0(configuration)) != null) {
            inputTravelDatesGuestsItemView.setSecondaryInputIconImage(imageO0);
        }
        this.k = configuration;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelSearchView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputTravelSearchView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ny0.k kVar = new ny0.k(this);
        this.f58672b = kVar;
        View.inflate(context, R$layout.internal_view_travel_search, this);
        this.f = (InputTravelSearchItemView) findViewById(R$id.inputTravelSearch_search);
        this.f58673g = (InputTravelAirportSearchItemView) findViewById(R$id.inputTravelSearch_airportSearch);
        this.f58674h = (InputTravelDatesGuestsItemView) findViewById(R$id.inputTravelSearch_datesGuests);
        InputText inputText = (InputText) findViewById(R$id.inputTravelSearch_flightDates);
        this.i = inputText;
        InputText inputText2 = (InputText) findViewById(R$id.inputTravelSearch_flightTravelers);
        this.f58675j = inputText2;
        inputText.setPrefixIconImage(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246));
        inputText.setFocusable(false);
        inputText.setSingleLine(true);
        inputText.P = true;
        inputText2.setPrefixIconImage(new ResourceImage(R$drawable.uikit_icn_24_user, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246));
        inputText2.setFocusable(false);
        inputText2.setSingleLine(true);
        inputText2.P = true;
        kVar.d(true);
    }

    public /* synthetic */ InputTravelSearchView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
