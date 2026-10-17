package ypi;

import com.revolut.retail.common.ui.R$id;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final h d;
    public static final h e;
    public static final h f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f315926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f315927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f315928c;

    static {
        h hVar = new h(Integer.valueOf(R$id.next_button), null, null);
        d = hVar;
        e = a(hVar, Integer.valueOf(R$id.bottom_layout), null, 5);
        f = a(hVar, Integer.valueOf(R$id.bottom_layout), Integer.valueOf(R$id.note_above_bottom_button), 1);
        a(hVar, Integer.valueOf(R$id.bottom_layout), Integer.valueOf(R$id.bottom_text), 1);
    }

    public h(Integer num, Integer num2, Integer num3) {
        this.f315926a = num;
        this.f315927b = num2;
        this.f315928c = num3;
    }

    public static h a(h hVar, Integer num, Integer num2, int i) {
        Integer num3 = hVar.f315926a;
        if ((i & 2) != 0) {
            num = hVar.f315927b;
        }
        if ((i & 4) != 0) {
            num2 = hVar.f315928c;
        }
        hVar.getClass();
        return new h(num3, num, num2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f315926a, hVar.f315926a) && Intrinsics.f(this.f315927b, hVar.f315927b) && Intrinsics.f(this.f315928c, hVar.f315928c);
    }

    public final int hashCode() {
        Integer num = this.f315926a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f315927b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f315928c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }
}
