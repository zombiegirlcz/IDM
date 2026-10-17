package ygm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l COMPLETE;

    static {
        l lVar = new l("COMPLETE", 0);
        COMPLETE = lVar;
        $VALUES = new l[]{lVar};
    }

    public static boolean a(fgm.l lVar, Object obj2) {
        if (obj2 == COMPLETE) {
            lVar.onComplete();
            return true;
        }
        if (obj2 instanceof j) {
            lVar.onError(((j) obj2).f313674a);
            return true;
        }
        lVar.onNext(obj2);
        return false;
    }

    public static boolean b(fgm.l lVar, Object obj2) {
        if (obj2 == COMPLETE) {
            lVar.onComplete();
            return true;
        }
        if (obj2 instanceof j) {
            lVar.onError(((j) obj2).f313674a);
            return true;
        }
        if (obj2 instanceof i) {
            lVar.onSubscribe(((i) obj2).f313673a);
            return false;
        }
        lVar.onNext(obj2);
        return false;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
