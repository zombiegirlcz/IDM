package oc;

/* JADX INFO: loaded from: classes16.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f224017a;

    public k(int i) {
        this.f224017a = i;
    }

    public static k a(int i) {
        byte b4 = (byte) (((byte) 1) | 2);
        if (b4 == 3) {
            return new k(i);
        }
        StringBuilder sb6 = new StringBuilder();
        if ((b4 & 1) == 0) {
            sb6.append(" appUpdateType");
        }
        if ((b4 & 2) == 0) {
            sb6.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb6.toString()));
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return (obj2 instanceof k) && this.f224017a == ((k) obj2).f224017a;
    }

    public final int hashCode() {
        return ((this.f224017a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return j6.a.l(this.f224017a, "AppUpdateOptions{appUpdateType=", ", allowAssetPackDeletion=false}");
    }
}
