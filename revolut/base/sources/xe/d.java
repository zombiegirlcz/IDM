package xe;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d implements we.b {
    public static final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f304506g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f304508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f304509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f304510c;
    public boolean d;
    public static final a e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f304507h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [xe.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [xe.b] */
    static {
        final int i = 0;
        f = new ve.e() { // from class: xe.b
            @Override // ve.a
            public final void encode(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ((ve.f) obj3).add((String) obj2);
                        break;
                    default:
                        ((ve.f) obj3).add(((Boolean) obj2).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        f304506g = new ve.e() { // from class: xe.b
            @Override // ve.a
            public final void encode(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ((ve.f) obj3).add((String) obj2);
                        break;
                    default:
                        ((ve.f) obj3).add(((Boolean) obj2).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f304508a = map;
        HashMap map2 = new HashMap();
        this.f304509b = map2;
        this.f304510c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, f304506g);
        map.remove(Boolean.class);
        map2.put(Date.class, f304507h);
        map.remove(Date.class);
    }

    @Override // we.b
    public final we.b registerEncoder(Class cls, ve.c cVar) {
        this.f304508a.put(cls, cVar);
        this.f304509b.remove(cls);
        return this;
    }
}
