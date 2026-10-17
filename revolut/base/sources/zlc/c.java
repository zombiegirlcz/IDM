package zlc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u000f\n\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&R\u001c\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b\u0014\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b \u0010.R\u001c\u00100\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b$\u0010.R\u001c\u00104\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b\u000f\u00103¨\u00065"}, d2 = {"Lzlc/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "portfolioId", "Lzlc/c$c;", "b", "Lzlc/c$c;", "n", "()Lzlc/c$c;", "state", "c", "f", "name", "d", "iconName", "e", "l", "portfolioTemplate", "m", "recommendedTemplate", "Ljava/time/LocalDate;", "g", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "canChangeTemplateSince", "h", "newTemplate", "i", "baseCurrency", "", "Lzlc/c$b;", "j", "Ljava/util/List;", "()Ljava/util/List;", "ongoingRebalanceTypes", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "initialTopupPerformed", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "plannedInitialDeposit", "plannedRecurringDeposit", "Lzlc/c$a;", "Lzlc/c$a;", "()Lzlc/c$a;", "goal", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("portfolioId")
    @NotNull
    private final String portfolioId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final EnumC1794c state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("iconName")
    private final String iconName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("portfolioTemplate")
    private final String portfolioTemplate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("recommendedTemplate")
    private final String recommendedTemplate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("canChangeTemplateSince")
    @NotNull
    private final LocalDate canChangeTemplateSince;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("newTemplate")
    private final String newTemplate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("baseCurrency")
    @NotNull
    private final String baseCurrency;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("ongoingRebalanceTypes")
    @NotNull
    private final List<b> ongoingRebalanceTypes;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("initialTopupPerformed")
    private final Boolean initialTopupPerformed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("plannedInitialDeposit")
    private final jo3.b plannedInitialDeposit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("plannedRecurringDeposit")
    private final jo3.b plannedRecurringDeposit;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("goal")
    private final a goal;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lzlc/c$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "()Ljo3/b;", "targetAmount", "b", "Ljava/lang/String;", "targetDate", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("targetAmount")
        @NotNull
        private final jo3.b targetAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("targetDate")
        @NotNull
        private final String targetDate;

        public a(String targetDate, jo3.b targetAmount) {
            Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
            Intrinsics.checkNotNullParameter(targetDate, "targetDate");
            this.targetAmount = targetAmount;
            this.targetDate = targetDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.b getTargetAmount() {
            return this.targetAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTargetDate() {
            return this.targetDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.targetAmount, aVar.targetAmount) && Intrinsics.f(this.targetDate, aVar.targetDate);
        }

        public final int hashCode() {
            return this.targetDate.hashCode() + (this.targetAmount.hashCode() * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzlc/c$b;", "", "PORTFOLIO_TEMPLATE_CHANGE", "PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE", "WITHDRAWAL", "FUNDING", "INITIAL_FUNDING", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @lg.b("FUNDING")
        public static final b FUNDING;

        @lg.b("INITIAL_FUNDING")
        public static final b INITIAL_FUNDING;

        @lg.b("PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE")
        public static final b PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE;

        @lg.b("PORTFOLIO_TEMPLATE_CHANGE")
        public static final b PORTFOLIO_TEMPLATE_CHANGE;

        @lg.b("WITHDRAWAL")
        public static final b WITHDRAWAL;

        static {
            b bVar = new b("PORTFOLIO_TEMPLATE_CHANGE", 0);
            PORTFOLIO_TEMPLATE_CHANGE = bVar;
            b bVar2 = new b("PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE", 1);
            PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE = bVar2;
            b bVar3 = new b("WITHDRAWAL", 2);
            WITHDRAWAL = bVar3;
            b bVar4 = new b("FUNDING", 3);
            FUNDING = bVar4;
            b bVar5 = new b("INITIAL_FUNDING", 4);
            INITIAL_FUNDING = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            $VALUES = bVarArr;
            $ENTRIES = s.n(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: zlc.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzlc/c$c;", "", "CREATED", "ACTIVE", "SUSPENDED", "OFFBOARDING", "TERMINATED", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnumC1794c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC1794c[] $VALUES;

        @lg.b("ACTIVE")
        public static final EnumC1794c ACTIVE;

        @lg.b("CREATED")
        public static final EnumC1794c CREATED;

        @lg.b(alternate = {"LIQUIDATING"}, value = "OFFBOARDING")
        public static final EnumC1794c OFFBOARDING;

        @lg.b("SUSPENDED")
        public static final EnumC1794c SUSPENDED;

        @lg.b("TERMINATED")
        public static final EnumC1794c TERMINATED;

        static {
            EnumC1794c enumC1794c = new EnumC1794c("CREATED", 0);
            CREATED = enumC1794c;
            EnumC1794c enumC1794c2 = new EnumC1794c("ACTIVE", 1);
            ACTIVE = enumC1794c2;
            EnumC1794c enumC1794c3 = new EnumC1794c("SUSPENDED", 2);
            SUSPENDED = enumC1794c3;
            EnumC1794c enumC1794c4 = new EnumC1794c("OFFBOARDING", 3);
            OFFBOARDING = enumC1794c4;
            EnumC1794c enumC1794c5 = new EnumC1794c("TERMINATED", 4);
            TERMINATED = enumC1794c5;
            EnumC1794c[] enumC1794cArr = {enumC1794c, enumC1794c2, enumC1794c3, enumC1794c4, enumC1794c5};
            $VALUES = enumC1794cArr;
            $ENTRIES = s.n(enumC1794cArr);
        }

        public static EnumC1794c valueOf(String str) {
            return (EnumC1794c) Enum.valueOf(EnumC1794c.class, str);
        }

        public static EnumC1794c[] values() {
            return (EnumC1794c[]) $VALUES.clone();
        }
    }

    public c(String portfolioId, EnumC1794c state, String str, String str2, String str3, String str4, LocalDate canChangeTemplateSince, String str5, String baseCurrency, ArrayList ongoingRebalanceTypes, Boolean bool, jo3.b bVar, jo3.b bVar2, a aVar) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canChangeTemplateSince, "canChangeTemplateSince");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(ongoingRebalanceTypes, "ongoingRebalanceTypes");
        this.portfolioId = portfolioId;
        this.state = state;
        this.name = str;
        this.iconName = str2;
        this.portfolioTemplate = str3;
        this.recommendedTemplate = str4;
        this.canChangeTemplateSince = canChangeTemplateSince;
        this.newTemplate = str5;
        this.baseCurrency = baseCurrency;
        this.ongoingRebalanceTypes = ongoingRebalanceTypes;
        this.initialTopupPerformed = bool;
        this.plannedInitialDeposit = bVar;
        this.plannedRecurringDeposit = bVar2;
        this.goal = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getCanChangeTemplateSince() {
        return this.canChangeTemplateSince;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getInitialTopupPerformed() {
        return this.initialTopupPerformed;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.portfolioId, cVar.portfolioId) && this.state == cVar.state && Intrinsics.f(this.name, cVar.name) && Intrinsics.f(this.iconName, cVar.iconName) && Intrinsics.f(this.portfolioTemplate, cVar.portfolioTemplate) && Intrinsics.f(this.recommendedTemplate, cVar.recommendedTemplate) && Intrinsics.f(this.canChangeTemplateSince, cVar.canChangeTemplateSince) && Intrinsics.f(this.newTemplate, cVar.newTemplate) && Intrinsics.f(this.baseCurrency, cVar.baseCurrency) && Intrinsics.f(this.ongoingRebalanceTypes, cVar.ongoingRebalanceTypes) && Intrinsics.f(this.initialTopupPerformed, cVar.initialTopupPerformed) && Intrinsics.f(this.plannedInitialDeposit, cVar.plannedInitialDeposit) && Intrinsics.f(this.plannedRecurringDeposit, cVar.plannedRecurringDeposit) && Intrinsics.f(this.goal, cVar.goal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNewTemplate() {
        return this.newTemplate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getOngoingRebalanceTypes() {
        return this.ongoingRebalanceTypes;
    }

    public final int hashCode() {
        int iHashCode = (this.state.hashCode() + (this.portfolioId.hashCode() * 31)) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.portfolioTemplate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recommendedTemplate;
        int iA = y.a((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.canChangeTemplateSince);
        String str5 = this.newTemplate;
        int iD = p.a.d(p.a.c((iA + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.baseCurrency), 31, this.ongoingRebalanceTypes);
        Boolean bool = this.initialTopupPerformed;
        int iHashCode5 = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        jo3.b bVar = this.plannedInitialDeposit;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.plannedRecurringDeposit;
        int iHashCode7 = (iHashCode6 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        a aVar = this.goal;
        return iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.b getPlannedInitialDeposit() {
        return this.plannedInitialDeposit;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.b getPlannedRecurringDeposit() {
        return this.plannedRecurringDeposit;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPortfolioTemplate() {
        return this.portfolioTemplate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getRecommendedTemplate() {
        return this.recommendedTemplate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final EnumC1794c getState() {
        return this.state;
    }
}
