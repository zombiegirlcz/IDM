package aw0;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ab {

    @NotNull
    public static final za Companion = new za();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f10236c = zhm.v.k(new ab(51.5938f, -1.0f), new ab(47.1849f, -3.30052f), new ab(46.0637f, -1.57513f), new ab(44.1952f, -1.0f), new ab(41.5792f, -6.55959f), new ab(39.7107f, -5.31347f), new ab(37.0947f, -6.08031f), new ab(35.9736f, -8.57254f), new ab(34.4788f, -8.18912f), new ab(31.8628f, -13.7487f), new ab(30.368f, -12.7902f), new ab(28.8732f, -13.9404f), new ab(27.752f, -10.8731f), new ab(24.3887f, -12.3109f), new ab(23.6412f, -15.0907f), new ab(21.7727f, -16.0492f), new ab(19.9042f, -21.8964f), new ab(17.6619f, -23.0466f), new ab(16.1671f, -18.3497f), new ab(15.046f, -23.6218f), new ab(13.1774f, -21.0337f), new ab(10.1877f, -19.7876f), new ab(7.57179f, -17.1036f), new ab(6.45067f, -23.2383f), new ab(4.95583f, -18.3497f), new ab(3.461f, -22.4715f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10238b;

    public ab(float f, float f4) {
        this.f10237a = f;
        this.f10238b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj2;
        return Float.compare(this.f10237a, abVar.f10237a) == 0 && Float.compare(this.f10238b, abVar.f10238b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10238b) + (Float.hashCode(this.f10237a) * 31);
    }
}
