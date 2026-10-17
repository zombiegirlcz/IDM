package v9;

import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f286916a;

    static {
        HashMap map = new HashMap();
        f286916a = map;
        map.put(boolean[].class.getName(), new a0(boolean[].class));
        map.put(byte[].class.getName(), new q(2));
        map.put(char[].class.getName(), new q(4));
        map.put(short[].class.getName(), new f0(short[].class));
        map.put(int[].class.getName(), new d0(int[].class));
        map.put(long[].class.getName(), new e0(long[].class));
        map.put(float[].class.getName(), new c0(float[].class));
        map.put(double[].class.getName(), new b0(double[].class));
    }
}
