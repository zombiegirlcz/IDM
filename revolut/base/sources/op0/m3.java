package op0;

import aw0.x4;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public abstract class m3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m3[] $VALUES;
    public static final m3 FIXED_ASPECT_RATIO;
    public static final m3 WRAP_CONTENT;

    static {
        m3 m3Var = new m3() { // from class: op0.k3
            private final int itemLayoutHeightParam = -1;

            @Override // op0.m3
            public final int a() {
                return this.itemLayoutHeightParam;
            }

            @Override // op0.m3
            public final q b(q modelWidgetSize) {
                Intrinsics.checkNotNullParameter(modelWidgetSize, "modelWidgetSize");
                return modelWidgetSize;
            }

            @Override // op0.m3
            public final aw0.x4 c() {
                aw0.d0.Companion.getClass();
                return new aw0.y4(aw0.d0.f10273c);
            }
        };
        FIXED_ASPECT_RATIO = m3Var;
        m3 m3Var2 = new m3() { // from class: op0.l3
            private final int itemLayoutHeightParam = -2;

            @Override // op0.m3
            public final int a() {
                return this.itemLayoutHeightParam;
            }

            @Override // op0.m3
            public final q b(q modelWidgetSize) {
                Intrinsics.checkNotNullParameter(modelWidgetSize, "modelWidgetSize");
                return null;
            }

            @Override // op0.m3
            public final aw0.x4 c() {
                return x4.c.f10604a;
            }
        };
        WRAP_CONTENT = m3Var2;
        m3[] m3VarArr = {m3Var, m3Var2};
        $VALUES = m3VarArr;
        $ENTRIES = vc.s.n(m3VarArr);
    }

    public static m3 valueOf(String str) {
        return (m3) Enum.valueOf(m3.class, str);
    }

    public static m3[] values() {
        return (m3[]) $VALUES.clone();
    }

    public abstract int a();

    public abstract q b(q qVar);

    public abstract aw0.x4 c();
}
