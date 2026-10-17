package b9;

import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f13306a;

    static {
        HashMap map = new HashMap(9);
        f13306a = map;
        j2 j2Var = j2.f13377pt;
        map.put("xx-small", new o0(0.694f, j2Var));
        map.put("x-small", new o0(0.833f, j2Var));
        map.put("small", new o0(10.0f, j2Var));
        map.put("medium", new o0(12.0f, j2Var));
        map.put("large", new o0(14.4f, j2Var));
        map.put("x-large", new o0(17.3f, j2Var));
        map.put("xx-large", new o0(20.7f, j2Var));
        j2 j2Var2 = j2.percent;
        map.put("smaller", new o0(83.33f, j2Var2));
        map.put("larger", new o0(120.0f, j2Var2));
    }
}
