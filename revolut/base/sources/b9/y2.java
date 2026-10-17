package b9;

import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f13514a;

    static {
        HashMap map = new HashMap(10);
        f13514a = map;
        map.put("none", x.none);
        map.put("xMinYMin", x.xMinYMin);
        map.put("xMidYMin", x.xMidYMin);
        map.put("xMaxYMin", x.xMaxYMin);
        map.put("xMinYMid", x.xMinYMid);
        map.put("xMidYMid", x.xMidYMid);
        map.put("xMaxYMid", x.xMaxYMid);
        map.put("xMinYMax", x.xMinYMax);
        map.put("xMidYMax", x.xMidYMax);
        map.put("xMaxYMax", x.xMaxYMax);
    }
}
