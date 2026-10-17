package qn2;

/* JADX INFO: loaded from: classes21.dex */
public abstract class h {
    public static final boolean a(qo2.i iVar) {
        return iVar.f247993b && iVar.f247992a.f247984g;
    }

    public static final String b(qo2.c cVar) {
        int i = cVar == null ? -1 : g.f247857b[cVar.ordinal()];
        if (i == 1) {
            return "DAILY";
        }
        if (i == 2) {
            return "WEEKLY";
        }
        if (i == 3) {
            return "BIWEEKLY";
        }
        if (i == 4) {
            return "MONTHLY";
        }
        if (i != 5) {
            return null;
        }
        return "YEARLY";
    }
}
