package zfm;

import efm.y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class m {
    private static final /* synthetic */ m[] $VALUES;
    public static final m COMPLETE;

    static {
        m mVar = new m("COMPLETE", 0);
        COMPLETE = mVar;
        $VALUES = new m[]{mVar};
    }

    public static boolean a(y yVar, Object obj2) {
        if (obj2 == COMPLETE) {
            yVar.onComplete();
            return true;
        }
        if (obj2 instanceof k) {
            yVar.onError(((k) obj2).f322037a);
            return true;
        }
        yVar.onNext(obj2);
        return false;
    }

    public static boolean b(y yVar, Object obj2) {
        if (obj2 == COMPLETE) {
            yVar.onComplete();
            return true;
        }
        if (obj2 instanceof k) {
            yVar.onError(((k) obj2).f322037a);
            return true;
        }
        if (obj2 instanceof j) {
            yVar.onSubscribe(((j) obj2).f322036a);
            return false;
        }
        yVar.onNext(obj2);
        return false;
    }

    public static boolean c(Object obj2) {
        return obj2 == COMPLETE;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
