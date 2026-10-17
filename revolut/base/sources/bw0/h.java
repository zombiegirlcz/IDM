package bw0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f19181c;
    public final boolean d;
    public final List e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19183h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19184j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f19185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f19186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f19187n;
    public final c o;

    public h(String amountString, String str, Clause clause, boolean z, List inputFilters, Boolean bool, boolean z3, boolean z4, boolean z6, boolean z11, e suggestionsMode, g suggestions, Clause hint, boolean z12, c inputState) {
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(inputFilters, "inputFilters");
        Intrinsics.checkNotNullParameter(suggestionsMode, "suggestionsMode");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        this.f19179a = amountString;
        this.f19180b = str;
        this.f19181c = clause;
        this.d = z;
        this.e = inputFilters;
        this.f = bool;
        this.f19182g = z3;
        this.f19183h = z4;
        this.i = z6;
        this.f19184j = z11;
        this.k = suggestionsMode;
        this.f19185l = suggestions;
        this.f19186m = hint;
        this.f19187n = z12;
        this.o = inputState;
    }

    public final boolean equals(Object obj2) {
        boolean z = this.i;
        if (z) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if (!h.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.amount.AmountInputModel");
        h hVar = (h) obj2;
        return Intrinsics.f(this.f19179a, hVar.f19179a) && Intrinsics.f(this.f19180b, hVar.f19180b) && Intrinsics.f(this.f19181c, hVar.f19181c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && this.f19182g == hVar.f19182g && this.f19183h == hVar.f19183h && z == hVar.i && this.f19184j == hVar.f19184j && this.k == hVar.k && Intrinsics.f(this.f19185l, hVar.f19185l) && Intrinsics.f(this.f19186m, hVar.f19186m) && this.o == hVar.o && this.f19187n == hVar.f19187n;
    }

    public final int hashCode() {
        int iHashCode = this.f19179a.hashCode() * 31;
        String str = this.f19180b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Clause clause = this.f19181c;
        int iD = p.a.d(j6.a.c((iHashCode2 + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        Boolean bool = this.f;
        return (Boolean.hashCode(this.f19187n) * 31) + this.f19186m.hashCode() + (this.f19185l.hashCode() * 31 * this.k.hashCode() * 31 * (Boolean.hashCode(this.f19184j) + ((this.o.hashCode() + j6.a.c(j6.a.c(j6.a.c((iD + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 31, 31, this.f19182g), 31, this.f19183h), 31, this.i)) * 31)) * 31);
    }

    public h(String str, String str2, Clause clause, boolean z, List list, Boolean bool, boolean z3, boolean z4, e eVar, f fVar, TextClause textClause, c cVar, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : clause, z, (i & 16) != 0 ? f0.f322471a : list, bool, (i & 64) == 0, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) == 0, (i & 1024) != 0 ? e.SuggestionsWhenTextEmptyElseCalculator : eVar, (g) ((i & 2048) != 0 ? new f(f0.f322471a) : fVar), (Clause) ((i & 4096) != 0 ? new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textClause), true, (i & 16384) != 0 ? c.Enabled : cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(String amountString, String str, TextClause textClause, boolean z, List list, Boolean bool, List suggestions, boolean z3, boolean z4, boolean z6, boolean z11, e eVar, Clause clause, boolean z12, int i) {
        TextClause textClause2 = (i & 4) != 0 ? null : textClause;
        List inputFilters = (i & 16) != 0 ? f0.f322471a : list;
        boolean z29 = (i & 128) != 0 ? false : z3;
        boolean z31 = (i & 256) != 0 ? false : z4;
        boolean z41 = (i & 512) != 0 ? false : z6;
        boolean z49 = (i & 1024) != 0 ? false : z11;
        e suggestionsMode = (i & 2048) != 0 ? e.SuggestionsWhenTextEmptyElseCalculator : eVar;
        Clause hint = (i & 4096) != 0 ? new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : clause;
        boolean z54 = (i & 8192) != 0;
        boolean z74 = (i & 16384) == 0 ? z12 : true;
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(inputFilters, "inputFilters");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(suggestionsMode, "suggestionsMode");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this(amountString, str, textClause2, z, inputFilters, bool, z29, z31, z41, z49, suggestionsMode, new f(suggestions), hint, z54, z74 ? c.Enabled : c.Disabled);
    }

    public h(String amountString, String str, boolean z, List list, Boolean bool, e eVar, TextClause textClause, boolean z3, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        List inputFilters = (i & 16) != 0 ? f0.f322471a : list;
        boolean z4 = (i & 512) == 0;
        e suggestionsMode = (i & 1024) != 0 ? e.SuggestionsWhenTextEmptyElseCalculator : eVar;
        f suggestions = new f(f0.f322471a);
        TextClause hint = (i & 4096) != 0 ? new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textClause;
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(inputFilters, "inputFilters");
        Intrinsics.checkNotNullParameter(suggestionsMode, "suggestionsMode");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this(amountString, str2, (Clause) null, z, inputFilters, bool, false, false, false, z4, suggestionsMode, (g) suggestions, (Clause) hint, true, z3 ? c.Enabled : c.Disabled);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(String amountString, String str, boolean z, List list, Boolean bool, boolean z3, boolean z4, boolean z6, boolean z11, List list2, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        List inputFilters = (i & 16) != 0 ? f0.f322471a : list;
        boolean z12 = (i & 64) != 0 ? false : z3;
        boolean z29 = (i & 128) != 0 ? false : z4;
        boolean z31 = (i & 256) != 0 ? false : z6;
        boolean z41 = (i & 512) != 0 ? true : z11;
        boolean z49 = (i & 1024) == 0;
        List suggestions = (i & 4096) != 0 ? f0.f322471a : list2;
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(inputFilters, "inputFilters");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this(amountString, str2, (TextClause) null, z, inputFilters, bool, suggestions, z12, z29, z31, z49, e.SuggestionsWhenTextEmptyElseCalculator, (Clause) null, z41, 12288);
    }
}
