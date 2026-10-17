package f8;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import y8.l;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f132686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f132687h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f132688a = new e(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.h f132689b = new ao.h(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f132690c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f132686g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f132687h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Bitmap bitmap, Integer num) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(l.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = l.d(config) * i * i2;
        e eVar = this.f132688a;
        h hVarO = (h) ((ArrayDeque) eVar.f22248b).poll();
        if (hVarO == null) {
            hVarO = eVar.o();
        }
        j jVar = (j) hVarO;
        jVar.b(iD, config);
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = e;
        } else {
            int i3 = i.f132682a[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : f132687h : f132686g : f : d;
        }
        int length = configArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i5];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num == null || num.intValue() > iD * 8) {
                i5++;
            } else if (num.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                eVar.h(jVar);
                int iIntValue = num.intValue();
                h hVarO2 = (h) ((ArrayDeque) eVar.f22248b).poll();
                if (hVarO2 == null) {
                    hVarO2 = eVar.o();
                }
                jVar = (j) hVarO2;
                jVar.b(iIntValue, config2);
            }
        }
        Bitmap bitmap = (Bitmap) this.f132689b.f(jVar);
        if (bitmap != null) {
            a(bitmap, Integer.valueOf(jVar.f132684b));
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f132690c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = l.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        e eVar = this.f132688a;
        h hVarO = (h) ((ArrayDeque) eVar.f22248b).poll();
        if (hVarO == null) {
            hVarO = eVar.o();
        }
        j jVar = (j) hVarO;
        jVar.b(iC, config);
        this.f132689b.s(jVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(jVar.f132684b));
        navigableMapD.put(Integer.valueOf(jVar.f132684b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbS = p.a.s("SizeConfigStrategy{groupedMap=");
        sbS.append(this.f132689b);
        sbS.append(", sortedSizes=(");
        HashMap map = this.f132690c;
        for (Map.Entry entry : map.entrySet()) {
            sbS.append(entry.getKey());
            sbS.append('[');
            sbS.append(entry.getValue());
            sbS.append("], ");
        }
        if (!map.isEmpty()) {
            sbS.replace(sbS.length() - 2, sbS.length(), "");
        }
        sbS.append(")}");
        return sbS.toString();
    }
}
