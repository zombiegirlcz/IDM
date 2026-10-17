package jbm;

import io.github.resilience4j.circuitbreaker.IllegalStateTransitionException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CLOSED_TO_CLOSED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b CLOSED_TO_CLOSED;
    public static final b CLOSED_TO_DISABLED;
    public static final b CLOSED_TO_FORCED_OPEN;
    public static final b CLOSED_TO_METRICS_ONLY;
    public static final b CLOSED_TO_OPEN;
    public static final b DISABLED_TO_CLOSED;
    public static final b DISABLED_TO_DISABLED;
    public static final b DISABLED_TO_FORCED_OPEN;
    public static final b DISABLED_TO_HALF_OPEN;
    public static final b DISABLED_TO_METRICS_ONLY;
    public static final b DISABLED_TO_OPEN;
    public static final b FORCED_OPEN_TO_CLOSED;
    public static final b FORCED_OPEN_TO_DISABLED;
    public static final b FORCED_OPEN_TO_FORCED_OPEN;
    public static final b FORCED_OPEN_TO_HALF_OPEN;
    public static final b FORCED_OPEN_TO_METRICS_ONLY;
    public static final b FORCED_OPEN_TO_OPEN;
    public static final b HALF_OPEN_TO_CLOSED;
    public static final b HALF_OPEN_TO_DISABLED;
    public static final b HALF_OPEN_TO_FORCED_OPEN;
    public static final b HALF_OPEN_TO_HALF_OPEN;
    public static final b HALF_OPEN_TO_METRICS_ONLY;
    public static final b HALF_OPEN_TO_OPEN;
    public static final b METRICS_ONLY_TO_CLOSED;
    public static final b METRICS_ONLY_TO_DISABLED;
    public static final b METRICS_ONLY_TO_FORCED_OPEN;
    public static final b METRICS_ONLY_TO_METRICS_ONLY;
    public static final b OPEN_TO_CLOSED;
    public static final b OPEN_TO_DISABLED;
    public static final b OPEN_TO_FORCED_OPEN;
    public static final b OPEN_TO_HALF_OPEN;
    public static final b OPEN_TO_METRICS_ONLY;
    public static final b OPEN_TO_OPEN;
    private static final Map<mhm.d, b> STATE_TRANSITION_MAP;
    private final a fromState;
    private final a toState;

    static {
        a aVar = a.CLOSED;
        b bVar = new b("CLOSED_TO_CLOSED", 0, aVar, aVar);
        CLOSED_TO_CLOSED = bVar;
        a aVar2 = a.OPEN;
        b bVar2 = new b("CLOSED_TO_OPEN", 1, aVar, aVar2);
        CLOSED_TO_OPEN = bVar2;
        a aVar3 = a.DISABLED;
        b bVar3 = new b("CLOSED_TO_DISABLED", 2, aVar, aVar3);
        CLOSED_TO_DISABLED = bVar3;
        a aVar4 = a.METRICS_ONLY;
        b bVar4 = new b("CLOSED_TO_METRICS_ONLY", 3, aVar, aVar4);
        CLOSED_TO_METRICS_ONLY = bVar4;
        a aVar5 = a.FORCED_OPEN;
        b bVar5 = new b("CLOSED_TO_FORCED_OPEN", 4, aVar, aVar5);
        CLOSED_TO_FORCED_OPEN = bVar5;
        a aVar6 = a.HALF_OPEN;
        b bVar6 = new b("HALF_OPEN_TO_HALF_OPEN", 5, aVar6, aVar6);
        HALF_OPEN_TO_HALF_OPEN = bVar6;
        b bVar7 = new b("HALF_OPEN_TO_CLOSED", 6, aVar6, aVar);
        HALF_OPEN_TO_CLOSED = bVar7;
        b bVar8 = new b("HALF_OPEN_TO_OPEN", 7, aVar6, aVar2);
        HALF_OPEN_TO_OPEN = bVar8;
        b bVar9 = new b("HALF_OPEN_TO_DISABLED", 8, aVar6, aVar3);
        HALF_OPEN_TO_DISABLED = bVar9;
        b bVar10 = new b("HALF_OPEN_TO_METRICS_ONLY", 9, aVar6, aVar4);
        HALF_OPEN_TO_METRICS_ONLY = bVar10;
        b bVar11 = new b("HALF_OPEN_TO_FORCED_OPEN", 10, aVar6, aVar5);
        HALF_OPEN_TO_FORCED_OPEN = bVar11;
        b bVar12 = new b("OPEN_TO_OPEN", 11, aVar2, aVar2);
        OPEN_TO_OPEN = bVar12;
        b bVar13 = new b("OPEN_TO_CLOSED", 12, aVar2, aVar);
        OPEN_TO_CLOSED = bVar13;
        b bVar14 = new b("OPEN_TO_HALF_OPEN", 13, aVar2, aVar6);
        OPEN_TO_HALF_OPEN = bVar14;
        b bVar15 = new b("OPEN_TO_DISABLED", 14, aVar2, aVar3);
        OPEN_TO_DISABLED = bVar15;
        b bVar16 = new b("OPEN_TO_METRICS_ONLY", 15, aVar2, aVar4);
        OPEN_TO_METRICS_ONLY = bVar16;
        b bVar17 = new b("OPEN_TO_FORCED_OPEN", 16, aVar2, aVar5);
        OPEN_TO_FORCED_OPEN = bVar17;
        b bVar18 = new b("FORCED_OPEN_TO_FORCED_OPEN", 17, aVar5, aVar5);
        FORCED_OPEN_TO_FORCED_OPEN = bVar18;
        b bVar19 = new b("FORCED_OPEN_TO_CLOSED", 18, aVar5, aVar);
        FORCED_OPEN_TO_CLOSED = bVar19;
        b bVar20 = new b("FORCED_OPEN_TO_OPEN", 19, aVar5, aVar2);
        FORCED_OPEN_TO_OPEN = bVar20;
        b bVar21 = new b("FORCED_OPEN_TO_DISABLED", 20, aVar5, aVar3);
        FORCED_OPEN_TO_DISABLED = bVar21;
        b bVar22 = new b("FORCED_OPEN_TO_METRICS_ONLY", 21, aVar5, aVar4);
        FORCED_OPEN_TO_METRICS_ONLY = bVar22;
        b bVar23 = new b("FORCED_OPEN_TO_HALF_OPEN", 22, aVar5, aVar6);
        FORCED_OPEN_TO_HALF_OPEN = bVar23;
        b bVar24 = new b("DISABLED_TO_DISABLED", 23, aVar3, aVar3);
        DISABLED_TO_DISABLED = bVar24;
        b bVar25 = new b("DISABLED_TO_CLOSED", 24, aVar3, aVar);
        DISABLED_TO_CLOSED = bVar25;
        b bVar26 = new b("DISABLED_TO_OPEN", 25, aVar3, aVar2);
        DISABLED_TO_OPEN = bVar26;
        b bVar27 = new b("DISABLED_TO_FORCED_OPEN", 26, aVar3, aVar5);
        DISABLED_TO_FORCED_OPEN = bVar27;
        b bVar28 = new b("DISABLED_TO_HALF_OPEN", 27, aVar3, aVar6);
        DISABLED_TO_HALF_OPEN = bVar28;
        b bVar29 = new b("DISABLED_TO_METRICS_ONLY", 28, aVar3, aVar4);
        DISABLED_TO_METRICS_ONLY = bVar29;
        b bVar30 = new b("METRICS_ONLY_TO_METRICS_ONLY", 29, aVar4, aVar4);
        METRICS_ONLY_TO_METRICS_ONLY = bVar30;
        b bVar31 = new b("METRICS_ONLY_TO_CLOSED", 30, aVar4, aVar);
        METRICS_ONLY_TO_CLOSED = bVar31;
        b bVar32 = new b("METRICS_ONLY_TO_FORCED_OPEN", 31, aVar4, aVar5);
        METRICS_ONLY_TO_FORCED_OPEN = bVar32;
        b bVar33 = new b("METRICS_ONLY_TO_DISABLED", 32, aVar4, aVar3);
        METRICS_ONLY_TO_DISABLED = bVar33;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33};
        STATE_TRANSITION_MAP = (Map) Arrays.stream(values()).collect(Collectors.toMap(new com.google.android.material.color.utilities.f(4), Function.identity()));
    }

    public b(String str, int i, a aVar, a aVar2) {
        this.fromState = aVar;
        this.toState = aVar2;
    }

    public static mhm.d a(b bVar) {
        return new mhm.d(bVar.fromState, bVar.toState);
    }

    public static boolean d(b bVar) {
        return bVar.toState == bVar.fromState;
    }

    public static b e(String str, a aVar, a aVar2) {
        b bVar = STATE_TRANSITION_MAP.get(new mhm.d(aVar, aVar2));
        if (bVar != null) {
            return bVar;
        }
        String string = aVar.toString();
        String string2 = aVar2.toString();
        StringBuilder sbM = v0.a.m("CircuitBreaker '", str, "' tried an illegal state transition from ", string, " to ");
        sbM.append(string2);
        throw new IllegalStateTransitionException(sbM.toString());
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final a b() {
        return this.fromState;
    }

    public final a c() {
        return this.toState;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "State transition from " + this.fromState + " to " + this.toState;
    }
}
