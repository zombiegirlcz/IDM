package nq;

import com.revolut.camerakit.core.camerax.extras.model.ResultInternal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f218332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f218334c;
    public final int d;
    public final String e;
    public final ResultInternal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f218335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f218336h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Iterable f218337j;

    public v(w scanType, List list, float f, int i, String experiment, ResultInternal resultInternal, boolean z, String str, Integer num, Iterable validationResults) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(validationResults, "validationResults");
        this.f218332a = scanType;
        this.f218333b = list;
        this.f218334c = f;
        this.d = i;
        this.e = experiment;
        this.f = resultInternal;
        this.f218335g = z;
        this.f218336h = str;
        this.i = num;
        this.f218337j = validationResults;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f218332a == vVar.f218332a && Intrinsics.f(this.f218333b, vVar.f218333b) && Float.compare(this.f218334c, vVar.f218334c) == 0 && this.d == vVar.d && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && this.f218335g == vVar.f218335g && Intrinsics.f(this.f218336h, vVar.f218336h) && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f218337j, vVar.f218337j);
    }

    public final int hashCode() {
        int iHashCode = this.f218332a.hashCode() * 31;
        List list = this.f218333b;
        int iC = p.a.c(j6.a.b(this.d, m72.b.b(this.f218334c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31, this.e);
        ResultInternal resultInternal = this.f;
        int iC2 = j6.a.c((iC + (resultInternal == null ? 0 : resultInternal.hashCode())) * 31, 31, this.f218335g);
        String str = this.f218336h;
        int iHashCode2 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.i;
        return this.f218337j.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }
}
