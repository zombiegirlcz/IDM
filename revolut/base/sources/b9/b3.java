package b9;

import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public abstract class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f13313a;

    static {
        HashMap map = new HashMap(13);
        f13313a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        com.google.android.gms.internal.mlkit_vision_face.a.A(1, map, "bolder", -1, "lighter");
        com.google.android.gms.internal.mlkit_vision_face.a.A(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        com.google.android.gms.internal.mlkit_vision_face.a.A(500, map, "500", 600, "600");
        map.put("700", 700);
        map.put("800", 800);
        map.put("900", 900);
    }
}
