package le;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f194357a;

    public o1(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f194357a = z;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f194357a == o1Var.f194357a;
    }

    public final int hashCode() {
        return ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.f194357a ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("OsData{osRelease=");
        sb6.append(Build.VERSION.RELEASE);
        sb6.append(", osCodeName=");
        sb6.append(Build.VERSION.CODENAME);
        sb6.append(", isRooted=");
        return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, this.f194357a, "}");
    }
}
