package qdk;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f244992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f244993c;
    public final AnimationRequest d;

    public x(String str, Data layout, boolean z, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f244991a = str;
        this.f244992b = layout;
        this.f244993c = z;
        this.d = animationRequest;
    }

    public static x a(x xVar, String str, Data layout, boolean z, AnimationRequest animationRequest, int i) {
        if ((i & 1) != 0) {
            str = xVar.f244991a;
        }
        if ((i & 2) != 0) {
            layout = xVar.f244992b;
        }
        if ((i & 4) != 0) {
            z = xVar.f244993c;
        }
        if ((i & 8) != 0) {
            animationRequest = xVar.d;
        }
        xVar.getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new x(str, layout, z, animationRequest);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f244991a, xVar.f244991a) && Intrinsics.f(this.f244992b, xVar.f244992b) && this.f244993c == xVar.f244993c && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        String str = this.f244991a;
        int iC = j6.a.c(kii.e.c(this.f244992b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f244993c);
        AnimationRequest animationRequest = this.d;
        return iC + (animationRequest != null ? animationRequest.hashCode() : 0);
    }
}
