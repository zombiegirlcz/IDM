package ag;

/* JADX INFO: loaded from: classes.dex */
public final class x implements zf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4747b;

    public x(String str, int i) {
        this.f4746a = str;
        this.f4747b = i;
    }

    public final boolean a() {
        if (this.f4747b == 0) {
            return false;
        }
        String strTrim = d().trim();
        if (o.e.matcher(strTrim).matches()) {
            return true;
        }
        if (o.f.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(p.a.p("[Value: ", strTrim, "] cannot be converted to a boolean."));
    }

    public final double b() {
        if (this.f4747b == 0) {
            return 0.0d;
        }
        String strTrim = d().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(p.a.p("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    public final long c() {
        if (this.f4747b == 0) {
            return 0L;
        }
        String strTrim = d().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(p.a.p("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    public final String d() {
        return this.f4747b == 0 ? "" : this.f4746a;
    }
}
