package d9;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g ANY;
    public static final g DEFAULT;
    public static final g NONE;
    public static final g NON_PRIVATE;
    public static final g PROTECTED_AND_PUBLIC;
    public static final g PUBLIC_ONLY;

    static {
        g gVar = new g("ANY", 0);
        ANY = gVar;
        g gVar2 = new g("NON_PRIVATE", 1);
        NON_PRIVATE = gVar2;
        g gVar3 = new g("PROTECTED_AND_PUBLIC", 2);
        PROTECTED_AND_PUBLIC = gVar3;
        g gVar4 = new g("PUBLIC_ONLY", 3);
        PUBLIC_ONLY = gVar4;
        g gVar5 = new g("NONE", 4);
        NONE = gVar5;
        g gVar6 = new g("DEFAULT", 5);
        DEFAULT = gVar6;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final boolean a(Member member) {
        int i = f.f112305a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return !Modifier.isPrivate(member.getModifiers());
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
        } else if (Modifier.isProtected(member.getModifiers())) {
            return true;
        }
        return Modifier.isPublic(member.getModifiers());
    }
}
