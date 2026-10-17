package pvg;

import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t {
    public static String a(iwg.a aVar) {
        if (aVar != null) {
            return kotlin.jvm.internal.s.Q(aVar);
        }
        return null;
    }

    public static String b(iwg.c cVar) {
        if (cVar != null) {
            return kotlin.jvm.internal.s.R(cVar);
        }
        return null;
    }

    public static String c(eel.c cVar) {
        if (cVar != null) {
            return nz8.d.t(cVar, null);
        }
        return null;
    }

    public static String d(a3 a3Var) {
        if (a3Var != null) {
            return a3Var.getId();
        }
        return null;
    }

    public static iwg.a e(String str) {
        if (str != null) {
            return kotlin.jvm.internal.s.z(str);
        }
        return null;
    }

    public static iwg.c f(String str) {
        if (str == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode != -1848957518) {
            if (iHashCode != -788933136) {
                if (iHashCode == 718356041 && str.equals("TIME_WEIGHTED")) {
                    return iwg.c.TIME_WEIGHTED;
                }
            } else if (str.equals("MODIFIED_DIETZ")) {
                return iwg.c.MONEY_WEIGHTED;
            }
        } else if (str.equals("SIMPLE")) {
            return iwg.c.SIMPLE;
        }
        throw new IllegalStateException(p.a.p("Can't convert ", str, " to enum"));
    }

    public static eel.c g(String str) {
        if (str == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode != 1619) {
            if (iHashCode != 1628) {
                if (iHashCode != 1638) {
                    if (iHashCode != 1640) {
                        if (iHashCode != 1764) {
                            if (iHashCode != 1783) {
                                if (iHashCode == 107876 && str.equals("max")) {
                                    return eel.c.ALL;
                                }
                            } else if (str.equals("6m")) {
                                return eel.c.SIX_MONTHS;
                            }
                        } else if (str.equals("5y")) {
                            return eel.c.FIVE_YEAR;
                        }
                    } else if (str.equals("1y")) {
                        return eel.c.ONE_YEAR;
                    }
                } else if (str.equals("1w")) {
                    return eel.c.ONE_WEEK;
                }
            } else if (str.equals("1m")) {
                return eel.c.ONE_MONTH;
            }
        } else if (str.equals("1d")) {
            return eel.c.ONE_DAY;
        }
        throw new IllegalStateException(p.a.p("Can't convert ", str, " to enum"));
    }
}
