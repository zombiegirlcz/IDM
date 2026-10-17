package ac;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f3003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a f3004c;
    public final String d;

    public b(Context context, ic.a aVar, ic.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f3002a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f3003b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f3004c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof d) {
            b bVar = (b) ((d) obj2);
            if (this.f3002a.equals(bVar.f3002a) && this.f3003b.equals(bVar.f3003b) && this.f3004c.equals(bVar.f3004c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3002a.hashCode() ^ 1000003) * 1000003) ^ this.f3003b.hashCode()) * 1000003) ^ this.f3004c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("CreationContext{applicationContext=");
        sb6.append(this.f3002a);
        sb6.append(", wallClock=");
        sb6.append(this.f3003b);
        sb6.append(", monotonicClock=");
        sb6.append(this.f3004c);
        sb6.append(", backendName=");
        return v0.a.i(sb6, this.d, "}");
    }
}
