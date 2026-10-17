package hcl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001f"}, d2 = {"Lhcl/d3;", "", "", "toString", "()Ljava/lang/String;", "Lhcl/d3$b;", "a", "Lhcl/d3$b;", "e", "()Lhcl/d3$b;", "typeKey", "Lhcl/c0;", "b", "Lhcl/c0;", "c", "()Lhcl/c0;", "fundSpecificProperties", "Lhcl/p;", "Lhcl/p;", "()Lhcl/p;", "etpSpecificProperties", "Lhcl/j;", "d", "Lhcl/j;", "()Lhcl/j;", "bondSpecificProperties", "Lhcl/u2;", "Lhcl/u2;", "()Lhcl/u2;", "noteSpecificProperties", "Companion", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("typeKey")
    @NotNull
    private final b typeKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fund")
    private final c0 fundSpecificProperties;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("etp")
    private final p etpSpecificProperties;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bond")
    private final j bondSpecificProperties;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("note")
    private final u2 noteSpecificProperties;

    /* JADX INFO: renamed from: hcl.d3$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lhcl/d3$b;", "", "FUND", "ETP", "BOND", "STRUCTURED_NOTE", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @lg.b("BOND")
        public static final b BOND;

        @lg.b("ETP")
        public static final b ETP;

        @lg.b("FUND")
        public static final b FUND;

        @lg.b("STRUCTURED_NOTE")
        public static final b STRUCTURED_NOTE;

        static {
            b bVar = new b("FUND", 0);
            FUND = bVar;
            b bVar2 = new b("ETP", 1);
            ETP = bVar2;
            b bVar3 = new b("BOND", 2);
            BOND = bVar3;
            b bVar4 = new b("STRUCTURED_NOTE", 3);
            STRUCTURED_NOTE = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = vc.s.n(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public d3(b typeKey, c0 c0Var, p pVar, j jVar, u2 u2Var) {
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        this.typeKey = typeKey;
        this.fundSpecificProperties = c0Var;
        this.etpSpecificProperties = pVar;
        this.bondSpecificProperties = jVar;
        this.noteSpecificProperties = u2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getBondSpecificProperties() {
        return this.bondSpecificProperties;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p getEtpSpecificProperties() {
        return this.etpSpecificProperties;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c0 getFundSpecificProperties() {
        return this.fundSpecificProperties;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final u2 getNoteSpecificProperties() {
        return this.noteSpecificProperties;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getTypeKey() {
        return this.typeKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return this.typeKey == d3Var.typeKey && Intrinsics.f(this.fundSpecificProperties, d3Var.fundSpecificProperties) && Intrinsics.f(this.etpSpecificProperties, d3Var.etpSpecificProperties) && Intrinsics.f(this.bondSpecificProperties, d3Var.bondSpecificProperties) && Intrinsics.f(this.noteSpecificProperties, d3Var.noteSpecificProperties);
    }

    public final int hashCode() {
        int iHashCode = this.typeKey.hashCode() * 31;
        c0 c0Var = this.fundSpecificProperties;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        p pVar = this.etpSpecificProperties;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        j jVar = this.bondSpecificProperties;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        u2 u2Var = this.noteSpecificProperties;
        return iHashCode4 + (u2Var != null ? u2Var.hashCode() : 0);
    }
}
