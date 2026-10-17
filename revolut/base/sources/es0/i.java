package es0;

import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public abstract class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i LEADING;
    public static final i TRAILING;

    static {
        i iVar = new i() { // from class: es0.h
            @Override // es0.i
            public final Object a(int i, List actions) {
                Intrinsics.checkNotNullParameter(actions, "actions");
                return zhm.d0.e0(zhm.v.j(actions) - i, actions);
            }

            @Override // es0.i
            public final int b() {
                return 7;
            }
        };
        TRAILING = iVar;
        i iVar2 = new i() { // from class: es0.g
            @Override // es0.i
            public final Object a(int i, List actions) {
                Intrinsics.checkNotNullParameter(actions, "actions");
                return zhm.d0.e0(i, actions);
            }

            @Override // es0.i
            public final int b() {
                return 6;
            }
        };
        LEADING = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public abstract Object a(int i, List list);

    public abstract int b();
}
